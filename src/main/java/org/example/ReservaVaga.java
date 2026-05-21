package org.example;

import java.time.LocalDateTime;

public class ReservaVaga {

    private Vaga vaga;
    private Cliente cliente;

    private String nomeClienteReserva;
    private LocalDateTime horarioReserva;

    public ReservaVaga(Vaga vaga, Cliente cliente,String nomeClienteReserva, LocalDateTime horarioReserva) {
        this.vaga = vaga;
        this.cliente = cliente;
        this.nomeClienteReserva = nomeClienteReserva;
        this.horarioReserva = horarioReserva;
    }

    public void imprimirReserva() {
        System.out.println("Reserva da vaga: " + vaga.getCodigo());
        System.out.println("Setor: " + vaga.getSetor());
        System.out.println("Cliente da reserva: " + vaga.getNomeClienteReserva());
        System.out.println("Cliente vinculado: " + cliente.getNome());
        System.out.println("Horário da reserva: " + vaga.getHorarioReserva());
    }

    public Vaga getVaga() {
        return vaga;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNomeClienteReserva() {
        return nomeClienteReserva;
    }

    public void setNomeClienteReserva(String nomeClienteReserva) {
        this.nomeClienteReserva = nomeClienteReserva;
    }

    public LocalDateTime getHorarioReserva() {
        return horarioReserva;
    }

    public void setHorarioReserva(LocalDateTime horarioReserva) {
        this.horarioReserva = horarioReserva;
    }
}
