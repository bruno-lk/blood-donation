package com.example.bancodesangue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "tb_doadores")
public class Doador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private String mae;
    private String pai;
    private String cep;
    private String endereco;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;
    private String telefone_fixo;
    private String celular;
    private Float altura;
    private Float peso;
    private String tipo_sanguineo;
    private String data_nasc;

    public Doador() {}

}
