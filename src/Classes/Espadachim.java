
package Classes;

public class Espadachim extends Personagem{
     private int ataque = 6;
     private int defesa = 4;
       
    public int getAtaque() {
     return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
     public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
}
