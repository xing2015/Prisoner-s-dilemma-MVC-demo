/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V;

import C.PanelCoup;
import M.Partie;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author xym
 */
public class FramePartie extends javax.swing.JFrame{
     Partie partie;
    /**
     * Creates new form FramePartie
     */
    public FramePartie() {
        partie= new Partie(); 
        initComponents();
        this.setPartie(partie);
    }
    
    public void setPartie(Partie p){
        panelCoup1.setPartie(p);
        panelSynthese1.setPartie(p);
        panelHistorique1.setPartie(p);
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCoup1 = new C.PanelCoup();
        panelSynthese1 = new V.PanelSynthese();
        panelHistorique1 = new V.PanelHistorique();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuOpen = new javax.swing.JMenuItem();
        jMenuSave = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMenuOpen.setText("Save game");
        jMenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuOpen);

        jMenuSave.setText("Load game");
        jMenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLoadActionPerformed1(evt);
            }
        });
        jMenu1.add(jMenuSave);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelCoup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(panelSynthese1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelHistorique1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelHistorique1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCoup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelSynthese1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSaveActionPerformed

        // TODO add your handling code here:
        JFileChooser open = new JFileChooser();
        open.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = open.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String filePath = open.getSelectedFile().getPath() + "\\game.txt";
            try {
                FileOutputStream fileOs = new FileOutputStream(filePath);
                ObjectOutputStream objectOs = new ObjectOutputStream(fileOs);
                objectOs.writeObject(partie);
                objectOs.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FramePartie.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FramePartie.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jMenuSaveActionPerformed

    private void jMenuLoadActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLoadActionPerformed1
        // TODO add your handling code here:
         JFileChooser load = new JFileChooser();
        int returnVal = load.showOpenDialog(this);
        if (returnVal == load.APPROVE_OPTION) {
            String filePath = load.getSelectedFile().getPath();
            try {
                FileInputStream fileIn= new FileInputStream(filePath);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);
                Partie instance = (Partie) objectIn.readObject();
                partie = (Partie) objectIn.readObject();
                setPartie(partie);
                objectIn.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FramePartie.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FramePartie.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FramePartie.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jMenuLoadActionPerformed1
   
    
        
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
            java.util.logging.Logger.getLogger(FramePartie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePartie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePartie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePartie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePartie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuOpen;
    private javax.swing.JMenuItem jMenuSave;
    private C.PanelCoup panelCoup1;
    private V.PanelHistorique panelHistorique1;
    private V.PanelSynthese panelSynthese1;
    // End of variables declaration//GEN-END:variables
}
