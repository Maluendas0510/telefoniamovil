package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private PlanTelefonia plan;

    //------------------
    //Metodos
    //------------------

    //Constructor
    
    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pPlan)
    {
        this.venPrin = pVenPrin;
        this.plan=pPlan;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
        if(comando.equals("costo plan"))
        {
            
            double numeroCelular = Double.parseDouble(venPrin.miPanelEntradaDatos.getNumeroCelular());
            String operador = venPrin.miPanelEntradaDatos.getOperadores();
            double valorMinuto = Double.parseDouble(venPrin.miPanelEntradaDatos.getValorMinuto());
            int cantMinutos = Integer.parseInt(venPrin.miPanelEntradaDatos.getCantMinutos());

            PlanTelefonia planto = new PlanTelefonia(numeroCelular, operador, cantMinutos, valorMinuto, cantMinutos, valorMinuto);
            planto.calcularCostoPlan();;
            

            venPrin.miPanelResultados.mostrarResultado("El numero de celular es: " + planto.getNumeroCelular() + "\nEl operador es: " + planto.getOperador() + "\nEl valor del minuto es: " + planto.getValorMinuto() + "\nLa cantidad de minutos es: " + planto.getCantidadMinutos() + "\nEl costo del plan es: " + planto.getcostoPlan() + "\n");
            

           
        }
    
        
        
            
    }
}
    