package homerentws.com.entity;

public enum Role {
    ADMIN(1),
    USER(2),
    ADMINISTRATOR(3);

    private int id;

    Role(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
