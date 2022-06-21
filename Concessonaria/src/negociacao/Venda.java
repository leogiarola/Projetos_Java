package negociacao;

import java.sql.Date;




public class Venda {
	String cliente;
	String tipoDeVeiculo;
	Date dataVenda;
	
	public String getCliente() {
		return cliente;
	}
	public String getTipoDeVeiculo() {
		return tipoDeVeiculo;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setTipoDeVeiculo(String tipoDeVeiculo) {
		this.tipoDeVeiculo = tipoDeVeiculo;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
}
