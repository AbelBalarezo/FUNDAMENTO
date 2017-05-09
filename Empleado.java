
package ejercicio.pkg4;


 class Empleado extends Persona {
    private double Salario;
    private String  Fecha_Entrada;
    
    public Empleado(String n,String d,String t,String e,double Salario,String Fecha_Entrada){
       super(n,d,t,e);
       this.Salario=Salario;
       this.Fecha_Entrada=Fecha_Entrada;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getFecha_Entrada() {
        return Fecha_Entrada;
    }

    public void setFecha_Entrada(String Fecha_Entrada) {
        this.Fecha_Entrada = Fecha_Entrada;
    }
    
     public void mostrar(){
        super.Mostrar();
        System.out.println("Salario : " + getSalario());
        System.out.println("Fecha de entrada : " + getFecha_Entrada() );
    }
    
    public static void main(String[] args) {
         Empleado emp=new Empleado("manuel","Bastion popular","2585554","manuel-balarezo_19@hotmail.com",750,"10 de octubre 2017");
         
         emp.mostrar();
     }
}


