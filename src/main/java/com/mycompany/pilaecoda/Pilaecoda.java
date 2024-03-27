/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilaecoda;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Pilaecoda {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("programma gestione fila e coda array dinamico scegliere il tipo di inserimento");
        System.out.println("1. Fila");
        System.out.println("2. Coda");
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        System.out.println("Inserisci quanti numeri vuoi inserire");
        int num=scan.nextInt();
        int[] in=new int[num];
        Aggiunta a=new Aggiunta();
        switch(s){
            case 1:
                for(int c=num-1 ; c>=0 ; c--){
                in[c]=scan.nextInt();
                }
                array.add(num);
                a.fila(num, in, array);
            break;
            
            case 2:
                for(int c=0 ; c<num ; c++){
                in[c]=scan.nextInt();
                }
                array.add(num);
                a.coda(num, in, array);
        }
    }
}
