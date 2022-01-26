import java.util.Scanner;

/*ler um sistema de 3 notas e dar a média ponderada (2,3,5) */
public class NotaDeAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3, media;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Entre com a nota 1: ");
		 nota1= sc.nextFloat();
		 System.out.println("Entre com a nota 2: ");
		 nota2= sc.nextFloat();
		 System.out.println("Entre com a nota 3: ");
		 nota3= sc.nextFloat();
		
		
		media= ((nota1*2+nota2*3+nota3*5)/10);
		
		 
		 
		 System.out.print("A média é: " +media);

	}

}
