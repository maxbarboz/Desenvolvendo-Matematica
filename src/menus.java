import java.util.Scanner;

import javax.swing.JOptionPane;

// conjunto de todos os menus 
public class menus {
	public static int areadefigurasplanas() {
		Scanner s = new Scanner(System.in);
		String areadefigurasplanas="------ ⒾⓃⒻⓄⓇⓂⒺ Ⓐ ⓄⓅⒸⒶⓄ ⒹⒺⓈⒺⒿⒶⒹⒶ ------"+
				"\n\n[1]  TRIÂNGULO"+
				"\n[2]  QUADRADO"+
				"\n[3]  RETÂNGULO"+
				"\n[4]  CÍRCULO"+
				"\n[5]  TRAPÉZIO"+
				"\n[6]  LOSANGO"+
				"\n[0]  VOLTAR AO MENU PRINCIPAL"+
				"\n\nⒹⒺⓈⒺⓃⓋⓄⓁⓋⒾⒹⓄ ⓅⓄⓇ ⓂⒶⓍⓈⓊⒺⓁ ⓈⓉⓄⓇⒸⒽ";
		String opcaocalculo=JOptionPane.showInputDialog(null, areadefigurasplanas);
		return Integer.parseInt(opcaocalculo);
	}

}
