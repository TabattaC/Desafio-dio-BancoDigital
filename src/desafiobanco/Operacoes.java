
package desafiobanco;

public interface Operacoes {
    abstract public void abrirConta(boolean abrir);
    
    abstract public void fecharConta(boolean fechar);

    abstract public void sacar(float valor);

    abstract public void depositar(float valor);
   
    abstract public void transferir(Conta contaDestino, float valor);
    
    abstract public void extrato();
}
