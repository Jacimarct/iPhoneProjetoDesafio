package iPhoneProjeto;

import iPhoneProjeto.Contato;

import java.util.ArrayList;
import java.util.List;
import iPhoneProjeto.ReprodutorMusical;
import iPhoneProjeto.AparelhoTelefonico;

public class iPhone {
	private List<ReprodutorMusical> reprodutores;
	private List<NavegadorInternet> navegadores;
//	private List<AparelhoTelefonico> telefones;
//
	private List<AparelhoTelefonico> telefones = new ArrayList<>();
//	
    private List<String> listaMensagens;	
	
	ReprodutorMusical reprodutor = new ReprodutorMusical();
//	NavegadorInternet navegador = new NavegadorInternet();
	AparelhoTelefonico telefone = new AparelhoTelefonico();
	
	public iPhone() {
        // Adicionando contatos
//
		this.telefone = new AparelhoTelefonico();
//		
        Contato contato1 = new Contato("João", "123456789");
        Contato contato2 = new Contato("Maria", "987654321");
//
        this.telefone.getListaContatos().add(contato1);
        this.telefone.getListaContatos().add(contato2);
//
//        telefone.getListaContatos().add(contato1);
//        telefone.getListaContatos().add(contato2);

//
        this.telefones.add(telefone);
//
        
//        telefones.add(telefone);
//        
    }
	
	public List<ReprodutorMusical> getReprodutores() {
		return reprodutores;
		
	}
	public void setReprodutores(List<ReprodutorMusical> reprodutores) {
		this.reprodutores = reprodutores;
	}
	
	  public void reproduzirMusica() {
	        ReprodutorMusical reprodutor = new ReprodutorMusical();
	        reprodutor.main(null);
	    }
	  
	  
	public List<AparelhoTelefonico> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<AparelhoTelefonico> telefones) {
		this.telefones = telefones;
	}
	
	public static void main(String[] args) {
        iPhone iphone = new iPhone();
//
        
        iphone.reproduzirMusica();
        // Fazendo chamada e recebendo chamada
        iphone.telefone.fazerChamada("987654321");
        iphone.telefone.receberChamada("123456789");
//
        // Verifica se a lista de telefones não é null e se tem pelo menos um telefone
        if (!iphone.getTelefones().isEmpty()) {
            // Obtendo o aparelho telefônico do iPhone
            AparelhoTelefonico telefone = iphone.getTelefones().get(0); // Supondo que haja apenas um telefone

            // Obtendo um contato existente ou criando um novo
            Contato contato = new Contato("Fulano", "987654321");

            // Enviando a mensagem para o contato
            telefone.enviarMensagem(contato, "Olá, tudo bem?");
        } else {
            System.out.println("Nenhum telefone associado ao iPhone.");
        }
//********************************************************************        
        
//        // Obtendo o aparelho telefônico do iPhone
//        AparelhoTelefonico telefone = iphone.getTelefones().get(0); // Supondo que haja apenas um telefone
//
//        // Obtendo um contato existente ou criando um novo
//        Contato contato = new Contato("Fulano", "987654321");
//
//        // Enviando a mensagem para o contato
//        telefone.enviarMensagem(contato, "Olá, tudo bem?");


}
}