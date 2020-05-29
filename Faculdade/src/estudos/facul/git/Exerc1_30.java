// Exercícios 01-02

package estudos.facul.git;

import java.util.Scanner;

public class Exerc1_30 {
	
	String nome;
	int idade;
	double valorPremio;
	String nomeCidade;

	public final void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Valor Prêmio: " + this.valorPremio);
		System.out.println("Desconto: " + this.nomeCidade);
	}

	public void cacularPremioValor() {
		if ((this.idade >= 18) && (this.idade <= 25)) {
			this.valorPremio += (this.valorPremio * 20) / 100;
		}
		if ((this.idade > 25) && (this.idade <= 36)) {
			this.valorPremio += (this.valorPremio * 15) / 100;
		}
		if (this.idade > 36) {
			this.valorPremio += (this.valorPremio * 10) / 100;
		}

	}

	public void oferecerDesconto(String nomeCidade) {
		if (nomeCidade == "Curitiba") {
			this.valorPremio -= (this.valorPremio * 20) / 100;
		}
		if (nomeCidade == "Rio de Janeiro") {
			this.valorPremio -= (this.valorPremio * 15) / 100;
		}
		if (nomeCidade == "São Paulo") {
			this.valorPremio -= (this.valorPremio * 10) / 100;
		}
		if (nomeCidade == "Belo Horizonte") {
			this.valorPremio -= (this.valorPremio * 5) / 100;
		}
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Exerc1_30 apolice = new Exerc1_30();

		apolice.idade = 25;
		apolice.nome = "Gustavo Baravieira Costa";
		apolice.valorPremio = 500;

		System.out.println("Impimindo os dados inicializados: ");
		apolice.imprimir();
		apolice.cacularPremioValor();
		System.out.println("Imprimindo os dados após a execução do método calcularPremioApolice: ");
		apolice.imprimir();
		apolice.oferecerDesconto("Curitiba");
		System.out.println("Imprimindo os dados após a execução do método oferecerDesconto: ");
		apolice.imprimir();

		leia.close();

	}

	

}
