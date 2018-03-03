
package usointerface;


public class Rectangulo implements FigurasGeometricas {

                   private int base;
                   private float altura;
                   float Area;
                   float Perimetro;

public Rectangulo(int base, float altura) {
        this.base = base;
        this.altura = altura;
    }


public int getbase(){
         return base;   
     }

public float getaltura() {
        return altura;
    }




    @Override
    public void Calculoarea() {
           Area =base*altura;
           System.out.println("El area del rectangulo es: " +Area);
    }

    @Override
public void Calculoperimetro() {
          Perimetro=2*(base+altura);
          System.out.println("El perimetro del rectangulo es: " +Perimetro);
    }

    
}
