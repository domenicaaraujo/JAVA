import java.util.Scanner;

/*sistema que l� 3 inteiros e positivos
 * calcule a express�o D=(R+S)/2 ONDE, R=(A+B)�, S=(B+C)�
 */

public class NumerosInteiros {

	public static void main(String[] args) {
		 int A, B, C, D, R, S;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Entre com um valor A: ");
		 A= sc.nextInt();
		 System.out.println("Um valor de B: ");
		 B= sc.nextInt();
		 System.out.println("Agora com o valor para C: ");
		 C= sc.nextInt();

		 R=(A+B)^2;
		 S=(B+C)^2;
		 D=(R+S)/2;
		 
		 System.out.print("O valor de D �: " +D);
		 

	}

}
