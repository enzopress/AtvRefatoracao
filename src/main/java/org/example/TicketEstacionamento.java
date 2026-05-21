package org.example;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class TicketEstacionamento {

    private String codigo;
    private Veiculo veiculo;
    private Vaga vaga;
    private boolean perdido;
    private LocalDateTime dataHoraEntrada;       // ← campo movido
    private LocalDateTime dataHoraSaidaPrevista; // ← campo movido

    public TicketEstacionamento(String codigo, Veiculo veiculo, Vaga vaga, boolean perdido,
                                LocalDateTime dataHoraEntrada,
                                LocalDateTime dataHoraSaidaPrevista) {
        this.codigo = codigo;
        this.veiculo = veiculo;
        this.vaga = vaga;
        this.perdido = perdido;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaidaPrevista = dataHoraSaidaPrevista;
    }

    public void imprimirTicket() {
        String entradaFormatada = dataHoraEntrada.getDayOfMonth() + "/"
                + dataHoraEntrada.getMonthValue() + "/"
                + dataHoraEntrada.getYear() + " "
                + dataHoraEntrada.getHour() + ":"
                + String.format("%02d", dataHoraEntrada.getMinute());

        System.out.println("Ticket: " + codigo);
        System.out.println("Veículo: " + veiculo.getPlaca());
        System.out.println("Vaga: " + vaga.getCodigo());
        System.out.println("Entrada: " + entradaFormatada);

        if (dataHoraEntrada.getDayOfWeek() == DayOfWeek.SATURDAY
                || dataHoraEntrada.getDayOfWeek() == DayOfWeek.SUNDAY
                || dataHoraEntrada.getHour() < 7
                || dataHoraEntrada.getHour() >= 22) {
            System.out.println("Período: horário especial");
        } else {
            System.out.println("Período: horário regular");
        }

        if (perdido) {
            System.out.println("Situação: ticket perdido");
        } else {
            System.out.println("Situação: ticket regular");
        }
    }

    public String getCodigo() { return codigo; }
    public Veiculo getVeiculo() { return veiculo; }
    public Vaga getVaga() { return vaga; }
    public boolean isPerdido() { return perdido; }
    public LocalDateTime getDataHoraEntrada() { return dataHoraEntrada; }
    public LocalDateTime getDataHoraSaidaPrevista() { return dataHoraSaidaPrevista; }
}