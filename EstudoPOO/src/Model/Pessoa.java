package Model;

public abstract class Pessoa { // encapsulamento
    // atributos- privado - só podem ser acessados pela classse,
    // outras classes e metodos nao conssguem acessar esses atributos
    // dica: atributos = privados metodos = publicos
    private String nome;
    private String data;
    private String cpf;

    // metodos publicos
    // construtor
    public Pessoa(String nome, String cpf, String data) {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //exibir informações 
    public void exibirinfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("CPF: "+cpf);
    }
}
