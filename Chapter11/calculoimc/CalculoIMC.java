package Chapter11.calculoimc;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        do {
            System.out.println("---- Cálculo de IMC -----");
            System.out.println("-------------------------");
            System.out.println("Informe: ");
            System.out.println("(1) Calc. IMC de um Homem");
            System.out.println("(2) Cal. IMC de uma Mulher");
            System.out.println("(9) sair");
            System.out.println("Digite a Opção: ");
            op = sc.nextInt();

            if (op == 1) calcularIMCHomem();
            else calcularIMCMulher();

        }while( op != 9);
    }

    private static void calcularIMCHomem() {
        Homem homem = new Homem();
        fillDadosPessoa(homem);
        imprimirDadosIMC(homem);
    }

    private static void calcularIMCMulher() {
        Mulher mulher = new Mulher();
        fillDadosPessoa(mulher);
        imprimirDadosIMC(mulher);
    }

    private static void fillDadosPessoa(Pessoa pessoa) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a altura: ");
        float altura = sc.nextFloat();
        pessoa.setAltura(altura);
        System.out.println("Informe o peso: ");
        float peso = sc.nextFloat();
        pessoa.setPeso(peso);
    }

    private static void imprimirDadosIMC(IAptoCalcularIMC apto){
        //A única coisa que o método quer saber
        // é se o objeto assina a interface
        //Neste caso tanto o homem quanto a mulher assinam
        //a interface
        System.out.println("Dados do IMC");
        System.out.println("-------------");
        apto.calcularIMC();
        Pessoa pessoa = (Pessoa) apto;
        if(pessoa instanceof Homem){
            System.out.println("A pessoa é um Homem");
            System.out.println("Peso: " + Float.toString(((Homem) apto).getPeso()));
            System.out.println("Altura: " + Float.toString(((Homem)apto).getAltura()));
            System.out.println("IMC: " + Float.toString(((Homem)apto).getImc()));
        }else if(pessoa instanceof Mulher){
            System.out.println("A pessoa é uma mulher");
            System.out.println("Peso: " + Float.toString(((Mulher)apto).getPeso()));
            System.out.println("Altura: " + Float.toString(((Mulher)apto).getAltura()));
            System.out.println("IMC: " + Float.toString(((Mulher)apto).getImc()));
        }
    }
}
