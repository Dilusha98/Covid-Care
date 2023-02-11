package Main;

import Dashboard_Design.DashboardMain_Design;
import Login_Design.Login;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;




/**
 *
 * @author Darkheart
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.getLookAndFeelDefaults().put("Panel.background", Color.WHITE);
            UIManager.getLookAndFeelDefaults().put("ScrollPane.border", "com.formdev.flatlaf.ui.FlatEmptyBorder@6b01ab73");
            UIManager.getLookAndFeelDefaults().put("Table.scrollPaneBorder", "com.formdev.flatlaf.ui.FlatEmptyBorder@6b01ab73");
            
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FinalProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                Login open = new Login();
                open.setVisible(true);

                //DashboardMain_Design open = new DashboardMain_Design();
                //open.setVisible(true);
    }
    
}
