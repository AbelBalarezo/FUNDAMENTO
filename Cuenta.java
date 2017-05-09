
package ejercicio.pkg2;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cuenta {
    private int id=0;
    private double saldo;
    private static double interes_anual=0;
    private Date fecha;

    public Cuenta(int id,double saldo) {
        this.id=id;
        this.saldo=saldo;
    }

    public Cuenta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public Date getFecha() {
        fecha= new Date();
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public double getInteresMensual(){
        double interes= this.saldo*0.045;
        return interes;
    }
    // metodo y su validacion
    public void Retirar_y_Depositar(double retiro,double deposito){
          this.saldo=this.saldo-retiro;
  
          if(retiro>this.saldo){
             System.out.println("  ");
             System.out.println("ESTIMADO USUARIO,USTED NO CUENTA CON SALDO SUFICIENTE PARA SU RETIRO :/");
           
          }else{
             this.saldo= this.saldo+ deposito;
              Mostrar();
          }
            

    }
    
    public void Mostrar(){
        
        System.out.println("=======DATOS IMPRESO RETIRO Y DEPOSITO======");
        
        DateFormat df= DateFormat.getDateInstance();
        System.out.println("FECHA DE CREACION: "+df.format(getFecha()));
        System.out.println("ID: "+ getId());
        System.out.println("BALANCE ATUAL: "+ getSaldo());
        System.out.println("INTERES ANUAL: "+ getInteres_anual());
        System.out.println("INTERES MENSUAL: "+ getInteresMensual());
       
    }
    
    
    public static void main(String []args){ 
        Cuenta test1=new Cuenta();
        test1.Mostrar();
        Cuenta test= new Cuenta();
        test.setId(1122);
        test.setSaldo(20000);
        test.setInteres_anual(0.045);
        //Mande los 2 valor en un solo metodo,el primero es de retiro y el segundo es de deposito
        // pilas profe,hice asi para que me pueda funcionar la validacion
        test.Retirar_y_Depositar(22500,3000);
        
        
    }
    
   
}  

