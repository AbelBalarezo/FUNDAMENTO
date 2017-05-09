
package ejercicio1;

public class Rectangulo {
private double Ancho=1;
private double Altura=1;


public Rectangulo(){

}
public Rectangulo(double Ancho,double Altura){
  this.Ancho=Ancho;
  this.Altura=Altura;  
  
}

    public double getPerimetro() {
        double Perimetro =2*(this.Ancho + this.Altura);
        return Perimetro;
        
    }

    public double getArea() {
        double area=(this.Ancho * this.Altura);
        return area;
        
    }
 
    public void Mostrar(){
      System.out.println("Altura : "+this.Altura );  
      System.out.println("Ancho : "+this.Ancho);
      System.out.println("Area : " +getArea());  
      System.out.println("Perimetro : "+getPerimetro()); 
      
  }

    public static void main(String[] args) {
        System.out.println("VALORES POR DEFECTO DEL TRIANGULO");
        Rectangulo rec=new Rectangulo();
        rec.Mostrar();
        System.out.println("CALCULO DE AREA Y PERIMETRO DEL TRIANGULO");
        Rectangulo rec1=new Rectangulo(4,40);
        rec1.Mostrar();
        System.out.println("CALCULO DE AREA Y PERIMETRO DEL TRIANGULO");
        Rectangulo rec2=new Rectangulo(3.5,35.9);
        rec2.Mostrar();
      
    }
    
}
