package s2020.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import s2020.Bookstore.domain.Book;
import s2020.Bookstore.domain.BookRepository;
import s2020.Bookstore.domain.Category;
import s2020.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository brepository, CategoryRepository crepository) {
		return (args) -> {
			crepository.save(new Category("Romance"));
			crepository.save(new Category("Horror"));
			
			brepository.save(new Book("JokuKirja", "JokuKirjoittaja", 2020, "ISBN1234", 100, crepository.findByName("Romance").get(0)));
			brepository.save(new Book("JokuToinen", "ToinenKirjoittaja", 2019, "ISBN1235", 90, crepository.findByName("Horror").get(0)));
			
		};
	}

}
