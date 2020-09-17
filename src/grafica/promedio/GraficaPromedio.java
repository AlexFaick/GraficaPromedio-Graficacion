/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica.promedio;



/**
 *
 * @author Cesar Mora
 */
public class GraficaPromedio {

    public static void main(String[] args) {
      //Arreglo con numeros aleatorios
   int Numbers []= new int[9];
  
   //se declara ls variable donde se almacenara promedio 
   int promedio=0;
   
        System.out.println("IMPRIMIENDO LINEAS DE NUMEROS ALEATORIOS GENERADOS");
        //se genera los nuemros aleatorios en el arreglo
        for (int x = 0; x < 9; x++) {
            
        Numbers[x]=(int)(Math.random()*100+1);
            
        promedio=promedio+Numbers[x];
        
        
        
        }
        //se saca el promedio
        promedio=promedio/10;
 
        
        //empieza los ciclos para poder imprimir las lineas
        for (int i = 0; i < 9; i++) {
            
          
   
            for (int j = 1; j<=Numbers[i]; j++) {
                
                System.out.print("-");
            // en este caso este if comprueba que el promedio sea igual ala linea de donde cruzara
                if(j==promedio){
                    System.out.print("||");
                    
                }
                //Imprime el numero aleatorio
              if (Numbers[i]==j) {
                    System.out.print(">");
                    
                }
       
            }
          System.out.println(Numbers[i]);
           
        }
        
        
        
        //Aqui empieza a imprimir el promedio de los numeros  de manera independiente
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
        System.out.println("");
        System.out.println("");
        
        for (int i = 1; i <=promedio; i++) {
            System.out.print("-");   
            if (promedio==i) {
                    System.out.print(">");
                    
                }
           
        }
        
         System.out.println(promedio+" <<--PROMEDIO DE TODOS LOS NUMEROS ALEATORIOS");
         System.out.println("");
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
       
        
    } 
    
}
