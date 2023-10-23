package org.example;

public class PedidoEstadoPreparando extends PedidoEstado {
    private static PedidoEstadoPreparando instance = new PedidoEstadoPreparando();

    private PedidoEstadoPreparando() {
    }

    public static PedidoEstadoPreparando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando";
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }
}