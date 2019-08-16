
package ClasesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListasLambda {
    
    //recorrer Array 
    public void lambda1(){
    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(n -> System.out.print(n + " "));
    }
    
    // otra forma utilizando expresiones Lambdas
public void lambda2(){
    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(
    System.out::println);
} 

/*Veamos otro ejemplo tenemos almacenados números del 1 al 10 en una lista y
queremos obtener los números mayores a 5 y almacenarlos en una nueva lista.*/
public void lambda3(){
   
ArrayList<Integer> mayores = (ArrayList<Integer>) 
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        // se crea el stream
        .stream()
        //filtro para obtener los números mayores a 5 y dentro se utiliza la expresión lambda (x -> x > 5)
        .filter(x -> x > 5)
        //pone los elementos que se filtró dentro de una nueva lista, dentro se utiliza una expresión lambda  
        .collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
        mayores.forEach(e -> System.out.println(e));
}

    
}
