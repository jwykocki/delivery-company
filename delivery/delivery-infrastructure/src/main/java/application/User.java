package application;

import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;

    public User(String name, String mail) {
        this.name = name;
        this.email = mail;
    }

    public User() {

    }

    public String toString(){

        return this.name + " " + this.email;
    }

}
