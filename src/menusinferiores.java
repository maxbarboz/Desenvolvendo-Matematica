import java.util.Scanner;

import javax.swing.JOptionPane;

// conjunto de sub menus internos, oque isso quer dizer?
// Os menus presentes nessa classe são menus de opções dentro de cada menu ( classe -> menu )
public class menusinferiores {
	public static int opcao() {
		String areadefigurasplanas="------ ⒾⓃⒻⓄⓇⓂⒺ Ⓐ ⓄⓅⒸⒶⓄ ⒹⒺⓈⒺⒿⒶⒹⒶ ------" + 
				"\n[1]  TRIÂNGULO RETÂNGULO" + 
				"\n[2]  TRIÂNGULO EQUILÁTERO" + 
				"\n[3]  TRIÂNGULO ISÓSCELES" + 
				"\n[4]  TRIÂNGULO ESCALENO"+ 
				"\n[0]  VOLTAR O MENU ANTERIOR " + 
				"\nⒹⒺⓈⒺⓃⓋⓄⓁⓋⒾⒹⓄ ⓅⓄⓇ ⓂⒶⓍⓈⓊⒺⓁ ⓈⓉⓄⓇⒸⒽ";
		String opcao=JOptionPane.showInputDialog(null, areadefigurasplanas);
		return Integer.parseInt(opcao);
	}
	
	
}
