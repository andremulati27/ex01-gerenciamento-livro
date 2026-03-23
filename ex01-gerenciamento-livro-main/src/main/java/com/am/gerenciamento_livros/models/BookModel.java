package com.am.gerenciamento_livros.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Titulo;
    private String Autor;
    private Integer AnoPublicacao;


    public BookModel(){
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public Integer getAnoPublicacao() {
        return AnoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        AnoPublicacao = anoPublicacao;
    }

}
