package model;

import java.sql.Date;

public class Vistoria {
	private int idVistoria;
	private Date dataVistoria;
	private String itensVerificados;
	private String observacoes;
	private int idAgendamento;
	private int idFuncionario;
	
public Vistoria() {
}

//Construtor

public Vistoria(int idVistoria, Date dataVistoria, String itensVerificados, 
		String observacoes, int idAgendamento, int idFuncionario) {
	
	this.idVistoria = idVistoria;
	this.dataVistoria = dataVistoria;
	this.itensVerificados = itensVerificados;
	this.observacoes = observacoes;
	this.idAgendamento = idAgendamento;
	this.idFuncionario = idFuncionario;	
}

//Getters

public int getIdVistoria() {
	return idVistoria;
}

public Date getDataVistoria() {
	return dataVistoria;
}

public String getItensVerificados() {
	return itensVerificados;
}

public String getObservacoes() {
	return observacoes;
}

public int getIdAgendamento() {
	return idAgendamento;
}

public int getIdFuncionario() {
	return idFuncionario;
}

//Setters

public void setIdVistoria(int idVistoria) {
	this.idVistoria = idVistoria;
}

public void setDataVistoria(Date dataVistoria) {
	this.dataVistoria = dataVistoria;
}

public void setItensVerificados(String itensVerificados) {
	this.itensVerificados = itensVerificados;
}

public void setObservacoes(String observacoes) {
	this.observacoes = observacoes;
}

public void setIdAgendamento(int idAgendamento) {
	this.idAgendamento = idAgendamento;
}

public void setiIdFuncionario(int idFuncionario) {
	this.idFuncionario = idFuncionario;
}

//Transforma objeto em uma String legível

public String toString() {
	return String.format(
			"Vistoria {idVistoria=%d, dataVistoria=%s, itensVerificados=%s, observacoes=%s, idAgendamento=%d, "
			+ "idFuncionario=%d}");
	}
}
