/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;

/**
 *
 * @author William
 */
public class Dado {
    Random random = new Random();
   
    int numDado;
    public String sDado;

    public int getNumDado() {
        return numDado;
    }

    public void setNumDado(int numDado) {
        this.numDado = numDado;
    }

    public String getsDado() {
        return sDado;
    }

    public void setsDado(String sDado) {
        this.sDado = sDado;
    }
    
    
    public int rolarDados(){
        setNumDado(random.nextInt(10));
        setsDado(Integer.toString(getNumDado()));
        return getNumDado();
    }
    
}
