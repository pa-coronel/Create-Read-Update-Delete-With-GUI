
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.*;

public class view extends javax.swing.JFrame {
    
    public view() {

        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        
        initComponents();
        
        cancel.setVisible(false);
        save.setVisible(false);
        
        IDnum.setText(Integer.toString(menu.idnum));
        
        display();
        
        setLocationRelativeTo(null);
    }
    
    private void display(){
        Connection conn = null;
        Statement stmt = null;
        
        try{
            String host = "jdbc:derby://localhost:1527/StudentRecord";
            String uName = "testing";
            String uPass= "testing";

            conn = DriverManager.getConnection(host,uName,uPass);

            stmt = conn.createStatement();
            String SQL = "SELECT * FROM STUDENTRECORD";
            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next()){
                if(rs.getInt("IDnumber") == menu.idnum){
                    IDnum.setText(Integer.toString(rs.getInt("IDnumber")));
                    lastname.setText(rs.getString("Lastname"));
                    firstname.setText(rs.getString("Firstname"));
                    middlename.setText(rs.getString("Middlename"));
                    age.setText(Integer.toString(rs.getInt("Age")));
                    sex.setSelectedItem(rs.getString("gender"));
                    science.setText(Integer.toString(rs.getInt("science")));
                    english.setText(Integer.toString(rs.getInt("english")));
                    math.setText(Integer.toString(rs.getInt("math")));
                    average.setText(Integer.toString(rs.getInt("average")));
                }
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }finally{
            CloseDB.closeConnectionAndStatement(conn, null, stmt);
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        IDnum = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox();
        grades = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        math = new javax.swing.JTextField();
        english = new javax.swing.JTextField();
        science = new javax.swing.JTextField();
        average = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(432, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(432, 420));
        getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID no.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 30, 60, 30);

        IDnum.setEditable(false);
        IDnum.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        IDnum.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(IDnum);
        IDnum.setBounds(90, 30, 100, 30);

        lastname.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lastname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lastname.setEnabled(false);
        getContentPane().add(lastname);
        lastname.setBounds(30, 80, 110, 30);

        firstname.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        firstname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        firstname.setEnabled(false);
        getContentPane().add(firstname);
        firstname.setBounds(160, 80, 110, 30);

        middlename.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        middlename.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        middlename.setEnabled(false);
        getContentPane().add(middlename);
        middlename.setBounds(290, 80, 110, 30);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("last name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 110, 110, 20);

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("first name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 110, 110, 20);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("middle name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 110, 110, 20);

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("age");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 170, 30, 30);

        age.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        age.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        age.setEnabled(false);
        getContentPane().add(age);
        age.setBounds(90, 170, 70, 30);

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("sex");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 240, 30, 30);

