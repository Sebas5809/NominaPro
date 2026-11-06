public class Programador extends Empleado {
    private int horasExtra;

    public Programador(int id, String nombre, double salarioBase, int horasExtra) {
        super(id, nombre, salarioBase);
        if (horasExtra < 0) {
            throw new IllegalArgumentException("Las horas extra no pueden ser negativas");
        }
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + horasExtra * 50;
    }

    @Override
    public String descripcion() {
        return (super.descripcion() + " Programador");
    }
}
