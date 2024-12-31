import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criação do objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        // Solicita o sexo
        System.out.print("Digite o sexo (masculino/feminino): ");
        String sexo = scanner.nextLine().toLowerCase();


        if (sexo.equals("masculino")) {
            System.out.println("O nome " + nome + " é masculino.");
        } else if (sexo.equals("feminino")) {
            System.out.println("O nome " + nome + " é feminino.");
        } else {
            System.out.println("Sexo inválido. Por favor, digite 'masculino' ou 'feminino'.");
        }


        scanner.close();
    }
}
p