package App;

public class Lavadora extends Electrodomestico {
    static final int CARGA_POR_DEFECTO = 5;
    private int carga;

    public Lavadora() {
        super();
        this.carga = CARGA_POR_DEFECTO;
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
        this.carga = CARGA_POR_DEFECTO;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        if (getCarga() > 30) {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}