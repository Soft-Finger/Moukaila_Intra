package INTRA.service;

import INTRA.persistence.PostDAO;

public class PostService {
    private PostDAO postDAO;

    public PostService ( PostDAO postDAO ) {
        this.postDAO = postDAO;
    }

    public String addUser(String nom) {
        postDAO.addUser( nom );
        return nom;
    }

    public void addComment(String commenteurId, String postId, String commentaire) {

    }
}
