import java.util.Scanner;
import javax.swing.JOptionPane;

// contém o meu main e dois menus principais, pois sempre aparecem

public class Main {
	public static void main(String[] args) {
		// variaveis
		int opcao=0, opcao2=0, opcaocalculo=0;
		double armazena=0; // armazena valores temporariamente

		// repetição do menu
		do {
			opcao=opcao();

			//case que resolve certa opção
			switch(opcao) {

			case 1:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.analisecombinatoria());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao menu principal");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 2:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.areadefigurasplanas());
					break;
				case 2:
					opcaocalculo=menus.areadefigurasplanas();
					switch(opcaocalculo) {
					case 1://case triangulo
						armazena=areadefigurasplanas.triangulo();
						if(armazena>0) {
							JOptionPane.showMessageDialog(null, "Área do triângulo-> "+armazena);
						}
						break;
					case 2://case quadrado
						JOptionPane.showMessageDialog(null, "Área do quadrado-> "+areadefigurasplanas.quadrado());
						break;
					case 3:// case retângulo
						JOptionPane.showMessageDialog(null, "Área do retângulo-> "+areadefigurasplanas.retangulo());
						break;
					case 4:// case circulo
						JOptionPane.showMessageDialog(null, "Área do círculo-> "+areadefigurasplanas.circulo());
						break;
					case 5:// case trapézio
						JOptionPane.showMessageDialog(null, "Área do trapézio-> "+areadefigurasplanas.trapezio());
						break;
					case 6:// case losango
						JOptionPane.showMessageDialog(null, "Área do trapézio-> "+areadefigurasplanas.losango());
						break;
					case 0:
						JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
						break;
					}
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 3:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.circunferencia());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 4:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.elipse());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 5:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.funcaoprimeirograu());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					break;
				default:
					break;
				}
				break;
			case 6:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.funcaosegundograu());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;		
			case 7:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.juros());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 8:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.logaritmo());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 9:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.matriz());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 10:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.potencia());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 11:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.probabilidade());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 12:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.triangulo());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 13:
				opcao2=opcao2();
				switch(opcao2) {
				case 1:
					JOptionPane.showMessageDialog(null, teoria.solidos());
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aperte em OK para voltar ao MENU PRINCIPAL");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
					break;
				}
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente ..");
				break;
			}
		}while(opcao!=0 && opcao2!=0);

	}

	public static int opcao() {
		Scanner s = new Scanner(System.in);
		String menu="------ ⒾⓃⒻⓄⓇⓂⒺ Ⓐ ⓄⓅⒸⒶⓄ ⒹⒺⓈⒺⒿⒶⒹⒶ ------"+
				"\n\n[1]  ANÁLISE COMBINATÓRIA"+
				"\n[2]  ÁREA DE FIGURAS PLANAS"+
				"\n[3]  CIRCUNFERÊNCIA"+
				"\n[4]  ELIPSE"+
				"\n[5]  FUNÇÃO DE 1º GRAU"+
				"\n[6]  FUNÇÃO DE 2º GRAU"+
				"\n[7]  JUROS"+
				"\n[8]  LOGARITMOS"+
				"\n[9]  MATRIZES"+
				"\n[10] POTENCIAÇÃO"+
				"\n[11] PROBABILIDADE"+
				"\n[12] TRIÂNGULOS"+
				"\n[13] VOLUME DE SÓLIDOS"+
				"\n[0]  FINALIZAR O PROGRAMA"+
				"\n\nⒹⒺⓈⒺⓃⓋⓄⓁⓋⒾⒹⓄ ⓅⓄⓇ ⓂⒶⓍⓈⓊⒺⓁ ⓈⓉⓄⓇⒸⒽ";
		String opcao=JOptionPane.showInputDialog(null, menu);
		return Integer.parseInt(opcao);

	}

	public static int opcao2() {
		Scanner s = new Scanner(System.in);
		String menu="------ ⒾⓃⒻⓄⓇⓂⒺ Ⓐ ⓄⓅⒸⒶⓄ ⒹⒺⓈⒺⒿⒶⒹⒶ ------"+
				"\n\n[1]  TEORIA"+
				"\n[2]  CALCULAR"+
				"\n[3]  VOLTAR AO MENU ANTERIOR"+
				"\n[0]  FINALIZAR O PROGRAMA"+
				"\n\nⒹⒺⓈⒺⓃⓋⓄⓁⓋⒾⒹⓄ ⓅⓄⓇ ⓂⒶⓍⓈⓊⒺⓁ ⓈⓉⓄⓇⒸⒽ";
		String opcao2=JOptionPane.showInputDialog(null, menu);
		return Integer.parseInt(opcao2);
	}

}
