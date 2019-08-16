
package interfazlambda;

import ClasesLambda.ListasLambda;


public class Main {
    
    @FunctionalInterface
    interface Suma{
    public Integer sumarDosNumeros (Integer a, Integer b);
}

    public static void main(String[] args) {
        
        ListasNormales eje = new ListasNormales();
        //eje.lista1();
        //eje.lista2();
        //exprexiones lambda
        ListasLambda lam = new ListasLambda();
        //System.out.println("lambda 1");
        //lam.lambda1();
        //System.out.println("lambda 2");
        //lam.lambda2();
        System.out.println("lambda 3");
        lam.lambda3();
        
        /*Suma suma = (a,b)-> a+b;
        System.out.println("Lambda interfaz Suma");
        System.out.println(suma.sumarDosNumeros(10, 5));
        
        
        operaciones op = (a,b)->a+b;
        
        
        System.out.println("Lambda interfaz operaciones");
        System.out.println(op.restarDosNumeros(10, 5));
        
        */
        
    }
    
}
