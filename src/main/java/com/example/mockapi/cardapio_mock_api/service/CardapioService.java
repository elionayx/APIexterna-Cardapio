package com.example.mockapi.cardapio_mock_api.service;

import com.example.mockapi.cardapio_mock_api.model.CategoriaItem;
import com.example.mockapi.cardapio_mock_api.model.ItemSimuladoDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CardapioService {
    public final List<ItemSimuladoDTO> dados = Arrays.asList(
            new ItemSimuladoDTO("Pizza Margherita", "Molho de tomate, mussarela e manjericão fresco", 35.90, CategoriaItem.PRATO_PRINCIPAL),
            new ItemSimuladoDTO("Pizza Calabresa", "Molho, mussarela, calabresa e cebola", 42.50, CategoriaItem.PRATO_PRINCIPAL),
            new ItemSimuladoDTO("Pizza Quatro Queijos", "Molho, mussarela, parmesão, gorgonzola e catupiry", 47.00, CategoriaItem.PRATO_PRINCIPAL),
            new ItemSimuladoDTO("Suco de Laranja", "Suco natural de laranja", 8.50, CategoriaItem.BEBIDA),
            new ItemSimuladoDTO("Refrigerante Lata", "Lata 350ml - Coca, Guaraná ou Fanta", 6.00, CategoriaItem.BEBIDA),
            new ItemSimuladoDTO("Água Mineral", "Água mineral sem gás 500ml", 4.00, CategoriaItem.BEBIDA),
            new ItemSimuladoDTO("Hambúrguer Artesanal", "Pão brioche, hambúrguer 180g, queijo cheddar, alface, tomate e maionese da casa", 29.90, CategoriaItem.SOBREMESA),
            new ItemSimuladoDTO("Batata Frita", "Porção de batata frita crocante", 14.90, CategoriaItem.SOBREMESA),
            new ItemSimuladoDTO("Pudim de Leite", "Pudim de leite condensado tradicional", 9.90, CategoriaItem.SOBREMESA),
            new ItemSimuladoDTO("Brownie com Sorvete", "Brownie de chocolate com uma bola de sorvete de creme", 12.90, CategoriaItem.SOBREMESA)
    );

    public List<ItemSimuladoDTO> listar() {
        return this.dados;
    }
}
