public class Cliente {
    // 1 - Atributos ou, as "váriaveis" do cliente.
    //São 'private' para proteger os dados (encapsulamento)

    private String nome;
    private String email;
    private boolean ativo;
    // 2 -  Construtor (O "manual de instruções" para criar um cliente)
    // É um método especial que tem o mesmo nome da classe.
    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.ativo = true;
    }
    // 3 - metodos, acoes que o cliente pode fazer
    public void desativar(){
        this.ativo = false;
        System.out.println("O cliente" + " " + this.nome + " " +  "foi desativado");
    }

    // 4 - metodo getters (para ler dados privados)
    public String getNome(){
        return this.nome;
    }

    // 5 - metodos setters (para "alterar" dados privados)
    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }





}
