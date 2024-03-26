package rf.aleksper.DZ5.controllers;

import lombok.Data;

@Data
public class IssueRequest {
    private long readerId;
    private long bookId;
}
