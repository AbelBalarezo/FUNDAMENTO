
package ejercicio.pkg4;


 class Estudiante extends Persona {
      
     public Estudiante(String n,String d,String t,String e){
         super(n,d,t,e);
     }
     
     
   public void mostrar(){
       super.Mostrar();
   }
    
     public static void main(String[] args) {
         
        Estudiante es =new Estudiante("Abel","Bastion popular","2585554","abel-balarezo_1997@hotmail.com");
        es.mostrar();
     } 
    
    
}
