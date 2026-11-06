public class Empleado{
    private int id;
    private String nombre;
    private double salarioBase;
    public Empleado(int id, String nombre, double salarioBase){
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
           
        }
         if (salarioBase < 0){
                throw new IllegalArgumentException("El salario no puede ser negativo");
            }
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public double calcularSalario(){
        return salarioBase;
    }
    public String descripcion(){
        return  (getId() + "," + getNombre() + "," + getSalarioBase());
    }
    public void aumentarSalario(double porcentaje){
        if(porcentaje>0){
            salarioBase = salarioBase + salarioBase * porcentaje/100;
        }
        
    }

}
