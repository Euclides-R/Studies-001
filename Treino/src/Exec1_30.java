
import java.util.Scanner;

public class Exec1_30 {

	private static void calcularPremioApolice() {

		int idade;
		float valorPremio = 10;

		System.out.println("Idade do segurado");
		idade = leia.nextInt();

		if (idade <= 25) {
			valorPremio += (valorPremio * 20) / 100;
		} else {
			if (idade <= 36) {
				valorPremio += (valorPremio * 15) / 100;
			} else {
				if (idade > 36) {
					valorPremio += (valorPremio * 10) / 100;
				}
			}
		}

		System.out.println("Valor Premio: " + valorPremio);
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println(calcularPremioApolice);

	}

}
