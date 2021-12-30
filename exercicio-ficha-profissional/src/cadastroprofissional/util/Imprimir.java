package cadastroprofissional.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import cadastroprofissional.model.Cadastro;

public class Imprimir {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");	
	public void imprimirFichaProfissional(Cadastro cadastro) {

		StringBuilder dadosFichaProfissional = new StringBuilder();
		

		dadosFichaProfissional.append("===================== FICHA PROFISSIONAL =====================\n");
		dadosFichaProfissional.append("\nProfiss�o: " + cadastro.getProfissao()); // T� EM NEGRITO ASSIM COMO FICHA
		dadosFichaProfissional.append("\nNome: " + cadastro.getNome());
		dadosFichaProfissional.append("\nSal�rio Requerido: M�nimo R$ " + cadastro.getSalarioMinimo() + " M�ximo R$ "
				+ cadastro.getSalarioMinimo());
		dadosFichaProfissional.append("\nData de Nasc.: " + cadastro.getDataNacimento() + " CPF: " + cadastro.getCpf()
				+ " RG: " + cadastro.getRg());
		dadosFichaProfissional.append("\nEndere�o: " + cadastro.getLogradouro());
		dadosFichaProfissional.append("\nN�: " + cadastro.getNumeroResidencial() + " Bairro: " + cadastro.getBairro()
				+ " Munic�pio: " + cadastro.getMunicipio() + " UF: " + cadastro.getUf());
		dadosFichaProfissional.append("\nCep: " + cadastro.getCep() + " Naturalidade: " + cadastro.getNaturalidade()
				+ " Pa�s: " + cadastro.getPais());
		dadosFichaProfissional.append("\nTelefone: " + cadastro.getTelefone() + " Celular: " + cadastro.getCelular()); // adicionar
																														// ddd
																														// +
																														// numero
		dadosFichaProfissional.append("\nE-Mail: " + cadastro.getEmail());
		dadosFichaProfissional.append("\n");
		
		
		System.out.println(dadosFichaProfissional);

	}

}
