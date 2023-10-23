package org.example;

public class Pedido {
    private String numeroPedido;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoNovo.getInstance();
    }

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean pagar() {
        return estado.pagar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

}