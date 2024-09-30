import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Digite um numero:");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("Este numero é par");
        } else {
            System.out.println("Este numero é impar");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //Maior numero entre os 5

        System.out.println("Digite 5 numeros:");


        int[] cincoNumeros = new int[5];

        for (int i = 0; i < 5; i++){
            cincoNumeros[i] = in.nextInt();
        }

        int maior = 0;

        for (int i = 0; i < cincoNumeros.length; i++) {
            if (cincoNumeros[i] > maior){
                maior = cincoNumeros[i];
            }
        }

        System.out.println("O maior numero é " + maior);

        System.out.println();
        System.out.println();
        System.out.println();

        //Soma dos numeros de 25 a 175

        int soma3 = 0;

        for (int i = 25; i <= 175; i++){
            soma3 = soma3 + i;
        }

        System.out.println(soma3);


        System.out.println();
        System.out.println();
        System.out.println();

        //TABUADA

        System.out.println("Digite um numero, para exibir a tabuada:");
        int tabuada = in.nextInt();

        for (int i = 1; i <= 10; i++) {

            int resultado = tabuada * i;
            System.out.println(tabuada + " X " + i + " = " + resultado);
        }


        System.out.println();
        System.out.println();
        System.out.println();

        //FATORIAL

        System.out.println("Digite um numero para saber seu fatorial: ");
        int numero = in.nextInt();

        int fatorial = 1;

        // Calcula o fatorial usando um loop for
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // fatorial = fatorial * i
        }

        // Exibe o resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        //-------------------------------EXIBIR NUMERO PRIMO--------------------------------
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        boolean ehPrimo = true;

        System.out.println("Digite um numero, e descubra se ele é primo: ");
        int primo = in.nextInt();

        if (primo <= 1){
            ehPrimo = false;
        } else {
            for (int i = 2; i <=Math.sqrt(primo); i++){
                if (primo % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(primo + " é um numero primo");
        } else {
            System.out.println(primo + " não é numero primo");
        }

        //Limapar Buffer
        in.nextLine();




        //---------------------------------------------INVERTER STRING-----------------------------------
        System.out.println("Digite uma String, para ser invertida: ");
        String original = in.nextLine();
        String invertida = "";

        int tamanhoOriginal = original.length(); // 3

        for (int i = tamanhoOriginal - 1; i >= 0; i--) {
            invertida = invertida + original.charAt(i);
        }
        System.out.println("A String invertida é " + invertida);


        //---------------------------------------------Contar Numero de vogais-------------------------------------------
        System.out.println("Digite uma palavra: ");
        String palavra = in.nextLine();

        int contagemVogais = 0;

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            for (char vogal : vogais) {
                if (vogal == letra) {
                    contagemVogais += 1;
                }
            }
        }

        System.out.println("Há " + contagemVogais + " vogais");

        //---------------------------------------------Contar Numero de consoantes-------------------------------------------

        System.out.println("Digite uma string: ");
        String stringConsoante = in.next();

        int contador = 0;

        String str = stringConsoante.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z' && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                contador++;
            }
        }

        System.out.println("Nessa string há " + contador + " consoantes.");


        //---------------------------------------------Ordenar Array de inteiros-------------------------------------------
        System.out.println("Digite uma quantidade de numeros: ");
        int QuantidadeNumeros = in.nextInt();
        int[] arrayNumeros = new int[QuantidadeNumeros];


        for (int i = 0; i < QuantidadeNumeros; i++){
            System.out.println("Digite um numero: ");
            arrayNumeros[i] = in.nextInt();
        }

        System.out.println("Array montado " + Arrays.toString(arrayNumeros));

        Arrays.sort(arrayNumeros);

        System.out.println("Array ordenado: " + Arrays.toString(arrayNumeros));


        //---------------------------------------------Calcular a média de uma lista de 10 numeros-------------------------------------------

        int[] lista = new int[10];

        System.out.println("Digite 10 numeros");

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            lista[i] = in.nextInt();
        }

        int somaLista = 0;
        for (int i = 0; i < 10; i++) {
            somaLista = somaLista + lista[i];
        }

        int mediaLista = somaLista / 10;

        System.out.println("A média dos 10 numeros digitados é " + mediaLista);


        //---------------------------------------------Exibir os primeiros N termos da sequencia de Fibonacci-------------------------------------------

        System.out.println("Digite um valor para exibir N termos da sequencia de Fibonacci:");
        int n = in.nextInt();

        if ( n <= 0 ) {
            System.out.println("Digite um valor maior que 0");
        } else {

            System.out.println("Os primeiros " + n + " termos da sequencia de Fibonacci são: ");

            int primeiro = 0;
            int segundo = 1;

            for (int i = 1; i <= n; i++) {
                // Exibir o próximo termo da sequência
                System.out.print(primeiro + " ");

                // Atualizar os termos
                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
        }

        //---------------------------------------------Transformador de Celsius para Fahrenheit-------------------------------------------

        System.out.println("Digite uma temperatura em Celsius: ");
        double celsius = in.nextInt();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é " + fahrenheit);


        //---------------------------------------------Calculadora simples-------------------------------------------
        int escolha;
        double a = 0;
        double b = 0;
        double resultado = 0;
        boolean bo = true;

        while (bo) {

            System.out.println("Bem Vindo a Calculadora Simples. Escolha uma operação: \n1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Sair");
            escolha = in.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Operação de adição: ");
                    System.out.print("Digite um numero: ");
                    a = in.nextDouble();

                    System.out.print("Digite um numero: ");
                    b = in.nextDouble();

                    resultado = a + b;

                    System.out.println();
                    System.out.println(a + " + " + b + " = " + resultado);
                    break;
                case 2:
                    System.out.println("Operação de Subtração");
                    System.out.print("Digite um numero: ");
                    a = in.nextDouble();

                    System.out.print("Digite um numero: ");
                    b = in.nextDouble();

                    resultado = a - b;

                    System.out.println();
                    System.out.println(a + " - " + b + " = " + resultado);
                    break;
                case 3:
                    System.out.println("Operação de Multiplicação");
                    System.out.print("Digite um numero: ");
                    a = in.nextDouble();

                    System.out.print("Digite um numero: ");
                    b = in.nextDouble();

                    resultado = a * b;
                    System.out.println(a + " x " + b + " = " + resultado);
                    break;
                case 4:
                    System.out.println("Operação de Divisão");
                    System.out.print("Digite um numero: ");
                    a = in.nextDouble();

                    System.out.print("Digite um numero: ");
                    b = in.nextDouble();

                    resultado = a / b;
                    System.out.println(a + " / " + b + " = " + resultado);
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o sistema!");
                    bo = false;
                    break;
                default:
                    System.out.println("Insira um numero valido de 1 a 4.");
                    break;
            }
            System.out.println();
        }

        //---------------------------------------------Todos os pares de um Limite-------------------------------------------

        System.out.println("Vamos exibir todos os pares de um limite x para final y:");
        System.out.println("Digite o valor de x:");
        int inicio = in.nextInt();
        System.out.println("Digite o valor de y:");
        int fim = in.nextInt();
        ArrayList<Integer> pares = new ArrayList<Integer>();


        if (fim <= inicio) {
            System.out.println("O valor de y deve ser maior que o valor de x. Digite novamente:");
            fim = in.nextInt();
        }

        for (int i = inicio; i < fim; i++ ) {
            if ( i % 2 == 0) {
                pares.add(i);
            }
        }

        System.out.println("Os pares dentro do limite definido são: " + pares);

        


    }
}