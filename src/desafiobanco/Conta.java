
package desafiobanco;

import java.util.stream.Stream;

public class Conta implements Operacoes {
    protected int numConta;
    protected float saldo;
    protected int agencia;
    protected boolean abrir;
    protected Cliente cliente;
    
    private static final int AGENCIA_PADRAO=1;  
    private static int SEQUENCIAL=1;  //Constante= classe estática 
    
    public Conta(Cliente cliente) {
        this.agencia= AGENCIA_PADRAO;
        this.numConta= SEQUENCIAL++; 
        this.abrir= false;
        this.cliente= cliente;
        
    } 
    
    protected void imprimirInfo() { //Apenas as classes filhas podem acessar
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumConta()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
    

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    
    public int getNumConta() {
        return numConta;
    }


    public float getSaldo() {
        return saldo;
    }


    public int getAgencia() {
        return agencia;
    }    

    public void setAbrir(boolean abrir) {
        this.abrir = abrir;
    }

    public boolean getAbrir() {
        return abrir;
    }
    
   
    
  //Metodos  

   
    @Override
    public void fecharConta(boolean fechar) {
        this.setAbrir(false);
        if (this.getSaldo()>0){
            System.out.println("Não é possivel fechar conta, retirar todo o saldo..");
        }else {
            System.out.println("Fechando a conta..");
        }
        
    }

    @Override
    public void sacar(float valor) {
        if (this.getSaldo()>valor){
            saldo-=valor;
        } else{
            System.out.println("Saldo Insuficiente ");
        }
      
       
    }

    @Override
    public void depositar(float valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(Conta contaDestino, float valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void extrato() {
        
    }

    @Override
    public void abrirConta(boolean abrir) {
    }

   
    
}
