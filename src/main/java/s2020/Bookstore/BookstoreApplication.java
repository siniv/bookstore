package s2020.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import s2020.Bookstore.domain.Book;
import s2020.Bookstore.domain.BookRepository;
import s2020.Bookstore.domain.Category;
import s2020.Bookstore.domain.CategoryRepository;
import s2020.Bookstore.domain.User;
import s2020.Bookstore.domain.UserRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository brepository, CategoryRepository crepository, UserRepository urepository) {
		return (args) -> {
			crepository.save(new Category("Romance"));
			crepository.save(new Category("Horror"));
			
			brepository.save(new Book("JokuKirja", "JokuKirjoittaja", 2020, "ISBN1234", 100, crepository.findByName("Romance").get(0)));
			brepository.save(new Book("JokuToinen", "ToinenKirjoittaja", 2019, "ISBN1235", 90, crepository.findByName("Horror").get(0)));
			
			// Create users: admin/admin user/user
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			
		};
	}

}
