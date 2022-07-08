
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá mundo!");
		System.out.println("Bom dia! ");
		
		//atrubuição de valores
		int x, y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		//conta simples com double
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		
		//utilizando o cast
		int a, c;
		double resultado;
		
		a = 5;
		
		c = 2;
		
		resultado = (double) a / c;
		
		System.out.println(resultado);
		
		
	}

}
