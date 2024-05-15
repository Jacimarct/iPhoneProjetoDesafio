package iPhoneProjeto;

public class Contato {
    private String nome;
    private String numero;

    // Construtor
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Métodos getters e setters para nome e número
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
