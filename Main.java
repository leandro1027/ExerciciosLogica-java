//import java.util.Scanner;

//public class Main {
    //Exercício 1

/*import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Digite 10 números: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Array formado: ");

        for(int num : array) {
            System.out.println(num);
        }

    }
}

//Exercício 2

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[3];

        System.out.println("Digite 3 números: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }

        int soma = 0;

        for(int numero : array){
            soma +=numero;
        }

        System.out.println("Soma = " + soma);
    }
}

//Exercício 3

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Digite 5 números: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }

        System.out.println("Maiores que 10: ");
        for(int numero : array){
            if(numero > 10){
                System.out.println(numero);
            }
        }

    }
}

//Exercício 4

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[3];

        System.out.println("Digite 3 números: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }

        int produto = 1;

        for(int numero : array){
            produto *=numero;
        }

        System.out.println("Produto = " + produto);
    }
}

//Exercício 5

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] array = new String[3];

        System.out.println("Digite 3 frutas: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scan.next();
        }

        for(String palavra : array){
            System.out.println(palavra+" é uma fruta");
        }


    }
}

//Exercício 6

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Digite 5 números: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }

        int par = 0;

        for(int numero : array){
            if(numero % 2 == 0){
                par++;
            }
        }
        System.out.println("Elementos pares: "+par);
    }
}

//Exercício 7

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[3];

        System.out.println("Digite 3 números: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }

        for(int numero : array){
            System.out.println((numero * numero +" "));
        }
    }
}

//Exercício 8

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] array = new String[3];

        System.out.println("Digite 3 palavras: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scan.next();
        }

        for(String palavra : array){
            System.out.print(palavra.toUpperCase()+" ");
        }
    }
}

//Exercício 9

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[3];

        System.out.println("Digite 3 números: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }

        //não consegui com o forEach
        for(int i = array.length -1; i>=0 ; i--){
            System.out.print(array[i] + " ");
        }
    }
}*/

//Exercício 10

import java.util.Scanner;
    public class Main
    {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int[] array = new int[4];

            System.out.println("Digite 4 números: ");

            for(int i = 0; i < array.length; i++){
                array[i] = scan.nextInt();
            }

            int soma = 0;

            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    soma += array[i];
                }
            }

            System.out.println("Soma dos elementos em posições ímpares: " + soma);
        }
    }


