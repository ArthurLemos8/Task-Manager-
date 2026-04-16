import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    int Id;
    String nameTask;
    boolean concluida;
    
    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Concluir tarefa");
        System.out.println("4 - Remover tarefa");
        System.out.println("5 - Sair");
        System.out.print("Escolha: ");
    }

    public static void addTask() {
        Task tk = new Task();
        System.out.println(" Adicione o nome de uma tarefa: ");
        tk.nameTask = sc.nextLine();
        tk.Id = tasks.size() + 1;
        tk.concluida = false;
        tasks.add(tk);
        System.out.println("Tarefa adicionada");

    }

    public static void Listasks() {
        System.out.println("\nLista das tarefas: ");
        for (int i = 0; i < tasks.size(); i++) {
            Task tk = tasks.get(i);
            System.out.println("ID: " + tk.Id + " Tarefa: " + tk.nameTask + " Status: " + tk.concluida);
        }
       
    }

    public static void concludTasks() {
        System.out.println("Qual tarefa deseja concluir? : ");
        for (int i = 0; i < tasks.size(); i++) {
            Task tk = tasks.get(i);
            if (tk.concluida == false) {
                System.out.println("ID: " + tk.Id + " Tarefa: " + tk.nameTask);
            }
        }
        System.out.println("Digite o numero do ID: ");
        int id2 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tasks.size(); i++) {
            Task tk = tasks.get(i);
            if (tk.Id == id2) {
                tk.concluida = true;
                System.out.println("Tarefa concluida!");
            }
        }
    }

        public static void removerTarefa(){
            System.out.println("===============");
              for (int i = 0; i < tasks.size(); i++) {
                Task tk = tasks.get(i);
            System.out.println("ID: " + tk.Id + " Tarefa: " + tk.nameTask + " Status: " + tk.concluida);
        }
        System.out.println("Digite o ID da tarefa que deseja remover: ");
        int id3 = Integer.parseInt(sc.nextLine());
        tasks.removeIf(tk->tk.Id == id3);
        System.out.println("Tarefa removida!");
        }

       
    }
