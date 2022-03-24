package INTRA.persistence;

import INTRA.model.PostComment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PostRepository implements PostDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory( "intra" );
    EntityManager em = emf.createEntityManager();

    public <T> void save(T t) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(t);

        em.getTransaction().commit();
        em.close();

    }

    public <T> void merge(T t) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.merge(t);

        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void addUser ( String nom ) {
       save( nom );
    }

    @Override
    public void addPost ( Long id , String post ) {

    }

    @Override
    public void addComment ( String commenteurId , String commentateur ) {

    }

    @Override
    public Long ceatePosteur ( Long id ) {
        PostComment postComment = new PostComment();
        return postComment.getId();
    }

    @Override
    public Long ceatePosteur ( String posteur ) {
        final PostComment postComment = new PostComment(posteur);
        return null;
    }
}
