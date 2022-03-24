package INTRA.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private Date datepost;
    private String postData ;
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "post")
    List<PostComment> postComments = new ArrayList<>();

}
