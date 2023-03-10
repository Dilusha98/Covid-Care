/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard_Design;

import Main.DBConnection;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.sql.Statement;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.synth.SynthLookAndFeel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;





/**
 *
 * @author Darkheart
 */
public class Report_Design extends javax.swing.JPanel {
    public static Connection Conn = null;
    public Statement stmt = null;
    public PreparedStatement pst = null;
    public String sql= "";
    public ResultSet rs = null;
    public static boolean roleView = true;
    
    /**
     * Creates new form ReportPanel
     */
    public Report_Design() {
        initComponents();
        Conn = DBConnection.getconn();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReportPanel = new javax.swing.JPanel();
        ReportShowPanel = new javax.swing.JPanel();
        ViewBTN = new javax.swing.JButton();
        ReportBG = new javax.swing.JLabel();
        ViewerPanel = new javax.swing.JPanel();
        MainWigdetLBL2 = new javax.swing.JLabel();

        setOpaque(false);

        ReportPanel.setOpaque(false);
        ReportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportShowPanel.setBackground(new java.awt.Color(255, 255, 255));
        ReportShowPanel.setForeground(new java.awt.Color(255, 255, 255));
        ReportShowPanel.setOpaque(false);
        ReportShowPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/Report/ViewBTNNormal.png"))); // NOI18N
        ViewBTN.setBorder(null);
        ViewBTN.setContentAreaFilled(false);
        ViewBTN.setPreferredSize(new java.awt.Dimension(220, 100));
        ViewBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/Report/ViewBTNSelect.png"))); // NOI18N
        ViewBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/Report/ViewBTNRoll.png"))); // NOI18N
        ViewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBTNActionPerformed(evt);
            }
        });
        ReportShowPanel.add(ViewBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 240, 100));

        ReportBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/Report/ReportBG.png"))); // NOI18N
        ReportShowPanel.add(ReportBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 550, -1));

        ReportPanel.add(ReportShowPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 21, 890, 450));

        ViewerPanel.setBackground(new java.awt.Color(255, 255, 255));
        ViewerPanel.setForeground(new java.awt.Color(255, 255, 255));
        ViewerPanel.setOpaque(false);
        ViewerPanel.setLayout(new javax.swing.BoxLayout(ViewerPanel, javax.swing.BoxLayout.LINE_AXIS));
        ReportPanel.add(ViewerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 21, 890, 450));

        MainWigdetLBL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/DashNormalWidget/DashMainWidget.png"))); // NOI18N
        MainWigdetLBL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MainWigdetLBL2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MainWigdetLBL2MouseExited(evt);
            }
        });
        ReportPanel.add(MainWigdetLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 930, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MainWigdetLBL2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainWigdetLBL2MouseEntered
        MainWigdetLBL2.setIcon(new ImageIcon("src/UI_Images/DashRolloverWidget/DashMainWigdetRollover.png"));
    }//GEN-LAST:event_MainWigdetLBL2MouseEntered

    private void MainWigdetLBL2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainWigdetLBL2MouseExited
        MainWigdetLBL2.setIcon(new ImageIcon("src/UI_Images/DashNormalWidget/DashMainWidget.png"));
    }//GEN-LAST:event_MainWigdetLBL2MouseExited

    private void ViewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBTNActionPerformed
        
        if(roleView)
        {
            ReportShowPanel.setVisible(false);
            ViewerPanel.setVisible(true);
            ReportGenarate();
        }
        else if(roleView == false)
        {
            JOptionPane.showMessageDialog(null, "Only Admin Users Can View Report!");
        }
        
 
    }//GEN-LAST:event_ViewBTNActionPerformed

    private void ReportGenarate()
    {
        

            //Path to your .jasper file in your package
            String reportName = "src/Dashboard_Design/report1.jasper";
            //Get a stream to read the file
            String is = reportName;


            
            //Fill the report with parameter, connection and the stream reader
            JasperPrint jp = null;
            
                try {
                    jp = JasperFillManager.fillReport(is, null, Conn);
                    //Viewer for JasperReport
                        
                        
                } catch (JRException ex) 
                {
                    Logger.getLogger(Report_Design.class.getName()).log(Level.SEVERE, null, ex);
                }
                                 net.sf.jasperreports.swing.JRViewer jv = new net.sf.jasperreports.swing.JRViewer(jp);
                                 ViewerPanel.removeAll();
                                 ViewerPanel.add(jv);
                                 ViewerPanel.repaint();
                                 ViewerPanel.revalidate();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainWigdetLBL2;
    private javax.swing.JLabel ReportBG;
    public javax.swing.JPanel ReportPanel;
    public javax.swing.JPanel ReportShowPanel;
    public javax.swing.JButton ViewBTN;
    public javax.swing.JPanel ViewerPanel;
    // End of variables declaration//GEN-END:variables
}
