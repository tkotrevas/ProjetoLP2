
package Classes;

public class Personagem {

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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    int ataque;
    int defesa;
    int  vida=10;
    String tipo;
    
    public void upgrade(int ataque, int defesa){
        this.ataque+=ataque;
        this.defesa+=defesa;
    }
}
    
  