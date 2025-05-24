import java.util.Arrays;
import java.util.Scanner;

public class GerenEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int CodProd [] = new int[8];
        String x = "N";
        
        while(x.equalsIgnoreCase("N")){
            int z = 0;
            System.out.println("\n=== Sistema Gerenciador de Códigos ===");
            System.out.println("1. Adicionar códigos\n2. Buscar Código\n3. Exibir lista\n4. Sair");
            System.out.print("== Comando: ");
            int dec = input.nextInt();    
            
            if(dec == 1){
                if(CodProd.length == 8){
                    for(int el : CodProd){
                        if(el == 0){
                            z++;
                        }
                    }
                    if(z == 8){
                        System.out.println(">> Por padrão, adicionarás 8 códigos <<");
                        for(int i = 0; i < CodProd.length; i++){
                            boolean valido = false;
                            
                            while(!valido){
                                System.out.print("Digite o código do produto " + (i + 1) + ": ");
                                int cod = input.nextInt();
                                input.nextLine(); // Limpa buffer

                                boolean jaExiste = false;

                                // Verifica se o código já existe no vetor
                                for(int j = 0; j < i; j++){
                                    if(CodProd[j] == cod){
                                        jaExiste = true;
                                        break;
                                    }
                                }

                                if(jaExiste){
                                    System.out.println(">> Código: " + cod + " já existe no vetor. Digite outro. <<");
                                } else {
                                    CodProd[i] = cod;
                                    valido = true; // Sai do while
                                }
                            }
                        }

                    }else{
                        System.out.println("= O vetor já está cheio =");
                    }
                }
            //Buscar código
            }else if(dec == 2){
                System.out.print("Buscar Código: ");
                int pesquisa = input.nextInt();

                boolean encontrado = false;

                for(int j = 0; j < CodProd.length; j++){
                    int codigoProdPesquisa = CodProd[j];

                    if(pesquisa == codigoProdPesquisa){
                        System.out.println(">> Código: "+pesquisa+" já existe no vetor <<");
                        encontrado = true;
                    }
                }

                if(!encontrado){
                    System.out.println(">> Código não encontrado <<");
                }

            //Exibir lista completa
            }else if(dec == 3){
                System.out.println("\n=== Apresentando a Lista de Códigos ===");
                Arrays.sort(CodProd);
                for(int codigo : CodProd){
                    System.out.print(codigo+" ");
                }
                System.out.println(" ");
                System.out.println("===============================");

            //Sair do programa
            }else if(dec == 4){
                input.nextLine(); 
                System.out.print("\nDeseja mesmo sair? [S/N] ");
                x = input.nextLine();
                System.out.println("===== Saindo do programa =====");

            }else{
                System.out.println("Opção inválida");
            }

        }

        //Imprimindo a lista ao sair
        System.out.println("\n=== Apresentando a Lista de Códigos ===");
        Arrays.sort(CodProd);
        for(int codigo : CodProd){
            System.out.print(codigo+" ");
        }
        System.out.println(" ");
        System.out.println("===============================");
        input.close();
    }
}