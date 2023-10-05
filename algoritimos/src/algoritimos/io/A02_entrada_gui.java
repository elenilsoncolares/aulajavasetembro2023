package algoritimos.io;

import javax.swing.JOptionPane;

public class A02_entrada_gui {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null,"digite seu nome" );
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua Idade"));
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu Peso"));
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua Altura"));
		
		char tipoSanguinio = JOptionPane.showInputDialog(null, "Digite seu tipo sanguinio").charAt(0);
		
		char fatorRH = JOptionPane.showInputDialog(null, "Digite seu fator RH").charAt(0);
		
		
		
		
	}

}
