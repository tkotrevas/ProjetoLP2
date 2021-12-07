/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public class Jogador {
    String login;
    String senha;
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }    
    
    public Jogador(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
}
