package teste_Pratico;
import java.time.LocalDate;

public class Funcionario {
	
	 private String nome;
	 private String cargo;
	 private LocalDate dataContratacao;

	 public Funcionario(String nome, String cargo, LocalDate dataContratacao) {
	        this.nome = nome;
	        this.cargo = cargo;
	        this.dataContratacao = dataContratacao;
	    }

	    public Funcionario(String nome2, String cargo2, String string) {
		
	}

		public String getNome() {
	        return nome;
	    }

	    public String getCargo() {
	        return cargo;
	    }

	    public LocalDate getDataContratacao() {
	        return dataContratacao;
	    }

	    public int calcularBeneficio() {
	        int anosContratacao = LocalDate.now().getYear() - dataContratacao.getYear();
	        int beneficio = 0;

	        if (cargo.equals("Secretário")) {
	            beneficio += 1000 * anosContratacao;
	            beneficio += 0.2 * 7000;
	        } else if (cargo.equals("Vendedor")) {
	            beneficio += 1800 * anosContratacao;
	            beneficio += 0.3 * 12000;
	        }

	        return beneficio;
	    }
	}

	