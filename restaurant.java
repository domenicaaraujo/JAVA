package application;

import java.util.Scanner;

public class Program 
{
	public static void main(String[]args)
	{ 
		int cod, gorjeta;
		float valor;
		
		System.out.println("\nO menu do dia �: ");
		System.out.println("\nc�d.1: Picanha ......... R$ 25,00 ");
		System.out.println("\nc�d.2: Lasanha ......... R$ 20,00 ");
		System.out.println("\nc�d.3: Strogonoff ...... R$ 18,00 ");
		System.out.println("\nc�d.4: Bife ............ R$ 15,00 ");
		System.out.println("\nc�d.5: P�o com ovo ..... R$ 05,00 ");
		System.out.println("\nEntre com sua escolha: ");
		
		Scanner leia = new Scanner(System.in);
		cod = leia.nextInt(); 
		
		System.out.println("\nVoc� aceita pagar 10% de gorjeta para o gar�om? ");
		System.out.println("\nCaso sim, digite '1', caso n�o, digite '0' ");
		gorjeta = leia.nextInt();
		
			
		switch(cod)
		{ 
           case 1:
        	 valor = 25;
        	if(gorjeta == 0)
        	{
       		System.out.println("\nc�d.1: Picanha ......... R$"+valor);
        	}
       		else if(gorjeta == 1)
       		{ 
           	System.out.println("\nc�d.1: Picanha ......... R$"+(valor+(valor*1.1f)));
       		}
       	       break;
       	   
           case 2:
        	  valor = 20;
        	if (gorjeta == 0)
        	{
       		System.out.println("\nc�d.2: Lasanha ......... R$ 20,00 ");  
        	}
       		else if(gorjeta == 1)
       		{ 
           	System.out.println("\nc�d.1: Lasanha ......... R$"+(valor+(valor*1.1f)));
       		}
        	   break;
        	   
           case 3:
        	   valor = 18;
        	if (gorjeta == 0)
        	{
       		System.out.println("\nc�d.3: Strogonoff ...... R$ 18,00 ");
        	}
       		else if(gorjeta == 1)
       		{ 
           	System.out.println("\nc�d.1: Strogonoff ......... R$"+(valor+(valor*1.1f)));
       		}
        	   break;
        	   
           case 4:
        	   valor = 15;
        	   if (gorjeta == 0)
        	{
       		System.out.println("\nc�d.4: Bife ............ R$ 15,00 "); 
        	}
        	   else if(gorjeta == 1)
        	{ 
            System.out.println("\nc�d.1: Bife ......... R$"+(valor+(valor*1.1f)));
          	}
        	   
        	   break;
        	   
           case 5: 
       		valor = 5;
     	   if (gorjeta == 0)
     	{
    		System.out.println("\nc�d.4: P�o com ovo ............ R$ 5,00 "); 
     	}
     	   else if(gorjeta == 1)
     	{ 
         System.out.println("\nc�d.1: P�o com ovo ......... R$"+(valor+(valor*1.1f)));
       	}
        	   break;
 
			
		
		
		
		}
	}

}
