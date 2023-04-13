import java.util.Scanner;

public class Estrutura {
	
	int cont=0,operacao;
	double num1, num2, resultado;
	
	Scanner input = new Scanner (System.in);
	Calculo Calc = new Calculo ();
	
	
	void repeticao () {

	
	System.out.println("Caluladora");
	System.out.println("Digite o primeiro número:");
	num1 = input.nextDouble();
	
	
	
	for (;cont==0;) {
		
		System.out.println("Digite o próximo número:");
		num2 = input.nextDouble ();
		System.out.println("1- Soma \t 2-Subtração \t 3-Multiplicação "
				+ "\t 4-Divisão \t 5-Potenciação \t 6-Zerar \t7-Sair");
		operacao = input.nextInt();
		
		switch (operacao) {
		case 1: resultado = Calc.somar (num1, num2);
			num1 = resultado;
			System.out.println(resultado);break;
		case 2: resultado = Calc.subtrair (num1, num2);
			num1 = resultado;
			System.out.println(resultado);break;
		case 3: resultado = Calc.multiplicar (num1, num2);
			num1 = resultado;
			System.out.println(resultado);break;
		case 4: resultado = Calc.dividir (num1, num2);
			num1 = resultado;
			System.out.println(resultado);break;
		case 5: resultado = Calc.potenciar (num1, num2);
			num1 = resultado;
			System.out.println(resultado);break;
		case 6: System.out.println("Digite o primeiro número:");
			num1= input.nextDouble(); break;
        case 7:System.out.println("Fim"); cont++; break;
        default: System.out.println("Operação não válida.");
		}
		
	}
        
        
		input.close();
	}	
}