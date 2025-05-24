import java.util.Scanner;

public class GerenciALL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n============== GerenciALL ==============");
        System.out.println("\n[1] Criar Tarefas\n[2] Gerenciar Tarefas\n[3] Fazer Tarefa\n[4] Calendário\n[5] Sair");
        System.out.println("\n========================================");
        System.out.print(">> Escolha: "); // Criar uma prevenção para erros de digitação de algo que não seja um número INT
        int escolha = input.nextInt();

        switch(escolha) {
            case 1: // Criar tarefas
                System.out.println("\n============ Criar Tarefas ============");
                break;
            case 2: // Gerenciar tarefas --> Filtrar, Pesquisar, editar e excluir
                System.out.println("\n========== Gerenciar Tarefas ==========");
                break;


            case 3: // Fazer tarefa
                System.out.println("\n============ Fazer Tarefas ============");
                break;
        

            default: // Caso não seja um número
                break;


        } // Fecha o Switch Case

        input.close();
    }//main
}//import

/* Programa para gerenciar tarefas:
 * 
 * 1. O Site deve conter
 *  1.1. Criar tarefa: nome, descrição, data, status;
 *  1.2. Exibição de tarefas já registradas
 *  1.3. Alteração de status
 *  1.4. Edição ou exclusão dos dados da tarefa
 * 
 * Opções do site:
 * 1. "Criar Tarefas" --> 1.1
 * 2. Gerenciar tarefas --> 1.2., 1.4.
 * 3. "Fazer Tarefa" --> 1.3.
 */