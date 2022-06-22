package Elementos;

import org.openqa.selenium.By;

public class Elementos {
   private By campoSeunome = By.id("nome_cad");
   private By campoSeuEmail = By.id("email_cad");
   private By campoSuaSenha = By.id("senha_cad");
   private By btnCadastro = By.cssSelector("#cadastro > form > p:nth-child(5) > input[type=submit]");
   private By btnIrparaLogin = By.cssSelector("#cadastro > form > p.link > a");
   private By campoSeuEmailLogin = By.id("email_login");
   private By campoSuaSenhaLogin = By.id("senha_login");
   private By btnManterLogado = By.id("manterlogado");
   private By btnLogin = By.cssSelector("#login > form > p:nth-child(5) > input[type=submit]");
public By getCampoSeunome() {
	return campoSeunome;
}
public By getCampoSeuEmail() {
	return campoSeuEmail;
}
public By getCampoSuaSenha() {
	return campoSuaSenha;
}
public By getBtnCadastro() {
	return btnCadastro;
}
public By getBtnIrparaLogin() {
	return btnIrparaLogin;
}
public By getCampoSeuEmailLogin() {
	return campoSeuEmailLogin;
}
public By getCampoSuaSenhaLogin() {
	return campoSuaSenhaLogin;
}
public By getBtnManterLogado() {
	return btnManterLogado;
}
public By getBtnLogin() {
	return btnLogin;
}
}
