import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatandoDatas {
    public static void main(String[] args) {
    LocalDate dataOriginal = LocalDate.of(2023, 10, 27); // 27 de Outubro de 2023

    // Define um formatador para o padrão "dd/MM/yyyy"
    DateTimeFormatter formatadorPadraoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Formata a data para uma String
    String dataFormatada = dataOriginal.format(formatadorPadraoBrasil);

    System.out.println("Data original: " + dataOriginal);
    System.out.println("Data formatada (dd/MM/yyyy): " + dataFormatada);

    }

}
