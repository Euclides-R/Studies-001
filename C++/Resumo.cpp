#include <iostream>
#include <math.h>
using namespace std;
/*
#define MAX_LISTA 10 //Tamanho Máximo da Lista

int main(){
	float ListaNotas[MAX_LISTA]; //Lista Linear Sequencial
	int PosUltimoElemlista = 0; //Qtde de elementos da Lista
	bool ret; //Recebe o retorno da função chamada
}*/

#define MAX_LISTA 5

bool Inserir(float Lista[], float valor, int &PosElemLista) {
	if (PosElemLista == MAX_LISTA){
		cout<<"ERRO: Lista Cheia"<<endl;
		return false;
	}
	else {
		Lista[PosElemLista] = valor;
		PosElemLista++;
	}
	return true;
}

int main (){
	float ListaNotas[MAX_LISTA];
	int PosElemLista = 0;
	bool Ret;
	int  valor;

	for (int i=0;i<10;i++){
		cout<<"Digite o valor para inserção: ";
		cin>>valor;
		Ret = Inserir(ListaNotas, valor, PosElemLista);
	}

	char
	cout<<

	if(Ret == false){
		cout<<"Inserção efetuada com sucesso!"<<endl;
	}
}
