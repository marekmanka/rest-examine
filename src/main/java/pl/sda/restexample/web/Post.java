package pl.sda.restexample.web;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor


public class Post {

    @Id
    @GeneratedValue
    public long id;
    public String title;
    public String message;

    public Post(String title, String message) {
        this.title = title;
        this.message = message;
    }
}
