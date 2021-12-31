
package View;

import Classes.Personagem;
import java.util.HashSet;
import java.util.Set;

public class Inicio extends javax.swing.JFrame {
Personagem p = new Personagem();
Introducao i = new Introducao();


    public Inicio() {
        initComponents();
    }
public Object retornap (){
    return  p;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnArqueiro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEspadachim = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMago = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnArqueiro.setText("Arqueiro(a)");
        btnArqueiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArqueiroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("Escolha sua classe:");

        btnEspadachim.setText("Espadachim");
        btnEspadachim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspadachimActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/espadachim.jpg"))); // NOI18N

        btnMago.setText("Mago(a)");
        btnMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arqueiro.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mago].jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnArqueiro)
                        .addGap(150, 150, 150)
                        .addComponent(btnEspadachim)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMago)
                        .addGap(107, 107, 107))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArqueiro)
                    .addComponent(btnEspadachim)
                    .addComponent(btnMago))
                .addGap(185, 185, 185))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArqueiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArqueiroActionPerformed
        p.setRaca("Arqueiro");
        p.setAtk(8);
        p.setDef(2);
        p.setVida(100);
        p.setBatalha(1);
        p.setCaminhoImg("C:\\RPGame\\src\\Imagens\\arqueiro.jpg");
        i.receberPersonagem(p,i);
        
        dispose();
    }//GEN-LAST:event_btnArqueiroActionPerformed

    private void btnEspadachimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspadachimActionPerformed
        p.setRaca("Espadachim");
        p.setAtk(7);
        p.setDef(6);
        p.setVida(100);
        p.setBatalha(1);
        p.setCaminhoImg("C:\\RPGame\\src\\Imagens\\espadachim.jpg");
        i.receberPersonagem(p,i);
        
        dispose();
    }//GEN-LAST:event_btnEspadachimActionPerformed

    private void btnMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagoActionPerformed
        
        p.setRaca("Mago");
        p.setAtk(8);
        p.setDef(5);
        p.setVida(100);
        p.setBatalha(1);
        p.setCaminhoImg("C:\\RPGame\\src\\Imagens\\mago].jpg");
        i.receberPersonagem(p,i);
        dispose();
    }//GEN-LAST:event_btnMagoActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArqueiro;
    private javax.swing.JButton btnEspadachim;
    private javax.swing.JButton btnMago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
