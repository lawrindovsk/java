// Arquivo: MeuPrimeiroPrograma.java
public class MeuPrimeiroPrograma {

    public static void main(String[] args) {

        // [1] "new" cria o Objeto (a "coisa real")
        // Estamos chamando o Construtor da classe Cliente
        Cliente cliente1 = new Cliente("Ana Silva", "ana@email.com");
        Cliente cliente2 = new Cliente("Bruno Costa", "bruno@email.com");

        // [2] Usando os métodos
        System.out.println("Nome do cliente 1: " + cliente1.getNome()); // Usa o getNome()

        cliente2.desativar(); // Chama a ação de desativar
    }
}