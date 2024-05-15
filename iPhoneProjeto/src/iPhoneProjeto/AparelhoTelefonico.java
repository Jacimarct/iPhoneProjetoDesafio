package iPhoneProjeto;

import java.util.List;
//import iPhoneProjeto.Contato;

import java.util.ArrayList;

public class AparelhoTelefonico {
    private List<Contato> listaContatos;
//
    private List<String> listaMensagens;
//    

    public AparelhoTelefonico() {
        this.listaContatos = new ArrayList<>(); // Inicializa a lista de contatos
//
        this.listaMensagens = new ArrayList<>();
//        
    }

    public void fazerChamada(String numero) {
        // L�gica para fazer uma chamada para o n�mero especificado
        System.out.println("Ligando para " + numero);
    }

    public void receberChamada(String numero) {
        // L�gica para receber uma chamada do n�mero especificado
        System.out.println("Atendendo a chamada de " + numero);
      try {
      Thread.sleep(1000);
	  } catch (InterruptedException e) {
	      e.printStackTrace();
	  }
        System.out.println("Iniciando correio de voz.");
    }
//
    public void enviarMensagem(Contato contato, String mensagem) {
        // L�gica para enviar uma mensagem para o contato especificado
        System.out.println("Enviando mensagem para " + contato.getNome() + ": " + mensagem);
    }    
//   
    // M�todos getters e setters para listaContatos
    public List<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(List<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }
    
    public List<String> getListaMensagens(){
    	return listaMensagens;
    }
    public void setListaMensagens(List<String> listaMensagens) {
    	this.listaMensagens = listaMensagens;
    }
}