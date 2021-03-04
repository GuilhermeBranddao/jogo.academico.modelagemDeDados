package jogoModelagemDeDados;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import swing.BotaoAction;

public class Principal {
//Da para criar fases de 10 em 10 perguntas
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Perguntas per = new Perguntas();
		int num = 0;
		int rod = 0;		System.out.println("================Inicio de Jogo================");
		System.out.println("Digite a quantidade de pessoas que vão jogar");
		num = scan.nextInt();
		System.out.println("Quantas rodadas o jogo vai ter?");
		rod = scan.nextInt();
		rod = num * rod;
		String pessoa[] = new String[num];
		int jogador[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Digite o nome da "+ ++i +"° pessoa");
			i--;
		pessoa[i] = scan.next();
		
		}

		int i = 0;
		
		for(int j = 0; j < rod; j++) {			
		per.alternativas();
		System.out.println("Deseja ver a resposta? [S/N]");
		String SNF = scan.next();
		if(SNF.equalsIgnoreCase("S")) {
			per.respostas();
		}
		System.out.println(pessoa[i]+" Respondeu corretamente? [S/N]");
		 SNF = scan.next();
		if(SNF.equalsIgnoreCase("S")) {
			jogador[i]++;
		}
		
		i++;
		if(i>=num) {
			i = 0;
		}
		}
		
		System.out.println("================Fim de jogo================");
		System.out.println("Placar de cada jogador");
		for(i = 0; i < num; i++) {
		System.out.println(pessoa[i]+ " = "+jogador[i]+" Pontos");
		}
		System.out.println("===========================================");

		}
}
