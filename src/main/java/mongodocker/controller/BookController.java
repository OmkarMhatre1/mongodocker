package mongodocker.controller;

import lombok.RequiredArgsConstructor;
import mongodocker.entity.Book;
import mongodocker.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PostMapping
    public Book create(@RequestBody Book book){
        return bookService.saveBook(book);
    }
}
