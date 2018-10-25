package entrega;

import excessoes.TipoEntregaInvalido;
import venda.Pedido;

public class TipoEntregaMotoboy implements TipoEntrega {
	
	public static final double PESO_MAXIMO = 25000;
	
	private static TipoEntregaMotoboy handler;

	public static TipoEntregaMotoboy getInstancia() {
		if (handler == null) {
			handler = new TipoEntregaMotoboy();
			System.out.println("Criei Motoboy.");
		}
		return handler;
	}

	@Override
	public double calcularValorEntrega(Pedido pedido) {
		return 7;
	}

	@Override
	public void validarEntrega(Pedido pedido) throws TipoEntregaInvalido {
		if (pedido.getPesoPedido() > PESO_MAXIMO) {
			throw new TipoEntregaInvalido("Peso excede o máximo para o motoboy (25).");
		} else if (pedido.getQuantidadeProdutos() > 30) {
			throw new TipoEntregaInvalido("Número de produtos excede o máximo para o motoboy (30).");
		}
	}

}
