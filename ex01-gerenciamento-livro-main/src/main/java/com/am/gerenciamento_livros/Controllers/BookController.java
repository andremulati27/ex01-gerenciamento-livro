package com.am.gerenciamento_livros.Controllers;

import com.am.gerenciamento_livros.Repositories.BookRepository;
import com.am.gerenciamento_livros.models.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {





    @Autowired
    private BookRepository bookRepository;

    // LISTA TODOS OS LIVROS
    @GetMapping
    public List<BookModel> listarLivros() {
        return bookRepository.findAll();
    }

    // BUSCA LIVRO POR ID
    @GetMapping("/{id}")
    public BookModel buscarLivro(@PathVariable Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // CRIA LIVRO
    @PostMapping
    public BookModel criarLivro(@RequestBody BookModel book) {
        return bookRepository.save(book);
    }

    // ATUALIZA LIVRO
    @PutMapping("/{id}")
    public BookModel atualizarLivro(@PathVariable Long id, @RequestBody BookModel book) {
        book.setId(id);
        return bookRepository.save(book);
    }

    // DELETA LIVRO
    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
