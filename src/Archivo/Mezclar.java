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
public class Mezclar 
{
    public void Merge(String Nombre1 , String Nombre2)
    {
        Algoritmos algoritmo = new Algoritmos();
        int cadena1, cadena2, num1=0, num2=0;
        Nombre1 = Nombre1.replaceAll("[.txt]", "");
        Nombre2 = Nombre2.replaceAll("[.txt]", "");
        String Titulo1 = Nombre1+".txt";
        String Titulo2 = Nombre2+".txt";
        String TituloFinal = Nombre1+Nombre2+".txt";
        FileReader Archivo1 = null;
        FileReader Archivo2 = null;
        FileWriter ArchivoFinal = null;
        PrintWriter pw = null;
        try
        {
            Archivo1 = new FileReader(Titulo1);
            Archivo2 = new FileReader(Titulo2);
            ArchivoFinal = new FileWriter(TituloFinal);
            pw = new PrintWriter(ArchivoFinal);
            cadena1 = Archivo1.read();
            cadena2 = Archivo2.read();
            while(cadena1 != -1 && cadena2 !=-1)
            {
                while(cadena1 != 32)
                {
                    num1 = num1*10 + algoritmo.Numero(cadena1);
                    cadena1 = Archivo1.read();
                }
                while(cadena2 != 32)
                {
                    num2 = num2*10 + algoritmo.Numero(cadena2);
                    cadena2 = Archivo2.read();
                }
                if(num1 < num2)
                {
                    pw.write(num1+" ");
                    cadena1 = Archivo1.read();
                    num1=0;
                }
                else if(num2 < num1)
                {
                    pw.write(num2+" ");
                    cadena2 = Archivo2.read();
                    num2 = 0;
                }
                else
                {
                    pw.write(num1+" "+num2+" ");
                    num1 = 0;
                    num2 = 0;
                    cadena2 = Archivo2.read();
                    cadena1 = Archivo1.read();
                }
            }
            if(cadena1 == -1)
            {//La cadena de numeros 1 se termino primero y el resto de numeros queda solo en la cadena 2
                try 
                {
                    if (null != Archivo1)
                       Archivo1.close();
                } 
                catch (Exception e2) 
                {
                   e2.printStackTrace();
                }
                
                while(cadena2!=-1)
                {
                    if(cadena2 != 32)
                        num2 = num2*10 + algoritmo.Numero(cadena2);
                    else
                    {
                        pw.write(num2+" ");
                        num2 = 0;
                    }
                    cadena2 = Archivo2.read();
                }
            }
            if(cadena2 == -1)
            {//La cadena de numeros 2 se termino primero y el resto de numeros queda solo en la cadena 1
                try 
                {
                    if (null != Archivo2)
                       Archivo2.close();
                } 
                catch (Exception e2) 
                {
                   e2.printStackTrace();
                }
                
                while(cadena1 != -1)
                {
                    if(cadena1 != 32)
                        num1 = num1*10 + algoritmo.Numero(cadena1);
                    else
                    {
                        pw.write(num1+" ");
                        num1 = 0;
                    }
                    cadena1 = Archivo1.read();
                }
                
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
                if (null != ArchivoFinal)
                   ArchivoFinal.close();
                if (null != Archivo1)
                       Archivo1.close();
                if (null != Archivo2)
                       Archivo2.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
        System.out.println("Archivos: "+Nombre1+" "+Nombre2+" Mezclados en el archivo: "+TituloFinal);
    }
}
