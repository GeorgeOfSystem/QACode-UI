package pomPages.todoLy;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class LeftSection {
    public Button addNewProjectButton= new Button(By.xpath("//td/textarea[@id='NewItemContentInput']"));
    public Button addButton= new Button(By.xpath("//td/input[@id ='NewItemAddButton']"));
    public TextBox nameProjectTextBox= new TextBox(By.xpath("//td/textarea[@id='NewItemContentInput']"));

    public Button projectMenuButton= new Button(By.xpath("//li[last()]//div/img[@class='ItemMenu' and @src='/Images/dropdown.png']"));
    public Button editOption= new Button(By.xpath("//ul[@id='projectContextMenu']//a[contains(.,'Edit')]"));
    public Button saveOption= new Button(By.xpath("//a[contains(.,'0')]"));
    public TextBox editNameProjectTextBox= new TextBox(By.id("ItemEditTextbox"));
    public Button deleteOption = new Button(By.xpath("//ul[@id='itemContextMenu']//a[contains(.,'Delete')]"));

    public Label lastProjectInListLabel= new Label(By.xpath("//div[@id=\"ProjectListPlaceHolder\"]//li[last()]"));

    public LeftSection(){

    }

    public void clickOnProject(String nameProject){
        Label projectInList= new Label(By.xpath("//li[last()]//div[contains(.,'"+nameProject+"') and @class='ItemContentDiv']"));
        projectInList.click();
    }

}
