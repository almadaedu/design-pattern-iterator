package iterator;

public class User {

    private String name;
    private boolean online;

    public User(String user, boolean online) {
        this.name = name;
        this.online = online;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
