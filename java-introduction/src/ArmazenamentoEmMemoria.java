import java.util.ArrayList; // 1 - imports pra usar o metodo de listas.
import java.util.List;
//2 - implements, seria algo como "assinar" o armazenamento.
public class ArmazenamentoEmMemoria implements Armazenamento{

    private List<Cliente> bancoDeDadosFalso = new ArrayList<>();
    //3 - banco de dados simlado

    //4 - o java origa a criar os metodos do "contrato"., @override é uma anotacao, que siginifica: sobrescrevendo/implementando
    //um meotod que veio do contrato (interface).
    @Override
    public void salvar(Cliente cliente) {
        bancoDeDadosFalso.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + "salvo na memory.");
    }

    @Override
    public List<Cliente> buscarTodos(){
        return bancoDeDadosFalso;
    }
}
