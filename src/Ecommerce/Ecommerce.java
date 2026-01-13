package Ecommerce;

import java.util.ArrayList;

class Cliente {
    String nome;
    String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class ItemPedido {
    Produto produto;
    int quantidade;

    public ItemPedido(Produto p, int qtd) {
        produto = p;
        quantidade = qtd;
    }

    double calcularSubtotal() {
        return produto.preco * quantidade;
    }
}

class Pedido {
    Cliente cliente;
    ArrayList<ItemPedido> itens;
    FormaPagamento pagamento;

    public Pedido(Cliente c) {
        cliente = c;
        itens = new ArrayList<>();
    }

    void adicionarItem(Produto p, int qtd) {
        itens.add(new ItemPedido(p, qtd));
    }

    double calcularTotal() {
        double total = 0;
        for(ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}

abstract class FormaPagamento {
    abstract void processar(double valor);
}

class PagamentoCartao extends FormaPagamento {
    String numeroCartao;
    int parcelas;

    void processar(double valor) {
        System.out.println("Processando cartão: R$" + valor);
    }
}

class PagamentoPix extends FormaPagamento {
    String chave;

    void processar(double valor) {
        System.out.println("Gerando PIX: R$" + valor);
    }
}

class PagamentoBoleto extends FormaPagamento {
    void processar(double valor) {
        System.out.println("Gerando boleto: R$" + valor);
    }
}