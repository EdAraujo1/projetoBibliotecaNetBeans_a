package br.com.bg.bibliotecaBG.controladores;

import br.com.bg.bibliotecaBG.dominio.Usuario;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ed Araújo
 */
public class ControladorTelaCadastroUsuario {

    private JTextField jtfNome;
    private JTextField jtfEmail;
    private JTextField jtfCPF;
    private JTextField jtfRG;
    private JTextField jtfIdade;
    private JTextField jtfSexo;

    Usuario usuario;

    public ControladorTelaCadastroUsuario(JTextField jtfNome, JTextField jtfEmail, JTextField jtfCPF, JTextField jtfRG, JTextField jtfIdade, JTextField jtfSexo) {
        this.jtfNome = jtfNome;
        this.jtfEmail = jtfEmail;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jtfIdade = jtfIdade;
        this.jtfSexo = jtfSexo;
    }

    private void preencherUsuario() {
        usuario = new Usuario();

        usuario.setNome(jtfNome.getText());
        usuario.seteMail(jtfEmail.getText());
        usuario.setCpf(jtfCPF.getText());
        usuario.setRg(jtfRG.getText());
        usuario.setIdade(Integer.parseInt(jtfIdade.getText()));
    }

    public void salvarCliente() {
        preencherUsuario();
        JOptionPane.showMessageDialog(null, "Usuario - " + usuario.toString());
    }
}
