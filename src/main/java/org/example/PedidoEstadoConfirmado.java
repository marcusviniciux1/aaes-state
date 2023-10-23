package org.example;

public class PedidoEstadoConfirmado extends PedidoEstado {
    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();

    private PedidoEstadoConfirmado() {
    }

    public static PedidoEstadoConfirmado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Confirmado";
    }

    public boolean pagar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        return true;
    }

    public boolean preparar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}