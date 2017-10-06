package ee3.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserMongo {
    @Id
    @GeneratedValue
    private String id;

    @Column(unique = true, length = 7, nullable = false)
    private String name;

    public UserMongo(String name) {
        this.name = name;
    }

    public UserMongo() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
