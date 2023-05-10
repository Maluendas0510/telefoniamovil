package modelo;

public class PlanTelefonia 
{
    //atributos

    private double numeroCelular ;
    private String operador;
    private int cantidadMinutos;
    private double valorMinutos;
    private double costoPlan;


    //metodos 
    public  PlanTelefonia (double pNumeroCelular,String pOperador,int pCantidadMinutos, double pValorMinuto,double pValorMinutos, double pCostoPlan)
    {
        this.numeroCelular=pNumeroCelular;
        this.operador=pOperador;
        this.cantidadMinutos=pCantidadMinutos;
        this.valorMinutos=pValorMinutos;
        this.costoPlan=pCostoPlan;
    

    }
    
    public PlanTelefonia() {
    }

    public void calcularCostoPlan() 
    {
        
            
        if(getOperador()=="WOM")
        {
            costoPlan=(valorMinutos*cantidadMinutos)/2;
                
        }
        else 
        {
            costoPlan =(valorMinutos*cantidadMinutos);

        }
        
    }

    
    public String getOperador() 
    {
        return operador;
        
    }
    public double getNumeroCelular()
    {
        return numeroCelular;

    }
    public int getCantidadMinutos()
    {
        return cantidadMinutos;
        
    }
    public double getValorMinuto()  
    {
        return valorMinutos;

    }
    public double getcostoPlan()  
    {
        return costoPlan;

    }
    



   
        
}
