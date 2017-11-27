package br.edu.iff.pooa20172.listviewexemplo;

/**
 * Created by lglmo on 27/11/2017.
 */

public class Escola {

    private String nome;
    private int imagem; // vai armazenar o identificador do recurso
    private String endereco;

    public Escola(String nome,  String endereco,int imagem) {
        this.nome = nome;
        this.imagem = imagem;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
