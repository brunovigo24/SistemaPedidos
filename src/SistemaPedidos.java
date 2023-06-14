import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private List<PedidoItem> pedidoItens;
    private List<Produto> produtos;

    public SistemaPedidos() {
        clientes = new ArrayList<>();
        funcionarios = new ArrayList<>();
        pedidoItens = new ArrayList<>();
        produtos = new ArrayList<>();
    }

    // Métodos para adicionar clientes, funcionários, produtos e itens do pedido
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarPedidoItem(PedidoItem pedidoItem) {
        pedidoItens.add(pedidoItem);
    }

    // Métodos para buscar clientes, funcionários, produtos e itens do pedido
    public Cliente buscarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionario(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public PedidoItem buscarPedidoItem(int id) {
        for (PedidoItem pedidoItem : pedidoItens) {
            if (pedidoItem.getId() == id) {
                return pedidoItem;
            }
        }
        return null;
    }

    // Métodos para atualizar e excluir objetos do sistema
    public void atualizarInformacoesCliente(int id, String novoNome) {
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            cliente.atualizarInformacoes(novoNome);
        }
    }

    public void excluirCliente(int id) {
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            clientes.remove(cliente);
        }
    }

    public void atualizarInformacoesFuncionario(int id, String novoNome) {
        Funcionario funcionario = buscarFuncionario(id);
        if (funcionario != null) {
            funcionario.atualizarInformacoes(novoNome);
        }
    }

    public void excluirFuncionario(int id) {
        Funcionario funcionario = buscarFuncionario(id);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
        }
    }

    public void atualizarInformacoesProduto(int id, String novoNome, double novoPreco) {
        Produto produto = buscarProduto(id);
        if (produto != null) {
            produto.atualizarInformacoes(novoNome, novoPreco);
        }
    }

    public void excluirProduto(int id) {
        Produto produto = buscarProduto(id);
        if (produto != null) {
            produtos.remove(produto);
        }
    }

    public void atualizarQuantidadePedidoItem(int id, int novaQuantidade) {
        PedidoItem pedidoItem = buscarPedidoItem(id);
        if (pedidoItem != null) {
            pedidoItem.atualizarQuantidade(novaQuantidade);
        }
    }

    public void excluirPedidoItem(int id) {
        PedidoItem pedidoItem = buscarPedidoItem(id);
        if (pedidoItem != null) {
            pedidoItens.remove(pedidoItem);
        }
    }

    public static void main(String[] args) {
        // Aqui podemos testar o sistema de pedidos
    }
}
