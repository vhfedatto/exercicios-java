import java.util.Scanner;

public class MatrizOperacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matriz [][] = new int[3][3];
        int soma = 0;
        
        System.out.println("\n=== Montando a Matriz ===");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print("Digite o valor da linha ["+i+"] coluna ["+j+"]: ");
                int num = input.nextInt();
                matriz[i][j] = num;
                soma += num;
            }
        }

        //Printando a soma usando uma variável;
        System.out.println("\nA soma de todos os elementos da matriz é: "+soma);

        //Printando a matriz completa;
        System.out.println("\n=== Matriz Digitada ===");

        for(int i = 0; i < matriz.length; i++){
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("|");
        }
        input.close();
    }
}