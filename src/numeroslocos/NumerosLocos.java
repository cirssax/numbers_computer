package numeroslocos;
import Algoritmos.Algoritmos;
import java.io.*;
import java.util.Random;
import java.util.logging.*;
import java.util.concurrent.ThreadLocalRandom;
import Archivo.*;

public class NumerosLocos 
{
    
    
    public static void main(String[] args) 
    {      
        CrearArchivo archivo= new CrearArchivo();
        SepararArchivo separar = new SepararArchivo();
        OrdenarArchivo ordenar = new OrdenarArchivo();
        Mezclar merge = new Mezclar();
        //Creacion del archivo de numeros desordenado
        archivo.ArchivoNumerosDesordenado();
        //Separacion del archivo en 8 archivos individuales
        try 
        {
            separar.Separar(8);
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(NumerosLocos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Ordenamiento de los o8 archivos por separado
        for(int i=1; i<=8; i++)
            ordenar.Ordenar(String.valueOf(i));
        //Creacion de los archivos mezclado
        merge.Merge("1", "2");
        merge.Merge("3", "4");
        merge.Merge("5", "6");
        merge.Merge("7", "8");
        merge.Merge("12", "34");
        merge.Merge("56", "78");
        merge.Merge("1234", "5678");
    }
    
}
