package org.example;

public class PedidoEstadoNovo extends PedidoEstado {
    private static PedidoEstadoNovo instance = new PedidoEstadoNovo();

    private PedidoEstadoNovo() {
    }

    public static PedidoEstadoNovo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Novo";
    }

    public boolean confirmar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}