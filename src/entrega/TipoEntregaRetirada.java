package entrega;

import excessoes.TipoEntregaInvalido;
import venda.Pedido;

public class TipoEntregaRetirada implements TipoEntrega {

	@Override
	public double calcularValorEntrega(Pedido pedido) {
		return 0;
	}

	@Override
	public void validarEntrega(Pedido pedido) throws TipoEntregaInvalido {
		return;
	}

}
