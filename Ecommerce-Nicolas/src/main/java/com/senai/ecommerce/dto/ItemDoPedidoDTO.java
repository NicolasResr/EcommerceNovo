package com.senai.ecommerce.dto;

import com.senai.ecommerce.entities.ItemDoPedidoPK;

public class ItemDoPedidoDTO {
	
	private ItemDoPedidoPK id = new ItemDoPedidoPK();
	private Integer quantidade;
	private double preco;
	
	public ItemDoPedidoDTO() {
	}

	public ItemDoPedidoDTO(ItemDoPedidoPK id, Integer quantidade, double preco) {
		this.id = id;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public ItemDoPedidoPK getId() {
		return id;
	}

	public void setId(ItemDoPedidoPK id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
