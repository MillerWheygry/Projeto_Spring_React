package br.com.api.produtos.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//essas dua anotacoes vai criar automaticamente tabelas no banco de dados
@Entity
@Table(name = "produtos")
@Getter
@Setter
public class ProdutoModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long codigo;
    private String nome;
    private String marca;
}
