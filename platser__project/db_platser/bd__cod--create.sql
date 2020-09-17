create table Contratacao (
	id_contracao serial primary key,
	id_consumidores bigint not null,
	id_cornecedores bigint not null,
	id_cervicos bigint not null,
	quantidade_Contratacao bigint not null,
	valor_Total_Contratacao bigint not null,
	
	foreign key (id_Consumidores) references contratacao (id_contracao)
)