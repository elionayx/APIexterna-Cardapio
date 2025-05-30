// src/main/java/com/example/mockapi/controller/CardapioController.java
package com.example.mockapi.cardapio_mock_api.controller;

import com.example.mockapi.cardapio_mock_api.model.ItemSimuladoDTO;
import com.example.mockapi.cardapio_mock_api.service.CardapioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cardapio") // O prefixo base para os endpoints desta API
public class CardapioController {
    private final CardapioService cardapioService;

    public CardapioController(CardapioService cardapioService) {
        this.cardapioService = cardapioService;
    }

    @GetMapping
    public List<ItemSimuladoDTO> listar() {
        return this.cardapioService.listar();
    }
}