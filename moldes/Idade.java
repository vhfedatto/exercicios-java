package moldes;
import java.util.Scanner;
import java.time.LocalDate;

public class Idade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o seu ano de nascimento? ");
        int ano = input.nextInt();
        System.out.print("Qual o seu mês de nascimento [ex: 04]? ");
        int mes = input.nextInt();
        input.close();

        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int mesAtual = dataAtual.getMonthValue();
        int diaMes = dataAtual.getDayOfMonth();

        int idade = anoAtual - ano;

        if(mesAtual < mes){
            System.out.println("A sua idade é: "+ (idade-1));
        }else{
            System.out.println("A sua idade é: "+ (idade));
        }

        System.out.println("O mês atual é: "+ mesAtual);
        System.out.println("O ano atual é: "+ anoAtual);
        System.out.println("O ano de nascimento é: "+ ano);
        System.out.println("O dia do mês atual é: "+ diaMes);
    }
}