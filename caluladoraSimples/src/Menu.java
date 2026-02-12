import java.util.Scanner;

public class Menu {
    // atributos
    double num1, num2, resultado; // variaveis primitivas(com letras minusculas e nao sao manipulaveis)
    String operacao;// ja a String pode ser manipulada mudando letras de lugar etc..
    boolean continuar = true;

    // metodos

    public void calculadora() {
        // para usar a calculadora - biblioteca de Scanner
        Scanner sc = new Scanner(System.in); // permite entrada de dados
        // usar um laço de repetição
        do {

            System.out.println("====Calculadora simples===");
            System.out.println("===Escolha a Operação===");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Raiz Quadrada");
            System.out.println("6. Potência");
            System.out.println("7.Sair");
            System.out.println("========================");
            // le oque o usuario digitou
            
            operacao = sc.next();
            // Escolhi a Operação -> Decisão
            Calculos cl = new Calculos();
            switch (operacao) {
                case "1":
                    digiteNumeros();
                    resultado = cl.soma(num1, num2);
                    System.out.println("O resultado é: " + resultado);
                    break;
                case "2":
                    digiteNumeros();
                    resultado = cl.subtracao(num1, num2);
                    System.out.println("O resultado é: " + resultado);
                    break;
                case "3":
                    digiteNumeros();
                    resultado = cl.multi(num1, num2);
                    System.out.println("O resultado é: " + resultado);
                    break;
                case "4":
                    digiteNumeros();
                    if (num2 == 0) {
                        System.out.println("Não é possivel dividir por 0!");
                    } else {
                        resultado = cl.div(num1, num2);
                        System.out.println("O resultado é: " + resultado);
                    }
                    break;
                case "5":
                    digiteNumeros();
                    resultado = cl.raiz(num1);
                    System.out.println("O resultado é: " + resultado);
                    break;
                case "6":
                    digiteNumeros();
                    resultado = cl.potencia(num1, num2);
                    System.out.println("O resultado é: " + resultado);
                    break;
                case "7":
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma operação válida!!");
                    break;
                }
         } while (continuar);
    }

    public void digiteNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Nº 1");
        num1 = sc.nextDouble();// le o valor e converte em double
        System.out.println("Informe o Nº 2");
        num2 = sc.nextDouble();
    }
}
