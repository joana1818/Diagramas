package Biblioteca;

import java.util.ArrayList;
import java.util.Date;

class Livro {
    String titulo;
    String isbn;
    ArrayList<Autor> autores;
    Editora editora;

    public Livro(String titulo, Editora ed) {
        this.titulo = titulo;
        this.editora = ed;
        autores = new ArrayList<>();
    }
}

class Autor {
    String nome;
    ArrayList<Livro> livros;

    public Autor(String nome) {
        this.nome = nome;
        livros = new ArrayList<>();
    }
}

class Editora {
    String nome;

    public Editora(String nome) {
        this.nome = nome;
    }
}

class BibliotecaUniversitaria {
    String nome;
    ArrayList<Exemplar> exemplares;

    public BibliotecaUniversitaria(String nome) {
        this.nome = nome;
        exemplares = new ArrayList<>();
    }
}

class Exemplar {
    String codigo;
    Livro livro;
    BibliotecaUniversitaria biblioteca;
    boolean disponivel;

    public Exemplar(String cod, Livro l, BibliotecaUniversitaria bib) {
        codigo = cod;
        livro = l;
        biblioteca = bib;
        disponivel = true;
    }
}

class Usuario {
    String nome;
    String matricula;

    public Usuario(String nome, String mat) {
        this.nome = nome;
        this.matricula = mat;
    }
}

class Reserva {
    Usuario usuario;
    Livro livro;
    Date dataSolicitacao;
    Date dataExpiracao;

    public Reserva(Usuario u, Livro l) {
        usuario = u;
        livro = l;
        dataSolicitacao = new Date();
        dataExpiracao = new Date();
    }
}

class Emprestimo {
    Usuario usuario;
    Exemplar exemplar;
    Date dataRetirada;
    Date dataDevolucao;

    public Emprestimo(Usuario u, Exemplar ex) {
        usuario = u;
        exemplar = ex;
        dataRetirada = new Date();
    }
}