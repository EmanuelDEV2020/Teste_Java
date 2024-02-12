package teste_Pratico;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class CalculadoraPagamento {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Jorge Carvalho", "Secretário", LocalDate.of(2018, 1, 1)));
        funcionarios.add(new Funcionario("Maria Souza", "Secretário", LocalDate.of(2015, 12, 1)));
        funcionarios.add(new Funcionario("Ana Silva", "Vendedor", LocalDate.of(2021, 12, 1)));
        funcionarios.add(new Funcionario("João Mendes", "Vendedor", LocalDate.of(2021, 12, 1)));
        funcionarios.add(new Funcionario("Juliana Alves", "Gerente", LocalDate.of(2017, 7, 1)));
        funcionarios.add(new Funcionario("Bento Albino", "Gerente", LocalDate.of(2014, 3, 1)));

        int totalPago = calcularTotalPago(funcionarios, 1, 2022);
        System.out.println("Total pago no mês: R$" + totalPago);
    }

    public static int calcularTotalPago(List<Funcionario> funcionarios, int mes, int ano) {
        int totalPago = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDataContratacao().getMonthValue() <= mes && funcionario.getDataContratacao().getYear() <= ano) {
                totalPago += calcularSalario(funcionario);
            }
        }
        return totalPago;
    }

    public static int calcularSalario(Funcionario funcionario) {
        int salarioBase = 0;

        if (funcionario.getCargo().equals("Secretário")) {
            salarioBase = 7000;
        } else if (funcionario.getCargo().equals("Vendedor")) {
            salarioBase = 12000;
        } else if (funcionario.getCargo().equals("Gerente")) {
            salarioBase = 20000;
        }

        int beneficio = funcionario.calcularBeneficio();
        return salarioBase + beneficio;
    }
}
