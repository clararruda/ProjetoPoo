/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.model;

/**
 *
 * @author clara
 */
public class Gerente extends Usuario {
    
    private int matricula;

    public Gerente(String login, String senha, String nome, String end, String tel, String cpf, int matricula) {
        super(login, senha, nome, end, tel, cpf);
        this.matricula = matricula;
    }

    public Gerente(){
        
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }    
    
    @Override
    public String toString() {
        return "Gerente{" + "matricula=" + matricula + '}';
    }
        
    
}
