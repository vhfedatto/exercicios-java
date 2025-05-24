package moldes;
import java.util.Scanner;
import java.time.LocalDate;

public class Idade2 {
    public static void main(String[] args){
        LocalDate dataAtual = LocalDate.now();
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a sua data de nascimento? [dd-mm-aaaa] ");
        String nasc = input.nextLine();

        String[] parte = nasc.split("-");
        String diaS = parte[0];
        String mesS = parte[1];
        String anoS = parte[2];

        int dia = Integer.valueOf(diaS);
        int mes = Integer.valueOf(mesS);
        int ano = Integer.valueOf(anoS);

        int anoAtual = dataAtual.getYear();
        int mesAtual = dataAtual.getMonthValue();
        int diaAtual = dataAtual.getDayOfMonth();

        int idade = anoAtual - ano;

        if(diaAtual < dia){
            if(mesAtual > mes){
                System.out.println("Você tem "+idade+" anos");
            }else if(mesAtual <= mes){
                idade = idade - 1;
                System.out.println("Você tem "+idade+" anos");
            }
        }else if(diaAtual >= dia){
            if(mesAtual >= mes){
                System.out.println("Você tem "+idade+" anos");

            }else if(mesAtual < mes){
                idade = idade - 1;
                System.out.println("Você tem "+idade+" anos");
            }
        }
        input.close();
    }
}
