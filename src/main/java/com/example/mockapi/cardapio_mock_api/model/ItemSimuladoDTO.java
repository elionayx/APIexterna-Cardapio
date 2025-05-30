package com.example.mockapi.cardapio_mock_api.model;

public class ItemSimuladoDTO {
    private String nome;
    private String descricao;
    private Double preco;
    private CategoriaItem categoria;

    public ItemSimuladoDTO() {}

    public ItemSimuladoDTO(String nome, String descricao, Double preco, CategoriaItem categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public CategoriaItem getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setCategoria(CategoriaItem categoria) {
        this.categoria = categoria;
    }
}
