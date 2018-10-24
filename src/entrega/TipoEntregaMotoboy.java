package entrega;

import excessoes.TipoEntregaInvalido;
import venda.Pedido;

public class TipoEntregaMotoboy implements TipoEntrega {
	
	public static final double PESO_MAXIMO = 25000;

	@Override
	public double calcularValorEntrega(Pedido pedido) {
		return 7;
	}

	@Override
	public void validarEntrega(Pedido pedido) throws TipoEntregaInvalido {
		if (pedido.getPesoPedido() > PESO_MAXIMO) {
			throw new TipoEntregaInvalido("Peso excede o m�ximo para o motoboy (25).");
		} else if (pedido.getQuantidadeProdutos() > 30) {
			throw new TipoEntregaInvalido("N�mero de produtos excede o m�ximo para o motoboy (30).");
		}
	}

}
