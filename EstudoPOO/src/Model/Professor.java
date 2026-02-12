//subClasse de pessoa

package Model;

public class Professor extends Pessoa {
    // atributos
    private double salario;

    // metodos
    // contrutor
    public Professor(String nome, String cpf, String data, double salario) {
        super(nome, cpf, data);
        this.salario = salario;
    }
    // getter e setters

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // exibir info
    @Override
    public void exibirinfo() {
        super.exibirinfo();
        System.out.println("Salario R$: " + salario);
    }
}
