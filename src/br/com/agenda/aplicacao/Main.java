package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Contato contato = new Contato();
		
		contato.setNome("carlos");
		contato.setIdade(41);
		contato.setDataDeCadastro(new Date());
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		//contatoDao.save(contato);
		
		Contato c1 = new Contato();
		
		c1.setNome("Carlos eduardu");
		c1.setIdade(31);
		c1.setDataDeCadastro(new Date());
		c1.setId(1);
		
		//contatoDao.update(c1);
		
		//DELETAR O CONTATO PELO ID
		
		contatoDao.deleteById(4);
		
		
		
		//vizualização dos registros do banco de dados *TODOS OS REGISTROS*
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getId());
			System.out.println("Contato: " + c.getNome());
			System.out.println("Contato: " + c.getIdade());
			System.out.println("Contato: " + c.getDataDeCadastro());
		}
			
	}

}
