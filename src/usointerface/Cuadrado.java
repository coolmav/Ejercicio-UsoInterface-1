
package usointerface;


public class Cuadrado implements FigurasGeometricas {
      
               private int lado;
               float area;
               float perimetro;
   
public Cuadrado(int lado){
          this.lado = lado;
     } 

public int getLado(){
         return lado;   
     }


    @Override
public void Calculoarea() {
           area=2*lado;
           System.out.println("El area del cuadrado es: " +area);
    }

    @Override
public void Calculoperimetro() {
          perimetro=4*lado;
          System.out.println("El perimetro del cuadrado es: " +perimetro);
    }
}
   
