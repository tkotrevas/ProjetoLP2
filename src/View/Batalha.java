/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.Combate;
import Classes.DefinicoesDeImagem;
import Classes.Inimigo;
import Classes.Personagem;
import Classes.Round;
import java.awt.Color;
import static java.lang.Math.random;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JLabel;
import java.util.Random;
/**
 *
 * @author William
 */
public class Batalha extends javax.swing.JFrame {
Personagem personagem = new Personagem();
Inimigo inimigo = new Inimigo();
//Combate combate = new Combate();
Round round = new Round();
Vitoria vitoria = new Vitoria();
Derrota derrota = new Derrota();
Itens itens = new Itens();
int roundEspecial;
    /**
     * Creates new form Batalha
     */



    public Batalha() {
        initComponents();
        defNumRound();
        
        corBotao(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Personagem = new javax.swing.JLabel();
        Inimigo = new javax.swing.JLabel();
        VS = new javax.swing.JLabel();
        barVidaPersonagem = new javax.swing.JProgressBar();
        barVidaInimigo = new javax.swing.JProgressBar();
        btnAtaque = new javax.swing.JButton();
        btnDefesa = new javax.swing.JButton();
        btnEspecial = new javax.swing.JButton();
        Dialogue = new javax.swing.JLabel();
        Round = new javax.swing.JLabel();
        numRound = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Personagem.setText("jLabel1");
        getContentPane().add(Personagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 124, 159));

        Inimigo.setText("jLabel1");
        getContentPane().add(Inimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 110, 159));

