package ejecutable;

import controlador.Controlador;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class Test {

    public static void main(String[] args) {

        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        PlanTelefonia miPlanTelefonia= new PlanTelefonia();
        Controlador miControlador = new Controlador(miVentanaPrincipal, miPlanTelefonia);        
    }
    
}
