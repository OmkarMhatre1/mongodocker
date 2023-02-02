package mongodocker.service;

import lombok.RequiredArgsConstructor;
import mongodocker.entity.Book;
import mongodocker.repo.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepo repo;

    public List<Book> getAll() {
        return repo.findAll();
    }

    public Book saveBook(Book book){
        return repo.save(book);
    }
}
