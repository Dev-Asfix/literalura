package com.alura.literatura.model;

import jakarta.persistence.*;

import java.util.List;

//@Entity
//@Table(name = "libros")
public class Libros {
  //  @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    //@Column(unique = true)
    private String titulo;

    private List<Autores> autores;
    private List<String> idiomas;
    private Integer descargas;

    public Libros(DatosLibros datosLibros) {
        this.titulo = datosLibros.titulo();
        this.idiomas = datosLibros.idiomas();
        this.descargas = datosLibros.descargas();

    }

    public Integer getDescargas() {
        return descargas;
    }

    public void setDescargas(Integer descargas) {
        this.descargas = descargas;
    }

    public List<String> getLenguajes() {
        return idiomas;
    }

    public void setLenguajes(List<String> lenguajes) {
        this.idiomas = lenguajes;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public List<Autores> getAutores() {
        return autores;
    }

    public void setAutores(List<Autores> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return
                "-----------------" +
                        "\n📚 Título: '" + titulo +
                        "\n✍️ Autores:  " + autores +
                        "\n🌍 Idiomas: " + idiomas +
                        "\n⬇️ Descargas: " + descargas
                ;
    }
}
