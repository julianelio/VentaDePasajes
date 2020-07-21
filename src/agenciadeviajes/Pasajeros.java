
package agenciadeviajes;


public class Pasajeros {
    String dni;
    String pasaporte;
    int edad;
    String nombre;

    
    
    
    void comprar(){
        
    }

    
    
  boolean siMenor(){
      boolean menor;
        System.out.println(this.edad);
        if (this.edad <=17) {
            menor = true;
           
          
      } else {
            menor = false;
           
      }
        return menor;
}

  
  @Override
    public String toString() {
        return "Pasajeros{" + "dni=" + dni + ", pasaporte=" + pasaporte + ", edad=" + edad + ", nombre=" + nombre + '}';
    }
}