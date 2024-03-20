/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilaecoda;

import java.util.ArrayList;

/**
 *
 * @author fabri
 */
public class Aggiunta {
    public void fila(int num, int[] input, ArrayList<Integer> array){
    int posti=array.size();
    int Posti=input.length;
    for(int c=posti-1; c>=posti-Posti;c--){
        Posti--;
        array.set(c, input[Posti]);
    }    
    }

    
    
    
    public void coda(int num, int[] input, ArrayList<Integer> array){
    int posti =array.size();
    int Posti=input.length;    
        
    }
}
