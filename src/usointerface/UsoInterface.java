
package usointerface;

import java.util.Scanner;


public class UsoInterface {


public static void main(String[] args) {

               Scanner bc=new Scanner(System.in);
   
//Cuadrado
               int ladoCuadrado;
               System.out.print("Digite el lado del cuadrado: ");
               ladoCuadrado=bc.nextInt();
               
               Cuadrado cuad=new Cuadrado(ladoCuadrado);
               
               cuad.Calculoarea();
               
               cuad.Calculoperimetro();
               
               System.out.println("\n");
  
//Rectangulo               
              int baseRectangulo;
              int alturaRectangulo;
              System.out.print("Digite la base del rectangulo: ");
              baseRectangulo=bc.nextInt();
              System.out.print("Digite la altura del rectangulo: ");
              alturaRectangulo=bc.nextByte();
   
               
              Rectangulo rec=new Rectangulo(baseRectangulo, alturaRectangulo);

              rec.Calculoarea();
              rec.Calculoperimetro();
              
       
              System.out.println("\n");
                                         
//Triangulo
              int BaseTriangulo;
              int AlturaTriangula;
              System.out.print("Digite la base del triangulo: ");
              BaseTriangulo=bc.nextInt();
              System.out.print("Digite la altura del triangulo: ");
              AlturaTriangula=bc.nextByte();
                                            
              Triangulo trian=new Triangulo(BaseTriangulo , AlturaTriangula);
              
              trian.Calculoarea();
              trian.Calculoperimetro();
                                
    }
    
}
