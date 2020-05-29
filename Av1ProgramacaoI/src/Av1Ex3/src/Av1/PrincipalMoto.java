package Av1;

public class PrincipalMoto {
	public static void main(String[] args) {
		Moto novoObj = new Moto();
		novoObj.data = 0;
		novoObj.chassi = "safa" ;
		novoObj.cor = "vermelho";
		novoObj.fabricante = "safas";
		novoObj.modelo = 0;
		novoObj.preco = 0;
		novoObj.numberChassi();
		novoObj.atualizarPreco(20);
		novoObj.imprimir();

	}
}
