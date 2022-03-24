package INTRA.service;

import INTRA.persistence.PostDAO;

public class PostService {
    private PostDAO postDAO;

    public PostService ( PostDAO postDAO ) {
        this.postDAO = postDAO;
    }

    public void addUser(String nom) {
        postDAO.addUser( nom );
    }

    public void addComment(String commenteurId, String postId, String commentaire) {

    }
}
