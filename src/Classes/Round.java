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
public class Round {
    int round;
    String sRound;
    
    public Round() {
        this.round = 1;
        this.sRound = (Integer.toString(round));
    }
    
    public String getsRound() {
        return sRound;
    }

    public void setsRound(String sRound) {
        this.sRound = sRound;
    }
    
    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
