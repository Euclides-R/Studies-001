// Exercícios 03_04

package estudos.facul.git;

import java.util.Scanner;

public class Exerc03_31 {

	String nome;
	String equipe;
	int idade;

	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Equipe: " + this.equipe);
		System.out.println("Idade: " + this.idade);
	}

	public void separarGrupo() {
		if ((this.idade >= 6) && (this.idade <= 10)) {
			this.equipe = "A";
		}
		if ((this.idade >= 11) && (this.idade <= 20)) {
			this.equipe = "B";
		}
		if (this.idade >= 21) {
			this.equipe = "C";
		}
	}

	public static void main(String[] args) {
		// Acampamento

		Scanner leia = new Scanner(System.in);

		Exerc03_31 acampamento = new Exerc03_31();
		
		acampamento.nome = "Gustavo Guerra";

		System.out.println("Insira a idade: ");
		acampamento.idade = leia.nextInt();

		acampamento.separarGrupo();
		
		acampamento.imprimir();

	}

}
