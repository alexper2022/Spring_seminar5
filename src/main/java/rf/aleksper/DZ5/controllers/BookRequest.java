package rf.aleksper.DZ5.controllers;

import lombok.Data;

@Data
public class BookRequest {
    private final long bookId;
    private final String bookName;
}
