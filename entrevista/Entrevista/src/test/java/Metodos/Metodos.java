package Metodos;

import org.openqa.selenium.WebDriver;

import Elementos.Elementos;
import Pages.Page;

public class Metodos {
	Page p = new Page();
	Elementos e = new Elementos();
	WebDriver driver;
	
	public void Executarnavegador(String site) {
		p.ExecutarNavegador(site);
	}
	public void preenchercampos() throws InterruptedException {
		p.preencher(e.getCampoSeunome(), "Aurora Jéssica Jesus");
		p.pausa(2000);
		p.preencher(e.getCampoSeuEmail(), "aurora-jesus97@eletrolexeng.com.br");
		p.pausa(2000);
		p.preencher(e.getCampoSuaSenha(), "1234");
		p.pausa(2000);
	}
	public void clicarcadastro() throws InterruptedException {
		p.clicar(e.getBtnCadastro());
		p.pausa(2000);
	}
	public void Irparalogin() throws InterruptedException {
		p.clicar(e.getBtnIrparaLogin());
		p.pausa(2000);
	
	}
    public void EmailLogin() throws InterruptedException {
    	p.preencher(e.getCampoSeuEmailLogin(), "aurora-jesus97@eletrolexeng.com.br");
    	p.pausa(2000);
    	p.preencher(e.getCampoSuaSenhaLogin(), "1234");
    	p.pausa(2000);
    }
	public void Manterlogado() {
		p.clicar(e.getBtnManterLogado());
	}
	public void clicaremLogin() throws InterruptedException {
		p.pausa(2000);
		p.clicar(e.getBtnLogin());
	}
	
	
	
	
	
	
	
	
	
}
