/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package branches;

import java.util.Scanner;

/**
 * @author alumne1daw
 */

public class Quina1 {
    
    public static int[] Ordenar (int[] carto) {
         int i, j, aux;
         for(i=0;i < carto.length-1;i++) {
              for(j=0;j < carto.length-i-1;j++) {
                   if(carto[j+1] < carto[j]){
                      aux = carto[j+1];
                      carto[j+1] = carto[j];
                      carto[j] = aux;
                   }
              }
        }
        return carto;
    }
    
    
    public static void Mostrar(int[] carto, int[] sortit){    
        for (int i = 0;i < 15;i++){
            System.out.println(carto[i]);
        }
    }
    
    public static boolean Hihasortit (int[] carto, int numero){
        boolean trobat = false;
            int i= 0;
            while (trobat == false && i< carto.length){
                if (carto[i] == numero){
                    trobat = true;
                }
                i++;
            }
        return trobat;
    }
    
    
    public static int[] retornaCarto(){   
        int numero;
        int[] carto;
        int[] sortit = {0,0,0,0,0,0,0,0,0,0};

        carto = new int[15];
        
        for (int i = 0;i<15;i++) {
            do{
                numero =  (int) (Math.random() * 90)+1;
            }while(sortit[numero/10] >= 3 || Hihasortit(carto,numero));
            carto[i] = numero;
            sortit[numero/10]++;
        }   

        carto = Ordenar(carto);
        Mostrar(carto,sortit);
        return carto;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] bulleta = retornaCarto();          
    }
}
