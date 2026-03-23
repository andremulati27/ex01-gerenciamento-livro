package com.am.gerenciamento_livros.Repositories;

import com.am.gerenciamento_livros.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Long> {

}
