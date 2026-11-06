public class Vendedor extends Empleado {
    private double ventas;

    public Vendedor(int id, String nombre, double salarioBase, double ventas) {
        super(id, nombre, salarioBase);
        if (ventas < 0) {
            throw new IllegalArgumentException("Las ventas no pueden ser negativas");
        }
        this.ventas = ventas;
    }

    public double getVentas() {
        return ventas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + ventas * 0.05;
    }

    @Override
    public String descripcion() {
        return (super.descripcion() + " Vendedor");
    }

}
