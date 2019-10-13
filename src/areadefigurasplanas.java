import java.util.Scanner;
import javax.swing.JOptionPane;

// conjunto de métodos que resolvem várias funções referente a area de figuras planas
public class areadefigurasplanas {

	public static double triangulo() {
		int opcao=menusinferiores.opcao();	
		// variaveis
		double base=0, altura=0, lado=0;
		double resultado=0;

		switch(opcao) {
		case 1:
			do{
				base=Double.parseDouble(JOptionPane.showInputDialog(null, "Vamos calcular a área do triângulo, informe o valor da base:"));
				altura=Double.parseDouble(JOptionPane.showInputDialog(null, "Agora, informe o valor da altura:"));
			}while(base<=0 || altura<=0 );
			resultado=(base*altura)/2;
			break;
		case 2:
			do{
				lado=Double.parseDouble(JOptionPane.showInputDialog(null, "Vamos calcular a área do tritângulo equilátero, informe o valor dos lados:"));
			}while(lado<=0);
			resultado=(Double)(((Math.pow(lado, 2))*(Math.pow(3, 0.5)))/4); //  quatro e tres são valores padrões da fórmula, como tambem a raiz quadrada esta representada por 0.5
			break;
		case 3:
			do{
				base=Double.parseDouble(JOptionPane.showInputDialog(null, "Vamos calcular a área do triângulo isóceles, informe o valor da base:"));
				altura=Double.parseDouble(JOptionPane.showInputDialog(null, "Agora, informe o valor da altura:"));
			}while(base<=0 || altura<=0);
			resultado=(base*altura)/2;
			break;
		case 4:
			System.out.println("A ser feito -> lembrete");
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao menu principal");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
			break;
		}
		return resultado;
	}

	public static double quadrado() {
		double lado=0;
		do {
			lado=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do lado do quadrado:"));
		}while(lado<=0);
		lado*=lado;
		return lado;
	}

	public static double retangulo() {
		double base=0, altura=0;
		do {
			base=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da base do retângulo:"));
			altura=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da altura do retângulo:"));
		}while(base<=0 || altura<=0);
		return base*altura;
	}

	public static double circulo() {
		double raio=0, pi=3.14, area=0; // usando um valor padrão de Pi pra calcular a área
		do {
			raio=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do raio, sabendo que diâmetro/2 = raio :"));
		}while(raio<=0);
		area=pi*(Math.pow(raio, 2));
		return area;
	}

	public static double trapezio() {
		double baseMenor=0, baseMaior=0, altura=0, area=0; // usando um valor padrão de Pi pra calcular a área
		do {
			baseMaior=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da base maior :"));
			baseMenor=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da base menor :"));
			altura=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura  :"));
		}while(baseMenor<=0 || baseMaior<=0 || altura<=0);
		area=((baseMaior+baseMenor)/2)*altura;
		return area;
	}

	public static double losango() {
		double diagonalMenor=0, diagonalMaior=0, area=0; // usando um valor padrão de Pi pra calcular a área
		do {
			diagonalMaior=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da diagonal maior :"));
			diagonalMenor=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da diagonal menor :"));
		}while(diagonalMenor<=0 || diagonalMaior<=0);
		area=(diagonalMaior*diagonalMenor)/2;
		return area;
	}
}
