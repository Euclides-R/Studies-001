package entregade1e2exerc;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar {
	Cadastrar colocar = new Cadastrar();
	Scanner input = new Scanner(System.in);
	
	private String nome_completo;
	private int rg;
	private int cpf;
	private int cod_usuario;
	
	ArrayList<Cadastrar> cl = new ArrayList<Cadastrar>();
	
	public void Cadastramento() {
		System.out.println("Nome completo: ");
		colocar.setNome_completo(this.input.next());
		System.out.println("RG: ");
		colocar.setRg(this.input.nextInt());
		System.out.println("CPF: ");
		colocar.setCpf(this.input.nextInt());
		cl.add(colocar);
	}
	
	public void Login() {
		for (int i = 0; i < 10; i++) {
			if (cl.get(i) != cl.get(i+1)) {
				System.out.println("Login efetuado");
			} 
			else {
				System.out.println("Não há Cadastro");
			}
		}
	}
		
	public String getNome_completo() {
		return nome_completo;
	}
	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getCod_usuario() {
		return cod_usuario;
	}
	public void setCod_usuario(int cod_usuario) {
		this.cod_usuario = cod_usuario;
	}
	@Override
	public String toString() {
		return "Cadastrar [nome_completo=" + nome_completo + ", rg=" + rg + ", cpf=" + cpf + ", cod_usuario="
				+ cod_usuario + "]";
	}
}
