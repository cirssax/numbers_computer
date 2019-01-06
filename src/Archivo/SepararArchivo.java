package Archivo;

import java.io.*;
import java.util.Random;
import java.util.logging.*;
import java.util.concurrent.ThreadLocalRandom;
import Algoritmos.*;

public class SepararArchivo 
{
    public void Separar(int i) throws FileNotFoundException
    {
        Algoritmos algoritmo = new Algoritmos();
        for(int j=1; j<=i; j++)
        {
            //CREACION DE LOS 8 ARCHIVOS INDIVIDUALES DE DATOS
            CrearArchivo File = new CrearArchivo();
            try
            {
                File.CrearArchivo(String.valueOf(j));
            }
            catch (Exception e)
            {
                System.out.println("Error: "+e);
            }
        }        
        int NumeroArchivo = 1, CantidadNumero = 0, caracter, num = 0;
        FileReader fr = null;
        FileWriter archivo1 = null;
        PrintWriter Ar1 =null;
        FileWriter archivo2 = null;
        PrintWriter Ar2 =null;
        FileWriter archivo3 = null;
        PrintWriter Ar3 =null;
        FileWriter archivo4 = null;
        PrintWriter Ar4 =null;
        FileWriter archivo5 = null;
        PrintWriter Ar5 =null;
        FileWriter archivo6 = null;
        PrintWriter Ar6 =null;
        FileWriter archivo7 = null;
        PrintWriter Ar7 =null;
        FileWriter archivo8 = null;
        PrintWriter Ar8 =null;
        try
        {
            fr = new FileReader("NumerosSinOrdenar.txt");
            archivo1 = new FileWriter("1.txt");
            Ar1 = new PrintWriter(archivo1);
            
            archivo2 = new FileWriter("2.txt");
            Ar2 = new PrintWriter(archivo2);
            
            archivo3 = new FileWriter("3.txt");
            Ar3 = new PrintWriter(archivo3);
            
            archivo4 = new FileWriter("4.txt");
            Ar4 = new PrintWriter(archivo4);
            
            archivo5 = new FileWriter("5.txt");
            Ar5 = new PrintWriter(archivo5);
            
            archivo6 = new FileWriter("6.txt");
            Ar6 = new PrintWriter(archivo6);
            
            archivo7 = new FileWriter("7.txt");
            Ar7 = new PrintWriter(archivo7);
            
            archivo8 = new FileWriter("8.txt");
            Ar8 = new PrintWriter(archivo8);
            
            caracter = fr.read();
            while(caracter != -1)
            {
                if(CantidadNumero == 400000000)
                {
                    if(NumeroArchivo==1)
                    {
                        archivo1.close();
                        System.out.println("Archivo 1 lleno");
                    }
                    else if(NumeroArchivo==2)
                    {
                        archivo2.close();
                        System.out.println("Archivo 2 lleno");
                    }
                    else if(NumeroArchivo==3)
                    {
                        archivo3.close();
                        System.out.println("Archivo 3 lleno");
                    }
                    else if(NumeroArchivo==4)
                    {
                        archivo4.close();
                        System.out.println("Archivo 4 lleno");
                    }
                    else if(NumeroArchivo==5)
                    {
                        archivo5.close();
                        System.out.println("Archivo 5 lleno");
                    }
                    else if(NumeroArchivo==6)
                    {
                        archivo6.close();
                        System.out.println("Archivo 6 lleno");
                    }
                    else if(NumeroArchivo==7)
                    {
                        archivo7.close();
                        System.out.println("Archivo 7 lleno");
                    }
                    else 
                    {
                        archivo8.close();
                        System.out.println("Archivo 8 lleno");
                    }
                    NumeroArchivo++;
                    CantidadNumero = 0;
                }
                if(NumeroArchivo==1)
                {
                    if(caracter != 32)
                    {
                        num = num*10 + algoritmo.Numero(caracter);
                    }
                    else
                    {
                        Ar1.print(num+" ");
                        CantidadNumero++;
                        num = 0;
                    }
                }
                else if(NumeroArchivo==2)
                {
                    if(caracter != 32)
                    {
                        num = num*10 + algoritmo.Numero(caracter);
                    }
                    else
                    {
                        Ar2.print(num+" ");
                        CantidadNumero++;
                        num = 0;
                    }
                }
                else if(NumeroArchivo==3)
                {
                    if(caracter != 32)
                    {
                        num = num*10 + algoritmo.Numero(caracter);
                    }
                    else
                    {
                        Ar3.print(num+" ");
                        CantidadNumero++;
                        num = 0;
                    }
                }
                else if(NumeroArchivo==4)
                {
                    if(caracter != 32)
                    {
                        num = num*10 + algoritmo.Numero(caracter);
                    }
                    else
                    {
                        Ar4.print(num+" ");
                        CantidadNumero++;
                        num = 0;
                    }
                }
                else if(NumeroArchivo==5)
                {
                    if(caracter != 32)
                    {
                        num = num*10 + algoritmo.Numero(caracter);
                    }
                    else
                    {
                        Ar5.print(num+" ");
                        CantidadNumero++;
                        num = 0;
                    }
                }
                else if(NumeroArchivo==6)
                {
                    if(caracter != 32)
                    {
                        num = num*10 + algoritmo.Numero(caracter);
                    }
                    else
                    {
                        Ar6.print(num+" ");
                        CantidadNumero++;
                        num = 0;
                    }
                }
                else if(NumeroArchivo==7)
                {
                    if(caracter != 32)
                    {
                        num = num*10 + algoritmo.Numero(caracter);
                    }
                    else
                    {
                        Ar7.print(num+" ");
                        CantidadNumero++;
                        num = 0;
                    }
                }
                else
                {
                    if(caracter != 32)
                    {
                        num = num*10 + algoritmo.Numero(caracter);
                    }
                    else
                    {
                        Ar8.print(num+" ");
                        CantidadNumero++;
                        num = 0;
                    }
                }
                caracter = fr.read();
            }
            
        }
         catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(fr != null)
                    fr.close();
                if(archivo1!=null)
                    archivo1.close();
                if(archivo2!=null)
                    archivo2.close();
                if(archivo3!=null)
                    archivo3.close();
                if(archivo4!=null)
                    archivo4.close();
                if(archivo5!=null)
                    archivo5.close();
                if(archivo6!=null)
                    archivo6.close();
                if(archivo7!=null)
                    archivo7.close();
                if(archivo8!=null)
                    archivo8.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
