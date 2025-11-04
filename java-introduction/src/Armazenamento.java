import java.util.List;

public interface Armazenamento {
    // 1 Este é o "contrato".
    // Qualquer classe que quiser ser um "Armazenamento"
    // DEVE ter um método salvar() e um método buscarTodos().
    // Note que não tem "corpo" (sem { ... }). É só a assinatura.

    void salvar(Cliente cliente);
    List<Cliente> buscarTodos();
}
