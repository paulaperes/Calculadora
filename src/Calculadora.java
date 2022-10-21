import java.util.Scanner;

public class Calculadora {
    public double soma(double num1, double y) {

        return num1 + y;

    }
    public double subtracao(double x, double y){

        return x - y;

    }
    public double divisao(double x,double y){

        return x / y;

    }
    public double multiplicacao(double x, double y){

        return x * y;

    }

    public static void main (String args[]){

        Calculadora c = new Calculadora();

        double opcao = 5;
        double x = 0;
        double y = 0;

        Scanner Entrada = new Scanner(System.in);


        System.out.println("Escolha uma opção:");
        System.out.println("1 Soma");
        System.out.println("2 Subtração");
        System.out.println("3 Divisão");
        System.out.println("4 Multiplicação");
        System.out.println("5 Sair");

        opcao = Entrada.nextDouble();

            if (opcao == 1) {

                Scanner Entrada1 = new Scanner(System.in);

                System.out.println("valor1: ");
                x = Entrada1.nextDouble();
                System.out.println("valor2: ");
                y = Entrada1.nextDouble();

                double soma = c.soma(x, y);

                System.out.println(soma);

            } else if (opcao == 2) {
                Scanner Entrada1 = new Scanner(System.in);
                System.out.println("Valor 1:");
                x = Entrada1.nextDouble();
                System.out.println("Valor 2:");
                y = Entrada1.nextDouble();
                double subtracao = c.subtracao(x,y);
                System.out.println(subtracao);
            } else if (opcao ==3) {
                Scanner Entrada1 = new Scanner(System.in);

                System.out.println("valor1: ");
                x = Entrada1.nextDouble();
                System.out.println("valor2: ");
                y = Entrada1.nextDouble();
                double divisao = c.divisao(x, y);

                System.out.println(divisao);
                
            } else if (opcao == 4) {
                Scanner Entrada1 = new Scanner(System.in);

                System.out.println("valor1: ");
                x = Entrada1.nextDouble();
                System.out.println("valor2: ");
                y = Entrada1.nextDouble();
                double multiplicacao = c.multiplicacao(x, y);

                System.out.println(multiplicacao);
            } else {
                System.out.println("Você escolheu sair");
            }
        }
    }

