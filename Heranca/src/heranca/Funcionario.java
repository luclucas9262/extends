/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa{
    
    private String cargo;
    
    public void SetCargo(){
        System.out.println("Digite o Cargo do Funcionário:");
        this.cargo=entrada.nextLine();
    }
    public String GetCargo(){
        return this.cargo;
    }
    
    public void ExibirCargo(){
        System.out.println(" Cargo do Funcionário: "+cargo);
         
    }
    
}
