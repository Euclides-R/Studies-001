package estacio.prova.av2.dao;

import estacio.prova.av2.jdbc.ConnectionBD;
import estacio.prova.av2.model.Variaveis_de_comunicacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Euclides Rodrigues Junior
 */
public class ComandosSQL {
    private final Connection con;
    
    public ComandosSQL(){
        this.con = ConnectionBD.getConnection();
    }
    
    // Métodos para CadastrarCliente
    public void cadastrarCliente(Variaveis_de_comunicacao objClientes) {
        try {
            // 1 - Comandos para inserção de dados no banco de dados
            String sql = "insert into tb_clientes (id_agencia, id_conta, nome_cliente, saldo) values (?,?,?,?)";
            
            try ( // 2 - Comando de comunicação para inserir os dados
                PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setInt(1, objClientes.getId_agencia());
                stmt.setInt(2, objClientes.getId_conta());
                stmt.setInt(3, objClientes.getNasc());
                stmt.setDouble(4, objClientes.getSaldo_real());
                
                // 3 - Executando e encerrando o comando
                stmt.execute();
            }
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    // Alterar Cliente
    public void alterarCliente() {
    }
    
    // Excluir Cliente
    public void excluirCliente() {
    }
    
    // Listar Clientes
    public List<Variaveis_de_comunicacao> listarClientes() {
        try {
            // 1 - Criar lista
            List<Variaveis_de_comunicacao> lista = new ArrayList<>();
            
            // 2 - Comando sql
            String comand = "SELECT * FROM tb_clientes";
            PreparedStatement mt;
            mt = con.prepareStatement(comand);
            ResultSet rs = mt.executeQuery();
            
            while (rs.next()) {
                Variaveis_de_comunicacao obj = new Variaveis_de_comunicacao();
                
                obj.setId_agencia(rs.getInt("id_agencia"));
                obj.setId_conta(rs.getInt("id_conta"));
                obj.setNasc(rs.getInt("nasc"));
                obj.setSaldo_real(rs.getDouble("saldo"));
                
                lista.add(obj);
            }
           return lista; 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return null;
    }
}
