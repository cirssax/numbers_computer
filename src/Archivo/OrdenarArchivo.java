/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import Algoritmos.Algoritmos;
import java.io.*;
/**
 *
 * @author cris_
 */
public class OrdenarArchivo 
{
    public void Ordenar(String nombre)
    {
        Algoritmos algoritmo = new Algoritmos();
        int [] Numeros;
        Numeros = new int[500000000];
        String Titulo = nombre + ".txt";
        FileReader fichero = null;
        int caracter, num=0, i=0;
        try
        {
            fichero = new FileReader(Titulo);
            caracter = fichero.read();
            while(caracter != -1)
            {
                if(caracter != 32)
                    num = num*10 + algoritmo.Numero(caracter);
                else
                {
                    Numeros[i]=num;
                    i++;
                    num=0;   
                }
                caracter = fichero.read();
            }
            
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
           try 
           {
                if (null != fichero)
                   fichero.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
        
        System.out.println("Archivo: "+Titulo+" sin ordenar");
        algoritmo.QuickSort(Numeros, 0, i-1);
        
        FileWriter ficheronuevo = null;
        PrintWriter pw = null;
        try
        {
            ficheronuevo = new FileWriter(Titulo);
            pw = new PrintWriter(ficheronuevo);
            for(int j=0; j< i ;j++)
                pw.print(Numeros[j]+" ");    
            System.out.println("Archivo "+Titulo+" ordenado");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
           try 
           {
                if (null != ficheronuevo)
                   ficheronuevo.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
    }
}
