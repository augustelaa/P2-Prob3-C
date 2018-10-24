package entrega;

import excessoes.TipoEntregaInvalido;
import venda.Pedido;

public class TipoEntregaPAC implements TipoEntrega {
	
	public static final double PESO_MAXIMO = 5000;

	@Override
	public double calcularValorEntrega(Pedido pedido) {
		if (pedido.getPesoPedido() <= 1000) {
			return 10;
		} else if (pedido.getPesoPedido() <= 2000) {
			return 15;
		} else if (pedido.getPesoPedido() <= 3000) {
			return 20;
		} else if (pedido.getPesoPedido() <= 5000) {
			return 30;
		}
		return 0;
	}

	@Override
	public void validarEntrega(Pedido pedido) throws TipoEntregaInvalido {
		if (pedido.getPesoPedido() > PESO_MAXIMO) {
			throw new TipoEntregaInvalido("Peso excede o máximo para PAC.");
		}
	}

}
