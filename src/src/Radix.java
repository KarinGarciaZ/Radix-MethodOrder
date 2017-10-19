package src;
public class Radix 
{
    
    String largoDigitos;
    int numDigitos;
    Nodo d0;
    Nodo d1;
    Nodo d2;
    Nodo d3;
    Nodo d4;
    Nodo d5;
    Nodo d6;
    Nodo d7;
    Nodo d8;
    Nodo d9;
    
    
    
    /*
    public void radixSort(int[] arr){
	        if(arr.length == 0)
	            return;
                
	        int[][] np = new int[arr.length][2];
                int[] q = new int[256];
                int i,j,k,l,f = 0;
	        for(k=0;k<4;k++){
	            for(i=0;i<(np.length-1);i++)
	                np[i][1] = i+1;
	            np[i][1] = -1;
	            for(i=0;i<q.length;i++)
	                q[i] = -1;
	            for(f=i=0;i<arr.length;i++){
	                j = ((255<<(k<<3)) & arr[i])>>(k<<3);
                        if(q[j] == -1)
	                    l = q[j] = f;
	                else{
	                    l = q[j];
	                    while(np[l][1] != -1)
	                        l = np[l][1];
	                    np[l][1] = f;
                     l = np[l][1];
	                }
	                f = np[f][1];
	                np[l][0] = arr[i];
	                np[l][1] = -1;
	            }
	            for(l=q[i=j=0];i<0x100;i++)
	                for(l=q[i];l!=-1;l=np[l][1])
	                        arr[j++] = np[l][0];
	        }
	    }
    
    public void radix2(int[] arreglo)
    {
        int x, i, j;
        for (x = Integer.SIZE-1; x>= 0; x--)
        {
            int auxiliar[] = new int [arreglo.length];
            j=0;
            for (i = 0; i < arreglo.length; i++)
            {
                boolean mover = arreglo[i] << x >= 0;
                
                
                
                if ((x==0)== mover)
                {
                    arreglo[i-j]=arreglo[i];
                }
                else
                {
                    auxiliar[j] = arreglo [i];
                    j++;
                    
                }
            }
            for(i=j; i< auxiliar.length; i++)
            {
                auxiliar[i] = arreglo[i-j];
            }
            arreglo = auxiliar;
        }
        for(int z = 0; z<arreglo.length; z++)
            System.out.println(arreglo[z]);
    }
    */
    public void numeroDigitos(int mayor)
    {
        largoDigitos = String.valueOf(mayor);
        numDigitos = largoDigitos.length();
    }
    
    public boolean listaVacia0()
    {
        if (d0==null)
            return true;
        else
            return false;
    }
    
