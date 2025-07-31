/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends_notes_system;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author HP
 */
public class Friends_Notes_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginFrame f1=new LoginFrame();
         f1.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        f1.setSize(d);
//       new EmailFetcher().getEmailAddress("ajinkyashinde");
    }
    
}
