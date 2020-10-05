package s2020.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import s2020.Bookstore.domain.Book;
import s2020.Bookstore.domain.BookRepository;
import s2020.Bookstore.domain.Category;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {
	
	@Autowired
	private BookRepository repository;
	
    @Test
    public void findByLastnameShouldReturnStudent() {
        List<Book> books = repository.findByTitle("JokuKirja");
        
        assertThat(books).hasSize(1);
        assertThat(books.get(0).getAuthor()).isEqualTo("JokuKirjoittaja");
    }
    
    @Test
    public void createNewStudent() {
    	Book book = new Book("JokuKolmas", "KolmasKirjoittaja", 2018, "ISBN1236", 30, new Category("Love"));
    	repository.save(book);
    	assertThat(book.getId()).isNotNull();
    }    

}
