package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    // Pedido novo

    @Test
    public void naoDevePagarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void naoDevePrepararPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveEntregarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void deveConfirmarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertTrue(pedido.confirmar());
        assertEquals(PedidoEstadoConfirmado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }


    // Pedido confirmado

    @Test
    public void naoDeveConfirmarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDeveEntregarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void devePagarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.pagar());
        assertEquals(PedidoEstadoPago.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void devePrepararPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.preparar());
        assertEquals(PedidoEstadoPreparando.getInstance(), pedido.getEstado());
    }


    // Pedido pago

    @Test
    public void naoDeveConfirmarPedidoPago() {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDevePagarPedidoPago() {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void naoDeveCancelarPedidoPago() {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void devePrepararPedidoPago() {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        assertTrue(pedido.preparar());
        assertEquals(PedidoEstadoPreparando.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveEntregarPedidoPago() {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }


    // Pedido cancelado

    @Test
    public void naoDeveConfirmarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDevePagarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDevePrepararPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }


    // Pedido preparando

    @Test
    public void naoDeveConfirmarPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDevePagarPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void naoDeveCancelarPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDevePrepararPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void deveEntregarPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }


    // Pedido entregue

    @Test
    public void naoDeveConfirmarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDevePagarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDevePrepararPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }

}