import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite qualquer coisa");

		String x;
		x = sc.next();

		System.out.println("Voc� digitou: " + x);

		System.out.println("Digite um n�mero aleat�rio");

		int y;
		y = sc.nextInt();
		System.out.println("Voc� digitou: " + y);

		sc.close();
	}

}
