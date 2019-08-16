/*
En este programa vamos a encontrar las diferencias que hay entre programacion 
funcional y programacion imperativa o tradicional y tambien veremos como 
se establecen las funciones lambda en la programacion funcional
*/
package p_funcional_imperativa_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;  

public class Ejercicios {
    
    static boolean esPar(Integer n){
             return n % 2==0;
         }
    
     public static void main(String[] args) {
         
         //creamos una lista de numeros\\
         List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
         //Encontramos los numeros pares y guardarlos en un ArrayList\\
         List<Integer> resultados = new ArrayList<Integer>();
         
         ///programacion funcional declarativa = "que quiero hacer"\\\
         /*resultados = numeros.stream()//tengo un steam de numero o flujo\\
                 .filter(Ejercicios::esPar)//filtro el flujo de numeros pares\\
                 .collect(Collectors.toList()); //los convierto en una lista\\
         */
         //Aqui entran las lambda\\
         /*resultados = numeros.stream()
                 .filter((Integer n) -> {return n % 2==0;})//lambda -> función anonima\\
                 .collect(Collectors.toList());*/
         //pero esta funcion lambda se puede reducir aun mas\\
         resultados = numeros.stream().filter(n -> n % 2==0).collect(Collectors.toList());
         

         /*y esta es laprogramacion imperativa las mas tradicional
         se enfoca en "como lo voy a hacer"*/         
         /*for (int i = 0; i < numeros.size(); i++) {
             if (numeros.get(i) % 2==0) {//evaluamos para encontrar los numeros pares 
                 resultados.add(numeros.get(i));
             }
         }*/
         System.out.println(resultados);
         
    }
    
}


/*
    CONCLUSION:
    Con la programacion funcional se tiende a reducir el codigo que aplicamos
    en la programacion tradicional aplicando las funciones lambda que nos 
    reducen considerablemente el codigo de nuestro programa 
*/