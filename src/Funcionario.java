public class Funcionario {
    private int id;
    private String nome;

    public Funcionario(int id, String nome) {
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

    // Método para atualizar as informações do funcionário
    public void atualizarInformacoes(String novoNome) {
        this.nome = novoNome;
    }

    // Método para excluir o funcionário
    public void excluir() {
        // Implementação da lógica para excluir o funcionário do sistema
    }
}
