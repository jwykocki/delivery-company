package application;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customers")

public class Customer {
    @Id
    private long id;
    String name;
    String email;
    String address;

    public Customer(String name, String email, String address) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Customer() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
