package rf.aleksper.DZ5;

import lombok.AllArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import rf.aleksper.DZ5.services.BookService;
import rf.aleksper.DZ5.services.IssueService;
import rf.aleksper.DZ5.services.ReaderService;

@Component
@AllArgsConstructor
public class CreateBase {
    private BookService bookServicey;
    private ReaderService readerService;
    private IssueService issueService;

    @EventListener(ContextRefreshedEvent.class)
    public void createdBbase() {
        bookServicey.addBook("Война и мир");
        bookServicey.addBook("Мастер и Маргарита");
        bookServicey.addBook("Приключения Буратино");

        readerService.addReader("Евгений Иванович Трошкин");
        readerService.addReader("Гаврила Петрович Шереметьев");
        readerService.addReader("Фёдор Петрович Ермаков");
        readerService.addReader("Василий Алибабаевич Алибаба");

        issueService.createIssue(0, 0);
        issueService.createIssue(1, 1);
        issueService.createIssue(2, 2);
    }

}
