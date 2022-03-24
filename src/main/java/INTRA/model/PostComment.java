package INTRA.model;


import javafx.geometry.Pos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostComment {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;
    private String commentaire;

    @ManyToOne
    private Post post;

    @OneToOne
    private User user;

    public PostComment ( String posteur ) {
        this.nom = posteur;
    }
}
