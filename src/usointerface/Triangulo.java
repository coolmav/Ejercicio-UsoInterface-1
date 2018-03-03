
package usointerface;


public class Triangulo implements FigurasGeometricas {

                 private int Base;
                 private float Altura;
                 float aRea;
                 float pErimetro;
   
public Triangulo(int Base, float Altura){
          this.Base = Base;
          this.Altura = Altura;
     } 


public int getBase() {
        return Base;
    }

public float getAltura() {
        return Altura;
    }




    @Override
public void Calculoarea() {
           aRea=Base*Altura/2;
           System.out.println("El area del rectangulo es: " +aRea);
    }

    @Override
public void Calculoperimetro() {
          pErimetro=3*Base;
          System.out.println("El perimetro del rectangulo es: " +pErimetro);
    }
    
}
