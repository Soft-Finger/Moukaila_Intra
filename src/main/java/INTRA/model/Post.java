package INTRA.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String postData ;
    @OneToMany(mappedBy = "post")
    private List<User> listUsers = new ArrayList<>();

}
