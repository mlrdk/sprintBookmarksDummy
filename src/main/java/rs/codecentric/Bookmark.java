package rs.codecentric;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.awt.print.Book;


@Entity
public class Bookmark {

    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private Long id;

    Bookmark(){
        // jpa only
    }

    public Bookmark(Account account, String uri, String description){
        this.uri = uri;
        this.descritpion = description;
        this.account = account;
    }

    public String uri;
    public String descritpion;

    public Account getAccount() {
        return account;
    }

    public Long getId(){
        return id;
    }

    public String getUri() {
        return uri;
    }

    public String getDescritpion() {
        return descritpion;
    }
}
