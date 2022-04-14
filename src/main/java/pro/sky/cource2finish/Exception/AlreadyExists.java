package pro.sky.cource2finish.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AlreadyExists extends RuntimeException {
    public AlreadyExists() {
    }

    public AlreadyExists(String s) {
        super(s);
    }
}
