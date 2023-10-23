package org.example;

public class PedidoEstadoPago extends PedidoEstado {
    private static PedidoEstadoPago instance = new PedidoEstadoPago();

    private PedidoEstadoPago() {
    }

    public static PedidoEstadoPago getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pago";
    }

    public boolean preparar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        return true;
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }
}