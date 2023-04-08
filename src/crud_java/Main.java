package crud_java;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		
		PacienteDAO pacienteDao = new PacienteDAO();

		Paciente p = new Paciente();
		p.setNome("Tassi");
		p.setCpf("01685946097");
		p.setDtnasc(new Date(19/07/1988));
		p.setSexo("f");
		p.setEndereco("Rua tal");
		p.setFone("123456789");
		p.setTiposangue("A-");
		p.setHistoricofamilia("diabete, pressão alta");
		p.setDoencas_antigas("catapora, pneumonia, gripe");
		p.setDoencas_atuais("nenhuma");
		p.setCondicoes("renite alérgica");

		//pacienteDao.cadastrar_dados(p);
		
		Paciente p1 = new Paciente();
		p1.setIdPaciente(12);
		p1.setNome("Tassiana");
		p1.setCpf("01685946097");
		p1.setDtnasc(new Date(19/07/1988));
		p1.setSexo("f");
		p1.setEndereco("Rua tal");
		p1.setFone("123456789");
		p1.setTiposangue("A-");
		p1.setHistoricofamilia("diabete, pressão alta");
		p1.setDoencas_antigas("catapora, pneumonia, gripe");
		p1.setDoencas_atuais("nenhuma");
		p1.setCondicoes("renite alérgica");
		p1.setIdPaciente(2);
		
		//pacienteDao.alterar_dados(p1);
		
		pacienteDao.deletar_dados(1);
		
		for(Paciente paciente : pacienteDao.visualizar_dados()) {
			System.out.println("ID: " + paciente.getIdPaciente());
			System.out.println("Paciente: " + paciente.getNome());
			System.out.println("CPF: " + paciente.getCpf());
			System.out.println("Data Nascimento: " + new java.sql.Date(paciente.getDtnasc().getTime()));
			System.out.println("Sexo: " + paciente.getSexo());
			System.out.println("Endereço: " + paciente.getEndereco());
			System.out.println("Telefone: " + paciente.getFone());
			System.out.println("Tipo Sanguíneo: " + paciente.getTiposangue());
			System.out.println("Histórico Familiar: " + paciente.getHistoricofamilia());
			System.out.println("Doenças que já teve: " + paciente.getDoencas_antigas());
			System.out.println("Doenças que possui: " + paciente.getDoencas_atuais());
			System.out.println("Condições: " + paciente.getCondicoes());
			
		}

	}

}
