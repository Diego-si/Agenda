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
public class SubGrupo extends Grupo {
    @Override
    public void imprimeDescricao() {
        super.imprimeDescricao();
        System.out.println("Sub-Grupo");
    }
}
