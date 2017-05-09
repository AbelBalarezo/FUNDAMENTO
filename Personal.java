
package ejercicio.pkg4;


public class Personal extends Empleado {
    
    public Personal(String no, String di, String te, String em, double Salario, String Fecha_Entrada) {
        super(no, di, te, em, Salario, Fecha_Entrada);
    }
    
    public void mostrar(){
      super.mostrar();
    }
    
    public static void main(String []args){
        Personal per=new Personal("Genesis","bastion popular","25884409","geny@hotmail.com",1500,"12 de enero 2004");
        per.mostrar();
    }
    
}
