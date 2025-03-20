package com.senai.ecommerce.dto;

import java.time.Instant;

import com.senai.ecommerce.entities.Pedido;
import com.senai.ecommerce.enun.StatusDoPedido;

public  class PedidoDTO {
	private Long id;
	private Instant momento;
	private StatusDoPedido Status;
	private Long clienteId;
	
	public PedidoDTO() {
	}

	public PedidoDTO(Long id, Instant momento, StatusDoPedido status, Long clienteId) {
		this.id = id;
		this.momento = momento;
		this.Status = status;
		this.clienteId = clienteId;
	}
	
	public PedidoDTO(Pedido entity) {
		id = entity.getId();
		momento = entity.getMomento();
		Status = entity.getStatus();
		clienteId = entity.getCliente().getId();
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return Status;
	}

	public void setStatus(StatusDoPedido status) {
		Status = status;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	
	
}