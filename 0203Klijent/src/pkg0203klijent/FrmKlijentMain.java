/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg0203klijent;

import domain.Poruka;
import domain.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import klijent.Client;
import klijent.Controller;

/**
 *
 * @author vojislav
 */
public class FrmKlijentMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmKlijentMain
     */
    User user;
    public FrmKlijentMain(User user) {
        this.user = user;
        initComponents();
        txtChat.setEditable(false);
        
        jLabel1.setText("Dobrodosao korisnice "+user.getEmail());
        // startuje se nit koja prima requestove koje server salje, ovo je neophodno da bi aplikacija radila u realtime-u 
        // tj. da bi poruke pristizale kako se salju
        try {
            Client klijent = new Client(user,Controller.getInstance().socket,txtChat, cbLoginovani, this);
            klijent.start();
        } catch (Exception ex) {
            Logger.getLogger(FrmKlijentMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        btnPosaljiSvima = new javax.swing.JButton();
        btnPosaljiSpecificnom = new javax.swing.JButton();
        txtPoruka = new javax.swing.JTextField();
        cbLoginovani = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnPrikaziOdSpecificnog = new javax.swing.JButton();
        btnOsveziKorisnike = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtChat.setColumns(20);
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        btnPosaljiSvima.setText("Posalji svima");
        btnPosaljiSvima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosaljiSvimaActionPerformed(evt);
            }
        });

        btnPosaljiSpecificnom.setText("Posalji specificnom");
        btnPosaljiSpecificnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosaljiSpecificnomActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        btnPrikaziOdSpecificnog.setText("Prikazi od specificnog");
        btnPrikaziOdSpecificnog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziOdSpecificnogActionPerformed(evt);
            }
        });

        btnOsveziKorisnike.setText("Osvezi listu korisnika");
        btnOsveziKorisnike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsveziKorisnikeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPoruka)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 156, Short.MAX_VALUE)
                                .addComponent(cbLoginovani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPosaljiSvima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOsveziKorisnike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPosaljiSpecificnom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrikaziOdSpecificnog, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPosaljiSvima)
                    .addComponent(txtPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosaljiSpecificnom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLoginovani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrikaziOdSpecificnog)
                    .addComponent(btnOsveziKorisnike))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPosaljiSvimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosaljiSvimaActionPerformed
        // Za slanje svima se koristi slicna struktura kao za posalji specificnom, al u ovom slucaju u konstruktoru poruke nema primaoca, tj. on je null
        // to kasnije koristim kako bih znao koju metodu na serveru da pozivam
        if(!txtPoruka.getText().isEmpty()){
            Poruka poruka = new Poruka(txtPoruka.getText(),new Date(),user);
            try {
                Controller.getInstance().posaljiPoruku(poruka);
            } catch (IOException ex) {
                Logger.getLogger(FrmKlijentMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrmKlijentMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnPosaljiSvimaActionPerformed

    private void btnOsveziKorisnikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsveziKorisnikeActionPerformed
        
        try {
            Controller.getInstance().getOnlineUsers(user);
        } catch (IOException ex) {
            Logger.getLogger(FrmKlijentMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(FrmKlijentMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOsveziKorisnikeActionPerformed

    private void btnPosaljiSpecificnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosaljiSpecificnomActionPerformed
        if(!txtPoruka.getText().isEmpty()&&cbLoginovani.getSelectedItem()!=null){
            Poruka poruka = new Poruka(txtPoruka.getText(),new Date(),user, (User) cbLoginovani.getSelectedItem());
            try {
                Controller.getInstance().posaljiPoruku(poruka);
            } catch (IOException ex) {
                Logger.getLogger(FrmKlijentMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrmKlijentMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPosaljiSpecificnomActionPerformed

    private void btnPrikaziOdSpecificnogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziOdSpecificnogActionPerformed
        // ovo koristi jednu istu formu, mozda sam mogao ovo drugacije ali poenta je tu svakako. 
        // koristi par korisnika kao argument, to je neophodno da bi se mogle poruke kasnije filtrirati preko emaila posiljaoca i primaoca
        if(cbLoginovani.getSelectedItem()!=null){
            User posiljalac = (User) cbLoginovani.getSelectedItem();
            List<User> parKorisnika = new ArrayList<>();
            parKorisnika.add(posiljalac);
            parKorisnika.add(user);
            try {
                Controller.getInstance().getAllFromUser(parKorisnika);
            } catch (IOException ex) {
                Logger.getLogger(FrmKlijentMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrmKlijentMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPrikaziOdSpecificnogActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOsveziKorisnike;
    private javax.swing.JButton btnPosaljiSpecificnom;
    private javax.swing.JButton btnPosaljiSvima;
    private javax.swing.JButton btnPrikaziOdSpecificnog;
    private javax.swing.JComboBox<Object> cbLoginovani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtPoruka;
    // End of variables declaration//GEN-END:variables
}
