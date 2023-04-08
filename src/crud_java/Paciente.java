package crud_java;

import java.util.Date;

public class Paciente {
	
	private int idPaciente;
	private String nome;
	private String cpf;
	private Date dtnasc;
	private String sexo;
	private String endereco;
	private String fone;
	private String tiposangue;
	private String historicofamilia;
	private String doencas_antigas;
	private String doencas_atuais;
	private String condicoes;
	

	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getTiposangue() {
		return tiposangue;
	}
	public void setTiposangue(String tiposangue) {
		this.tiposangue = tiposangue;
	}
	public String getHistoricofamilia() {
		return historicofamilia;
	}
	public void setHistoricofamilia(String historicofamilia) {
		this.historicofamilia = historicofamilia;
	}
	public String getDoencas_antigas() {
		return doencas_antigas;
	}
	public void setDoencas_antigas(String doencas_antigas) {
		this.doencas_antigas = doencas_antigas;
	}
	public String getDoencas_atuais() {
		return doencas_atuais;
	}
	public void setDoencas_atuais(String doencas_atuais) {
		this.doencas_atuais = doencas_atuais;
	}
	public String getCondicoes() {
		return condicoes;
	}
	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
	}
}
