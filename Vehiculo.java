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

    public void arrancarMotor(){
        if(motorApagado == true){
            motorApagado = false;
        }
        else{
            motorApagado = true;
        }
    }

    public void imprimirDetalles(){
        System.out.println("Modelo: " + tractor + "Estado depósito gasolina: " + capacidadDeposito+"Apagado: "+ motorApagado);
    }

    public String obtenerDetalles(){
        String detalles = "Modelo del tractor: "+ tractor+ "Estado depósito gasolina: " + capacidadDeposito+"Apagado: "+ motorApagado;
        return detalles;
    }
}