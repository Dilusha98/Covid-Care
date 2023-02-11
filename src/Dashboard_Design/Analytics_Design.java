/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dashboard_Design;

import Main.DBConnection;
import com.raven.chart.ModelChartLine;
import com.raven.chart.ModelChartPie;
import com.raven.chart.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;


/**
 *
 * @author Darkheart
 */
public class Analytics_Design extends javax.swing.JPanel {

    private Statement stmt = null;
    private PreparedStatement pst = null;
    private String sql = "";
    private ResultSet rs = null;
    private static Connection Conn = null;
    public int availbleTotalDose = 0;
    private final java.sql.Date todaysDate = new java.sql.Date(new java.util.Date().getTime());
    
    /**
     * Creates new form Analytics_Design
     */
    public Analytics_Design() {
          
        initComponents();
        Conn = DBConnection.getconn();
        /*
        chart.addLegend("First Dose Given", new Color(245, 189, 135));
        chart.addLegend("Second Dose Given", new Color(135, 189, 245));
        chart.addLegend("Fully Vaccinated", new Color(189, 135, 245));
        chart.addLegend("Cost", new Color(139, 229, 222));
        chart.addLegend("avg", new Color(100, 229, 222));
        chart.addData(new ModelChart("January", new double[]{500,500, 200, 80,89}));
        chart.addData(new ModelChart("Febuary", new double[]{500,500, 200, 80,89}));*/
        

        /*
        Pfizer-BioNTech
        Moderna
        Johnson & Johnson’s Janssen
        Gamaleya/Sputnik V
        Covishield (Oxford/AstraZeneca formulation)
        Sinopharm
        Sinovac CoronaVac*/
        updateCharts();
        
        //todaysDate = new java.sql.Date(new java.util.Date().getTime());

        
        int pastDay=2;

        //java.sql.Date futureDate = addDays(todaysDate, futureDay);
        java.sql.Date pastDate = subtractDays(todaysDate, 1);

  }
    
    
    public static Date subtractDays(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, -days);
        return new Date(c.getTimeInMillis());
    }

    public int AvailbleTotalDose()
    {
        availbleTotalDose = (int) ((int) (updatePieChart01("Pfizer-BioNTech")-updatePieChart02("Pfizer-BioNTech")) + updatePieChart01("Moderna")-updatePieChart02("Moderna") + updatePieChart01("Johnson & Johnson’s Janssen")-updatePieChart02("Johnson & Johnson’s Janssen") + updatePieChart01("Gamaleya/Sputnik V")-updatePieChart02("Gamaleya/Sputnik V") + updatePieChart01("Covishield (Oxford/AstraZeneca formulation)")-updatePieChart02("Covishield (Oxford/AstraZeneca formulation)") + updatePieChart01("Sinopharm")-updatePieChart02("Sinopharm") + updatePieChart01("Sinovac CoronaVac")-updatePieChart02("Sinovac CoronaVac"));
        
        return availbleTotalDose;
    }
    
        List<ModelChartPie> list1 = new ArrayList<>();
        List<ModelChartPie> list2 = new ArrayList<>();
        List<ModelChartLine> list = new ArrayList<>();
        //private boolean atrue = false;
        
    public void updateCharts()
    {
        /*
            if(atrue == true)
            {
                /*chartPie.getModel().clear();
                chartPie.getModel().set(0,new ModelChartPie("Pfizer", updatePieChart01("Pfizer-BioNTech")-updatePieChart02("Pfizer-BioNTech"), new Color(4, 174, 243)));
                chartPie.getModel().set(1,new ModelChartPie("Moderna", updatePieChart01("Moderna")-updatePieChart02("Moderna"), new Color(215, 39, 250)));
                chartPie.getModel().set(2,new ModelChartPie("J & J Janssen", updatePieChart01("Johnson & Johnson’s Janssen")-updatePieChart02("Johnson & Johnson’s Janssen"), new Color(44, 88, 236)));
                chartPie.getModel().set(3,new ModelChartPie("Sputnik V", updatePieChart01("Gamaleya/Sputnik V")-updatePieChart02("Gamaleya/Sputnik V"), new Color(21, 202, 87)));
                chartPie.getModel().set(4,new ModelChartPie("AstraZeneca", updatePieChart01("Covishield (Oxford/AstraZeneca formulation)")-updatePieChart02("Covishield (Oxford/AstraZeneca formulation)"), new Color(127, 63, 255)));
                chartPie.getModel().set(5,new ModelChartPie("Sinopharm", updatePieChart01("Sinopharm")-updatePieChart02("Sinopharm"), new Color(238, 167, 35)));
                chartPie.getModel().set(6,new ModelChartPie("Sinovac", updatePieChart01("Sinovac CoronaVac")-updatePieChart02("Sinovac CoronaVac"), new Color(245, 79, 99)));
                */
                //chartPie.getModel().removeAll(list1);

                //chartPie.setModel(list1);
                /*
                double ff = chartPiem.getModel().get(1).getValue();
                System.out.println("test "+ff);
                
                chartPiem.getModel().get(1).setValue(500);//set(0,new ModelChartPie("Pfizer", 500, new Color(4, 174, 243)));
                double f2 = chartPiem.getModel().get(1).getValue();
                
                //chartPiem.setModel();
                
                chartPiem.initData();
                
                System.out.println("test "+f2);
                //chartPie1.getModel().clear();
                //chartLine1.getModel().clear();
            }
            
            
            else
            {
                */    
                    
                list1.add(new ModelChartPie("Pfizer", updatePieChart01("Pfizer-BioNTech")-updatePieChart02("Pfizer-BioNTech"), new Color(4, 174, 243)));
                list1.add(new ModelChartPie("Moderna", updatePieChart01("Moderna")-updatePieChart02("Moderna"), new Color(215, 39, 250)));
                list1.add(new ModelChartPie("J & J Janssen", updatePieChart01("Johnson & Johnson’s Janssen")-updatePieChart02("Johnson & Johnson’s Janssen"), new Color(44, 88, 236)));
                list1.add(new ModelChartPie("Sputnik V", updatePieChart01("Gamaleya/Sputnik V")-updatePieChart02("Gamaleya/Sputnik V"), new Color(21, 202, 87)));
                list1.add(new ModelChartPie("AstraZeneca", updatePieChart01("Covishield (Oxford/AstraZeneca formulation)")-updatePieChart02("Covishield (Oxford/AstraZeneca formulation)"), new Color(127, 63, 255)));
                list1.add(new ModelChartPie("Sinopharm", updatePieChart01("Sinopharm")-updatePieChart02("Sinopharm"), new Color(238, 167, 35)));
                list1.add(new ModelChartPie("Sinovac", updatePieChart01("Sinovac CoronaVac")-updatePieChart02("Sinovac CoronaVac"), new Color(245, 79, 99)));
                chartPiem.setModel(list1);
                
                
                
                
                list2.add(new ModelChartPie("Pfizer", updatePieChart02("Pfizer-BioNTech"), new Color(4, 174, 243)));
                list2.add(new ModelChartPie("Moderna", updatePieChart02("Moderna"), new Color(215, 39, 250)));
                list2.add(new ModelChartPie("J & J Janssen", updatePieChart02("Johnson & Johnson’s Janssen"), new Color(44, 88, 236)));
                list2.add(new ModelChartPie("Sputnik V", updatePieChart02("Gamaleya/Sputnik V"), new Color(21, 202, 87)));
                list2.add(new ModelChartPie("AstraZeneca", updatePieChart02("Covishield (Oxford/AstraZeneca formulation)"), new Color(127, 63, 255)));
                list2.add(new ModelChartPie("Sinopharm", updatePieChart02("Sinopharm"), new Color(238, 167, 35)));
                list2.add(new ModelChartPie("Sinovac", updatePieChart02("Sinovac CoronaVac"), new Color(245, 79, 99)));
                chartPie1.setModel(list2);
                
                
                
                list.add(new ModelChartLine("Day 01", updateLineChart(subtractDays(todaysDate, 0))));
                list.add(new ModelChartLine("Day 02", updateLineChart(subtractDays(todaysDate, 1))));
                list.add(new ModelChartLine("Day 03", updateLineChart(subtractDays(todaysDate, 2))));
                list.add(new ModelChartLine("Day 04", updateLineChart(subtractDays(todaysDate, 3))));
                list.add(new ModelChartLine("Day 05", updateLineChart(subtractDays(todaysDate, 4))));
                list.add(new ModelChartLine("Day 06", updateLineChart(subtractDays(todaysDate, 5))));
                list.add(new ModelChartLine("Day 07", updateLineChart(subtractDays(todaysDate, 6))));
                chartLine1.setModel(list);
                
    
    }
          
    private double updateLineChart(java.sql.Date Date)
    {
        
        double sum = 0;
        try 
        {
            sql = "SELECT SUM(DoseCount) FROM (SELECT VName, COUNT(FirstDoseStatus) AS DoseCount FROM dosestatus WHERE FirstDoseDate = '"+Date+"' AND FirstDoseStatus = 'Taken' UNION ALL SELECT VName, COUNT(SecondDoseStatus) AS DoseCount FROM dosestatus WHERE SecondDoseDate = '"+Date+"' AND SecondDoseStatus = 'Taken')a";
            
            stmt = Conn.createStatement();
       
            rs = stmt.executeQuery(sql);

            if(rs.next() == false)
            {
                sum = 0;
            }
            
            else
            {
                
            do
            {  
                if(rs.getString("SUM(DoseCount)") == null)
                {
                    sum = 0;
                }
                
                else 
                {
                    sum = Double.valueOf(rs.getString("SUM(DoseCount)"));
                }
               
               
            }while(rs.next());
            
            }
            rs.close();
        }
                
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        

        return sum;
    }
    
    private double updatePieChart01(String vaccname)
    {
        
        double sum = 0;
        try 
        {
            sql = "SELECT VaccName, SUM(Quantity) FROM vaccines WHERE VaccName = '"+vaccname+"'";
            
            stmt = Conn.createStatement();
       
            rs = stmt.executeQuery(sql);

            if(rs.next() == false)
            {
                sum = 0;
            }
            
            else
            {
                
            do
            {  
                if(rs.getString("SUM(Quantity)") == null)
                {
                    sum = 0;
                }
                
                else 
                {
                    sum = Double.valueOf(rs.getString("SUM(Quantity)"));
                }
               
               
            }while(rs.next());
            
            }
            rs.close();
        }
                
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        

        return sum;
    }
    

    private double updatePieChart02(String vaccname)
    {
        double sum = 0;
        
        try 
        {
            sql = "SELECT SUM(DoseCount) FROM (SELECT VName, COUNT(FirstDoseStatus) AS DoseCount FROM dosestatus WHERE VName = '"+vaccname+"' AND FirstDoseStatus = 'Taken' UNION ALL SELECT VName, COUNT(SecondDoseStatus) AS DoseCount FROM dosestatus WHERE VName = '"+vaccname+"' AND SecondDoseStatus = 'Taken')a";
            
            stmt = Conn.createStatement();
       
            rs = stmt.executeQuery(sql);

            if(rs.next() == false)
            {
                sum = 0;
            }
            
            else
            {
                
            do
            {  
                if(rs.getString("SUM(DoseCount)") == null)
                {
                    sum = 0;
                }
                
                else 
                {
                    sum = Double.valueOf(rs.getString("SUM(DoseCount)"));
                }
               
               
            }while(rs.next());
            
            }
            rs.close();
        }
                
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        

        return sum;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnalyticsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chartPie1 = new com.raven.chart.ChartPie();
        chartLine1 = new com.raven.chart.ChartLine();
        jPanel1 = new javax.swing.JPanel();
        chartPiem = new com.raven.chart.ChartPie();
        MainWidgetLBL = new javax.swing.JLabel();

        setOpaque(false);

        AnalyticsPanel.setOpaque(false);
        AnalyticsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/Analytics/Last 7 Days Given Vaccines.png"))); // NOI18N
        AnalyticsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 250, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/Analytics/Available Total Vaccines.png"))); // NOI18N
        AnalyticsPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 23, 240, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/Analytics/Group 35.png"))); // NOI18N
        AnalyticsPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 360, 240));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/Analytics/Given Total Vaccines.png"))); // NOI18N
        AnalyticsPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, 200, 20));
        AnalyticsPanel.add(chartPie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 400, 160));
        AnalyticsPanel.add(chartLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 430, -1));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(chartPiem);

        AnalyticsPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 450, 170));

        MainWidgetLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Images/DashNormalWidget/DashMainWidget.png"))); // NOI18N
        MainWidgetLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MainWidgetLBLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MainWidgetLBLMouseExited(evt);
            }
        });
        AnalyticsPanel.add(MainWidgetLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 930, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AnalyticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AnalyticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MainWidgetLBLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainWidgetLBLMouseEntered
        MainWidgetLBL.setIcon(new ImageIcon("src/UI_Images/DashRolloverWidget/DashMainWigdetRollover.png"));
    }//GEN-LAST:event_MainWidgetLBLMouseEntered

    private void MainWidgetLBLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainWidgetLBLMouseExited
        MainWidgetLBL.setIcon(new ImageIcon("src/UI_Images/DashNormalWidget/DashMainWidget.png"));
        
    }//GEN-LAST:event_MainWidgetLBLMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel AnalyticsPanel;
    private javax.swing.JLabel MainWidgetLBL;
    public com.raven.chart.ChartLine chartLine1;
    public com.raven.chart.ChartPie chartPie1;
    public com.raven.chart.ChartPie chartPiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
