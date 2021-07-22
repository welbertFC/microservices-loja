package br.com.microservice.loja.controllers;

import br.com.microservice.loja.dto.CompraDto;
import br.com.microservice.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<?> realizarCompra(@RequestBody CompraDto compraDto){
        compraService.realizaCompra(compraDto);
        return ResponseEntity.ok().build();


    }
}