    public int quitar0()throws Exception
    {
        if(listaVacia0() == false)
        {
            int aux;
            aux = d0.informacion;
            d0 = d0.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal0(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d0 == null)
            d0=n;
        else
        {
            Nodo t=d0;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    
    public boolean listaVacia1()
    {
        if (d1==null)
            return true;
        else
            return false;
    }
    
    public int quitar1()throws Exception
    {
        if(listaVacia1() == false)
        {
            int aux;
            aux = d1.informacion;
            d1 = d1.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal1(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d1 == null)
            d1=n;
        else
        {
            Nodo t=d1;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    
    public boolean listaVacia2()
    {
        if (d2==null)
            return true;
        else
            return false;
    }
    
    public int quitar2()throws Exception
    {
        if(listaVacia2() == false)
        {
            int aux;
            aux = d2.informacion;
            d2 = d2.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal2(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d2 == null)
            d2=n;
        else
        {
            Nodo t=d2;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    public boolean listaVacia3()
    {
        if (d3==null)
            return true;
        else
            return false;
    }
    
    public int quitar3()throws Exception
    {
        if(listaVacia3() == false)
        {
            int aux;
            aux = d3.informacion;
            d3 = d3.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal3(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d3 == null)
            d3=n;
        else
        {
            Nodo t=d3;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    public boolean listaVacia4()
    {
        if (d4==null)
            return true;
        else
            return false;
    }
    
    public int quitar4()throws Exception
    {
        if(listaVacia4() == false)
        {
            int aux;
            aux = d4.informacion;
            d4 = d4.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal4(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d4 == null)
            d4=n;
        else
        {
            Nodo t=d4;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    public boolean listaVacia5()
    {
        if (d5==null)
            return true;
        else
            return false;
    }
    
    public int quitar5()throws Exception
    {
        if(listaVacia5() == false)
        {
            int aux;
            aux = d5.informacion;
            d5 = d5.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal5(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d5 == null)
            d5=n;
        else
        {
            Nodo t=d5;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    public boolean listaVacia6()
    {
        if (d6==null)
            return true;
        else
            return false;
    }
    
    public int quitar6()throws Exception
    {
        if(listaVacia6() == false)
        {
            int aux;
            aux = d6.informacion;
            d6 = d6.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal6(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d6 == null)
            d6=n;
        else
        {
            Nodo t=d6;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    public boolean listaVacia7()
    {
        if (d7==null)
            return true;
        else
            return false;
    }
    
    public int quitar7()throws Exception
    {
        if(listaVacia7() == false)
        {
            int aux;
            aux = d7.informacion;
            d7 = d7.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal7(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d7 == null)
            d7=n;
        else
        {
            Nodo t=d7;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    public boolean listaVacia8()
    {
        if (d8==null)
            return true;
        else
            return false;
    }
    
    public int quitar8()throws Exception
    {
        if(listaVacia8() == false)
        {
            int aux;
            aux = d8.informacion;
            d8 = d8.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal8(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d8 == null)
            d8=n;
        else
        {
            Nodo t=d8;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    public boolean listaVacia9()
    {
        if (d9==null)
            return true;
        else
            return false;
    }
    
    public int quitar9()throws Exception
    {
        if(listaVacia9() == false)
        {
            int aux;
            aux = d9.informacion;
            d9 = d9.enlace;
            return aux;
        }
        else
            throw new Exception ("cola vacia");
    }
    
    public void insertarFinal9(int informacion)
    {
        Nodo n = new Nodo(informacion);
        if(d9 == null)
            d9=n;
        else
        {
            Nodo t=d9;
            while(t.enlace != null)
                t = t.enlace;
            t.enlace = n;
        }
    }
    
    public void todo(int[] arr)
    {
        
        int z=0;
        for (int w = 0; w < numDigitos; w++)
        {
            
            z++;
            for(int x=0; x<arr.length; x++)
            {
                String numerito = String.valueOf(arr[x]);
                int larguito = numerito.length();
                    while(larguito < z)
                    {
                        numerito = "0" + numerito;
                        larguito++;
                    }
                char dig = numerito.charAt(larguito-z);
                String d = ""+dig;
                int dig2 = Integer.valueOf(d);
                
                switch(dig2)
                {
                    case 0:
                        insertarFinal0(arr[x]);
                        break;
                    case 1:
                        insertarFinal1(arr[x]);
                        break;
                    case 2:
                        insertarFinal2(arr[x]);
                        break;
                    case 3:
                        insertarFinal3(arr[x]);
                        break;
                    case 4:
                        insertarFinal4(arr[x]);
                        break;
                    case 5:
                        insertarFinal5(arr[x]);
                        break;
                    case 6:
                        insertarFinal6(arr[x]);
                        break;
                    case 7:
                        insertarFinal7(arr[x]);
                        break;
                    case 8:
                        insertarFinal8(arr[x]);
                        break;
                    case 9:
                        insertarFinal9(arr[x]);
                        break;
                }
            }
            
            int ww = 0;
            while(listaVacia0() == false)
            {
                try
                {
                    
                    int newValor = quitar0();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
            
            while(listaVacia1() == false)
            {
                
                try
                {
                    int newValor = quitar1();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
            
            while(listaVacia2() == false)
            {
                try
                {
                    int newValor = quitar2();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
            
            while(listaVacia3() == false)
            {
                try
                {
                    int newValor = quitar3();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
            
            while(listaVacia4() == false)
            {
                try
                {
                    int newValor = quitar4();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
            
            while(listaVacia5() == false)
            {
                try
                {
                    int newValor = quitar5();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
            
            while(listaVacia6() == false)
            {
                try
                {
                    int newValor = quitar6();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
            
            while(listaVacia7() == false)
            {
                try
                {
                    int newValor = quitar7();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
            
            while(listaVacia8() == false)
            {
                try
                {
                    int newValor = quitar8();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
            
            while(listaVacia9() == false)
            {
                try
                {
                    int newValor = quitar9();
                    arr[ww] = newValor;
                    ww++;
                }
                catch(Exception e)
                {
                    
                }
            }
        }
        
        System.out.print("\nORDENADOS: ");
        for(int qq = 0; qq<arr.length; qq++)
            System.out.print(arr[qq]+ "  ");
    }
}
