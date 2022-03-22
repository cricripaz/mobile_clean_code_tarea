package testClean;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.DeleteModalScreen;
import activities.whenDo.ListScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class WhenDoTest {


    CreateTaskScreen createTaskScreen = new CreateTaskScreen();
    ListScreen listScreen = new ListScreen();
    DeleteModalScreen deleteModalScreen = new DeleteModalScreen();


    @Test
    public void createTaskTest() throws MalformedURLException, InterruptedException {

        listScreen.addButton.click();
        createTaskScreen.titleTextbox.setValue("Task 1");
        createTaskScreen.saveTaskButton.click();


        listScreen.checkTaskButton.click();

        Thread.sleep(1000);

        listScreen.moreOptionsButton.click();

        listScreen.deletedOptionButton.click();

        deleteModalScreen.deleteButton.click();

        Thread.sleep(1000);


        String expectResult = "No tasks added";

        String actualResult= listScreen.noTaskLabel.getText();


        Assertions.assertEquals(expectResult,actualResult,"ERROR");


    }

    @AfterEach
    public void closeApp() throws MalformedURLException {

    }
}
