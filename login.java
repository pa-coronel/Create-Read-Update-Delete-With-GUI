
package crud;

import javax.swing.UIManager;

public class login extends javax.swing.JFrame {

    public login() {
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        
        initComponents();
        setLocationRelativeTo(null);
        //getContentPane().setBackground(new java.awt.Color(102, 102, 102));
        incorrect.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        incorrect = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("welcome to student record");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("MS Reference Sans Serif", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(204, 204, 204));
        setName("Student Record"); // NOI18N
        setPreferredSize(new java.awt.Dimension(523, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(523, 428));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 30)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bulacan State University");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 30, 380, 50);

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sarmiento Campus");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 70, 190, 30);

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(420, 30, 110, 30);

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(450, 70, 100, 20);

        jLabel14.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel14.setText("Powered by: UnderGround");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 110, 210, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 570, 140);

        password.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(290, 240, 190, 40);

        username.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(username);
        username.setBounds(290, 170, 190, 40);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel1.setText("username");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 220, 69, 18);
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel2.setLabelFor(password);
        jLabel2.setText("password");
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 290, 68, 18);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/Bulacan_State_University_logo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 30, 250, 250);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20)); // NOI18N
        jLabel3.setText("BSIT 2C2 Student Records");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 270, 270, 45);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 110, 270, 320);

        login.setBackground(new java.awt.Color(0, 204, 204));
        login.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        login.setText("login");
        login.setBorder(null);
        login.setBorderPainted(false);
        login.setFocusable(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(330, 320, 110, 41);

        incorrect.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        incorrect.setForeground(new java.awt.Color(255, 0, 0));
        incorrect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        incorrect.setText("incorrect username or password");
        incorrect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        incorrect.setFocusable(false);
        getContentPane().add(incorrect);
        incorrect.setBounds(290, 370, 200, 20);

        getAccessibleContext().setAccessibleName("frame1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        if(username.getText().equals("admin") && String.valueOf(password.getPassword()).equals("admin")){
            this.setVisible(false);
            new menu().setVisible(true);
        }else{
            incorrect.setVisible(true);
        } 
        
    }//GEN-LAST:event_loginActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if(evt.getKeyChar() == '\n'){
            if(username.getText().equals("admin") && String.valueOf(password.getPassword()).equals("admin")){
                this.setVisible(false);
                new menu().setVisible(true);
            }else{
                incorrect.setVisible(true);
            } 
        }
    }//GEN-LAST:event_passwordKeyPressed

    public static void main(String args[]) {             
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel incorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
