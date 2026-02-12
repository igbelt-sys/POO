import model.pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        //aqui eu execulto as ações!
        //instanciar(criar um obj) um objeto da classe pessoa
        pessoa obj = new pessoa("123","igor",30);
        obj.setIdade(16);
        System.out.println("Nome da pessoa: "+obj.getNome());
        System.out.println("Idade da pessoa:" +obj.getIdade());
    }

}
