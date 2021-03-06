package br.com.wellingtoncosta.bookservice.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Wellington Costa on 30/11/2018.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(String title, String author) {
        super("A book already exists in database with the same title: " + title + ", and author: " + author + ".");
    }

}
