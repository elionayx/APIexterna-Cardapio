package com.example.mockapi.cardapio_mock_api.model;

import java.math.BigDecimal;

public class ItemSimuladoDTO {
    public long idExterno;
    public String nome;
    public BigDecimal preco;
    public String descricao;
    public String categoria;

    public ItemSimuladoDTO(long idExterno, String nome, BigDecimal preco, String descricao, String categoria) {
        this.idExterno = idExterno;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
    }
}
