package src;
        import java.util.Scanner;
	
	public class PruebaRadix
        {
            
            public static void main(String[] args){
                Radix r = new Radix();
	        int i;
                
                Scanner leer = new Scanner(System.in);
	        int arr[] = new int[4];
                
                
	        
	        for(i=0;i<arr.length;i++){
                    System.out.print("Introduzca el numero: ");
                    arr[i] = leer.nextInt();
	            	        }
                
                int mayor = arr[0];
                
                for(int s=1;s<arr.length;s++){
                    if(arr[s] > mayor)
                        mayor = arr[s];
                }
                
                r.numeroDigitos(mayor);
                
                System.out.print("ORIGINAL: ");
                
                for(i=0;i<arr.length;i++){
                    
                    System.out.print(arr[i] + " ");
                }
                
	        r.todo(arr);
	        
	    }
	}
