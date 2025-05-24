package carrental;

public class CategoriaCarro {
    public static final CategoriaCarro COMPACTO = new CategoriaCarro("COMPACTO", 30.0);
    public static final CategoriaCarro SEDAN_MEDIANO = new CategoriaCarro("SEDAN_MEDIANO", 40.0);
    public static final CategoriaCarro SEDAN_EJECUTIVO = new CategoriaCarro("SEDAN_EJECUTIVO", 50.0);
    public static final CategoriaCarro SUV = new CategoriaCarro("SUV", 60.0);

    private final String nombre;
    private final double tarifaDiaria;

    private CategoriaCarro(String nombre, double tarifaDiaria) {
        this.nombre = nombre;
        this.tarifaDiaria = tarifaDiaria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
