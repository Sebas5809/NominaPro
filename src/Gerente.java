public class Gerente extends Empleado{
private double bono;
public Gerente(int id, String nombre, double salarioBase, double bono){
    super(id, nombre,salarioBase);
    if (bono<0){
        throw new IllegalArgumentException("El bono no puede ser negativo");
    }
    this.bono = bono;
}
public double getBono(){
    return bono;
}
@Override
public double calcularSalario(){
    return getSalarioBase() + bono;
}
@Override
public String descripcion(){
    return (super.descripcion() + " Gerente");
}
}


