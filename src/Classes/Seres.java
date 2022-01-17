/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author William
 */
public class Seres {
    float atk;
    float def;
    String raca;

    public Seres(float atk, float def, String raca) {
        this.atk = atk;
        this.def = def;
        this.raca = raca;
    }

    public Seres(){
        
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
