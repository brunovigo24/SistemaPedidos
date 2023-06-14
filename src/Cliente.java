public class Cliente {
    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }



    // getters e setters

    // Método para atualizar as informações do cliente
    public void atualizarInformacoes(String novoNome) {
        this.nome = novoNome;
    }

    // Método para excluir o cliente
    public void excluir() {
        // Implementação da lógica para excluir o cliente do sistema
    }
}
