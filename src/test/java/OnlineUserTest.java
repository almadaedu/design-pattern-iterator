import iterator.OnlineUser;
import iterator.SocialMedia;
import iterator.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OnlineUserTest {

    @Test
    void contarUsuariosOnline() {
        SocialMedia socialMedia = new SocialMedia(
                new User("Marco", true),
                new User("Antonio", true),
                new User("Jose", false),
                new User("Maria", true)
        );
        assertEquals(3, OnlineUser.contarUsuariosOnline(socialMedia));
    }

    @Test
    void deveContarTotalUsuarios() {
        SocialMedia socialMedia = new SocialMedia(
                new User("Marco", true),
                new User("Antonio", true),
                new User("Jose", false),
                new User("Maria", true)
        );
        assertEquals(4, OnlineUser.contarTotalAlunosCurso(socialMedia));
    }
}
