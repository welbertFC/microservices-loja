package br.com.microservice.loja.service;

import br.com.microservice.loja.dto.CompraDto;
import br.com.microservice.loja.dto.InfoFornecedorDto;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {


    public void realizaCompra(CompraDto compraDto) {
        var cliente = new RestTemplate();
        var exchange =  cliente.exchange("http://localhots:8081/info/" + compraDto.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDto.class);
        System.out.println(exchange.getBody().getEndereco());
    }
}
