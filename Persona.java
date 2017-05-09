/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;


public abstract class Persona {
private String Nombre;
private String Direccion;    
private String Telefono;
private String Email;
public Persona (String n,String d,String t,String e){
this.Nombre=n;
this.Direccion=d;
this.Telefono=t;
this.Email=e;

}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void Mostrar(){
    
    System.out.println("====Datos del estudiante=====");
        System.out.println("Nombre : " + getNombre());
        System.out.println("Direccion : " +getDireccion());
        System.out.println("Telefono : " +getTelefono());
        System.out.println("Email : " +getEmail());
}
     

}
