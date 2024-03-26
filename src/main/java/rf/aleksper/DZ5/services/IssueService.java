package rf.aleksper.DZ5.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import rf.aleksper.DZ5.entity.Issue;
import rf.aleksper.DZ5.repository.BookRepository;
import rf.aleksper.DZ5.repository.IssueRepository;
import rf.aleksper.DZ5.repository.ReaderRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@AllArgsConstructor
@Service
public class IssueService {
    private final BookRepository bookRepository;
    private final IssueRepository issueRepository;
    private final ReaderRepository readerRepository;


    public Issue createIssue(long readerId, long bokId) {
        if (bookRepository.findById(bokId) == null) {
            log.info("Не удалось найти книгу с id " + bokId);
            throw new NoSuchElementException("Не удалось найти книгу с id " + bokId);
        }
        if (readerRepository.findById(readerId) == null) {
            log.info("Не удалось найти читателя с id " + readerId);
            throw new NoSuchElementException("Не удалось найти читателя с id " + readerId);
        }
        return issueRepository.save(new Issue(readerId, bokId));
    }

    public Issue findBookInIssue(long bookId) {
        return issueRepository.findByBookId(bookId);
    }

    public List<Issue> isReaderIssueBook(long id) {
        return issueRepository.findAllByReaderId(id);
    }

    public List<Issue> findIssueForReader(long readerId) {
        return issueRepository.findAllByReaderId(readerId);
    }

    public List<Issue> allIssues() {
        return issueRepository.findAll();
    }
}
