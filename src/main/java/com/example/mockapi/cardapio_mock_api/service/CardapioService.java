package com.example.mockapi.cardapio_mock_api.service;

import com.example.mockapi.cardapio_mock_api.model.ItemSimuladoDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CardapioService {
    private final List<ItemSimuladoDTO> dados = Arrays.asList(
            new ItemSimuladoDTO(101L, "Pizza Margherita (Externa)", new BigDecimal("50.00"), "Clássica pizza italiana.", "Pizzas"),
            new ItemSimuladoDTO(102L, "Lasanha Bolonhesa (Externa)", new BigDecimal("42.00"), "Lasanha tradicional com molho à bolonhesa.", "Massas"),
            new ItemSimuladoDTO(103L, "Risoto de Cogumelos (Externa)", new BigDecimal("55.00"), "Risoto cremoso com cogumelos frescos.", "Pratos Principais"),
            new ItemSimuladoDTO(104L, "Brownie com Sorvete (Externa)", new BigDecimal("25.00"), "Brownie quente com uma bola de sorvete de creme.", "Sobremesas"),
            new ItemSimuladoDTO(105L, "Água Mineral (Externa)", new BigDecimal("5.00"), "Garrafa de 500ml.", "Bebidas"),
            new ItemSimuladoDTO(106L, "Suco Natural de Laranja (Externa)", new BigDecimal("12.00"), "Suco fresco e natural.", "Bebidas")
    );

    public List<ItemSimuladoDTO> listar() {
        return this.dados;
    }

    public List<ItemSimuladoDTO> filtrar(List<Long> ids) {
        List<ItemSimuladoDTO> items = new ArrayList<>();
        for (Long value: ids) {
            for (ItemSimuladoDTO item: this.dados) {
                if(value == item.idExterno) {
                    items.add(item);
                }
            }
        }
        return items;
    }

    public ItemSimuladoDTO recuperar(long id) {
        ItemSimuladoDTO itemSimuladoDTO = null;
        for (ItemSimuladoDTO item: this.dados) {
            if (item.idExterno == id) {
                itemSimuladoDTO = item;
            }
        }

        if (itemSimuladoDTO == null) {
            throw new NoSuchElementException("Item não encontrado!");
        }

        return itemSimuladoDTO;
    }
}
