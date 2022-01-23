
package desafiobanco;

public class DesafioBanco {

    public static void main(String[] args) {
       Cliente Tabatta = new Cliente();
       Cliente Lucas = new Cliente();
       
       Tabatta.setNome("Tábatta Caroline Cerri França");
       Lucas.setNome("Lucas Xavier");
      
       Conta cc = new ContaPoupança(Tabatta);
       
       cc.imprimirInfo();
       
       
       
       
       
    }
    
}
