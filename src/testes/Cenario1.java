package testes;

import java.util.Date;

import org.junit.Test;

import entrega.TipoEntrega;
import entrega.TipoEntregaMotoboy;
import entrega.TipoEntregaPAC;
import entrega.TipoEntregaRetirada;
import entrega.TipoEntregaSEDEX;
import excessoes.TipoEntregaInvalido;
import venda.Pedido;
import venda.Produto;

public class Cenario1 {

	@Test
	public void test() {
		Pedido pedido = new Pedido();
		pedido.setData(new Date());
		pedido.setEndereco("Rua Antonio da Veiga");
		pedido.setNomeCliente("Fernando BeiraMar");
		pedido.setNumero(24);
		
		Produto caneta = new Produto("Caneta muito fera meu", 20, 500);
		Produto borracha = new Produto("Borracha para caneta", 50, 500);
		Produto mouse = new Produto("Mouse sem fio", 250, 1500);
		
		pedido.incluirItem(caneta, 5);
		pedido.incluirItem(borracha, 12);
		pedido.incluirItem(mouse, 15);
		
		System.out.println("Valor dos itens: " + pedido.getValorPedido());
		System.out.println("Peso dos itens: " + pedido.getPesoPedido());
		System.out.println("Quantidade de produtos: " + pedido.getQuantidadeProdutos());
		
		TipoEntrega tipoEntregaPAC = new TipoEntregaPAC();
		TipoEntrega tipoEntregaRetirada = new TipoEntregaRetirada();
		TipoEntrega tipoEntregaSEDEX = new TipoEntregaSEDEX();
		TipoEntrega tipoEntregaMotoboy = new TipoEntregaMotoboy();
		
		try {
			pedido.setTipoEntrega(tipoEntregaPAC);
		} catch (TipoEntregaInvalido e) {
			System.out.println(e.getMessage());
		}

		System.out.println("---------------PAC-----------------");

		if (pedido.getTipoEntrega() != null) {
			System.out.println("Valor entrega: " + pedido.getValorEntrega());
			System.out.println("Valor total: " + pedido.getValorTotal());
		}
		
		System.out.println("---------------RETIRADA-------------");
		
		try {
			pedido.setTipoEntrega(tipoEntregaRetirada);
		} catch (TipoEntregaInvalido e) {
			System.out.println(e.getMessage());
		}
		
		if (pedido.getTipoEntrega() != null) {
			System.out.println("Valor entrega: " + pedido.getValorEntrega());
			System.out.println("Valor total: " + pedido.getValorTotal());
		}
		
		System.out.println("---------------SEDEX---------------");
		
		try {
			pedido.setTipoEntrega(tipoEntregaSEDEX);
		} catch (TipoEntregaInvalido e) {
			System.out.println(e.getMessage());
		}
		
		if (pedido.getTipoEntrega() != null) {
			System.out.println("Valor entrega: " + pedido.getValorEntrega());
			System.out.println("Valor total: " + pedido.getValorTotal());
		}
		
		System.out.println("---------------MOTOBOY-------------");
		
		try {
			pedido.setTipoEntrega(tipoEntregaMotoboy);
		} catch (TipoEntregaInvalido e) {
			System.out.println(e.getMessage());
		}
		
		if (pedido.getTipoEntrega() != null) {
			System.out.println("Valor entrega: " + pedido.getValorEntrega());
			System.out.println("Valor total: " + pedido.getValorTotal());
		}
		
	}

}
