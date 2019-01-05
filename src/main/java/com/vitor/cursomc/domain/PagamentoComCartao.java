package com.vitor.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import com.vitor.cursomc.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComCartao extends Pagamento implements Serializable {
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
