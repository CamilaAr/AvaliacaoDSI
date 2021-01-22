package camila.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import camila.dao.PessoaDAOimp;

public class TelaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private PessoaDAOimp dao;
	
	private JButton enviar;
	private JLabel titulo;
	private JTextField inserir;
	

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public TelaPrincipal(PessoaDAOimp dao) {
		
		this.dao = dao;
		contentPane = new JPanel();
		enviar = new JButton("inserir");
		titulo = new JLabel("Tela principal");
		enviar.addActionListener(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setVisible(true);
		
		contentPane.add(titulo);
	
		contentPane.add(enviar);
		this.add(contentPane);
		pack();
		
	}

	private void chamarInserir() {
		new telaInserir(dao);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == enviar) {
			chamarInserir();
		}
		
	}
	
	
}
