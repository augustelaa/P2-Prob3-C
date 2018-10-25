package entrega;

import excessoes.TipoEntregaInvalido;
import venda.Pedido;

public class TipoEntregaSEDEX implements TipoEntrega {
	
	private static TipoEntregaSEDEX handler;

	public static TipoEntregaSEDEX getInstancia() {
		if (handler == null) {
			handler = new TipoEntregaSEDEX();
			System.out.println("Criei SEDEX.");
		}
		return handler;
	}

	@Override
	public double calcularValorEntrega(Pedido pedido) {
		if (pedido.getPesoPedido() <= 500) {
			return 12.5;
		} else if (pedido.getPesoPedido() <= 750) {
			return 20;
		} else if (pedido.getPesoPedido() <= 1200) {
			return 30;
		} else if (pedido.getPesoPedido() <= 2000) {
			return 45;
		}else {
			int multiplicador = (int) (Math.ceil(pedido.getPesoPedido() - 2000)/100);
			return 45 + 1.5*multiplicador;
		}
	}

	@Override
	public void validarEntrega(Pedido pedido) throws TipoEntregaInvalido {
		return;
	}

}
