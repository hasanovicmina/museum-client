/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.vodici;

import domen.Izlozba;
import domen.Vodic;
import forme.MeniForma;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import kontroler.Kontroler;
import sesija.Sesija;
import transfer.ServerskiOdgovor;

/**
 *
 * @author hasan
 */
public class UnosVodica extends javax.swing.JFrame {

    List<Izlozba> listaIzlozbi;
    /**
     * Creates new form UnosVodica
     */
    public UnosVodica() {
        initComponents();
        this.setTitle("Unos vodiča");
        
        srediFormu();
        this.setLocationRelativeTo(null);
        this.setResizable(false);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        btnNazad = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datDatum = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbIzlozbe = new javax.swing.JComboBox();
        btnSacuvaj = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNazad.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        btnNazad.setText("<- Nazad ");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(235, 232, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel1.setText("Ime:");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel2.setText("Prezime:");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel3.setText("Datum vođenja:");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel4.setText("Izaberi izložbu:");

        cmbIzlozbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIzlozbeActionPerformed(evt);
            }
        });

        btnSacuvaj.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        btnSacuvaj.setText("Sačuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSacuvaj)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbIzlozbe, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(txtIme)
                                .addComponent(datDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(datDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbIzlozbe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNazad)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNazad)
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadActionPerformed
        MeniForma mf = new MeniForma();
        mf.setUlogovaniZaposleni(Sesija.getInstanca().getZaposleni());
        mf.srediIzgled();
        mf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNazadActionPerformed

    private void cmbIzlozbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIzlozbeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIzlozbeActionPerformed

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        String ime = txtIme.getText().trim();
        String poruka = "Vodič nije kreiran!\n";
        if(ime.isEmpty()){
            String p = "Ime je obavezno polje.";
            JOptionPane.showMessageDialog(this, poruka+p);
            return;
            
        }
     
        String prezime = txtPrezime.getText().trim();
        if(prezime.isEmpty()){
            String p = "Prezime je obavezno polje.";
            JOptionPane.showMessageDialog(this, poruka+p);
            return;
            
        }
        
        String imePrezime = ime+" "+prezime;
        if(imePrezime.length()>=50){
            String p = "Predugačko ime i prezime.";
            JOptionPane.showMessageDialog(this, poruka+p);
            return;
        }
        Date datumVodjenja = datDatum.getDate();
        if(datumVodjenja == null){
            String p = "Datum je obavezno polje.";
            JOptionPane.showMessageDialog(this, poruka+p);
            return;
        }
        Calendar kalendar = Calendar.getInstance();
        kalendar.setTime(datumVodjenja);
        int dan = kalendar.get(Calendar.DAY_OF_WEEK);
        if(dan == 7 || dan == 1){
            String p = "Vodič ne može da bude angažovan vikendom.";
            JOptionPane.showMessageDialog(this, poruka+p);
            return;
        }
        Izlozba i = (Izlozba) cmbIzlozbe.getSelectedItem();
        if(i == null){
            String p = "Morate da izaberete jednu izložbu.";
            JOptionPane.showMessageDialog(this, poruka+p);
            return;
        }
        
        Vodic vodic = new Vodic(-1, imePrezime, datumVodjenja, i.getIzlozbaID());
        ServerskiOdgovor so = Kontroler.getInstanca().kreirajVodica(vodic);
       
        if(so != null && so.isUspesno()){
            JOptionPane.showMessageDialog(this, "Vodič je sačuvan!");
        }else{
            JOptionPane.showMessageDialog(this, "Neuspelo čuvanje vodiča!");
            
        }
        
        
    }//GEN-LAST:event_btnSacuvajActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UnosVodica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnosVodica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnosVodica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnosVodica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnosVodica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox cmbIzlozbe;
    private com.toedter.calendar.JDateChooser datDatum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        listaIzlozbi= new ArrayList<>();
        Izlozba izlozba = new Izlozba(-1, "", "", null, null);
        ServerskiOdgovor so = Kontroler.getInstanca().vratiListuIzlozbi(izlozba);
        if (so != null && so.getParametar()!=null) {
            listaIzlozbi = (List<Izlozba>) so.getParametar();
            cmbIzlozbe.removeAllItems();
            cmbIzlozbe.insertItemAt(null, 0);
            for (Izlozba i : listaIzlozbi) {
                cmbIzlozbe.addItem(i);
            }

            System.out.println("Sistem je vratio listu izlozbi.");
        } else {
            JOptionPane.showMessageDialog(this, "Neuspešno učitana lista izlozbi. Pokušajte kasnije");
            btnSacuvaj.setEnabled(false);
            return;
        }
    }
}
