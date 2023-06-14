public class Main {
    public static void main(String[] args) {

        // Criando instâncias de objetos
        Cliente cliente1 = new Cliente(1, "João");
        Funcionario funcionario1 = new Funcionario(1, "Maria");
        Produto produto1 = new Produto(1, "Camiseta", 29.90);
        PedidoItem pedidoItem1 = new PedidoItem(produto1, 2);

        // Criando uma instância do sistema de pedidos
        SistemaPedidos sistemaPedidos = new SistemaPedidos();

        // Adicionando objetos ao sistema
        sistemaPedidos.adicionarCliente(cliente1);
        sistemaPedidos.adicionarFuncionario(funcionario1);
        sistemaPedidos.adicionarProduto(produto1);
        sistemaPedidos.adicionarPedidoItem(pedidoItem1);

        // Buscando objetos no sistema
        Cliente clienteEncontrado = sistemaPedidos.buscarCliente(1);
        Funcionario funcionarioEncontrado = sistemaPedidos.buscarFuncionario(1);
        Produto produtoEncontrado = sistemaPedidos.buscarProduto(1);
        PedidoItem pedidoItemEncontrado = sistemaPedidos.buscarPedidoItem(1);

        // Exibindo informações dos objetos encontrados
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado: " + clienteEncontrado.getNome());
        }

        if (funcionarioEncontrado != null) {
            System.out.println("Funcionário encontrado: " + funcionarioEncontrado.getNome());
        }

        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado.getNome());
        }

        if (pedidoItemEncontrado != null) {
            System.out.println("Pedido item encontrado: " + pedidoItemEncontrado.getQuantidade());
        }

        // Atualizando informações de um objeto
        sistemaPedidos.atualizarInformacoesCliente(1, "João da Silva");

        // Excluindo um objeto do sistema
        sistemaPedidos.excluirPedidoItem(1);
    }
}