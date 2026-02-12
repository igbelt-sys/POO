import Model.Pessoa;
import View.CursoView;

public class App {
    public static void main(String[] args) throws Exception {
        //instanciando obj das classes
        // ao transformar a classe em bstrata nao é possivel istanciar ela 
        // Pessoa pes1 = new Pessoa("Fulano", "123.456.789-00", "10/10/1910");
        // pes1.exibirinfo();
        new CursoView().menu();
    }
}
