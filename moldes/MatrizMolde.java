package moldes;

import java.util.Scanner;

public class MatrizMolde{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matriz [] [] = new int[3][3];
        
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print("Digite o valor da linha ["+i+"] coluna ["+j+"]: ");
                int num = input.nextInt();
                matriz[i][j] = num;
            }
        }

        System.out.println("Matriz Digitada:");
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        input.close();

    }
}