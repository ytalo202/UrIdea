package dbUrIdea.models;

/**
 * Created by Ytalo Tuesta on 14/06/2017.
 */
public class UserType {
    private int id;
    private String userTipeName;
    private String descripcion;

    public UserType() {
    }

    public UserType(int id, String userTipeName, String descripcion) {
        this.setId(id);
        this.setUserTipeName(userTipeName);
        this.setDescripcion(descripcion);
    }

    public int getId() {
        return id;
    }

    public UserType setId(int id) {
        this.id = id;
        return this;
    }

    public String getUserTipeName() {
        return userTipeName;
    }

    public UserType setUserTipeName(String userTipeName) {
        this.userTipeName = userTipeName;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public UserType setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
}
