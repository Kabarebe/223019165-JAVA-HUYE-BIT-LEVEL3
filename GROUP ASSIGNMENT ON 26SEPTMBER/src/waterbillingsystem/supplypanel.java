package waterbillingsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class supplypanel extends JPanel implements ActionListener {
	JTextField
    useridTxt = new JTextField(),
    roleTxt = new JTextField(),
    emailTxt = new JTextField(),
    priceTxt = new JTextField(),
    addressTxt = new JTextField(),
    consumedTxt = new JTextField();
    
    JButton addBtn = new JButton("Add"),
            updateBtn = new JButton("Update"),
            deleteBtn = new JButton("Delete"),
            loadBtn = new JButton("Load");

    JTable table;
    DefaultTableModel model;
    int userId;
    public supplypanel(int userid) {
    	this.userId=userid;
    	setLayout(null);
    	String[] labels= {"id","role","email","price","address","consumed"
    };
    	model = new DefaultTableModel(labels, 0);
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20, 230, 800, 300);

        int y = 20;
        addField("userid", useridTxt, y); y += 30;
        addField("role", roleTxt, y); y += 30;
        addField("price", priceTxt, y); y += 30;
        addField("address", addressTxt, y); y += 30;
        addField("consumed", consumedTxt, y); y += 30;

        

        useridTxt.setEditable(false);

        addButtons();
        add(sp);


        // Load users automatically on startup
        loadwaterbillingsystem();

        // Fill form when a row is clicked
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                if (row >= 0) {
                    useridTxt.setText(model.getValueAt(row, 0).toString());
                    roleTxt.setText(model.getValueAt(row, 2).toString());
                    emailTxt.setText(model.getValueAt(row, 1).toString());
                    priceTxt.setText(model.getValueAt(row, 3).toString());
                    addressTxt.setText(model.getValueAt(row, 4).toString());
                    consumedTxt.setText(model.getValueAt(row, 5).toString());
 
                }
            }
        });
        
    }
    private void addField(String lbl, JComponent txt, int y) {
        JLabel l = new JLabel(lbl);
        l.setBounds(20, y, 80, 25);
        txt.setBounds(100, y, 150, 25);
        add(l); add(txt);
    }

    private void addButtons() {
        addBtn.setBounds(300, 20, 100, 30);
        updateBtn.setBounds(300, 60, 100, 30);
        deleteBtn.setBounds(300, 100, 100, 30);
        loadBtn.setBounds(300, 140, 100, 30);
        add(addBtn); add(updateBtn); add(deleteBtn); add(loadBtn);
        addBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        loadBtn.addActionListener(this);
    }




	private void loadwaterbillingsystem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try (Connection con = waterbilling.getConnection()) {
            if (e.getSource() == addBtn) {
                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO fleet(type,model,year,fuelType,price,user_id) VALUES(?,?,?,?,?,?)"
                );
                ps.setString(1, useridTxt.getText());
                ps.setString(2, roleTxt.getText());
                ps.setString(3, emailTxt.getText());
                ps.setString(4, priceTxt.getText());
                ps.setString(5, addressTxt.getText());
                ps.setString(6, consumedTxt.getText());
                ps.setInt(6,userId);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "customer Added!");
                setfieldsEmpty();
                loadFleets();
            }
            else if (e.getSource() == updateBtn) {
                PreparedStatement ps = con.prepareStatement(
                        "UPDATE fleet SET type=?, model=?, fuelType=?, price=?,year=? WHERE id=?"
                );
                ps.setString(1, useridTxt.getText());
                ps.setString(2, roleTxt.getText());
                ps.setString(5, emailTxt.getText());
                ps.setString(3, priceTxt.getText());
                ps.setString(4,addressTxt.getText());
                ps.setString(6,consumedTxt.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Fleet Updated!");
                setfieldsEmpty();
                loadFleets();
            }
            else if (e.getSource() == deleteBtn) {
                PreparedStatement ps = con.prepareStatement("DELETE FROM fleet WHERE id=?");
                ps.setInt(1, Integer.parseInt(useridTxt.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Fleet Deleted!");
                setfieldsEmpty();
                loadFleets();
            }
            else if (e.getSource() == loadBtn) {
                setfieldsEmpty();
                loadFleets();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

	// Utility to refresh table
    private void loadFleets() {
        try (Connection con = waterbilling.getConnection()) {
            model.setRowCount(0);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM fleet where user_id=?");
            ps.setInt(1,userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getInt("userid"),
                        rs.getString("role"),
                        rs.getString("email"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getString("consumed")
                });
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void setfieldsEmpty(){
        roleTxt.setText("");
        emailTxt.setText("");
        priceTxt .setText("");
        useridTxt .setText("");
        addressTxt.setText("");
        consumedTxt.setText("");
    }





}