        sex.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "male", "female" }));
        sex.setToolTipText("");
        sex.setEnabled(false);
        getContentPane().add(sex);
        sex.setBounds(90, 240, 70, 30);

        grades.setBackground(new java.awt.Color(102, 102, 102));
        grades.setLayout(null);

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("math");
        grades.add(jLabel4);
        jLabel4.setBounds(30, 10, 60, 30);

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("english");
        grades.add(jLabel5);
        jLabel5.setBounds(30, 50, 60, 30);

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("science");
        grades.add(jLabel6);
        jLabel6.setBounds(30, 90, 60, 30);

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("average");
        grades.add(jLabel7);
        jLabel7.setBounds(30, 130, 60, 30);

        math.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        math.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        math.setText("0");
        math.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        math.setEnabled(false);
        math.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mathFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mathFocusLost(evt);
            }
        });
        grades.add(math);
        math.setBounds(100, 10, 40, 30);

        english.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        english.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        english.setText("0");
        english.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        english.setEnabled(false);
        english.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                englishFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                englishFocusLost(evt);
            }
        });
        grades.add(english);
        english.setBounds(100, 50, 40, 30);

        science.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        science.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        science.setText("0");
        science.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        science.setEnabled(false);
        science.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                scienceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                scienceFocusLost(evt);
            }
        });
        grades.add(science);
        science.setBounds(100, 90, 40, 30);

        average.setEditable(false);
        average.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        average.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        average.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        average.setEnabled(false);
        average.setFocusable(false);
        grades.add(average);
        average.setBounds(100, 130, 40, 30);

        getContentPane().add(grades);
        grades.setBounds(220, 150, 160, 170);

        update.setBackground(new java.awt.Color(0, 255, 0));
        update.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        update.setText("update");
        update.setFocusable(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(60, 340, 90, 30);

        back.setBackground(new java.awt.Color(0, 204, 204));
        back.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        back.setText("back");
        back.setFocusable(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(280, 340, 90, 30);

        delete.setBackground(new java.awt.Color(255, 0, 0));
        delete.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        delete.setText("delete");
        delete.setMaximumSize(new java.awt.Dimension(65, 27));
        delete.setMinimumSize(new java.awt.Dimension(65, 27));
        delete.setPreferredSize(new java.awt.Dimension(65, 27));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(170, 340, 90, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("record viewer");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 20, 90, 40);

        save.setBackground(new java.awt.Color(0, 204, 204));
        save.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(110, 340, 90, 30);

        cancel.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(230, 340, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String Average(){
    
        int sci = Integer.parseInt(science.getText());
        int mat = Integer.parseInt(math.getText());
        int eng = Integer.parseInt(english.getText());
        
        int result = (sci + mat + eng) / 3;
        
        String ave = Integer.toString(result);
        
        return ave;
        
    }  
    
    private void mathFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mathFocusGained
        math.selectAll();
        average.setText(Average());
    }//GEN-LAST:event_mathFocusGained

    private void mathFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mathFocusLost
        average.setText(Average());
    }//GEN-LAST:event_mathFocusLost

    private void englishFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_englishFocusGained
        english.selectAll();
        average.setText(Average());
    }//GEN-LAST:event_englishFocusGained

    private void englishFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_englishFocusLost
        average.setText(Average());
    }//GEN-LAST:event_englishFocusLost

    private void scienceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scienceFocusGained
        science.selectAll();
        average.setText(Average());
    }//GEN-LAST:event_scienceFocusGained

    private void scienceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scienceFocusLost
        average.setText(Average());
    }//GEN-LAST:event_scienceFocusLost

    private void enabler(boolean setEnable, boolean setenable){
        lastname.setEnabled(setEnable);
        firstname.setEnabled(setEnable);
        middlename.setEnabled(setEnable);
        age.setEnabled(setEnable);
        sex.setEnabled(setEnable);
        science.setEnabled(setEnable);
        english.setEnabled(setEnable);
        math.setEnabled(setEnable);
        
        update.setVisible(setenable);
        delete.setVisible(setenable);
        back.setVisible(setenable);
        
        save.setVisible(setEnable);
        cancel.setVisible(setEnable);
        
    }
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        enabler(true, false);

    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "confirmation", JOptionPane.YES_NO_OPTION);
        
        if(answer == JOptionPane.YES_NO_OPTION){
            
            String host = "jdbc:derby://localhost:1527/StudentRecord";
            String uName = "testing";
            String uPass= "testing";

            
            Connection conn = null;
            PreparedStatement ps = null;
            
            try{
                conn = DriverManager.getConnection(host, uName, uPass);
                ps = conn.prepareStatement("DELETE FROM StudentRecord WHERE IDnumber=?");
                ps.setInt(1, Integer.parseInt(IDnum.getText()));
                ps.executeUpdate();
                 
                JOptionPane.showMessageDialog(null, "The record has been deleted succesfully");
                 
                this.setVisible(false);
                new menu().setVisible(true);
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "SQL Exception Error…");
            }finally{
                CloseDB.closeConnectionAndStatement(conn, ps, null);

            }     
        }else{
            JOptionPane.showMessageDialog(null, "phew!");
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        String host = "jdbc:derby://localhost:1527/StudentRecord";
        String uName = "testing";
        String uPass= "testing";
        
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = DriverManager.getConnection(host, uName, uPass);

            ps  = conn.prepareStatement("update studentrecord SET lastname = ?, firstname = ?, middlename = ?, gender = ?, age = ?, science = ?, english = ?, math = ?, average = ? WHERE IDnumber = ?");

            ps.setString(1, lastname.getText());
            ps.setString(2, firstname.getText());
            ps.setString(3, middlename.getText());
            ps.setString(4, (String) sex.getSelectedItem());
            ps.setInt(5, Integer.parseInt(age.getText()));
            ps.setInt(6, Integer.parseInt(science.getText()));
            ps.setInt(7, Integer.parseInt(english.getText()));
            ps.setInt(8, Integer.parseInt(math.getText()));
            ps.setInt(9, Integer.parseInt(average.getText()));
            ps.setInt(10, Integer.parseInt(IDnum.getText()));
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Updated Succesfully");
            enabler(false, true);

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }finally{
            CloseDB.closeConnectionAndStatement(conn, ps, null);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        
        enabler(false, true);
        
    }//GEN-LAST:event_cancelActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField IDnum;
    private javax.swing.JTextField age;
    private javax.swing.JTextField average;
    private javax.swing.JButton back;
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JTextField english;
    private javax.swing.JTextField firstname;
    private javax.swing.JPanel grades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField math;
    private javax.swing.JTextField middlename;
    private javax.swing.JButton save;
    private javax.swing.JTextField science;
    private javax.swing.JComboBox sex;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
