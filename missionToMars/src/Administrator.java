public class Administrator {

    private int id;
    private String password;

    public Administrator()
    {
        id = 0;
        password = "";
    }

    public Administrator(int newId, String newPassword)
    {
        id = newId;
        password = newPassword;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
