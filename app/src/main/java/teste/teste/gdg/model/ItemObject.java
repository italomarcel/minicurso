package teste.teste.gdg.model;

/**
 * Created by Italo on 11/03/17.
 */
public class ItemObject {
    private int photo;
    private String name;

    public ItemObject(String name, int photo) {
        this.photo = photo;
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
