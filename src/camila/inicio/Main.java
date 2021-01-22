package camila.inicio;

import camila.dao.PessoaDAO;
import camila.dao.PessoaDAOimp;
import camila.view.TelaPrincipal;

public class Main {

	public static void main(String[] args) {
		
		PessoaDAOimp dao = new PessoaDAOimp();
		new TelaPrincipal(dao);

	}

}
