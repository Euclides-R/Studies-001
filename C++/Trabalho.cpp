#include <iostream>
#include <math.h>
#include <stdlib.h>
#include <locale.h>
using namespace std;

void vista(float v1){
	float vt, vf;
	vt = v1;
	vf = vt*0.10;
	vf = vt-vf;
	cout<<vf;
}

void dx(float v1){
	float vt, vf;
	vt = v1/2;
	vf = vt;
	cout<<vf<<" x2";
}

void dezx(float v1){
	float vt, vf;
	if (v1>=100){
	vt = v1/10;
	vf = (vt*0.03)+vt;
	cout<<vf<<" com 3% de juros ao Mês";
	}
	else {
		vt = v1/10;
		vf = vt;
		cout<<vf<<" compras abaixo de R$ 100,00 não há acrescimo de juros";
	}
}

int main (){

	setlocale(LC_ALL, "Portuguese");

	float valort;
	int opcao;

	cin>>valort;

	cout<<"Selecione uma das 3 formas de pagamentos: "<<endl;
	cout<<"Opção 1: a vista dom 10% de desconto"<<endl;
	cout<<"Opção 2: em duas vezes com preço da etiqueta"<<endl;
	cout<<"Opção 3 : em 10% vezes com 3% de juros"<<endl;
	cin>>opcao;

	if (opcao==1){
		vista(valort);
	}

	else if (opcao==2){
		dx(valort);
	}

	else {
		dezx(valort);
	}

}
