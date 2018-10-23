package br.com.bg.bibliotecaBG.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.chart.PieChart.Data;

import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Edson Araújo
 */
public class ControladorTelaMenu {

    private JLabel jlaDiaSemana;
    private JLabel jlaData;
    private JLabel jlaHora;
    private Timer timer;

    //ALT + INSERT
    public ControladorTelaMenu(JFrame telaMenu,JDesktopPane desktop,JLabel jlaDiaSemana, JLabel jlaData, JLabel jlaHora) {
        //super (telaMenu, desktop); //usar o super quando for herdar da classe mãe
        this.jlaDiaSemana = jlaDiaSemana;
        this.jlaData = jlaData;
        this.jlaHora = jlaHora;
        atualizacaoTimer();
    }

    private void atualizacaoTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarHora();
            }
        });
        timer.start();
        atualizarData();
    }

    private void atualizarHora() {
        jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));

    }

    private void atualizarData() {
        jlaDiaSemana.setText(new SimpleDateFormat("EEEE"). format (new Date())); //EEEE código padrao para os dias da semana
        
        jlaData.setText(DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()));
        
        
    }

}
