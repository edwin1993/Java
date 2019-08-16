/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazlambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author climb
 */
public class ListasNormales {
    
    
    //Recorrer una lista en versiones anteriores de java
    public void lista1(){
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    
    public void lista2(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
    /*utilizar el metodo foreach() de las colecciones de java , debemos llamar 
    al metodo foreach de la instancia de coleccion y enviar un parametro del tipo Consumer*/
    list.forEach(System.out::println);
    
        
    }
    
    public void lista3(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for(Integer str : list)
        {
            //imprimimos el objeto pivote
            System.out.println(str);
        }
    }
    
    
    
}
