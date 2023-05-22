/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author 051968
 */
public class Aluno extends Pessoa{
    private String ra;
    
    public void SetRa(){
        System.out.print("Digite o RA do Aluno: ");
        this.ra = entrada.nextLine();  
    }
    
    public String GetRa(){
        return this.ra;
    }
  
    public void ExibirRA(){
        System.out.print(" RA do Aluno:" +ra);
    }
    
}
