
package desafiobanco;

public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }
   
    @Override
    public void extrato(){
        System.out.println("==== Extrato Conta Poupança ===="); 
        super.imprimirInfo();
        
    }
    @Override
    public void abrirConta(boolean abrir) {
        System.out.println("Conta Poupança aberta..");
        this.setAbrir(true);
        this.setSaldo(50);
    }
    

    
}
