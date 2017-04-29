import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Created by User on 29.04.2017.
 */

@ManagedBean(name = "item")
@RequestScoped
public class ItemBean implements Serializable {

    private String selectedItem;

    public String getSelectedItem() {
        return selectedItem;
    }

    public String changeItem(String item) {
        selectedItem = item;
        return selectedItem;
    }

}
