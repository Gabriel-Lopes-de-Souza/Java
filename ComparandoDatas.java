import java.time.LocalDate;
public class ComparandoDatas {
   public static void main(String[] args) {
       LocalDate hoje = LocalDate.now();
       // Exemplo: Usando uma data fixa para consistência na saída
       // Em um cenário real, 'hoje' seria a data atual de execução.
       LocalDate hojeSimulado = LocalDate.of(2023, 10, 27);
       LocalDate dataVencimento1 = LocalDate.of(2023, 10, 26); // Data no passado
       LocalDate dataVencimento2 = LocalDate.of(2023, 10, 27); // Hoje (data simulada)
       LocalDate dataVencimento3 = LocalDate.of(2023, 11, 5);  // Data no futuro
       System.out.println("Hoje (simulado): " + hojeSimulado);
       System.out.println("Data de Vencimento 1: " + dataVencimento1);
       System.out.println("Data de Vencimento 2: " + dataVencimento2);
       System.out.println("Data de Vencimento 3: " + dataVencimento3);
       System.out.println("--------------------");
       // Comparando dataVencimento1 com hoje
       if (dataVencimento1.isBefore(hojeSimulado)) {
           System.out.println("Data de Vencimento 1 (" + dataVencimento1 + ") está antes de hoje (" + hojeSimulado + ").");
       } else if (dataVencimento1.isEqual(hojeSimulado)) {
           System.out.println("Data de Vencimento 1 (" + dataVencimento1 + ") é igual a hoje (" + hojeSimulado + ").");
       } else {
           System.out.println("Data de Vencimento 1 (" + dataVencimento1 + ") está depois de hoje (" + hojeSimulado + ").");
       }
       // Comparando dataVencimento2 com hoje
       if (dataVencimento2.isBefore(hojeSimulado)) {
           System.out.println("Data de Vencimento 2 (" + dataVencimento2 + ") está antes de hoje (" + hojeSimulado + ").");
       } else if (dataVencimento2.isEqual(hojeSimulado)) {
           System.out.println("Data de Vencimento 2 (" + dataVencimento2 + ") é igual a hoje (" + hojeSimulado + ").");
       } else {
           System.out.println("Data de Vencimento 2 (" + dataVencimento2 + ") está depois de hoje (" + hojeSimulado + ").");
       }
       // Comparando dataVencimento3 com hoje
       if (dataVencimento3.isBefore(hojeSimulado)) {
           System.out.println("Data de Vencimento 3 (" + dataVencimento3 + ") está antes de hoje (" + hojeSimulado + ").");
       } else if (dataVencimento3.isEqual(hojeSimulado)) {
           System.out.println("Data de Vencimento 3 (" + dataVencimento3 + ") é igual a hoje (" + hojeSimulado + ").");
       } else {
           System.out.println("Data de Vencimento 3 (" + dataVencimento3 + ") está depois de hoje (" + hojeSimulado + ").");
           System.out.println(hoje);
       }
   }
}
