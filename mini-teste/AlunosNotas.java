import java.util.Scanner;

public class AlunosNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Notas[] = new double [10];
        
        double soma = 0;
        int c = 0;
        int acima = 0;
        
        for(int i = 0; i<10; i++){
            
            System.out.print("Aluno "+(i+1)+": Qual a nota? ");
            double nota = input.nextDouble();
            c++;
            Notas[i] = nota;
            
            soma += nota;
        }
        
        double media = 0;
        media = soma / c;
        
        System.out.println("\nMédia das notas: "+ String.format("%.2f", media));
        System.out.println("=== Notas acima da média ===");
        for(double nota : Notas){

            //Estou considerando que a média é 7;
            if(nota >= 7){
                System.out.println(nota);
                acima++;
            }
        }
        if(acima == 0){
            System.out.println("Não há notas acima da média");   
        }
        System.out.println("Quantidade de notas abaixo da média: "+(10-acima));
        input.close();
    }
}