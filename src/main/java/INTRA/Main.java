package INTRA;

import INTRA.persistence.PostRepository;
import INTRA.service.PostService;
import lombok.var;

public class Main {
    public static void main ( String[] args ) {
        PostService postService = new PostService( new PostRepository() );

        var posteurId = postService.addUser( "Posteur1" );
        var commenteurID = postService.addUser( "Commentateur1" );
        var postId = postService.addUser( "Mon 1er post" );
        postService.addComment(commenteurID, postId, "Mon commentaire");

    }
}
