import java.time.LocalDate;
import java.time.DayOfWeek;
public class ExemploDataAtual {
    public static void main (String[] args){
        
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalDate dataNascimento = LocalDate.of(2005, 6, 13);
        System.out.println("Data de nascimento: " + dataNascimento);

        int dia = dataAtual.getDayOfMonth();
        System.out.println("Dia do mês: " + dia);

        int mes = dataAtual.getMonthValue();
        System.out.println("Mês (numérico): " + mes);

        int ano = dataAtual.getYear();
        System.out.println("Ano: " + ano);

        DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();
        System.out.println("Dia da semana: " + diaDaSemana);
    }
}
