package aula5;

public class Aula5 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setDono("Jubileu");
        p1.setNumConta(1111);
        p1.abrirConta("CC");        
        
        ContaBanco p2 = new ContaBanco();
        p2.setDono("Creuza");
        p2.setNumConta(2222);
        p2.abrirConta("CP");        
        
        p1.depositar(100);
        p2.depositar(300);
        p2.sacar(200);
        
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
