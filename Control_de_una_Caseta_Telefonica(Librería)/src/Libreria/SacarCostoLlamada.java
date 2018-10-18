
package Libreria;


public class SacarCostoLlamada {
    public double sacar_costo_llamada_menor_igual_3(double duracion){
        duracion = 10;
        return duracion;
    }
    
     public double sacar_costo_llamada_mayor3_menor10(double duracion){
        double auxiliar = 10;
        duracion = duracion - 3;
        duracion = duracion * 5;
        duracion = duracion + auxiliar;
        return duracion;
    }
      public double sacar_costo_llamada_mayor10(double duracion){
         double auxiliar = 45;
        duracion = duracion - 10 ;
        duracion = duracion * 7;
        duracion = duracion + auxiliar;
        return duracion;
    }
    
    
}
