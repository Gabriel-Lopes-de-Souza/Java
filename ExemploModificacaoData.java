import java.time.LocalDate;
public class ExemploModificacaoData {
   public static void main(String[] args) {
       LocalDate dataOriginal = LocalDate.of(2023, 6, 13);
       System.out.println("Data original: " + dataOriginal);
       // Adicionando períodos
       LocalDate dataMais5Dias = dataOriginal.plusDays(5);
       System.out.println("Adicionando 5 dias: " + dataMais5Dias);
       LocalDate dataMais2Meses = dataOriginal.plusMonths(2);
       System.out.println("Adicionando 2 meses: " + dataMais2Meses);
       LocalDate dataMais1Ano = dataOriginal.plusYears(1);
       System.out.println("Adicionando 1 ano: " + dataMais1Ano);
       // Removendo períodos
       LocalDate dataMenos3Dias = dataOriginal.minusDays(3);
       System.out.println("Removendo 3 dias: " + dataMenos3Dias);
       LocalDate dataMenos1Mes = dataOriginal.minusMonths(1);
       System.out.println("Removendo 1 mês: " + dataMenos1Mes);
       LocalDate dataMenos2Anos = dataOriginal.minusYears(2);
       System.out.println("Removendo 2 anos: " + dataMenos2Anos);
       // Verificando que a data original não foi alterada
       System.out.println("Data original após modificações: " + dataOriginal);
   }
}
