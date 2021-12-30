/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author William
 */
public class DefinicoesDeImagem {
    public void escalonarImagem(String caminho, JLabel JLblImg){
        ImageIcon icon = new ImageIcon(caminho);
        Image img = icon.getImage();
        Image imageScaled = img.getScaledInstance(JLblImg.getWidth(),JLblImg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScaled);
        JLblImg.setIcon(scaledIcon);
    }
}
