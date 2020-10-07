package prova.progII;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {
		new Exerc02().processar();
	}
	// Exerc�cio 02.2
	public void processar() {
		try (Scanner input = new Scanner (System.in)) {
			int y = 0;
			do {
				System.out.println("<--- CRIAR E REMOVER TABELAS --->");
				System.out.println("<--- 1 - CRIAR TABELAS");
				System.out.println("<--- 2 - REMOVER TABELAS");
				System.out.println("<--- 3 - INSERIR DADOS");
				System.out.println("<--- 9 - SAIR DO CODIGO");
				y = input.nextInt();
				switch (y) {
				case 1:
					criarTabela();
					break;
					
				case 2:
					removerTabelas();
					break;

				case 9:
					y = 99;
					break;
				}
			} while(y == 99);
		}
	}
	
	public Object criarTabela() {
		Exerc01 mConexao = new Exerc01();
		try (Connection con = mConexao.conectarBanco();) {
			StringBuilder sql = new StringBuilder();
			sql.append(" CREATE TABLE IF NOT EXISTS ");
			sql.append(" FAQ_FACULDADE_PAI");
			sql.append("( ");

			sql.append("ID_PAI");
			sql.append(" INT NOT NULL");
			sql.append(", ");

			sql.append("ID_DETALHE");
			sql.append(" INT NOT NULL");
			sql.append(",");
			
			sql.append(" DESC_ITEM");
			sql.append(" TEXT NOT NULL");
			sql.append(",");

			sql.append("PRIMARY KEY");
			sql.append("(");
			sql.append("ID_PAI");
			sql.append(")");
			sql.append(")");

			System.out.println("SQL Criar tabela " + "FAQ_FACULDADE_PAI" + " - " + sql);

			try (Statement stmt = con.createStatement();) {
				int r = stmt.executeUpdate(sql.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}
	 // Exerc�cio 02.1
	public void removerTabelas() {
		Exerc01 MC = new Exerc01();
		try (Connection con = MC.conectarBanco();) {
			StringBuilder sql = new StringBuilder();
			sql.append(" DROP TABLE ");
			sql.append("FAQ_FACULDADE_PAI");

			System.out.println("SQL remover tabela " + " FAQ_FACULDADE_PAI " + " - " + sql);

			try (Statement stmt = con.createStatement();) {
				int r = stmt.executeUpdate(sql.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
