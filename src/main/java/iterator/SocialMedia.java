package iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class SocialMedia implements Iterable<User>{
    private List<User> users = new ArrayList<User>();

    public SocialMedia(User... users) {
        this.users = Arrays.asList(users);
    }

    @Override
    public Iterator<User> iterator() {
        return users.iterator();
    }
}
