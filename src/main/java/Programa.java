import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /*Quantidade de Vetores*/
        System.out.print("Quantas Notas serão alocado ao Vetor ?");
        int n = sc.nextInt();
        double[] cont = new double[n];

        /*Percorre os Vetores*/
        for (int i = 0; i < cont.length; i++) {
            System.out.print("Nota " + (i+1) + ":");
            cont[i] = sc.nextDouble();
        }
        /*Acumula os valores*/
        double soma = 0.0;
        for(int i = 0; i < cont.length; i++){
            soma += cont[i];
        }
        /*Regra de Negócio*/
        double media = soma / cont.length;
        System.out.printf("Media Final: %.2f%n ",  media);
        if (media < 7) {
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Aprovado");
        }

        sc.close();
        }

    }


