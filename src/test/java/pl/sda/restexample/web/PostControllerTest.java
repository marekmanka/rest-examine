package pl.sda.restexample.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(PostController.class)

public class PostControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void shouldReturnCreatedPost(){
        //given
        Post postToAdd = new Post();
        //when

        //then

    }


}
