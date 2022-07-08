import java.util.Scanner;

public class condicionalTernaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double preco = 34.5;
		double desconto;

		// if else para desconto
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}

		System.out.println(desconto);

		// novo desconto com função ternaria
		double novoDesconto = (preco < 20.) ? preco * 0.1 : preco * 0.05;

		System.out.println(novoDesconto);

		sc.close();
	}

}