        VS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VS.setText("VS");
        getContentPane().add(VS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 51, 47));

        barVidaPersonagem.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(barVidaPersonagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 103, -1));

        barVidaInimigo.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(barVidaInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 100, -1));

        btnAtaque.setText("Ataque");
        btnAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, -1));

        btnDefesa.setText("Defesa");
        btnDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefesaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDefesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, -1));

        btnEspecial.setText("Especial");
        btnEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecialActionPerformed(evt);
            }
        });
        getContentPane().add(btnEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        Dialogue.setBackground(new java.awt.Color(204, 204, 204));
        Dialogue.setLabelFor(Dialogue);
        Dialogue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(Dialogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 272, 470, 113));

        Round.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Round.setText("Round");
        Round.setToolTipText("");
        getContentPane().add(Round, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 24, 50, 20));

        numRound.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numRound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numRound.setText("0");
        getContentPane().add(numRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 50, 20));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Personagem receberPersonagem(Personagem personagem, Batalha batalha){
        batalha.setVisible(true);
        this.personagem = personagem;
        return personagem;
    }
    
    

    public Inimigo receberInimigo(Inimigo inimigo){
        this.inimigo = inimigo;
        return inimigo;
    }
    
    public void definirTodasImagens(Personagem personagem){
        DefinicoesDeImagem defImg = new DefinicoesDeImagem();
        Random num = new Random();
        int lvlMonstro, caminhoMonstro;
        float monsterVariation;
        String[] monstros1 = new String[13];
        String[] monstros2 = new String[14];
        String[] monstros3 = new String[10];
        String[][] todosMonstros = new  String[3][14];
        personagem.setBatalha(personagem.getBatalha() +1);
        System.out.println("Batalha: " +personagem.getBatalha());
        
 
        
        if(personagem.getBatalha() <= 2){
            lvlMonstro = 0;
            monsterVariation = num.nextFloat()*3;
            caminhoMonstro = num.nextInt(11);
            
        }
        else if(personagem.getBatalha() <= 4){
            lvlMonstro = 1;
            monsterVariation = num.nextFloat()*6;
            caminhoMonstro = num.nextInt(13);
        }
        else{
            lvlMonstro = 2;
            monsterVariation = num.nextFloat()*9;
            caminhoMonstro = num.nextInt(9);
        }
        //Setando poder aleatório
        inimigo.setAtk(inimigo.getAtk() + monsterVariation);
        inimigo.setDef(inimigo.getDef() + monsterVariation);
        inimigo.setVida(inimigo.getVida() + monsterVariation);
        
        
        //MONSTROS NIVEL 1
         todosMonstros[0][0] = "C:\\RPGame\\src\\Imagens\\Gnomo.png";
         todosMonstros[0][1] = "C:\\RPGame\\src\\Imagens\\Gnomo2.png";
         todosMonstros[0][2] = "C:\\RPGame\\src\\Imagens\\Gnomo4.png";
         todosMonstros[0][3] = "C:\\RPGame\\src\\Imagens\\Gnomo3.png";
         todosMonstros[0][4] = "C:\\RPGame\\src\\Imagens\\Gnomo5.png";
         todosMonstros[0][5] = "C:\\RPGame\\src\\Imagens\\Celestial1.png";
         todosMonstros[0][6] = "C:\\RPGame\\src\\Imagens\\Celestial2.png";
         todosMonstros[0][7] = "C:\\RPGame\\src\\Imagens\\Celestial3.png";
         todosMonstros[0][8] = "C:\\RPGame\\src\\Imagens\\Bruxo1.png";
         todosMonstros[0][9] = "C:\\RPGame\\src\\Imagens\\Bruxo2.png";
         todosMonstros[0][10] = "C:\\RPGame\\src\\Imagens\\Bruxo3.png";
         todosMonstros[0][11] = "C:\\RPGame\\src\\Imagens\\Bruxa4.png";
          
         //MONSTROS NIVEL 2
         todosMonstros[1][0] = "C:\\RPGame\\src\\Imagens\\Centauro1.png";
         todosMonstros[1][1] = "C:\\RPGame\\src\\Imagens\\Centauro3.png";
         todosMonstros[1][2] = "C:\\RPGame\\src\\Imagens\\Centauro2.png";
         todosMonstros[1][3] = "C:\\RPGame\\src\\Imagens\\Centauro4.png";
         todosMonstros[1][4] = "C:\\RPGame\\src\\Imagens\\Cerbero.png";
         todosMonstros[1][5] = "C:\\RPGame\\src\\Imagens\\Cerbero.png";
         todosMonstros[1][6] = "C:\\RPGame\\src\\Imagens\\Cerbero2.png";
         todosMonstros[1][7] = "C:\\RPGame\\src\\Imagens\\Cerbero3.png";
         todosMonstros[1][8] = "C:\\RPGame\\src\\Imagens\\Cerbero4.png";
         todosMonstros[1][9] = "C:\\RPGame\\src\\Imagens\\Elemental1.png";
         todosMonstros[1][10] = "C:\\RPGame\\src\\Imagens\\Elemental2.png";
         todosMonstros[1][11] = "C:\\RPGame\\src\\Imagens\\Elemental3.png";
         todosMonstros[1][12] = "C:\\RPGame\\src\\Imagens\\Elemental4.png";
         todosMonstros[1][13] = "C:\\RPGame\\src\\Imagens\\Elemental5.png";
         
           //MONSTROS NIVEL 3
         todosMonstros[2][0]= "C:\\RPGame\\src\\Imagens\\Elfo1.png";
         todosMonstros[2][1]="C:\\RPGame\\src\\Imagens\\Elfo2.png";
         todosMonstros[2][2]="C:\\RPGame\\src\\Imagens\\Elfo3.jpg";
         todosMonstros[2][3]="C:\\RPGame\\src\\Imagens\\Elfo4.png";
         todosMonstros[2][4]="C:\\RPGame\\src\\Imagens\\Grifo1.png";
         todosMonstros[2][5]="C:\\RPGame\\src\\Imagens\\Grifo2.png";
         todosMonstros[2][6]="C:\\RPGame\\src\\Imagens\\Grifo3.png";
         todosMonstros[2][7]="C:\\RPGame\\src\\Imagens\\Orc1.png";
         todosMonstros[2][8]="C:\\RPGame\\src\\Imagens\\Orc2.png";
         todosMonstros[2][9]="C:\\RPGame\\src\\Imagens\\Orc3.png";
        
         derrota.definirTodasImagens(todosMonstros[lvlMonstro][caminhoMonstro]);
         
        System.out.println("Caminho Personagem: " + personagem.getCaminhoImg());
        defImg.escalonarImagem(personagem.getCaminhoImg(), Personagem);
        
        defImg.escalonarImagem(todosMonstros[lvlMonstro][caminhoMonstro], Inimigo);
        System.out.println("lvlMonstro " + lvlMonstro + " Caminho monstro " + caminhoMonstro);
        System.out.println("Caminho" + todosMonstros[lvlMonstro][caminhoMonstro]);

        
        //caminho = "C:\\Users\\William\\Desktop\\IFSP\\2 Semestre\\LP2 - Linguagem de Programação 2\\Programas em Java\\ProjetoLP2\\src\\Imagens\\arenaOriginal.jpg";
        //defImg.escalonarImagem(caminho, Background);
    }
    public void defBarVida(){
        int vidaPersonagem = (int)(personagem.getVida());
        System.out.println("Vida personagem" + vidaPersonagem);
        int vidaInimigo = (int)(inimigo.getVida());
        barVidaPersonagem.setMaximum(vidaPersonagem);
        barVidaInimigo.setMaximum(vidaInimigo);
    }
    
    public void updateBarVida(int vidaPers, int vidaIni){
        barVidaPersonagem.setValue(vidaPers);
        barVidaInimigo.setValue(vidaIni);
    }
    
    public void defNumRound(){
        String txtRound;
        txtRound = Integer.toString(round.getRound());
        numRound.setText(txtRound);
    }
    
    public void updateNumRound(){
        String txtRound;
        round.setRound(round.getRound());
        txtRound = Integer.toString(round.getRound());
        numRound.setText(txtRound);
    }
    
    public void morte(Personagem personagem, Inimigo inimigo){
        
        if((personagem.getBatalha()==3) && (inimigo.getVida()<= 0)){
            Inimigo.setVisible(false);
            Upgrade upgrade = new Upgrade();
            upgrade.setVisible(true);
            upgrade.receberPersonagem(personagem, upgrade);
            dispose();
        }
        else if((personagem.getBatalha()==6) && (inimigo.getVida()<= 0)){
            Inimigo.setVisible(false);
            Upgrade upgrade = new Upgrade();
            upgrade.setVisible(true);
            upgrade.receberPersonagem(personagem, upgrade);
            dispose();
        }
        else if((personagem.getBatalha()==9) && (inimigo.getVida()<= 0)){
            Inimigo.setVisible(false);
            Final Final = new Final();
            Final.setVisible(true);
            Final.receberPersonagem(personagem, Final);
            dispose();
        }
        
        else if(personagem.getVida()<= 0){
            Personagem.setVisible(false);
            
            derrota.setVisible(true);
            dispose();
        }
        else if(inimigo.getVida()<= 0){
            Inimigo.setVisible(false);
            vitoria.definirTodasImagens(personagem);
            dispose();
            vitoria.receberPersonagem(personagem, vitoria); 
        } 
         
    }
        
    
    public void corBotao(){
        if(round.getRound() - roundEspecial <= 3){
            btnEspecial.setBackground(Color.GRAY);
        }
        else{
            btnEspecial.setBackground(Color.WHITE);
        }
    }
    
    private void btnDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefesaActionPerformed
       Combate combate = new Combate();
        combate.lutaDef(personagem, inimigo);
        updateBarVida((int)(personagem.getVida()), (int)(inimigo.getVida()));
        round.setRound(round.getRound()+1);
        morte(personagem, inimigo);
        corBotao();
        updateNumRound();
       Dialogue.setText("Você se defende.\n O inimigo ataca.");
        
    }//GEN-LAST:event_btnDefesaActionPerformed

    private void btnAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueActionPerformed
       Combate combate = new Combate();
        combate.lutaAtk(personagem, inimigo);
        updateBarVida((int)(personagem.getVida()), (int)(inimigo.getVida()));
        round.setRound(round.getRound()+1);
        morte(personagem, inimigo);
        corBotao();
        updateNumRound();
        Dialogue.setText("Você ataca com ataque comum.\n O inimigo ataca.");
    }//GEN-LAST:event_btnAtaqueActionPerformed

    private void btnEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecialActionPerformed
       if(round.getRound() - roundEspecial >= 3){
           Combate combate = new Combate();
            combate.lutaEspecial(personagem, inimigo);
            updateBarVida((int)(personagem.getVida()), (int)(inimigo.getVida()));
            round.setRound(round.getRound()+1);
            morte(personagem, inimigo);
            roundEspecial = round.getRound();
            corBotao();
            updateNumRound();
           Dialogue.setText("Você ataca com poder especial.\n O inimigo ataca.");
       }
    }//GEN-LAST:event_btnEspecialActionPerformed

    
  
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
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Dialogue;
    private javax.swing.JLabel Inimigo;
    private javax.swing.JLabel Personagem;
    private javax.swing.JLabel Round;
    private javax.swing.JLabel VS;
    private javax.swing.JProgressBar barVidaInimigo;
    private javax.swing.JProgressBar barVidaPersonagem;
    private javax.swing.JButton btnAtaque;
    private javax.swing.JButton btnDefesa;
    private javax.swing.JButton btnEspecial;
    private javax.swing.JLabel numRound;
    // End of variables declaration//GEN-END:variables
}
