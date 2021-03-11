package pomPages.todoLy;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTextBox= new TextBox(By.xpath("//input[@name='email']"));
    public TextBox pwdTextBox= new TextBox(By.xpath("//input[@name='pwd']"));
    public Button loginButton= new Button(By.xpath("//button/span[contains(.,'Registrarse con')]"));
    public TextBox nameTextBox= new TextBox(By.xpath("//input[@class='input_name']"));
    public Button loginButton2= new Button(By.xpath("//button/span[contains(.,'Registrarse ahora')]"));
    public Button abrir= new Button(By.xpath("//a[contains(.,'Abr')]\n"));
    public LoginModal(){}

    public void loginAction(String user, String pwd){
        emailTextBox.set(user);
        pwdTextBox.set(pwd);
        loginButton.click();
    }

}
