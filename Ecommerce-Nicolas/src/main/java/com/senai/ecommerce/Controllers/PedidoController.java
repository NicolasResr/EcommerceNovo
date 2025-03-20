package com.senai.ecommerce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.ecommerce.dto.PedidoDTO;
import com.senai.ecommerce.services.PedidoService;

@RequestMapping("pedido")
@RestController
public class PedidoController {
	
	@Autowired
	PedidoService pedidoService;
	
	@PostMapping
	public ResponseEntity<PedidoDTO> inserir(@RequestBody PedidoDTO pedidoDTO){
		pedidoDTO = pedidoService.inserir(pedidoDTO);
		return ResponseEntity.ok(pedidoDTO);
	}
	
	
	

}
