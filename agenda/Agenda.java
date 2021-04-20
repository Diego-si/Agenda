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
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Impresora i1 =new Impresora();
        Impresora i2 = new Laser();
        Impresora i3 = new JatodeTinta();
        
        i1.imprimir();
        i2.imprimir();
        i3.imprimir();
        */
        
        
        // TODO code application logic here
        
        
        Pessoa s1 = new Pessoa("oii", "878", 42);
        Pessoa p2 = new Pessoa("João", "6445451", 43);
        Pessoa p3 = new Pessoa("marco","54545",5);
        Pessoa p4 = new Pessoa(p3);
        
        //p1.setNome("Antonio");
        //p1.setTelefone("454323");
        //p1.setIdade(32);
        //p3.setNome("Marco");
        //p3.setCpf("45134");
        //p3.setImposto(5);
        //Pessoa.imposto = 7;
        
        
        System.out.println(s1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        Grupo g1 = new Grupo();
        Grupo g2 = new SubGrupo();
        g1.imprimeDescricao();
        g2.imprimeDescricao();
        
        if (p2.getIdade() < p3.getIdade() & (p4 != p3)) {
            System.out.println(s1.getNome());
        } else if (s1.getIdade() > p2.getIdade() ){
            System.out.println(p2.getNome());
        } 
        else if (p4.equals(p3)) {
            System.out.println("sao iguais");
            }
    }
   
}
