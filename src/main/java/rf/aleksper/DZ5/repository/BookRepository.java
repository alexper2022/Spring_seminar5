package rf.aleksper.DZ5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rf.aleksper.DZ5.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
