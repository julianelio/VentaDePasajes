
package agenciadeviajes;

import java.util.ArrayList;


public class Pasajes {

    
    public static void main(String[] args) {
        
      Pasajeros miPasajero1 = new Pasajeros();
       miPasajero1.nombre ="Brian Lopez";
       miPasajero1.dni ="43446467";
       miPasajero1.edad= 32;
       miPasajero1.pasaporte ="E34BN7";
        System.out.println(miPasajero1.siMenor());
       
        
    System.out.println(miPasajero1);
    
    Pasajeros miPasajero2 = new Pasajeros();
       miPasajero2.nombre ="Marisa Laglaibe";
       miPasajero2.dni ="33446467";
       miPasajero2.edad= 15;
       miPasajero2.pasaporte ="E34BJO7";
        System.out.println(miPasajero2.siMenor());
       
        
       System.out.println(miPasajero2);
        
       Pasajeros miPasajero3 = new Pasajeros();
       miPasajero3.nombre ="Mario Bross";
       miPasajero3.dni ="334897865";
       miPasajero3.edad= 22;
       miPasajero3.pasaporte ="R44BJJG";
        System.out.println(miPasajero3.siMenor());
        
        
        
        
        System.out.println(miPasajero3);
       
       //Crear arraylist
        ArrayList listadoPasajeros = new ArrayList();
        System.out.println(listadoPasajeros);
        listadoPasajeros.add(miPasajero1);
        System.out.println(listadoPasajeros);
        listadoPasajeros.add(miPasajero2);
        System.out.println(listadoPasajeros);
        listadoPasajeros.add(miPasajero3);
        System.out.println(listadoPasajeros);
        
        //Recorrer el array
         System.out.println("El total de pasajeros es:"+ listadoPasajeros.size());
        for (int i = 0; i < listadoPasajeros.size(); i++) {
            System.out.println("Registro: "+ listadoPasajeros.get(i));
            
        }
            
        }
      
    }
    

