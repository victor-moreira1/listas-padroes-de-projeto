public class Forno {
    public static void main(String[] args) {
        SensorFahrenheit sensorF = new SensorFahrenheit();
        
        MedidorCelsius medidor = new AdapterFaParaCel(sensorF);
        
        medidor.exibirTemperatura(0.0);
    }
}