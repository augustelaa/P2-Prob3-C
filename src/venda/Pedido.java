package venda;

import java.util.ArrayList;
import java.util.Date;

import entrega.TipoEntrega;
import excessoes.TipoEntregaInvalido;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;
    private TipoEntrega tipoEntrega;

    public Pedido() {
    	itens = new ArrayList<ItemPedido>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void incluirItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));
    }

    public double getValorPedido() {
        double valorTotal = 0;
        for (ItemPedido ip : this.itens) {
            valorTotal += (ip.getValorItem());
        }
        return valorTotal;
    }
    
    public double getPesoPedido() {
        double pesoTotal = 0;
        for (ItemPedido ip : this.itens) {
        	pesoTotal += (ip.getPesoItem());
        }
        return pesoTotal;
    }
    
    public int getQuantidadeProdutos() {
    	int quantidade = 0;
        for (ItemPedido ip : this.itens) {
        	quantidade += ip.getQuantidade();
        }
        return quantidade;
    }
    
    public void cancelarTipoEntrega() {
    	this.tipoEntrega = null;
    }

	public void setTipoEntrega(TipoEntrega tipoEntrega) throws TipoEntregaInvalido {
		if (tipoEntrega == null) {
			throw new TipoEntregaInvalido("Tipo de entrega n�o definida.");
		}
		tipoEntrega.validarEntrega(this);
		this.tipoEntrega = tipoEntrega;
	}
	
	public TipoEntrega getTipoEntrega() {
		return tipoEntrega;
	}

	public double getValorEntrega() {
    	return tipoEntrega.calcularValorEntrega(this);
    }
    
    public double getValorTotal() {
    	return getValorPedido() + getValorEntrega();
    }

}
