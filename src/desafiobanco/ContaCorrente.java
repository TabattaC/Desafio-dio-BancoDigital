
package desafiobanco;


public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void extrato(){
        System.out.println("==== Extrato Conta Corrente====");
        super.imprimirInfo();
    }
    
    @Override
    public void abrirConta(boolean abrir) {
        System.out.println("Conta Corrente aberta..");
        this.setAbrir(true);
        this.setSaldo(100);
    }
}
