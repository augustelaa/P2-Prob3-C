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
	
	TipoEntregaPAC tipoEntregaPAC = TipoEntregaPAC.getInstancia();
	TipoEntregaRetirada tipoEntregaRetirada = TipoEntregaRetirada.getInstancia();
	TipoEntregaSEDEX tipoEntregaSEDEX = TipoEntregaSEDEX.getInstancia();
	TipoEntregaMotoboy tipoEntregaMotoboy = TipoEntregaMotoboy.getInstancia();

	@Test
	public void test() {
		System.out.println("Inicio test");
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
		
		pedido.cancelarTipoEntrega();
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
		
		pedido.cancelarTipoEntrega();
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
		
		pedido.cancelarTipoEntrega();
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
		
		pedido.cancelarTipoEntrega();
		try {
			pedido.setTipoEntrega(tipoEntregaMotoboy);
		} catch (TipoEntregaInvalido e) {
			System.out.println(e.getMessage());
		}
		
		if (pedido.getTipoEntrega() != null) {
			System.out.println("Valor entrega: " + pedido.getValorEntrega());
			System.out.println("Valor total: " + pedido.getValorTotal());
		}
		System.out.println("Fim test");
	}
	
	@Test
	public void test2() {
		System.out.println("Inicio test2");
		Pedido pedido = new Pedido();
		pedido.setData(new Date());
		pedido.setEndereco("Rua 2 Setembro");
		pedido.setNomeCliente("Josue Martins");
		pedido.setNumero(36);
		
		Produto gabinete = new Produto("Gabinete fera", 20, 500);
		Produto camisinha = new Produto("Camisinha furada", 50, 500);
		Produto feijao = new Produto("Feijão do bom", 250, 1500);
		
		pedido.incluirItem(gabinete, 5);
		pedido.incluirItem(camisinha, 12);
		pedido.incluirItem(feijao, 15);
		
		System.out.println("Valor dos itens: " + pedido.getValorPedido());
		System.out.println("Peso dos itens: " + pedido.getPesoPedido());
		System.out.println("Quantidade de produtos: " + pedido.getQuantidadeProdutos());
		
		pedido.cancelarTipoEntrega();
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
		
		pedido.cancelarTipoEntrega();
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
		
		pedido.cancelarTipoEntrega();
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
		
		pedido.cancelarTipoEntrega();
		try {
			pedido.setTipoEntrega(tipoEntregaMotoboy);
		} catch (TipoEntregaInvalido e) {
			System.out.println(e.getMessage());
		}
		
		if (pedido.getTipoEntrega() != null) {
			System.out.println("Valor entrega: " + pedido.getValorEntrega());
			System.out.println("Valor total: " + pedido.getValorTotal());
		}
		System.out.println("Fim test2");
	}
}
