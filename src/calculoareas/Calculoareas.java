/*
 Crea un programa que pregunte para que figura geométrica quiero calcular el
 área. Las opciones serían círculo o cuadrado.
   -Tendremos en cuenta que el área de un círculo es igual a PI*R2
   -Si es cuadrilatero tendremos que preguntar si ambos lados son iguales 
    (si es un cuadrado pedir a, si es un rectangulo pedir a y b)
    (circulo? --> bn, cuadrado? preguntar si es un cuadrado perfect o un rect)
    R (RADIO), PI= 3,14   ||  base =B  altura =A   || no debe haber ceros



CREAR UN PROGRAMA QUE PREGUNTE PARA QUE FIGURA GEOMÉTRICA QUIERO CALCULAR EL AREA.
LAS OPCIONES SERÍAN CIRCULO O CUADRILATERO
    - SI ES CIRCULO TENDREMOS EN CUENTA QUE EL AREA DE UN CIRCULO ES IGUAL A PI*r2
    - SI ES CUADRILATERO TENDREMOS QUE PREGUNTAR SI QUEREMOS CALCULAR EL AREA DE UN CUADRADO O UN RECTÁNCULO
            - SI ES CUADRADO TENDRÉ QUE PEDIR 1 DATO Y CALCULO EL AREA
            - SI ES RECTÁNGULO TENDRÉ QUE PEDIR 2 DATOS Y CALCULO EL AREA
    - SERÁ NECESARIO CONTROLAR QUE NINGUNO DE LOS DATOS INTRODUCIDOS POR TECLADO SEA MENOR O IGUAL A CERO

nueva version owo
 */
package calculoareas;

import java.util.Scanner;

/**
 *
 * @author vespertino
 */
public class Calculoareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         double PI=3.1415;
         int R=0;
         int B=0;
         int A=0;
         Boolean circle= true;
         Boolean square= true;
         int AreaCirculo=0;
         int AreaCuadrado=0;
         int AreaRectangulo=0;
         String circulo="circulo";
         String cuadrado="cuadrado";
         String rectangulo="rectangulo";
         
        Scanner teclado = new Scanner(System.in);
         
        System.out.println("Calculemos el area de una figura geometrica\n");
        
        circulo= teclado.next();
        
        if (circle ==true){
            
        System.out.println("Calculemos el area de un circulo\n");
        System.out.println("Dime cuanto vale R");
        
        R=teclado.nextInt();
        
        AreaCirculo= (int) (PI*R*R);
        System.out.println("El area del circulo es " + AreaCirculo);
       
        
        }else {
          if (circle ==false) {

             System.out.println("Calculemos el area de un cuadrado\n");
             System.out.println("Dime cuanto vale B");
        
              B=teclado.nextInt();
        
             AreaCuadrado= (int) (B*A);
             System.out.println("El area del cuadrado es " + AreaCuadrado);    
        
          }else {
        
             System.out.println("Calculemos el area de un rectangulo\n");
             System.out.println("Dime cuanto vale B");
             B=teclado.nextInt();
             
             System.out.println("Dime cuanto vale A");
             A=teclado.nextInt();
        
             AreaRectangulo= (int) (B*A);
             System.out.println("El area del cuadrado es " + AreaRectangulo);   
          
          }

          /*holiwi ^^
          */
          
          
        }
    }
}
              
              
              
             
               
            
               
       
           
           
        
            
       
   
 
    
