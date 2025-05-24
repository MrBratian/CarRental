package carrental;

public class Carro {
    private String placa;
    private String modelo;
    private CategoriaCarro categoria;
    private boolean disponible;

    public Carro(String placa, String modelo, CategoriaCarro categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.categoria = categoria;
        this.disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double obtenerTarifaDiaria() {
        return categoria.getTarifaDiaria();
    }

    public CategoriaCarro getCategoria() {
        return categoria;
    }
}
