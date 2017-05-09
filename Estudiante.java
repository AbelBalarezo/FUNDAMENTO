
package ejercicio.pkg4;


 class Estudiante extends Persona {
     private String Status;
     
     public Estudiante(String n,String d,String t,String e,String St){
         super(n,d,t,e);
         this.Status=St;
     }
     
     
   public void mostrar(){
       super.Mostrar();
       System.out.println("Status Del Estudiante : " +getStatus());
   }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
     public static void main(String[] args) {
         
        Estudiante es =new Estudiante("abel","Bastion popular","2585554","abel-balarezo_1997@hotmail.com","Cuarto año");
        es.mostrar();
     } 
    
    
}
