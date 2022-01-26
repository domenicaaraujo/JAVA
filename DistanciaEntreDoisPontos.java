import java.util.Scanner;

/*lista1 ex6*/
public class DistanciaEntreDoisPontos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	float P, x1, x2, y1, y2 ;
	double d;
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Entre com o primeiro ponto: ");
	 x1= sc.nextFloat();

System.out.println("Entre com o segundo ponto: ");
	  y1= sc.nextFloat();
System.out.println("Entre com o terceiro ponto: ");	  
x2= sc.nextFloat();
System.out.println("Entre com o quarto ponto: ");
y2= sc.nextFloat();

d=Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));

System.out.println("A distância entre os pontos é: " +d);

}
}