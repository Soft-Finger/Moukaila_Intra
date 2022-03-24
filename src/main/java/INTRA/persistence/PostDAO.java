package INTRA.persistence;

public interface PostDAO {
    void addUser(String nom);
    void addPost(Long id, String post);
    void addComment(String commenteurId, String commentateur);
}
