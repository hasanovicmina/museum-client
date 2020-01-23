/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.izlozbe;

import domen.Delo;
import domen.Izlozba;
import forme.MeniForma;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import kontroler.Kontroler;
import modeli.ModelaTabeleIzlozbi;
import sesija.Sesija;
import transfer.ServerskiOdgovor;

/**
 *
 * @author hasan
 */
public class PretragaIzlozbe extends javax.swing.JFrame {

    
    Izlozba trenutnaIzlozba;
    /**
     * Creates new form PretragaIzlozbe
     */
    public PretragaIzlozbe() {
        initComponents();
        this.setTitle("Pretraga izložbe");
        
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

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnNazad4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPretrazi = new javax.swing.JButton();
        txtTip = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIzlozba = new javax.swing.JTable();
        btnIzaberi = new javax.swing.JButton();
        panelObrisi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        txtTip2 = new javax.swing.JTextField();
        lblDatOd = new javax.swing.JLabel();
        lblDatDo = new javax.swing.JLabel();
        btnObrisi = new javax.swing.JButton();
        cmbDela = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNazad4.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        btnNazad4.setText("<- Nazad ");
        btnNazad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazad4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(235, 232, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel1.setText("Tip");

        btnPretrazi.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        btnPretrazi.setText("Pretraži ");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        tblIzlozba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblIzlozba);

        btnIzaberi.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        btnIzaberi.setText("Otvori izabranu izložbu");
        btnIzaberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzaberiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(txtTip, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnPretrazi)))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnIzaberi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretrazi))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnIzaberi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        panelObrisi.setBackground(new java.awt.Color(235, 232, 221));
        panelObrisi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel2.setText("Naziv:");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel3.setText("Tip:");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel4.setText("Datum od:");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel5.setText("Datum do:");

        lblDatOd.setText("jLabel6");

        lblDatDo.setText("jLabel7");

        btnObrisi.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        btnObrisi.setText("Obriši ");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelObrisiLayout = new javax.swing.GroupLayout(panelObrisi);
        panelObrisi.setLayout(panelObrisiLayout);
        panelObrisiLayout.setHorizontalGroup(
            panelObrisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObrisiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelObrisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(panelObrisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelObrisiLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelObrisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDatDo)
                            .addComponent(lblDatOd)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtTip2)))
                    .addGroup(panelObrisiLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelObrisiLayout.setVerticalGroup(
            panelObrisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObrisiLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelObrisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelObrisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelObrisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDatOd))
                .addGap(29, 29, 29)
                .addGroup(panelObrisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblDatDo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnObrisi)
                .addGap(31, 31, 31))
        );

        cmbDela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNazad4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(panelObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmbDela, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNazad4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbDela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNazad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazad4ActionPerformed
        MeniForma mf = new MeniForma();
        mf.setUlogovaniZaposleni(Sesija.getInstanca().getZaposleni());
        mf.srediIzgled();
        mf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNazad4ActionPerformed

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        String tip = txtTip.getText().trim();
        if(tip.isEmpty()){
            JOptionPane.showMessageDialog(this, "Morate prvo da unesete tip.");
            return;
        }
         ModelaTabeleIzlozbi mti = new ModelaTabeleIzlozbi();
         tblIzlozba.setModel(mti);
        
        Izlozba i = new Izlozba(-1, "", tip, null, null);
        List<Izlozba> lista = new ArrayList<>();
        ServerskiOdgovor so = Kontroler.getInstanca().nadjiIzlozbe(i);
        if (so != null && so.getParametar() != null) {
            lista = (List<Izlozba>) so.getParametar();
            mti.setLista(lista);
            mti.osvezi();
            if (lista.size() != 0) {
                JOptionPane.showMessageDialog(this, "Izložbe su pronađene!");

            } else {
                JOptionPane.showMessageDialog(this, "Izložbe nisu pronađene!");

            }

        } else {
            JOptionPane.showMessageDialog(this, "Izložbe nisu pronađene!");
            return;
        }
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void btnIzaberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzaberiActionPerformed
        int red = tblIzlozba.getSelectedRow();
        if(red == -1){
            JOptionPane.showMessageDialog(this,"Niste izabrali nijednu izložbu.");
            return;
        }
        ModelaTabeleIzlozbi mtck = (ModelaTabeleIzlozbi) tblIzlozba.getModel();
        

        Izlozba i = mtck.vratiIzlozbu(red);
        panelObrisi.setVisible(true);
        ServerskiOdgovor so = Kontroler.getInstanca().ucitajIzlozbu(i);
        if (so != null && so.getParametar() != null) {
            setSize(new Dimension(920, 500));
            i = (Izlozba) so.getParametar();
            trenutnaIzlozba = i;

            txtNaziv.setText(i.getNaziv());
            txtNaziv.setEditable(false);
            txtTip2.setText(i.getTip());
            txtTip2.setEditable(false);
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            Date datOd = i.getDatumOd();
            Date datDo = i.getDatumDo();
            String od = "";
            String doo = "";
            if (datDo != null && datOd != null) {
                od = sdf.format(datOd);
                doo = sdf.format(datDo);
            } 
            lblDatOd.setText(od);
            lblDatDo.setText(doo);
            cmbDela.removeAllItems();
            
            ServerskiOdgovor so2  = Kontroler.getInstanca().ucitajDela(i);
            ArrayList<Delo> listaDela = (ArrayList<Delo>) so2.getParametar();
            if(listaDela!=null){
            for (Delo delo : listaDela) {
                cmbDela.addItem(delo);
            }
            }
            JOptionPane.showMessageDialog(this,"Izložba je pronađena.");
        }else{
            JOptionPane.showMessageDialog(this,"Izložba nije pronađena.");
            return;
        }
    }//GEN-LAST:event_btnIzaberiActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Izlozba i = trenutnaIzlozba;
        ServerskiOdgovor so = Kontroler.getInstanca().obrisiIzlozbu(i);
        if (so != null && so.isUspesno()) {
            ModelaTabeleIzlozbi mti = (ModelaTabeleIzlozbi) tblIzlozba.getModel();
            JOptionPane.showMessageDialog(this, "Izložba je obrisana!");
        } else {
            JOptionPane.showMessageDialog(this, "Brisanje izložbe nije uspelo!");
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void cmbDelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDelaActionPerformed

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
            java.util.logging.Logger.getLogger(PretragaIzlozbe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PretragaIzlozbe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PretragaIzlozbe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PretragaIzlozbe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PretragaIzlozbe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzaberi;
    private javax.swing.JButton btnNazad4;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JComboBox cmbDela;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatDo;
    private javax.swing.JLabel lblDatOd;
    private javax.swing.JPanel panelObrisi;
    private javax.swing.JTable tblIzlozba;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtTip;
    private javax.swing.JTextField txtTip2;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        setSize(new Dimension(550, 500));

        panelObrisi.setVisible(false);
        ModelaTabeleIzlozbi mti = new ModelaTabeleIzlozbi();
        tblIzlozba.setModel(mti);
    }
}