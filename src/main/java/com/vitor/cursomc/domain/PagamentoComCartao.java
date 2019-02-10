package com.vitor.cursomc.domain;



import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.vitor.cursomc.domain.enums.EstadoPagamento;
@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	private Integer numerodeparcelas;

	public PagamentoComCartao() {
		super();
	}

	public PagamentoComCartao(Integer numerodeparcelas) {
		super();
		this.setNumerodeparcelas(numerodeparcelas);
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.setNumerodeparcelas(numeroDeParcelas);
	}

	public Integer getNumerodeparcelas() {
		return numerodeparcelas;
	}

	public void setNumerodeparcelas(Integer numerodeparcelas) {
		this.numerodeparcelas = numerodeparcelas;
	}
	
	
}
