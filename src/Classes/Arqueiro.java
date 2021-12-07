
package Classes;

public class Arqueiro extends Personagem{

    
        private int ataque = 7;
        private int defesa = 3;
       
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
