/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForgotPassword_Design;

import Dashboard_Design.DashboardMain_Design;
import Dashboard_Design.Report_Design;
import Main.DBConnection;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.sql.PreparedStatement;

/**
 *
 * @author Darkheart
 */
public class ResetPassword extends javax.swing.JFrame {

    public Connection Conn = null;
    public Statement stmt = null;
    public String sql ="";
    public ResultSet rs = null;
    private String EmailAdd = null;
    private String Username = null;
    public PreparedStatement pst = null;
    private static String EmailUname;
    private static String EmailPass;
    
    /**
     * Creates new form ResetPassword
     * @param Mail
     * @param User
     */
    public ResetPassword(String Mail,String User) {
        initComponents();
        Conn = DBConnection.getconn();
        EmailAdd = Mail;
        Username = User;
        SendMail("Reset code has been sent to your Email..");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CancelBTN = new javax.swing.JButton();
        ResetCode = new javax.swing.JTextField();
        NewPassword = new javax.swing.JPasswordField();
        ConfirmPassword = new javax.swing.JPasswordField();
        ResetCodeTextBoxLBL = new javax.swing.JLabel();
        NewPassTextBoxLBL = new javax.swing.JLabel();
        CpassTextBoxLBL = new javax.swing.JLabel();
        ResetBTN = new javax.swing.JButton();
        ResendBTN = new javax.swing.JButton();
        BackgroundUI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CancelBTN.setBackground(new java.awt.Color(242, 242, 242));
        CancelBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/CancelBTN/CancelBTN.png"))); // NOI18N
        CancelBTN.setBorder(null);
        CancelBTN.setContentAreaFilled(false);
        CancelBTN.setIconTextGap(0);
        CancelBTN.setMargin(new java.awt.Insets(0, 0, 0, 0));
        CancelBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/CancelBTN/CancelBTNPressed.png"))); // NOI18N
        CancelBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/CancelBTN/CancelBTNRollOver.png"))); // NOI18N
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 3, -1, -1));

        ResetCode.setBorder(null);
        ResetCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ResetCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ResetCodeFocusLost(evt);
            }
        });
        getContentPane().add(ResetCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 290, 30));

        NewPassword.setBorder(null);
        NewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NewPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NewPasswordFocusLost(evt);
            }
        });
        getContentPane().add(NewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 290, 30));

        ConfirmPassword.setBorder(null);
        ConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ConfirmPasswordFocusLost(evt);
            }
        });
        getContentPane().add(ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 290, 30));

        ResetCodeTextBoxLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/ForgotPassword/SearchUsernameTextBox.png"))); // NOI18N
        getContentPane().add(ResetCodeTextBoxLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 340, 50));

        NewPassTextBoxLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/ForgotPassword/SearchUsernameTextBox.png"))); // NOI18N
        getContentPane().add(NewPassTextBoxLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 340, 50));

        CpassTextBoxLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/ForgotPassword/SearchUsernameTextBox.png"))); // NOI18N
        getContentPane().add(CpassTextBoxLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 340, 50));

        ResetBTN.setBackground(new java.awt.Color(242, 242, 242));
        ResetBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/ResetPassword/ResetBTNNormal.png"))); // NOI18N
        ResetBTN.setToolTipText("");
        ResetBTN.setBorder(null);
        ResetBTN.setContentAreaFilled(false);
        ResetBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/ResetPassword/ResetBTNSelect.png"))); // NOI18N
        ResetBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/ResetPassword/ResetBTNRoll.png"))); // NOI18N
        ResetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 110, 50));

        ResendBTN.setBackground(new java.awt.Color(242, 242, 242));
        ResendBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/SignUp/ResendNormalBTN.png"))); // NOI18N
        ResendBTN.setBorder(null);
        ResendBTN.setContentAreaFilled(false);
        ResendBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/SignUp/ResendSelected.png"))); // NOI18N
        ResendBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/SignUp/ResendBTNRoll.png"))); // NOI18N
        ResendBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResendBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ResendBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 120, 50));

        BackgroundUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/ResetPassword.png"))); // NOI18N
        getContentPane().add(BackgroundUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelBTNActionPerformed

    private void ResetCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResetCodeFocusGained
        ResetCodeTextBoxLBL.setIcon(new ImageIcon("src/UI_Images/ResetPassword/TextBoxFocus.png"));
    }//GEN-LAST:event_ResetCodeFocusGained

    private void ResetCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResetCodeFocusLost
        ResetCodeTextBoxLBL.setIcon(new ImageIcon("src/UI_Images/ResetPassword/TextBox.png"));
    }//GEN-LAST:event_ResetCodeFocusLost

    private void ResendBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResendBTNActionPerformed
        SendMail("Resend Code Sent Success..");
    }//GEN-LAST:event_ResendBTNActionPerformed

    private void NewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewPasswordFocusGained
        NewPassTextBoxLBL.setIcon(new ImageIcon("src/UI_Images/ResetPassword/TextBoxFocus.png"));
    }//GEN-LAST:event_NewPasswordFocusGained

    private void NewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewPasswordFocusLost
        NewPassTextBoxLBL.setIcon(new ImageIcon("src/UI_Images/ResetPassword/TextBox.png"));
    }//GEN-LAST:event_NewPasswordFocusLost

    private void ConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordFocusGained
        CpassTextBoxLBL.setIcon(new ImageIcon("src/UI_Images/ResetPassword/TextBoxFocus.png"));
    }//GEN-LAST:event_ConfirmPasswordFocusGained

    private void ConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordFocusLost
        CpassTextBoxLBL.setIcon(new ImageIcon("src/UI_Images/ResetPassword/TextBox.png"));
    }//GEN-LAST:event_ConfirmPasswordFocusLost

    private void ResetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBTNActionPerformed
        
        System.out.println("Reset BTN pressed!");
        if(Integer.valueOf(ResetCode.getText())==randomCode){
         System.out.println("Code is Correct!");
            
                    
        String password = String.valueOf(NewPassword.getPassword());
        String confirmPass = String.valueOf(ConfirmPassword.getPassword());
        String Role;
                    if(password.equals(confirmPass))
                    { 
                        try 
                        {
                            stmt = Conn.createStatement();
                            sql = "update Users set Password = '"+password+"' where Uname ='"+Username+"'";
                            stmt.executeUpdate(sql);
                            
                            JOptionPane.showMessageDialog(null, "Password Reset Success..");
                            

                            
                            
                                sql = "SELECT * FROM Users WHERE Uname = ?";
        
                                try {
                                    pst = Conn.prepareStatement(sql);

                                    pst.setString(1, Username);
                                    

                                    rs = pst.executeQuery();

                                    if(rs.next())
                                    {
                                        Role = rs.getString("Role");

                                    if("admin".toLowerCase().trim().equals(Role))
                                    {
                                        DashboardMain_Design Dash = new DashboardMain_Design();
                                        this.setVisible(false);
                                        this.dispose();

                                        Dash.UpdataDP(Username);
                                        Dash.DashUserNameLBL.setText(Username);

                                        System.out.println("Login in!");
                                        Dash.setVisible(true);
                                        
                                    }
                                    else if ("user".toLowerCase().trim().equals(Role)) 
                                    {

                                        DashboardMain_Design Dash = new DashboardMain_Design();

                                        Dash.UpdataDP(Username);
                                        Dash.DashUserNameLBL.setText(Username);

                                        Dash.Register.TabbedPane.removeTabAt(2);
                                        Dash.Register.TabbedPane.removeTabAt(1);

                                        Dash.Settings.TabbedPane.removeTabAt(1);
                                        Report_Design.roleView = false;

                                        this.setVisible(false);
                                        this.dispose();
                                        System.out.println("Login in!");
                                        Dash.setVisible(true);


                                    }
                                    }
                            

                            
                        } 
                        catch (SQLException ex) 
                        {
                            Logger.getLogger(ResetPassword.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        } catch (SQLException ex) {
                 Logger.getLogger(ResetPassword.class.getName()).log(Level.SEVERE, null, ex);
             }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Password is not matching, Retype!");
                    }

                    
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Verification Code is Wrong!");
            }
        
    }//GEN-LAST:event_ResetBTNActionPerformed

    private int randomCode;
    
    
    private void ReadConfig()
    {
        BufferedReader br = null;
        try {
            File file = new File("Config.txt"); // java.io.File
            FileReader fr = new FileReader(file); // java.io.FileReader
            br = new BufferedReader(fr); // java.io.BufferedReader
            String line;
            while ((line = br.readLine()) != null) 
            {
              // process the line

		if (line.startsWith("MailUN")) 
                { // check for a value (string starting with "")
                    
                    EmailUname = line.substring(6).trim(); // show it in the label in the userinterface
                    System.out.println("Username"+EmailUname);
		}
              
                if (line.startsWith("MailPW")) 
                { // check for a value (string starting with "")
                    
                    EmailPass = line.substring(6).trim(); // show it in the label in the userinterface
                    System.out.println("Password"+EmailPass );
		}
            }
          }
          catch(IOException e) { e.printStackTrace();}
          finally
          {
              try { if (br != null) {
                  br.close();
              } }
              catch(IOException e) { e.printStackTrace(); }
          }
        
    }
    
    private void SendMail(String showmsg)
    {
        ReadConfig();
        
        try{
        Random rand = new Random();
        randomCode=rand.nextInt(999999);
        String host = "smtp.gmail.com";
        String user = EmailUname;
        String pass = EmailPass;
        String to = EmailAdd;
        String subject="CovidCare Password Reset Code";
        String message ="Your reset code is "+randomCode;
        boolean sessionDebug = false;
        Properties pros = System.getProperties();
        pros.put("mail.smtp.starttls.enable", "true");
        pros.put("mail.smtp.host", "host");
        pros.put("mail.smtp.port","587");
        pros.put("mail.smtp.auth","true");
        pros.put("mail.smtp.starttls.required", "true");
        java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        Session mailSession = Session.getDefaultInstance(pros, null);
        mailSession.setDebug(sessionDebug);
        Message msg = new MimeMessage(mailSession);
        msg.setFrom(new InternetAddress(user));
        InternetAddress [] address = {new InternetAddress(to)};
        msg.setRecipients(Message.RecipientType.TO, address);
        msg.setSubject(subject);
        msg.setText(message);
            try (Transport transport = mailSession.getTransport("smtp")) {
                transport.connect(host, user, pass);
                transport.sendMessage(msg, msg.getAllRecipients());
            }
        JOptionPane.showMessageDialog(null, showmsg);
        }catch(HeadlessException | MessagingException ex){
        JOptionPane.showMessageDialog(rootPane, ex);
        }
                System.out.println("Mail Sent!");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try
        {
            UIManager.setLookAndFeel(new SynthLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundUI;
    private javax.swing.JButton CancelBTN;
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JLabel CpassTextBoxLBL;
    private javax.swing.JLabel NewPassTextBoxLBL;
    private javax.swing.JPasswordField NewPassword;
    private javax.swing.JButton ResendBTN;
    private javax.swing.JButton ResetBTN;
    private javax.swing.JTextField ResetCode;
    private javax.swing.JLabel ResetCodeTextBoxLBL;
    // End of variables declaration//GEN-END:variables
}
