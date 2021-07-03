package com.example.bancodesangue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Doador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String nome;
    private String cpf;
    private String rg;
    private LocalDate data_nasc;
    private String sexo;
    private String nome_mae;
    private String nome_pai;

    private String email;
    private String tel_fixo;
    private String celular;
    private Float altura;
    private Float peso;
    private String tipo_sanguineo;

    @Embedded
    private Endereco endereco;
}
