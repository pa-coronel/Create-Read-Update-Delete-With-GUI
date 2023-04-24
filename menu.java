
package crud;

import java.sql.*;
import java.time.Year;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
        
        createPanel.setVisible(false);
        
        setLocationRelativeTo(null);
    }

    private String Average(){
    
        int sci = Integer.parseInt(science.getText());
        int mat = Integer.parseInt(math.getText());
        int eng = Integer.parseInt(english.getText());
        
        int result = (sci + mat + eng) / 3;
        
        String ave = Integer.toString(result);
        
        return ave;
        
    }
    
    private void IDnumberSetter(){
        Connection conn = null;
        Statement stmt = null;
        String year = year = Integer.toString(Year.now().getValue());
        
        try{
            String host = "jdbc:derby://localhost:1527/StudentRecord";
            String uName = "testing";
            String uPass= "testing";

            conn = DriverManager.getConnection(host,uName,uPass);

            stmt = conn.createStatement();
            String SQL = "SELECT * FROM STUDENTRECORD";
            ResultSet rs = stmt.executeQuery(SQL);    
            
            while(rs.next()){
                IDnum.setText(year + Integer.toString((rs.getInt("IDnumber") + 1) % 1000000));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }finally{
            CloseDB.closeConnectionAndStatement(conn, null, stmt);
        }
        
        if(IDnum.getText().equals("")){
            IDnum.setText(year + 500001);
        }
    }
    
    private void clear(){
        lastname.setText("");
        firstname.setText("");
        middlename.setText("");
        age.setText("");
        science.setText("0");
        math.setText("0");
        english.setText("0");
        average.setText("0");
        sex.setSelectedItem(" ");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomePanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        about = new javax.swing.JButton();
        createPanel = new javax.swing.JPanel();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox();
        IDnum = new javax.swing.JTextField();
        grades = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        math = new javax.swing.JTextField();
        english = new javax.swing.JTextField();
        science = new javax.swing.JTextField();
        average = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        viewPanel = new javax.swing.JPanel();
        viewRecord = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableList = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(615, 440));
        setPreferredSize(new java.awt.Dimension(615, 440));
        setResizable(false);
        setSize(new java.awt.Dimension(615, 440));
        getContentPane().setLayout(null);

        welcomePanel.setBackground(new java.awt.Color(0, 153, 153));
        welcomePanel.setMinimumSize(new java.awt.Dimension(440, 390));
        welcomePanel.setPreferredSize(new java.awt.Dimension(440, 390));
        welcomePanel.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("WELCOME!");
        welcomePanel.add(jLabel12);
        jLabel12.setBounds(100, 60, 240, 90);

        jLabel13.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Please Enjoy :)");
        welcomePanel.add(jLabel13);
        jLabel13.setBounds(110, 160, 220, 90);

        jLabel14.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Powered by: UnderGround");
        welcomePanel.add(jLabel14);
        jLabel14.setBounds(220, 360, 210, 30);

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        welcomePanel.add(jPanel4);
        jPanel4.setBounds(10, -10, 40, 160);

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        welcomePanel.add(jPanel5);
        jPanel5.setBounds(60, 0, 20, 100);

        jLabel16.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Made by: Coronel, Paul Andrie N.");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        welcomePanel.add(jLabel16);
        jLabel16.setBounds(80, 280, 270, 50);

        getContentPane().add(welcomePanel);
        welcomePanel.setBounds(160, 10, 440, 390);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(106, 0, 0, 0);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(null);

        createButton.setBackground(new java.awt.Color(0, 204, 204));
        createButton.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        createButton.setText("create record");
        createButton.setFocusable(false);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jPanel2.add(createButton);
        createButton.setBounds(20, 30, 130, 40);

        viewButton.setBackground(new java.awt.Color(0, 204, 204));
        viewButton.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        viewButton.setText("record list");
        viewButton.setFocusable(false);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        jPanel2.add(viewButton);
        viewButton.setBounds(20, 90, 130, 40);

        logout.setBackground(new java.awt.Color(0, 204, 204));
        logout.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        logout.setText("logout");
        logout.setFocusable(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout);
        logout.setBounds(20, 330, 130, 40);

        about.setBackground(new java.awt.Color(0, 204, 204));
        about.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        about.setText("about");
        about.setFocusable(false);
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jPanel2.add(about);
        about.setBounds(40, 280, 90, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 0, 160, 420);

        createPanel.setBackground(new java.awt.Color(153, 153, 153));
        createPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createPanelMouseEntered(evt);
            }
        });
        createPanel.setLayout(null);

        lastname.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        createPanel.add(lastname);
        lastname.setBounds(30, 80, 110, 30);

        firstname.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        createPanel.add(firstname);
        firstname.setBounds(160, 80, 110, 30);

        middlename.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        createPanel.add(middlename);
        middlename.setBounds(290, 80, 110, 30);

        age.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        createPanel.add(age);
        age.setBounds(90, 170, 70, 30);

        sex.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "male", "female" }));
        sex.setToolTipText("");
        createPanel.add(sex);
        sex.setBounds(90, 240, 70, 30);

        IDnum.setEditable(false);
        IDnum.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        createPanel.add(IDnum);
        IDnum.setBounds(90, 30, 100, 30);

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
        average.setText("0");
        average.setFocusable(false);
        grades.add(average);
        average.setBounds(100, 130, 40, 30);

        createPanel.add(grades);
        grades.setBounds(220, 150, 160, 170);

        save.setBackground(new java.awt.Color(0, 204, 204));
        save.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        save.setText("save");
        save.setFocusable(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        createPanel.add(save);
        save.setBounds(120, 340, 65, 27);

        cancel.setBackground(new java.awt.Color(0, 204, 204));
        cancel.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cancel.setText("cancel");
        cancel.setFocusable(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        createPanel.add(cancel);
        cancel.setBounds(240, 340, 75, 27);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("last name");
        createPanel.add(jLabel1);
        jLabel1.setBounds(30, 110, 110, 20);

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("first name");
        createPanel.add(jLabel2);
        jLabel2.setBounds(160, 110, 110, 20);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("middle name");
        createPanel.add(jLabel3);
        jLabel3.setBounds(290, 110, 110, 20);

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("age");
        createPanel.add(jLabel8);
        jLabel8.setBounds(50, 170, 30, 30);

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID no.");
        createPanel.add(jLabel9);
        jLabel9.setBounds(30, 30, 60, 30);

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("sex");
        createPanel.add(jLabel10);
        jLabel10.setBounds(50, 240, 30, 30);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("create record");
        createPanel.add(jLabel15);
        jLabel15.setBounds(350, 10, 80, 30);

        getContentPane().add(createPanel);
        createPanel.setBounds(160, 10, 440, 390);

        viewPanel.setBackground(new java.awt.Color(0, 102, 102));
        viewPanel.setLayout(null);

        viewRecord.setBackground(new java.awt.Color(0, 204, 204));
        viewRecord.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        viewRecord.setText("view record");
        viewRecord.setEnabled(false);
        viewRecord.setFocusable(false);
        viewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordActionPerformed(evt);
            }
        });
        viewPanel.add(viewRecord);
        viewRecord.setBounds(170, 340, 105, 30);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TableList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID number", "Full name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableList.setFocusable(false);
        TableList.setRowHeight(24);
        TableList.getTableHeader().setResizingAllowed(false);
        TableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableList);
        TableList.getColumnModel().getColumn(0).setPreferredWidth(50);
        TableList.getColumnModel().getColumn(1).setPreferredWidth(200);

        viewPanel.add(jScrollPane1);
        jScrollPane1.setBounds(40, 60, 360, 260);

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("list of records");
        viewPanel.add(jLabel11);
        jLabel11.setBounds(160, 20, 130, 30);

        getContentPane().add(viewPanel);
        viewPanel.setBounds(160, 10, 440, 390);
        viewPanel.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        createPanel.setVisible(false);
        viewPanel.setVisible(true);
        welcomePanel.setVisible(false);
        
        Connection conn = null;
        Statement stmt = null;
        
        try{
            String host = "jdbc:derby://localhost:1527/StudentRecord";
            String uName = "testing";
            String uPass= "testing";

            conn = DriverManager.getConnection(host,uName,uPass);

            stmt = conn.createStatement();
            String SQL = "SELECT IDnumber, LastName, FirstName, MiddleName FROM STUDENTRECORD";
            ResultSet rs = stmt.executeQuery(SQL);
            
            int row = 0, column = 1;
            
            while(rs.next()){
                
                DefaultTableModel dtm = (DefaultTableModel) TableList.getModel();
                dtm.setRowCount(row + 1);
                TableList.setModel(dtm);
                
                TableList.setValueAt(rs.getInt("IDnumber"), row, 0);
                TableList.setValueAt(rs.getString("Lastname") + ", " + rs.getString("Firstname") + " " + rs.getString("Middlename").charAt(0) + ". ", row++, 1);
            
            }               

        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }finally{
            CloseDB.closeConnectionAndStatement(conn, null, stmt);
        }
        
    }//GEN-LAST:event_viewButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        createPanel.setVisible(true);
        viewPanel.setVisible(false);
        welcomePanel.setVisible(false);
        IDnumberSetter();
    }//GEN-LAST:event_createButtonActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        String host = "jdbc:derby://localhost:1527/StudentRecord";
        String uName = "testing";
        String uPass= "testing";
        
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = DriverManager.getConnection(host, uName, uPass);
            ps  = conn.prepareStatement("INSERT INTO studentrecord (IDnumber, lastname, firstname, middlename, gender, age, science, english, math, average)" + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setInt(1, Integer.parseInt(IDnum.getText()));
            ps.setString(2, lastname.getText());
            ps.setString(3, firstname.getText());
            ps.setString(4, middlename.getText());
            ps.setString(5, (String) sex.getSelectedItem());
            ps.setInt(6, Integer.parseInt(age.getText()));
            ps.setInt(7, Integer.parseInt(science.getText()));
            ps.setInt(8, Integer.parseInt(english.getText()));
            ps.setInt(9, Integer.parseInt(math.getText()));
            ps.setInt(10, Integer.parseInt(average.getText()));
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record Saved Succesfully");
            
            IDnumberSetter();
            clear();
                      
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }finally{
            CloseDB.closeConnectionAndStatement(conn, ps, null);
        }
                
    }//GEN-LAST:event_saveActionPerformed

    private void mathFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mathFocusGained
        math.selectAll();
        average.setText(Average());
    }//GEN-LAST:event_mathFocusGained

    private void englishFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_englishFocusGained
        english.selectAll();
        average.setText(Average());
    }//GEN-LAST:event_englishFocusGained

    private void scienceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scienceFocusGained
        science.selectAll();
        average.setText(Average());
    }//GEN-LAST:event_scienceFocusGained

    private void mathFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mathFocusLost
        average.setText(Average());
    }//GEN-LAST:event_mathFocusLost

    private void englishFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_englishFocusLost
        average.setText(Average());
    }//GEN-LAST:event_englishFocusLost

    private void scienceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scienceFocusLost
        average.setText(Average());
    }//GEN-LAST:event_scienceFocusLost
  
    public static int idnum;
    
    private void viewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordActionPerformed
        
        int row = TableList.getSelectedRow();
        idnum = (((Integer)TableList.getValueAt(row, 0)));  
        new view().setVisible(true);
        this.setVisible(false);
 
    }//GEN-LAST:event_viewRecordActionPerformed

    private void TableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableListMouseClicked
        viewRecord.setEnabled(true);
    }//GEN-LAST:event_TableListMouseClicked

    private void createPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createPanelMouseEntered
        IDnumberSetter();
    }//GEN-LAST:event_createPanelMouseEntered

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        createPanel.setVisible(false);
        viewPanel.setVisible(false);
        welcomePanel.setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "are you sure?", "confirmation", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_NO_OPTION){
            clear();
            IDnumberSetter();
        }
    }//GEN-LAST:event_cancelActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDnum;
    private javax.swing.JTable TableList;
    private javax.swing.JButton about;
    private javax.swing.JTextField age;
    private javax.swing.JTextField average;
    private javax.swing.JButton cancel;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel createPanel;
    private javax.swing.JTextField english;
    private javax.swing.JTextField firstname;
    private javax.swing.JPanel grades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton logout;
    private javax.swing.JTextField math;
    private javax.swing.JTextField middlename;
    private javax.swing.JButton save;
    private javax.swing.JTextField science;
    private javax.swing.JComboBox sex;
    private javax.swing.JButton viewButton;
    private javax.swing.JPanel viewPanel;
    private javax.swing.JButton viewRecord;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
