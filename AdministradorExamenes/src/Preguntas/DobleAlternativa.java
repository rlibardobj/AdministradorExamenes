/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Preguntas;

import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ronny
 */
public class DobleAlternativa extends JInternalFrame implements Preguntas{
    private String pregunta;
    private int numeroPregunta, respuesta;
    private ArrayList<String> opciones = new ArrayList<String>();
    private JPanel panelRespuesta, panelCargaDatos;
    
    public void insertarInfo() {
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
    }
    
    public void evaluarPregunta() {
    }
}
