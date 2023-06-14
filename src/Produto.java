public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    // getters e setters

    // Método para atualizar as informações do produto
    public void atualizarInformacoes(String novoNome, double novoPreco) {
        this.nome = novoNome;
        this.preco = novoPreco;
    }

    // Método para excluir o produto
    public void excluir() {
        // Implementação da lógica para excluir o produto do sistema
    }
}
