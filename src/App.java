import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int firstNumber = terminal.nextInt();
        System.out.println("Digite o segundo numero: ");
        int secNumber = terminal.nextInt();

        try {
            int count = accountant(firstNumber, secNumber);
            for (int i = 1; i <= count; i++) {
                System.out.println("Imprimindo o numero " + i);
            }

            terminal.close();
        } catch (InvalidParametersException e) {
            e.printStackTrace();
        }

    }

    static int accountant(int parametroUm, int parametroDois) throws InvalidParametersException {
        int contagem = parametroDois - parametroUm;
        if (parametroUm > parametroDois) {
            throw new InvalidParametersException();
        }

        return contagem;
    }
}
