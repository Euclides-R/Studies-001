package Av1;

import java.util.Scanner;

public class Moto {
	int data;
	String chassi;
	String cor;
	String fabricante;
	int modelo;
	double preco;

	public void imprimir() {
		System.out.println("mostrar data: " + this.data);
		System.out.println("mostrar chassi : " + this.chassi);
		System.out.println("mostrar cor : " + this.cor);
		System.out.println("mostrar fabricante : " + this.fabricante);
		System.out.println("mostrar modelo : " + this.modelo);
		System.out.println("mostrar preco : " + this.preco);

	}

	public void atualizarPreco(double percentual) {
		preco = (percentual/100 +1)*preco;

	}

	public void numberChassi() {
		Scanner input = new Scanner(System.in);
		System.out.println("programa inicializado");
		System.out.println();
		System.out.println("digite a data: ");
		data = input.nextInt();
		System.out.println("digite o numero do chassi: ");
		chassi = input.next();
		System.out.println("digite a cor: ");
		cor = input.next();
		System.out.println("digite o fabricante: ");
		fabricante = input.next();
		System.out.println("digite o modelo: ");
		modelo = input.nextInt();
		System.out.println("digite o preco: ");
		preco = input.nextDouble();
		
		imprimir();
		
		if(chassi==null) {
			System.out.println("chassi invalido");
			
			
		}
	}
	
}
