import java.util.Scanner;

public class Calculadora {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		int num1, num2, resultado,memoria,operacao;
		
		
		System.out.println("Caluladora");
		System.out.println("Digite o primeiro número:");
		num1 = input.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = input.nextInt ();
		System.out.println("1- Soma \t 2-Subtração \t 3-Multiplicação \t 4-Divisão");
		operacao = input.nextInt();
		
		Calculo Calc = new Calculo ();
		
		switch (operacao) {
			case 1: resultado = Calc.Soma (num1, num2);
				System.out.println("O resultado é: "+resultado);break;
			case 2: resultado = Calc.Subtrair (num1, num2);
				System.out.println("O resultado é: "+resultado);break;
			case 3: resultado = Calc.Multiplicar (num1, num2);
				System.out.println("O resultado é: "+resultado);break;
			case 4: resultado = Calc.Dividir (num1, num2);
				System.out.println("O resultado é: "+resultado);break;
            case 5:System.out.println("Fim");break;
            default: System.out.println("Operação não válida.");

		}
			
	}
}
