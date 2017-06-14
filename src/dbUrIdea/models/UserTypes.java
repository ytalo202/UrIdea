package dbUrIdea.models;

/**
 * Created by Ytalo Tuesta on 14/06/2017.
 */
public class UserTypes {
    private int id;
    private String userTipeName;
    private String descripcion;

    public UserTypes() {
    }

    public UserTypes(int id, String userTipeName, String descripcion) {
        this.setId(id);
        this.setUserTipeName(userTipeName);
        this.setDescripcion(descripcion);
    }

    public int getId() {
        return id;
    }

    public UserTypes setId(int id) {
        this.id = id;
        return this;
    }

    public String getUserTipeName() {
        return userTipeName;
    }

    public UserTypes setUserTipeName(String userTipeName) {
        this.userTipeName = userTipeName;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public UserTypes setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
}
