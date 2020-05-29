package entregade1e2exerc;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Cadastrar c = new Cadastrar();
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		int op = 0;
		
		do {
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Entrar");
		System.out.println("0 - Exit");
		op = input.nextInt();
		
		switch (op) {
		case 1:
			c.Cadastramento();		
			break; 
		case 2:
			c.Login();
			break;

		case 0 :
			loop = false;
			break;
		}
		
		} while (loop == true);
		
		input.close();
	}
	
}
