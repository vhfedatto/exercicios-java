import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        
        String data;
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n>>>>>>>>>>>>>> GerenciALL <<<<<<<<<<<<<<");
            System.out.println("\n[1] Criar Tarefas\n[2] Gerenciar Tarefas\n[3] Fazer Tarefa\n[4] Calendário\n[5] Sair");
            System.out.println("========================================");
            System.out.print(">> Escolha: "); // Criar uma prevenção para erros de digitação de algo que não seja um número INT

            int escolha = input.nextInt();
            input.nextLine(); // Limpa o buffer

            switch (escolha) {
                case 1 -> { // Criar tarefas
                    System.out.println("\n============ Criar Tarefas ============");
                    System.out.print("NOME TAREFA: ");
                    String titulo = input.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = input.nextLine();

                    while (true) {
                        System.out.print("Data: [yyyy-mm-dd] ");
                        data = input.nextLine();

                        try {
                            LocalDate dataDigitada = LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                            if (dataDigitada.isBefore(LocalDate.now())) {
                                System.out.println("A data não pode estar no passado. Digite novamente.");
                            } else {
                                break;
                            }

                        } catch (DateTimeParseException e) {
                            System.out.println("Data inválida! Use o formato correto e uma data real (ex: 2025-07-30).");
                        }
                    }

                    System.out.println("Status:\n[1] A fazer\n[2] Fazendo\n[3] Feito");
                    System.out.print(">> Escolha: ");
                    int status = input.nextInt();
                    input.nextLine();

                    Tarefa nova = new Tarefa(titulo, descricao, data, status);
                    listaTarefas.add(nova);

                    System.out.println("\nTarefa criada com sucesso!");
                }

                case 2 -> { // Gerenciar tarefas --> Filtrar, Pesquisar, editar e excluir
                    System.out.println("\n========== Tarefas Registradas ==========");
                    if (listaTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa registrada.");
                    } else {
                        for (int i = 0; i < listaTarefas.size(); i++) {
                            System.out.println("\n[" + (i + 1) + "]\n" + listaTarefas.get(i));
                        } //for
                    }//else if
                }//case

                case 3 -> { // Fazer tarefa
                    System.out.println("\n========== Fazer Tarefa ==========");
                    if (listaTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa para atualizar.");
                    } else {
                        System.out.println("Qual tarefa deseja atualizar?");
                        for (int i = 0; i < listaTarefas.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + listaTarefas.get(i).getTitulo());
                        }
                        System.out.print(">> Escolha: ");
                        int index = input.nextInt() - 1;

                        System.out.println("Novo status:\n[1] A fazer\n[2] Fazendo\n[3] Feito");
                        System.out.print(">> Escolha: ");
                        int novoStatus = input.nextInt();
                        input.nextLine();

                        listaTarefas.get(index).setStatus(novoStatus);
                        System.out.println("Status atualizado com sucesso!");
                    }
                }

                case 4 ->{ //Ver calendário
                    System.out.println("====== Calendário ======");
                }

                case 5 -> { //Sair do programa
                    System.out.println("Saindo...");
                    rodando = false;
                }

                default -> System.out.println("Opção inválida."); // Caso não seja um número
            } // Fecha o Switch Case
        }
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