package carrental;

import java.time.LocalDate;

public class CarRental {
    public static void main(String[] args) {
        // Crear algunos carros
        Carro carro1 = new Carro("ABC123", "Toyota Yaris", CategoriaCarro.COMPACTO);
        Carro carro2 = new Carro("XYZ789", "Honda CR-V", CategoriaCarro.SUV);

        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan Pérez", "12345678");

        // Fechas de reserva
        LocalDate inicio = LocalDate.of(2025, 6, 1);
        LocalDate fin = LocalDate.of(2025, 6, 5);

        // Realizar reserva si el carro está disponible
        if (carro1.estaDisponible()) {
            Reserva reserva = new Reserva(cliente1, carro1, inicio, fin);
            System.out.println(reserva.resumenReserva());

            // Cancelar la reserva (ejemplo)
            reserva.cancelarReserva();
            System.out.println("\nReserva cancelada. ¿Carro disponible? " + carro1.estaDisponible());
        } else {
            System.out.println("El carro no está disponible.");
        }
    }
}
