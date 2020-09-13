package s2020.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import s2020.Bookstore.domain.Book;
import s2020.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			Book uusi = new Book("JokuKirja", "JokuKirjoittaja", 2020, "ISBN1234", 100);
			Book uusi2 = new Book("JokuToinen", "ToinenKirjoittaja", 2019, "ISBN1235", 90);
			
			repository.save(uusi);
			repository.save(uusi2);
		};
	}

}
