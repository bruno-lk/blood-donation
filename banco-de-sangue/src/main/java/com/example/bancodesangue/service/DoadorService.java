package com.example.bancodesangue.service;

import com.example.bancodesangue.entity.Doador;
import com.example.bancodesangue.repository.DoadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoadorService {

    private DoadorRepository doadorRepository;

    public DoadorService(DoadorRepository doadorRepository){
        this.doadorRepository = doadorRepository;
    }

    public Iterable<Doador> findAll(){
        return doadorRepository.findAll();
    }

    public Doador save(Doador doador){
        return doadorRepository.save(doador);
    }

    public Iterable<Doador> saveAll(List<Doador> doadores){
        return doadorRepository.saveAll(doadores);
    }
}
