import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o número inicial:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int paramentroDois) throws ParametrosInvalidosException {
        if (parametroUm > paramentroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = paramentroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
