package carrental;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Cliente cliente;
    private Carro carro;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Reserva(Cliente cliente, Carro carro, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.carro = carro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.carro.setDisponible(false);  // Marcar carro como no disponible
    }

    public double calcularCostoTotal() {
        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return dias * carro.obtenerTarifaDiaria();
    }

    public void cancelarReserva() {
        this.carro.setDisponible(true);
    }

    public String resumenReserva() {
        return "Cliente: " + cliente.getNombre() +
               "\nCarro: " + carro.getCategoria() +
               "\nFechas: " + fechaInicio + " a " + fechaFin +
               "\nTotal: $" + calcularCostoTotal();
    }
}
