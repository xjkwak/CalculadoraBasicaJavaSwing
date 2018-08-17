import javax.swing.*;
import java.awt.*;

class Calculadora extends JFrame {
    
    private JTextField visor;
    private JButton botonUno;
    private JButton botonDos;
    private JButton botonMas;
    private JButton botonIgual;
    
    public Calculadora() {
        super("Calculadora para principiantes!");
        
        visor = new JTextField();
        visor.setEditable(false);
        
        setLayout(new BorderLayout());
        
        add(visor, BorderLayout.NORTH);
        
        botonUno = new JButton("1");
        botonDos = new JButton("2");
        botonIgual = new JButton("=");
        botonMas = new JButton("+");
        
        JPanel aux = new JPanel();
        aux.setLayout(new GridLayout(2,2));
        
        aux.add(botonUno);
        aux.add(botonDos);
        aux.add(botonMas);
        aux.add(botonIgual);
        
        add(aux, BorderLayout.CENTER);
    }
}