package iterator;
import java.util.Iterator;

public class OnlineUser {
    public static Integer contarUsuariosOnline(SocialMedia socialMedia) {
        int quantidade = 0;
        for (User user : socialMedia) {
            if (user.isOnline()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalAlunosCurso(SocialMedia socialMedia) {
        int quantidade = 0;
        for (Iterator a = socialMedia.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
