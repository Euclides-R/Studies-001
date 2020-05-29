package avalicao1.ead;

import java.util.Scanner;

public class PrincipalMoto {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Moto objMoto = new Moto();
		int porcento = 20;
		
		System.out.println("Ano de Fabricação: ");
		objMoto.setDataFabricacao(input.nextInt());
		System.out.println("Número do Chassi: ");
		objMoto.setNumberChassi(input.next());
		System.out.println("Cor da moto: ");
		objMoto.setCor(input.next());
		System.out.println("Marca: ");
		objMoto.setMarca(input.next());
		System.out.println("Modelo: ");
		objMoto.setModelo(input.next());
		System.out.println("Preço da Moto: ");
		objMoto.setPreco(input.nextDouble());
		System.out.println("Pencentual de Acrescimo: 20%");
		objMoto.atualizarPreco(porcento);
		
		objMoto.imprimir();
	}
}
