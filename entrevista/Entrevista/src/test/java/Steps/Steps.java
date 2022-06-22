package Steps;

import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {
	Metodos m = new Metodos();
	@Given("dado acesse url {string}")
	public void dado_acesse_url(String site) {
	    m.Executarnavegador(site);
	}

	@Given("preencher os dados pedidos")
	public void preencher_os_dados_pedidos() throws InterruptedException {
	    m.preenchercampos();
	}

	@Given("selecionar campo cadastrar")
	public void selecionar_campo_cadastrar() throws InterruptedException {
	    m.clicarcadastro();
	}

	@Given("seleciona campo Ir para login")
	public void seleciona_campo_ir_para_login() throws InterruptedException {
	    m.Irparalogin();
	}

	@Given("preencher os dados")
	public void preencher_os_dados() throws InterruptedException {
	    m.EmailLogin();
	}

	@Given("selecionar campo Manter Logado")
	public void selecionar_campo_manter_logado() {
	    m.Manterlogado();
	}

	@Then("selecionar campo Logar")
	public void selecionar_campo_logar() throws InterruptedException {
	    m.clicaremLogin();
	}
}
