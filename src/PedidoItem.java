public class PedidoItem {

    //Coloquei 'static' para o contador ser declarado em todas as instâncias da classe
    private static int contador = 0;
    private int id;
    private Produto produto;
    private int quantidade;

    public PedidoItem(Produto produto, int quantidade) {
        this.id = ++contador;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        PedidoItem.contador = contador;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // getters e setters

    // Método para atualizar a quantidade do pedido item
    public void atualizarQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    // Método para excluir o pedido item
    public void excluir() {
        // Implementação da lógica para excluir o pedido item do sistema
    }


}
