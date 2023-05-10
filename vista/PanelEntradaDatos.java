package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbOperadores;
    private JLabel lbNumeroCelular, lbcantidadMinutos, lbvalorMinuto;
    private JComboBox cbOperadores;
    private JTextField tfNmeroCelular,tfcantidadMinutos,tfvalorMinutos;


    //----------------------
    // Metodos
    //---------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta empleados
        lbOperadores = new JLabel("Operadores: ", JLabel.RIGHT);
        lbOperadores.setBounds(0,120,100,20);
        this.add(lbOperadores);
      

        //Creación y adición de los JComboBox
        cbOperadores = new JComboBox();
        cbOperadores.setBounds(150,120,150,20);
        cbOperadores.addItem("Tigo");
        cbOperadores.addItem("Movistar");
        cbOperadores.addItem("Claro");
        cbOperadores.addItem("WOM");
        this.add(cbOperadores);

        lbNumeroCelular = new JLabel("Num. Celular : ", JLabel.RIGHT);
        lbNumeroCelular.setBounds(10,50,100,20);
        this.add(lbNumeroCelular);

        tfNmeroCelular= new JTextField();
        tfNmeroCelular.setBounds(150,50,100, 25);
        this.add(tfNmeroCelular);

        lbcantidadMinutos = new JLabel("Cant. Minutos: ", JLabel.RIGHT);
        lbcantidadMinutos.setBounds(10,20,100,20);
        this.add(lbcantidadMinutos);

        tfcantidadMinutos= new JTextField();
        tfcantidadMinutos.setBounds(150,20,100, 25);
        this.add(tfcantidadMinutos);

        lbvalorMinuto = new JLabel("Valor.Min: ", JLabel.RIGHT);
        lbvalorMinuto.setBounds(10,80,100,20);
        this.add(lbvalorMinuto);

        tfvalorMinutos= new JTextField();
        tfvalorMinutos.setBounds(150,80,100, 25);
        this.add(tfvalorMinutos);

        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public String getOperadores()
    {
        return (String) cbOperadores.getSelectedItem();
    }
    public String getNumeroCelular()
    {
        return tfNmeroCelular.getText();
    }
    public String getCantidadMinutos()
    {
        return tfcantidadMinutos.getText();
    }

    public String getValorMinuto() 
    {
        return tfvalorMinutos.getText();
    }

    public String getCantMinutos()
     {
        return tfcantidadMinutos.getText();
    }
    
}
