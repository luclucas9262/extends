
package heranca;


public class professor extends Funcionario{
    
    private int carga_horaria;
    private String Titulacao;
    
    public void SetCarga(){
        System.out.println("Digite a carga Hóraria:");
        this.carga_horaria = entrada.nextInt();
    }
    public int GetCarga(){
        return this.carga_horaria;
    }
    
    public void SetTit(){
        System.out.println("Digite a Titulação: ");
        this.Titulacao = entrada.nextLine();  
    }
    
    public String GetTit(){
        return this.Titulacao;
    }
    
    public void ExibirCarga(){
        System.out.println(" Carga hóraria: "+carga_horaria);
    }
    
    public void ExibirTit(){
        
        System.out.println(" Titulação: "+Titulacao);
         
    }

    
    
    
}





