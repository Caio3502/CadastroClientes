package br.com.cadastroclientes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.cadastroclientes.www.Cliente;

public class ClienteDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet res;
	private String sql; 
	
	
	public long salvar(Cliente cliente) throws SQLException {
		conn = ConnectionFactory.getConnection();
		sql = "INSERT INTO cadastroClientes("
				+ "nome, "
				+ "email, "
				+ "telefone, "
				+ "senha)"
				+ "VALUES(?,?,?,?)";
		pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, cliente.getNome());
		pstmt.setString(2, cliente.getEmail());
		pstmt.setString(3, cliente.getTelefone());
		pstmt.setInt(4, cliente.getSenha());
		pstmt.execute();
		res = pstmt.getGeneratedKeys();
		if (res.next()) {
			return res.getLong(1);
		}
		return 0;
		}
}
