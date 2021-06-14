package br.com.agenda.app;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContatoDAO contatoDAO = new ContatoDAO();
		
		//criar contato
		Contato contato = new Contato();
		contato.setNome("Brúnei");
		contato.setIdade(36);
		contato.setDataCadastro(new Date());
		
		//contatoDAO.save(contato);
		
		//Atualizar contato
		Contato c1 = new Contato();
		c1.setNome("Brúnei Mourão Siqueira");
		c1.setIdade(37);
		c1.setDataCadastro(new Date());
		c1.setId(1);//É o número que esta no banco da PK
		
		//contatoDAO.update(c1);
		
		//Deletar contato pelo id
		contatoDAO.deleteById(1);
		
		// Listar contato
		for (Contato c : contatoDAO.getContatos()) {
			System.out.println("Contato: " + c.getNome());	
		}
	}

}
