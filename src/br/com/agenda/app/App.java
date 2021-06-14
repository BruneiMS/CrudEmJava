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
		contato.setNome("Br�nei");
		contato.setIdade(36);
		contato.setDataCadastro(new Date());
		
		//contatoDAO.save(contato);
		
		//Atualizar contato
		Contato c1 = new Contato();
		c1.setNome("Br�nei Mour�o Siqueira");
		c1.setIdade(37);
		c1.setDataCadastro(new Date());
		c1.setId(1);//� o n�mero que esta no banco da PK
		
		//contatoDAO.update(c1);
		
		//Deletar contato pelo id
		contatoDAO.deleteById(1);
		
		// Listar contato
		for (Contato c : contatoDAO.getContatos()) {
			System.out.println("Contato: " + c.getNome());	
		}
	}

}
