package pomPages.todoLy;

import controls.Label;
import org.openqa.selenium.By;

public class CenterSection {
    public Label projectNameLabel= new Label(By.xpath("//li[last()]//td/div[@class ='ItemContentDiv']"));
    public CenterSection(){}
}
