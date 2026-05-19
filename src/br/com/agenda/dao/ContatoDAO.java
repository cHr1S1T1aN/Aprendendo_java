package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO {
	/*
	 * crud(CREATE,READE,UPDATE,DELETE)
	 * */
	public void save (Contato contato) {
		
		String sql = "INSERT INTO contatos(nome,idade,dataCadastro) VALUES (?, ?, ?)"; 
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			//cria conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			//criação de uma preparestatement,para executar uma query;
			pstm = conn.prepareStatement(sql);
			//adiciona valores que são esperados por uma query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataDeCadastro().getTime()));
			
			//executa a query
			pstm.execute();
			
		}catch (Exception e) {
			//mostra o erro
			e.printStackTrace();
		}finally {
			//fechar as conexões;
			try {
				if(pstm != null) {
					pstm.close();
					}
				
				if (conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void update(Contato contato) {
		
		String sql = "UPDATE contatos SET nome = ?,idade = ?, dataCadastro = ? " +
		"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			
			//ADICIONAR OS VALORES PARA ATUALIZAR O BANCO
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataDeCadastro().getTime()));
			
			//QUAL O ID DESEJA O REGRISTRO DESEJA ATUALIZAR
			pstm.setInt(4, contato.getId());
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)
					conn.close();
				if(pstm != null) {
					pstm.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void deleteById(int id) {
		
		String sql = "DELETE FROM contatos WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public List<Contato> getContatos() throws Exception{
		
		String sql = "SELECT * FROM contatos";
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		//classe que vai recuperar os dados do banco *SELECT*
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			
			
			while (rset.next()) {
				
					Contato contato = new Contato();
					//recuperar o id
					contato.setId(rset.getInt("id"));
					contato.setNome(rset.getString("nome"));
					contato.setIdade(rset.getInt("idade"));
					contato.setDataDeCadastro(rset.getDate("dataCadastro"));
				
					contatos.add(contato);
				}
			}catch (Exception e) {
			e.printStackTrace();
			}finally {
				try {
					if(rset != null) {
							rset.close();
					}
					if (conn != null) {
						conn.close();
					}
					if (pstm != null) {
						pstm.close();
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		return contatos;
	}
}
