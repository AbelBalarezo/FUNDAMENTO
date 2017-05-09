
package ejercicio.pkg4;


public class Profesor extends Empleado{
   

    public Profesor(String n, String d, String t, String e, double Salario, String Fecha_Entrada) {
          super(n, d, t, e, Salario, Fecha_Entrada); 
    }
    public void mostrar(){
       super.mostrar();
    }
    public static void main(String []args){
        Profesor pro=new Profesor("Abel","Bastion popular","2585554","abel-balarezo_1997@hotmail.com",800,"15 de agosto 2013");
        pro.mostrar();
    }
    
}
