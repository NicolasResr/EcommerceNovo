package com.senai.ecommerce.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.ecommerce.dto.PedidoDTO;
import com.senai.ecommerce.entities.Pedido;
import com.senai.ecommerce.entities.Usuario;
import com.senai.ecommerce.enun.StatusDoPedido;
import com.senai.ecommerce.repositories.PedidoRepository;
import com.senai.ecommerce.repositories.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
public class PedidoService {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@Transactional
	public PedidoDTO inserir(PedidoDTO pedidoDto) {
		//Pulling moment and order status
		Pedido pedido = new Pedido();
		pedido.setMomento(Instant.now());
		pedido.setStatus(StatusDoPedido.AGUARDANDO_PAGAMENTO);
		 
		Usuario cliente = usuarioRepository.findById(pedidoDto.getClienteId()).orElseThrow(() -> 
	            new IllegalArgumentException("Cliente não encontrado"));
	        pedido.setCliente(cliente);
		
	    
		pedido = pedidoRepository.save(pedido);
		return new PedidoDTO(pedido);
	}

}
