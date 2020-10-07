package prova.progII;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Exerc04 {
	public static void main(String[] args) {
		
	}
	
	public List<FAQ> selecionarTodosFAQ() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT");
		sql.append("ID_PAI)";
		sql.append(", ";
		sql.append("ID_DETALHE");
		sql.append(", ");
		sql.append("DESC_ITEM");
		sql.append("FROM");
		sql.append("FAQ_FACULDADE_PAI");
		System.out.println("Comando select: " + sql);
		// doule 1 doule 2
		List<FAQ> listaFaqs = new ArrayList<>();
		ConexaoBanco minhaClasseCon = new ConexaoBanco();
		try (Connection con = minhaClasseCon.conectarBanco();
				PreparedStatement pstmt = con.prepareStatement(sql.toString());) {
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					FAQ linha = new FAQ();
					linha.setIdPai(rs.getInt(ID_PAI));
					linha.setIdItem(rs.getInt(ID_DETALHE));
					linha.setDescItem(rs.getString(DESC_ITEM));
					listaFaqs.add(linha);
				}
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
		return listaFaqs;
	}
}
