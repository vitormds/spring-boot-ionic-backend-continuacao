package com.vitor.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import com.vitor.cursomc.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComBoleto extends Pagamento  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	
	
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date datapagamento) {
		super(id, estado, pedido);
		this.dataPagamento = datapagamento;
		this.dataVencimento = dataVencimento;
	}
	public PagamentoComBoleto() {
		
	}
	public PagamentoComBoleto(Date dataVencimento, Date dataPagamento) {
		super();
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	

}
