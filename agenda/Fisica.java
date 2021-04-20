/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Diego
 */
public class Fisica extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public String mostrarDados() {
        return "Nome: " + nome + " - Telefone: " + 
                telefone + " - Idade: " + idade + 
                " - Imposto :" + IMPOSTO + " - CPF "
                + cpf;
    }
}
