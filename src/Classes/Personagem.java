
package Classes;


public class Personagem extends Seres {
    Item item;
    float vida;
    float vidaBase;
    int batalha;
    String caminhoImg;

    public Personagem(Item item, float vida, float vidaBase, int batalha, String caminhoImg, float atk, float def, String raca) {
        super(atk, def, raca);
        this.item = item;
        this.vida = vida;
        this.vidaBase = vidaBase;
        this.batalha = batalha;
        this.caminhoImg = caminhoImg;
    }

    
    
    public Personagem(){
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(float vidaBase) {
        this.vidaBase = vidaBase;
    }

    public int getBatalha() {
        return batalha;
    }

    public void setBatalha(int batalha) {
        this.batalha = batalha;
    }

    public String getCaminhoImg() {
        return caminhoImg;
    }

    public void setCaminhoImg(String caminhoImg) {
        this.caminhoImg = caminhoImg;
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
}