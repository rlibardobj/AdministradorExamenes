/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Preguntas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ronny
 */
public class DobleAlternativa extends JInternalFrame implements Preguntas {

    private String pregunta;
    private int numeroPregunta, respuesta;
    private ArrayList<String> opciones = new ArrayList<String>();
    private JPanel panelGeneral, panelRespuesta, panelCargaDatos;

    public DobleAlternativa() {
        initialize();
    }

    public void initialize() {
        panelGeneral = new JPanel(new CardLayout());
        panelCargaDatos = new JPanel();
        panelCargaDatos.setLayout(new BoxLayout(panelCargaDatos,BoxLayout.PAGE_AXIS));
        JPanel definirPregunta,definirNumPregunta,definirOpciones;
        definirPregunta = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        definirPregunta.add(new JTextField(""));
        definirPregunta.add(new JLabel("Defina la pregunta: "));
        definirNumPregunta = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        definirNumPregunta.add(new JTextField(""));
        definirNumPregunta.add(new JLabel("Defina el número de la pregunta: "));
        definirOpciones = new JPanel();
        definirOpciones.setLayout(new BoxLayout(definirOpciones,BoxLayout.PAGE_AXIS));
        panelCargaDatos.add(definirOpciones);
        panelCargaDatos.add(definirNumPregunta);
        panelCargaDatos.add(definirPregunta);
        panelRespuesta = new JPanel();
        panelRespuesta.add(new JLabel("Prueba Panel Respuesta"));
        panelGeneral.add(panelCargaDatos, "CargaDatos");
        panelGeneral.add(panelRespuesta, "Respuesta");
        this.getContentPane().add(panelGeneral);
    }

    public void insertarInfo() {
        CardLayout mostrarInterfaz = (CardLayout) panelGeneral.getLayout();
        mostrarInterfaz.show(panelGeneral, "CargaDatos");
    }

    public void eliminarInfo() {
        this.pregunta = "";
        this.numeroPregunta = -1;
        this.respuesta = -1;
        this.opciones.clear();
    }

    public double getScore() {
        return 0.0;
    }

    public void desplegarPregunta() {
        CardLayout mostrarInterfaz = (CardLayout) panelGeneral.getLayout();
        mostrarInterfaz.show(panelGeneral, "Respuesta");
    }

    public void evaluarPregunta() {
    }
}
