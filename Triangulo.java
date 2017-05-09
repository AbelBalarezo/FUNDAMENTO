/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;


public class Triangulo extends ObjetoGeometrico {
 
public Triangulo(){
    
}
public Triangulo(double lado1,double lado2,double lado3){
   
    this.Lado1=lado1;
    this.Lado2=lado2;
    this.Lado3=lado3;
}

    public void setLado1(double Lado1) {
        this.Lado1 = Lado1;
    }

    public void setLado2(double Lado2) {
        this.Lado2 = Lado2;
    }

    public void setLado3(double Lado3) {
        this.Lado3 = Lado3;
    }

    public double getLado1() {
        return Lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public double getLado3() {
        return Lado3;
    }

    public double getArea() {
        double res=(Lado1+Lado3)/2;
        return res;
    }

    public double getPerimetro() {
        double res1=(Lado1+Lado2+Lado3);
        return res1;
    }
public void Mostrar(){
    System.out.println("LADO1 : " + getLado1());
    System.out.println("LADO2 : " + getLado2());
    System.out.println("LADO3 : " + getLado3());
    //utilice el lado 1 y el lado 3 como la base y la altura
    System.out.println("AREA (BASE *ALTURA /2): "  + getArea());
    System.out.println("PERIMETRO (L1+L2+L3): " + getPerimetro());
}
    
    public static void main(String[] args) {
        System.out.println("VALORES POR DEFECTO DEL TRIANGULO");
        Triangulo t=new Triangulo();
        t.Mostrar();
        System.out.println("VALORES ESTABLECIDOS POR EL USUARIO DEL TRIANGULO");
        Triangulo t1=new Triangulo();
        t1.setLado1(1);
        t1.setLado2(1.5);
        t1.setLado3(1);
        t1.Mostrar();
    }
}
