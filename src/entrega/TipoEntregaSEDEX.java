package entrega;

import excessoes.TipoEntregaInvalido;
import venda.Pedido;

public class TipoEntregaSEDEX implements TipoEntrega {

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
		}
		return 0;
	}

	@Override
	public void validarEntrega(Pedido pedido) throws TipoEntregaInvalido {
		return;
	}

}
