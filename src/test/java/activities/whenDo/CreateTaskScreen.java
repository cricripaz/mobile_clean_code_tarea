package activities.whenDo;

import controles.Button;
import controles.TextBox;
import org.openqa.selenium.By;

public class CreateTaskScreen {


    public TextBox titleTextbox = new TextBox(By.xpath("//android.widget.EditText[@text='Title']"));
    public Button saveTaskButton = new Button(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/saveItem']"));

}
