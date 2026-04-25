import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op != 5) {
            Task.menu();
          op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    Task.addTask();
                    break;
                case 2:
                    Task.Listasks();
                    break;
                case 3:
                    Task.concludTasks();
                    break;
                case 4:
                    Task.removerTarefa();
                    break;
                case 5:
                    System.out.println("Encerrando o programa, obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    System.out.println();
            }
        }

        sc.close();

    }
}
