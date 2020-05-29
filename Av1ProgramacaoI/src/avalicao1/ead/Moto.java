package avalicao1.ead;

public class Moto {
	private int dataFabricacao;
	private String numberChassi;
	private String cor;
	private String marca;
	private String modelo;
	private double preco;
	
	public void atualizarPreco(double percentual) {
		percentual = percentual / 100;
		double aux = this.preco * percentual;
		this.preco = this.preco + aux;
	}
	
	public void imprimir() {
		System.out.println("Ano de Fabricação: " + this.dataFabricacao);
		System.out.println("Número do Chassi: " + this.numberChassi);
		System.out.println("Cor da Moto: " + this.cor);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Preço da moto: " + this.preco);
	}

	public int getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(int dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getNumberChassi() {
		return numberChassi;
	}

	public String setNumberChassi(String numberChassi) {
		return this.numberChassi = numberChassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Moto [dataFabricacao=" + dataFabricacao + ", numberChassi=" + numberChassi + ", cor=" + cor + ", marca="
				+ marca + ", modelo=" + modelo + ", preco=" + preco + "]";
	}	
}
