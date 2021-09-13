import java.util.Scanner;

public class Entregavel1 {
	
	// declara��o das constantes
	public static final int FRENTE = 1;
	public static final int DIREITA = 2;
	public static final int ESQUERDA = 3;
	public static final int TRAS = 4;
	public static final int CPQ = 10; // consumo energ�tico por quadrado
	
	public static void main(String[] args) {
		
		int direcao, distancia, custoEnergia = 0;
		boolean fail = false; // flag de falha
		Scanner input = new Scanner(System.in);
		
		// tabela de comandos - aparece apenas uma vez no in�cio do programa
		System.out.println("----- C�digos de dire��o -----");
		System.out.println("| 1 - FRENTE                 |");
		System.out.println("| 2 - DIREITA                |");
		System.out.println("| 3 - ESQUERDA               |");
		System.out.println("| 4 - TR�S                   |");
		System.out.println("------------------------------\n");
		
		// a pista tem 7 comandos no total
		for(int step = 1; step <= 7; step++) {
			
			System.out.println(step + "� comando");
			
			System.out.print("Digite uma dire��o: ");
			direcao = input.nextInt();
			System.out.print("Digite a dist�ncia: ");
			distancia = input.nextInt();
			System.out.println();
			
			switch(step) {
				case 1:
					if(direcao == FRENTE && distancia == 7)
						custoEnergia += 7*CPQ;
					else
						fail = true;
					break;
				case 2:
					if(direcao == DIREITA && distancia == 7)
						custoEnergia += 7*CPQ;
					else
						fail = true;
					break;
				case 3:
					if(direcao == ESQUERDA && distancia == 10)
						custoEnergia += 10*CPQ;
					else
						fail = true;
					break;
				case 4:
					if(direcao == ESQUERDA && distancia == 13)
						custoEnergia += 13*CPQ;
					else
						fail = true;
					break;
				case 5:
					if(direcao == DIREITA && distancia == 11)
						custoEnergia += 11*CPQ;
					else
						fail = true;
					break;
				case 6:
					if(direcao == DIREITA && distancia == 8)
						custoEnergia += 8*CPQ;
					else
						fail = true;
					break;
				case 7:
					if(direcao == ESQUERDA && distancia == 10)
						custoEnergia += 10*CPQ;
					else
						fail = true;
					break;
			}
			
			if(fail) // se fail assumiu o valor true durante o switch, saia do loop
				break;
		}
		
		if(fail)
			System.out.println("Comando inv�lido! Abortando a miss�o...");
		else
			System.out.println("Parab�ns! Voc� chegou ao seu destino.");
		
		System.out.println("Consumo total de energia: " + custoEnergia + " Wh");
		input.close();

	}
	
}
