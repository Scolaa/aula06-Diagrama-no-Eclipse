package br.com.db1startrecibo;

import java.util.Date;
import java.util.List;

public class Recibo {

	
	public Integer numero;
	public Double valor;
	public Date dataCadastro;
	public Boolean confirmacao;
	public Date dataEmissao;
	public String dataDoRecibo;
	public Emitente emitente;
	public List<Servico> servico;
	public Cidade cidade;
	public Pagador pagador; 
	
	public String getValorDescrito(){
		return "";
	}
	public String getDataDaEmissao(){
		return "";
	}
}
