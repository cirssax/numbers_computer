package Algoritmos;

public class Algoritmos 
{
    public void QuickSort(int a[], int l, int u)
    {
        int j;
        if(l<u)
        {
            j=partition(a,l,u);
            QuickSort(a,l,j-1);
            QuickSort(a,j+1,u);
        }
    }
    
    private int partition(int a[],int l,int u)
    {
        int v,i,j,temp;
        v=a[l];
        i=l;
        j=u+1;
        do
        {
            do
                i++;
            while(a[i]<v&&i<=u);
            do
                j--;
            while(v<a[j]);
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }while(i<j);
        a[l]=a[j];
        a[j]=v;
        return(j);
    }
    
    public int Numero(int digito)
    {
        if(digito == 48)
            return 0;
        else if(digito == 49)
            return 1;
        else if(digito == 50)
            return 2;
        else if(digito == 51)
            return 3;
        else if(digito == 52)
            return 4;
        else if(digito == 53)
            return 5;
        else if(digito == 54)
            return 6;
        else if(digito == 55)
            return 7;
        else if(digito == 56)
            return 8;
        else
            return 9;
    }
    
}
