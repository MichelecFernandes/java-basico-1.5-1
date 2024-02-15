import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Valor 1: ");
        Scanner n1 = new Scanner(System.in);
        int numero1 = n1.nextInt();
        Numero leitura1 = new Numero(numero1);


        System.out.println("Valor 2: ");
        Scanner n2 = new Scanner(System.in);
        int numero2 = n1.nextInt();
        Numero leitura2 = new Numero(numero2);

        System.out.println("Valor 3: ");
        Scanner n3 = new Scanner(System.in);
        int numero3 = n1.nextInt();
        Numero leitura3 = new Numero(numero3);

        System.out.println("Valor 4: ");
        Scanner n4 = new Scanner(System.in);
        int numero4 = n1.nextInt();
        Numero leitura4 = new Numero(numero4);



        ArrayList<Numero> numeros = new ArrayList<>();
        numeros.add(leitura1);
        numeros.add(leitura2);
        numeros.add(leitura3);
        numeros.add(leitura4);

        int maior = numeros.get(0).getNumero();
        int menor = numeros.get(0).getNumero();

        for (int i = 1; i < numeros.size(); i++) {
            int numeroLoop = numeros.get(i).getNumero();
            if (numeroLoop > maior){
                maior = numeroLoop;
            } else if (numeroLoop < menor) {
                menor = numeroLoop;
            }

        }

        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        if(maior > 50){
            System.out.println("Valor muito alto!");
        }
    }
}