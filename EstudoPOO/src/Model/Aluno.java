//subClasse de pessoa
package Model;

public class Aluno extends Pessoa {
    // atributos
    // já tem os atributos (nome, cpf, dataNasc) da SuperClasse Pessoa
    private String matricula;
    private double nota;

    // metodos
    // construtor

    public Aluno(String nome, String cpf, String data, String matricula) {
        super(nome, cpf, data);
        this.matricula = matricula;
    }
    // getters e setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // exibir info do aluno
    @Override //polimorfismo de classe ou seja ajustando oque vai aparecer 
                // para cada usuario, no caso de aluno ele tem uma matricula a ser mostrada
    public void exibirinfo() {
        super.exibirinfo();
        System.out.println("Matrícula: " + matricula);
    }
}
