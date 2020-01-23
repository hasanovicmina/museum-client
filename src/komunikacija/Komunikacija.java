/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author hasan
 */
public class Komunikacija {
    private static Komunikacija instanca;
    Socket s;
    
    private Komunikacija() {
        try {
            s = new Socket("localhost", 9000);
           
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(null, "Server je zaustavljen.");
        }
    }

    public static Komunikacija getInstanca() {
      if(instanca == null){
          instanca = new Komunikacija();
      }
        return instanca;
    }
    
    public ServerskiOdgovor primiOdgovor(){
        ServerskiOdgovor so = new ServerskiOdgovor();
        try {
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            so = (ServerskiOdgovor) ois.readObject();
        } catch (IOException ex) {
   //         JOptionPane.showMessageDialog(null, "Server je zaustavljen.");
            so.setUspesno(false);
        } catch (ClassNotFoundException ex) {
   //         JOptionPane.showMessageDialog(null, "Server je zaustavljen.");
            so.setUspesno(false);  
        }
        return so;
    }
    
    public void posaljiZahtev(KlijentskiZahtev kz) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(kz);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Server je zaustavljen.");

        }
    }
    
}
