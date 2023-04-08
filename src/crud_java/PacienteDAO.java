package crud_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {
	
	private Connection conn;

	public PacienteDAO() {
		this.conn = ConnectionFactory.getConnection();
	}

	
	public void cadastrar_dados(Paciente paciente) {
		String sql = "INSERT INTO paciente (idPaciente, nome, cpf, dtnasc, sexo, endereco, fone, tiposangue, historicofamilia, doencas_antigas, doencas_atuais, condicoes) VALUES (NULL, ?,?,?,?,?,?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, paciente.getNome());
			pstm.setString(2, paciente.getCpf());
			pstm.setDate(3, new java.sql.Date(paciente.getDtnasc().getTime()));
			pstm.setString(4, paciente.getSexo());
			pstm.setString(5, paciente.getEndereco());
			pstm.setString(6, paciente.getFone());
			pstm.setString(7, paciente.getTiposangue());
			pstm.setString(8, paciente.getHistoricofamilia());
			pstm.setString(9, paciente.getDoencas_antigas());
			pstm.setString(10, paciente.getDoencas_atuais());
			pstm.setString(11, paciente.getCondicoes());
			
			pstm.execute();
			
		}catch(Exception e) {
			
			throw new RuntimeException(e);
			
		}
		
		
	}
	
	public List<Paciente> visualizar_dados() {
		String sql = "SELECT * FROM paciente";
		
		List<Paciente> paciente = new ArrayList<Paciente>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Paciente p = new Paciente();
				p.setIdPaciente(rset.getInt("idPaciente"));
				p.setNome(rset.getString("nome"));
				p.setCpf(rset.getString("cpf"));
				p.setDtnasc(rset.getDate("dtnasc"));
				p.setSexo(rset.getString("sexo"));
				p.setEndereco(rset.getString("endereco"));
				p.setFone(rset.getString("fone"));
				p.setTiposangue(rset.getString("tiposangue"));
				p.setHistoricofamilia(rset.getString("historicofamilia"));
				p.setDoencas_antigas(rset.getString("doencas_antigas"));
				p.setDoencas_atuais(rset.getString("doencas_atuais"));
				p.setCondicoes(rset.getString("condicoes"));
				
				paciente.add(p);
				
				}
			
		}catch(Exception e) {
			
			throw new RuntimeException(e);
			
		}
		
		return paciente;
	}
	
	public void alterar_dados(Paciente paciente) {
		
		String sql = "UPDATE paciente SET idPaciente = ?, nome = ?, cpf = ?, dtnasc = ?, sexo = ?, endereco = ?, fone = ?, tiposangue = ?, historicofamilia = ?, doencas_antigas = ?, doencas_atuais = ?, condicoes = ?" +
		"WHERE idPaciente = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, paciente.getIdPaciente());
			pstm.setString(2, paciente.getNome());
			pstm.setString(3, paciente.getCpf());
			pstm.setDate(4, new java.sql.Date(paciente.getDtnasc().getTime()));
			pstm.setString(5, paciente.getSexo());
			pstm.setString(6, paciente.getEndereco());
			pstm.setString(7, paciente.getFone());
			pstm.setString(8, paciente.getTiposangue());
			pstm.setString(9, paciente.getHistoricofamilia());
			pstm.setString(10, paciente.getDoencas_antigas());
			pstm.setString(11, paciente.getDoencas_atuais());
			pstm.setString(12, paciente.getCondicoes());
			
			pstm.setInt(13, paciente.getIdPaciente());
			
			pstm.execute();
		}catch(Exception e) {
			
			throw new RuntimeException(e);
			
		}
		
	}
	
	public void deletar_dados(int idPaciente) {
		String sql = "DELETE FROM paciente WHERE idPaciente = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, idPaciente);
			
			pstm.execute();
			
		}catch(Exception e) {
			
			throw new RuntimeException(e);
			
		}
	}

}
