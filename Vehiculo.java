 public class Vehiculo{
    private String tractor;
    private int capacidadDeposito;
    private boolean motorApagado;
    public Vehiculo(String modeloTractor,int capacidadDelDeposito){
        tractor = modeloTractor;
        capacidadDeposito = capacidadDelDeposito;
        motorApagado = true;
    }
    
    public String getTractor(){
        return tractor;
    }
    
    public int getcapacidadDeposito(){
        return capacidadDeposito;
    }
    
    public boolean getMotorApagado(){
        return motorApagado;
    }
    
    public void setmodeloTractor(String nuevoModelo){
        this.tractor = nuevoModelo;
    }
    
    public void aumentarAutonomiaVehiculo(int cantidadLitros){
        capacidadDeposito = capacidadDeposito + cantidadLitros;
    }
    
    public void estadoVehiculo (){
        if(motorApagado == true){
        System.out.println("El motor se encuentra Apagado");
        }
        else{
        System.out.println("El motor se encuentra Encendido");
        }
    }
    
    public void imprimirDetalles(){
        System.out.println("Modelo: " + tractor + "Estado depósito gasolina: " + capacidadDeposito+"Apagado: "+ motorApagado);
    }
    
    public String obtenerDetalles(){
        return "Modelo del tractor: "+ tractor+ "Estado depósito gasolina: " + capacidadDeposito+"Apagado: "+ motorApagado;
    }
}