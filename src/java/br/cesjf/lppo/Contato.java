package br.cesjf.lppo;

public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;
    private Long id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long aLong) {
        this.id = aLong;
    }
}
