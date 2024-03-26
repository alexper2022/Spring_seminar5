package rf.aleksper.DZ5.controllers;

import lombok.Data;

@Data
public class ReaderRequest {
    private final long readerId;
    private final String readerName;
}
