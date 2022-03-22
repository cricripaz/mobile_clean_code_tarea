package activities.whenDo;

import controles.Button;
import controles.Label;
import controles.TextBox;
import org.openqa.selenium.By;

public class ListScreen {

    public Button addButton = new Button(By.xpath("//android.widget.ImageButton[@resource-id='com.vrproductiveapps.whendo:id/fab']"));
    public Label firstTaskLabel = new Label(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/home_list_item_text']"));
    public Button checkTaskButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc='Mark Done']"));
    public Button moreOptionsButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='More options']"));
    public Button deletedOptionButton = new Button(By.xpath("//android.widget.TextView[@text = 'Delete Completed']"));
    public Label noTaskLabel = new Label(By.xpath("//android.widget.TextView[@text = 'No tasks added']"));


}
