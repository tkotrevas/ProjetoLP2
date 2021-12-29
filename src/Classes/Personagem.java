
package Classes;

public class Personagem {
    String raca;
    Item item;
    float atk;
    float def;
    float vida;

    public Personagem(String raca, Item item, float atk, float def, float vida) {
        this.raca = raca;
        this.item = item;
        this.atk = atk;
        this.def = def;
        this.vida = vida;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getAtk() {
        return atk;
    }

    public void setAtk(float atk) {
        this.atk = atk;
    }

    public float getDef() {
        return def;
    }

    public void setDef(float def) {
        this.def = def;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }
    
}
    
  