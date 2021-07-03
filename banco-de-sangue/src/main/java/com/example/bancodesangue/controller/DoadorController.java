package com.example.bancodesangue.controller;

import com.example.bancodesangue.entity.Doador;
import com.example.bancodesangue.service.DoadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doador")
public class DoadorController {

    private DoadorService doadorService;

    public DoadorController(DoadorService doadorService) {
        this.doadorService = doadorService;
    }

    @GetMapping
    public List<Doador> findAll(){
            return doadorService.findAll();
    }
}
