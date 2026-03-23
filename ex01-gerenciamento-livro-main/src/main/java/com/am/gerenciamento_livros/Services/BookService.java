package com.am.gerenciamento_livros.Services;

import com.am.gerenciamento_livros.Repositories.BookRepository;
import com.am.gerenciamento_livros.models.BookModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BookService {
    @Autowired
    private BookRepository livroRepository;

    public List<BookModel> findAll(){
        return livroRepository.findAll();
    }

    public BookModel criarLivro(BookModel livro){
        return livroRepository.save(livro);
    }

    public Optional<BookModel> buscarId(Long id){
        return livroRepository.findById(id);
    }

    public BookModel atualizarAutor(Long id, BookModel livro){
        BookModel model = livroRepository.findById(id).get();

        model.setAutor(livro.getAutor());

        return livroRepository.save(model);
    }

    public void deletar(Long id){
        livroRepository.deleteById(id);
    }
}

