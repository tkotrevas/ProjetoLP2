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
    Random random = new Random();
    float atkPersonagem;
    float atkInimigo;
    float defPersonagem;
    float defInimigo;
    int num=1;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getAtkPersonagem() {
        return atkPersonagem;
    }

    public void setAtkPersonagem(float atkPersonagem) {
        this.atkPersonagem = atkPersonagem;
    }

    public float getAtkInimigo() {
        return atkInimigo;
    }

    public void setAtkInimigo(float atkInimigo) {
        this.atkInimigo = atkInimigo;
    }

    public float getDefPersonagem() {
        return defPersonagem;
    }

    public void setDefPersonagem(float defPersonagem) {
        this.defPersonagem = defPersonagem;
    }

    public float getDefInimigo() {
        return defInimigo;
    }

    public void setDefInimigo(float defInimigo) {
        this.defInimigo = defInimigo;
    }
    
    
    
    
    public void lutaAtk(Personagem personagem, Inimigo inimigo){
        Dado dado = new Dado();
        int dadoPersonagem = dado.rolarDados();
        System.out.println("Dado Personagem " + dadoPersonagem);
        int dadoInimigo = dado.rolarDados();
        System.out.println("Dado Inimigo " + dadoInimigo);
        setAtkPersonagem(0);
        setAtkInimigo(0);
        setDefPersonagem(0);
        setDefInimigo(0);
        
        setAtkPersonagem(personagem.getAtk()+dadoPersonagem);
        System.out.println("Ataque Personagem " + getAtkPersonagem());
        setDefInimigo(inimigo.getDef()+dadoInimigo);
        System.out.println("Defesa Inimigo " + getDefInimigo());
        
        if(getAtkPersonagem() > getDefInimigo()){
            inimigo.setVida(inimigo.getVida() - getAtkPersonagem());
            System.out.println("Vida Inimigo " + inimigo.getVida());
        }
        else{
            System.out.println("Personagem Errou ataque");
        }
        dado = new Dado();
        dadoPersonagem = dado.rolarDados();
        System.out.println("Dado Personagem " + dadoPersonagem);
        dadoInimigo = dado.rolarDados();
        System.out.println("Dado Inimigo " + dadoInimigo);
        setAtkPersonagem(0);
        setAtkInimigo(0);
        setDefPersonagem(0);
        setDefInimigo(0);

        setAtkInimigo(inimigo.getAtk() + dadoInimigo);
        System.out.println("Ataque Inimigo " + getAtkInimigo());
        setDefPersonagem(personagem.getDef()+dadoPersonagem);
        System.out.println("Defesa Personagem " + getDefPersonagem());
        
        if(getAtkInimigo() > getDefPersonagem()){
            personagem.setVida(personagem.getVida() - getAtkInimigo());
            System.out.println("Vida Personagem " + personagem.getVida());
        }
        else{
            System.out.println("Inimigo Errou");
        }
    }
    
    public void lutaDef (Personagem personagem, Inimigo inimigo){
        Dado dado = new Dado();
        int dadoPersonagem = dado.rolarDados();
        System.out.println("Dado Personagem " + dadoPersonagem);
        int dadoInimigo = dado.rolarDados();
        System.out.println("Dado Inimigo " + dadoInimigo);
        setAtkPersonagem(0);
        setAtkInimigo(0);
        setDefPersonagem(0);
        setDefInimigo(0);

        setAtkInimigo(inimigo.getAtk() + dadoInimigo);
        System.out.println("Ataque Inimigo " + getAtkInimigo());
        setDefPersonagem((personagem.getDef() + dadoPersonagem)*1.4f);
        System.out.println("Defesa Personagem " + getDefPersonagem());
        
        if(getAtkInimigo() > getDefPersonagem()){
            personagem.setVida(personagem.getVida() - getAtkInimigo());
            System.out.println("Vida Personagem " + personagem.getVida());
        }
        else{
            System.out.println("Inimigo Errou");
        }
    }
    
    public void lutaEspecial(Personagem personagem, Inimigo inimigo){
        Dado dado = new Dado();
        int dadoPersonagem = dado.rolarDados();
        System.out.println("Dado Personagem " + dadoPersonagem);
        int dadoInimigo = dado.rolarDados();
        System.out.println("Dado Inimigo " + dadoInimigo);
        setAtkPersonagem(0);
        setAtkInimigo(0);
        setDefPersonagem(0);
        setDefInimigo(0);
        
        setAtkPersonagem((personagem.getAtk()+dadoPersonagem)*1.4f);
        System.out.println("Ataque Personagem " + getAtkPersonagem());
        setDefInimigo(inimigo.getDef()+dadoInimigo);
        System.out.println("Defesa Inimigo " + getDefInimigo());
        
        if(getAtkPersonagem() > getDefInimigo()){
            inimigo.setVida(inimigo.getVida() - getAtkPersonagem());
            System.out.println("Vida Inimigo " + inimigo.getVida());
        }
        else{
            System.out.println("Personagem Errou ataque");
        }
        dado = new Dado();
        dadoPersonagem = dado.rolarDados();
        System.out.println("Dado Personagem " + dadoPersonagem);
        dadoInimigo = dado.rolarDados();
        System.out.println("Dado Inimigo " + dadoInimigo);
        setAtkPersonagem(0);
        setAtkInimigo(0);
        setDefPersonagem(0);
        setDefInimigo(0);

        setAtkInimigo(inimigo.getAtk() + dadoInimigo);
        System.out.println("Ataque Inimigo " + getAtkInimigo());
        setDefPersonagem(personagem.getDef()+dadoPersonagem);
        System.out.println("Defesa Personagem " + getDefPersonagem());
        
        if(getAtkInimigo() > getDefPersonagem()){
            personagem.setVida(personagem.getVida() - getAtkInimigo());
            System.out.println("Vida Personagem " + personagem.getVida());
        }
        else{
            System.out.println("Inimigo Errou");
        }
    }
    
}
