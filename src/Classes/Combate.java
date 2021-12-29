/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author William
 */
public class Combate {
    public Inimigo inimigo = new Inimigo();
    Random random = new Random();

    
    
    public void luta(Personagem personagem){
        Dado dado = new Dado();
        int dadoPersonagem = dado.rolarDados();
        int dadoInimigo = dado.rolarDados();
        
        personagem.setAtk(personagem.getAtk()+dadoPersonagem);
        System.out.println("Ataque " + personagem.getAtk());
        inimigo.setDef(inimigo.getDef()+dadoInimigo);
        System.out.println("Defesa " + inimigo.getDef());
        
        if(personagem.getAtk() > inimigo.getDef()){
            inimigo.setVida(inimigo.getVida() - personagem.getAtk());
            System.out.println("Vida Inimigo " + inimigo.getVida());
        }
        else{
            System.out.println("Personagem Errou ataque");
        }

        inimigo.setAtk(inimigo.getAtk() + dadoInimigo);
        System.out.println("Ataque Inimigo " + inimigo.getAtk());
        personagem.setDef(personagem.getDef()+dadoPersonagem);
        System.out.println("Defesa Personagem " + personagem.getDef());
        
        if(inimigo.atk > personagem.getDef()){
            personagem.setVida(personagem.getVida() - inimigo.getAtk());
            System.out.println("Vida Personagem " + personagem.getVida());
        }
        else{
            System.out.println("Inimigo Errou");
        }
    }
    
}
