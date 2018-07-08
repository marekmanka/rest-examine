package pl.sda.restexample.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Post addNewPost(@RequestBody Post postToAdd){
        return null;
    }


}
