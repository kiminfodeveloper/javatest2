import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		// estrutura condicional com mais de 1 if
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else {
			if (hora <= 17) {
				System.out.println("Boa tarde!");
			} else {
				System.out.println("Boa noite!");
			}
		}
		sc.close();

	}

}
