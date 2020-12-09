package estacio.prova.av2.dao;

import estacio.prova.av2.jdbc.ConnectionBD;
import estacio.prova.av2.model.Variaveis_de_comunicacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            String sql = "insert into provafinal (id_agencia, id_conta, nasc, saldo) values (?,?,?,?)";
            
            try ( // 2 - Comando de comunicação para inserir os dados
                PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setInt(1, objClientes.getId_agencia());
                stmt.setInt(2, objClientes.getId_conta());
                stmt.setInt(3, objClientes.getNasc());
                stmt.setDouble(4, objClientes.getSaldo_real());
                
                // 3 - Executando e encerrando o comando
                stmt.execute();
            }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e);
            }
        }
    

    // Listar Clientes
    public void mostrarSaldo(int cont) throws SQLException {
        
        try {
            String comand = "SELECT id_agencia, id_conta, saldo FROM provafinal WHERE id_conta = '" + cont + "'";
            PreparedStatement mt;
            mt = con.prepareStatement(comand);
            ResultSet rs = mt.executeQuery();
            
            Variaveis_de_comunicacao cha = new Variaveis_de_comunicacao();
            cha.setSaldo_real(rs.getDouble("saldo"));
            
            JOptionPane.showMessageDialog(null, "Seu SALDO ATUAL É: " + cha.getSaldo_real());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }

    /*public List<Variaveis_de_comunicacao> listarClientes(Variaveis_de_comunicacao conta) {
        
    }
    
    // Alterar Cliente
    public void alterarCliente() {
    }
    
    // Excluir Cliente
    public void excluirCliente() {
    }*/
}
