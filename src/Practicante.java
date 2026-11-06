public class Practicante extends Empleado {
    private int horasTrabajadas;
    public Practicante(int id, String nombre, int horasTrabajadas){
        super(id, nombre, 0);
        if (horasTrabajadas<0){
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas");
        }
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getHorasTrabajadas(){
        return  horasTrabajadas;
    }
    @Override 
    public double calcularSalario(){
        return horasTrabajadas*17;
    }
    @Override 
    public String descripcion(){
        return (super.descripcion() + " Practicante");
    }

    
}