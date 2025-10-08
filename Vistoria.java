package model;

import java.sql.Date;

public class Vistoria {
	private int idVistoria;
	private Date dataVistoria;
	private String itensVerificados;
	private String observacao;
	private int idAgendamento;
	private int idFuncionarios;
	
public Vistoria() {
}

//Construtor

public Vistoria(int idVistoria, Date dataVistoria, String itens_Verificados, 
		String observacao, int id_Agendamento, int id_Funcionarios) {
	
	this.idVistoria = idVistoria;
	this.dataVistoria = dataVistoria;
	this.itensVerificados = itens_Verificados;
	this.observacao = observacao;
	this.idAgendamento = id_Agendamento;
	this.idFuncionarios = id_Funcionarios;	
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

public String getObservacao() {
	return observacao;
}

public int getIdAgendamento() {
	return idAgendamento;
}

public int getIdFuncionario() {
	return idFuncionarios;
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

public void setObservacao(String observacao) {
	this.observacao = observacao;
}

public void setIdAgendamento(int idAgendamento) {
	this.idAgendamento = idAgendamento;
}

public void setIdFuncionarios(int idFuncionario) {
	this.idFuncionarios = idFuncionario;
}

//Transforma objeto em uma String legível

public String toString() {
	return String.format(
			"Vistoria {idVistoria=%d, dataVistoria=%s, itensVerificados=%s, observacao=%s, idAgendamento=%d, "
			+ "idFuncionarios=%d}");
	}
}
