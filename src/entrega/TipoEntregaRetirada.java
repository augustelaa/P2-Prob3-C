package entrega;

import excessoes.TipoEntregaInvalido;
import venda.Pedido;

public class TipoEntregaRetirada implements TipoEntrega {
	
	private static TipoEntregaRetirada handler;

	public static TipoEntregaRetirada getInstancia() {
		if (handler == null) {
			handler = new TipoEntregaRetirada();
			System.out.println("Criei Retirada.");
		}
		return handler;
	}

	@Override
	public double calcularValorEntrega(Pedido pedido) {
		return 0;
	}

	@Override
	public void validarEntrega(Pedido pedido) throws TipoEntregaInvalido {
		return;
	}

}
