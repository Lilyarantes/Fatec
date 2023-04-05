package automovel;

import javax.swing.JOptionPane;

public class Manipula_Automovel {
	public static void main (String args []) {
		
		Automovel k = new Automovel ();
	
		String mr, md, cr, pr;
		double pc;
		
		mr = JOptionPane.showInputDialog ("Digite a marca: ");
		md = JOptionPane.showInputDialog ("Digite o modelo: ");
		cr = JOptionPane.showInputDialog ("Digite a cor: ");
		pr = JOptionPane.showInputDialog ("Digite o preco: ");
		
		pc = Double.parseDouble(pr);
		
		k.setMarca(mr);
		k.setModelo(md);
		k.setCor(cr);
		k.setPreco(pc);
		
		System.out.println("Marca do automovel: \t" +k.getMarca() + ".");
		System.out.println("Modelo do automovel: \t" + k.getModelo() + ".");
		System.out.println("Cor do automovel: \t" + k.getCor() + ".");
		System.out.println("Preco do automovel: \t" + k.getPreco() + "."); 
	}
	
	

}
