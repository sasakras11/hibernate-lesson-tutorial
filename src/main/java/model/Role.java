package model;


import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "roles")
public class Role extends Model {

    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy = "roles")
   private Set<User> users;

    public Role() {

    }
    public Role(Long id){
        super(id);
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
