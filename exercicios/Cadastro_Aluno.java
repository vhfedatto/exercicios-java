package exercicios;
//Exercicio - Criado por Victor H Fedatto
/* */

import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro_Aluno{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> Nomes = new ArrayList<String>(); 
        ArrayList<Double> Notas = new ArrayList<Double>(); 

        String choice = "N";
        
        //Cadastrar alunos:
        while (choice.equalsIgnoreCase("N")){
            System.out.println("\n=== Sistema de Cadastro de Alunos ===\n1. Cadastrar aluno\n2. Mostrar todos os alunos\n3. Buscar aluno por nome\n4. Remover aluno\n5. Sair");
            System.out.print("== Escolha [ex.: 1]: ");
            int escolha = input.nextInt();
            input.nextLine(); // Limpa o buffer
            
            // Cadastrar alunos
            if(escolha == 1){
                System.out.print("\nQuantos alunos deseja de cadastrar? ");
                int q1 = input.nextInt();
                input.nextLine(); //Limpa o buffer

                for(int c = 0; c < q1; c++){
                    //Perguntando o nome:
                    System.out.print("Nome do aluno: ");
                    String nome = input.nextLine();
                    Nomes.add(nome);

                    //Perguntando a nota final:
                    System.out.print("Nota final: ");
                    double nota = input.nextDouble();
                    input.nextLine(); // Limpa o buffer
                    Notas.add(nota);
                }
            
            //Mostrar todos os alunos - notas - situação
            }else if(escolha == 2){
                if(Nomes.size() == 0){
                    System.out.println("Não há alunos cadastrados.");
                }else{
                    System.out.println("\n===Lista de alunos ===");
                    
                    //Apresentando todos os alunos - notas - situação;
                    for(int i = 0; i < Nomes.size(); i++){
                        String aluno = Nomes.get(i);
                        double media = Notas.get(i);

                        //Determinando a situação:
                        String situacao;
                        if(media >= 7){
                            situacao = "Aprovado";

                        }else if(media >= 5){
                            situacao = "Recuperação";

                        }else{
                            situacao = "Reprovado";
                        }

                        //Saída:
                        System.out.println(aluno+" - Média: "+String.format("%.1f", media)+" - Situação: "+situacao);

                    }
                }
            
            //Buscar alunos
            }else if(escolha == 3){
                System.out.print("\nQuantos alunos deseja buscar? ");
                int q1 = input.nextInt();
                input.nextLine(); //Limpa o buffer


                for(int c = 0; c < q1; c++){
                    System.out.print("Buscar nome: ");
                    String alunoBuscado = input.nextLine();

                    boolean encontrado = false;

                    for(int j = 0; j < Nomes.size(); j++){
                        String aluno = Nomes.get(j);
                        double media = Notas.get(j);

                        if(alunoBuscado.equalsIgnoreCase(aluno)){
                            System.out.println("== Encontrado: "+alunoBuscado+" - Média: "+media+" ==");
                            encontrado = true;

                            System.out.print("\nEditar a nota? [S/N] ");
                            String editar = input.nextLine();

                            if(editar.equalsIgnoreCase("S")){
                                System.out.print("Qual a nota correta para o aluno "+aluno+"? ");
                                double novaNota = input.nextDouble(); 
                                Notas.set(j, novaNota);

                                //Apresentação da nota nova
                                System.out.print("\n=== A nota do aluno "+aluno+" foi alterada para: "+novaNota+" ===\n");
                            }
                            break;
                        }
                        
                    }
                    if(!encontrado){
                        System.out.println("== Aluno não encontrado ==");
                    }
                }
            
            // Remover aluno e nota; 
            }else if (escolha == 4){
                                System.out.print("\nQuantos alunos deseja excluir? ");
                int q1 = input.nextInt();
                input.nextLine(); //Limpa o buffer


                for(int c = 0; c < q1; c++){
                    System.out.print("Buscar nome: ");
                    String alunoBuscado = input.nextLine();

                    boolean encontrado = false;

                    for(int j = 0; j < Nomes.size(); j++){
                        String aluno = Nomes.get(j);
                        double media = Notas.get(j);

                        if(alunoBuscado.equalsIgnoreCase(aluno)){
                            Nomes.remove(j);
                            Notas.remove(j);
                            System.out.println("== Aluno "+aluno+" e média "+media+" excluídos com sucesso ==");
                            encontrado = true;
                            break;
                        }
                        
                    }
                    if(!encontrado){
                        System.out.println("== Aluno não encontrado ==");
                    }
                }
            }else if(escolha == 5){
                System.out.print("Deseja mesmo sair? [S/N]: ");
                choice = input.nextLine();
            }
        }
        input.close();
        System.out.print("== Programa encerrado ==");
    }
}