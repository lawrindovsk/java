import java.util.ArrayList;
import java.util.List;

// Arquivo: MeuPrimeiroPrograma.java
public class MeuPrimeiroPrograma {

    public static void main(String[] args) {
//        // [1] "new" cria o Objeto (a "coisa real")
//        // Estamos chamando o Construtor da classe Cliente
//        Cliente cliente1 = new Cliente("Ana Silva", "ana@email.com");
//        Cliente cliente2 = new Cliente("Bruno Costa", "bruno@email.com");
//        // [2] Usando os métodos
//        System.out.println("Nome do cliente 1: " + cliente1.getNome()); // Usa o getNome()
//        cliente2.desativar(); // Chama a ação de desativar

        // 3 - lista para guardar usuiarios
        // sintaxe parecida com c#
        //new ArrayList<*tipo*>() = é como eu estaria dizendo, "crie uma nova lista em branco".
        List<Cliente> meusClientes = new ArrayList<>();

        //4 - criar e add clientes na lista;
        meusClientes.add(new Cliente("Gustavo Laurindo", "gustavo.lsantos05@gmail.com"));

        meusClientes.add(new Cliente("Pyter Laurindo", "pyter.lauriindo@gmail.com"));

        //5 - printar os clientes;
        System.out.println("Total de clientes na list: " + meusClientes.size());

        //6 - percorre na lista (em c# seria foreach)
        // é praticamente igual
        System.out.println("+++ Lista de Clientes da Pasta +++");
        for (Cliente cliente: meusClientes){
            // para cada cliente DENTRO da lista meusClientes, printa
            System.out.println("Nome: " + cliente.getNome());
        }

        //7 - pegar um item especifico (get num cliente de um indicie especifico, tipo o indice 0)
        Cliente primeiroCliente = meusClientes.get(0);
        System.out.println("O primeiro cliente da lista é: " + primeiroCliente.getNome());

    }


}