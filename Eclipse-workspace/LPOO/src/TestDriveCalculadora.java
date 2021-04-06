
public class TestDriveCalculadora {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		double n1 = 10;
		double n2 = 2;
		double result;
		
		result = calc.somar(n1, n2);
		System.out.println(result);
		
		result = calc.subtrair(n1, n2);
		System.out.println(result);
		
		result =  calc.dividir(n1, n2);
		System.out.println(result);
		
		result =  calc.multiplicar(n1, n2);
		System.out.println(result);
	}
}
