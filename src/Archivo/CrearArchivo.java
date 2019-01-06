package Archivo;
import java.io.*;
import java.util.Random;
import java.util.logging.*;
import java.util.concurrent.ThreadLocalRandom;

public class CrearArchivo 
{
    public void ArchivoNumerosDesordenado()
    {//FUNCION PARA CREAR EL ARCHIVO CON NUMEROS RANDOM
        int n;
        Random r = new Random();
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("NumerosSinOrdenar.txt");
            pw = new PrintWriter(fichero);
            for(int j=0; j< 8;j++)
            {
                for (int i=0; i< 400000000; i++)
                {
                    n = r.nextInt(500000000);
                    pw.print(n+" ");
                }
            }
            System.out.println("Archivo con numeros aleatorios creado");
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
    }
    
    public void CrearArchivo(String nombre)
    {//FUNCION PARA CREAR UN ARCHIVO POR SU NOMBRE
        Random r = new Random();
        String Titulo = nombre + ".txt";
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(Titulo);
            System.out.println("Archivo: "+nombre+" creado");
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
    }
}
