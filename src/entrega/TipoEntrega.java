package entrega;

import excessoes.TipoEntregaInvalido;
import venda.Pedido;

public interface TipoEntrega {
	public double calcularValorEntrega(Pedido pedido);
	public void validarEntrega(Pedido pedido) throws TipoEntregaInvalido;
}
