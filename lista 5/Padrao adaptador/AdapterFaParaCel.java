public class AdapterFaParaCel extends MedidorCelsius {
    private SensorFahrenheit sensorFahrenheit;

    public AdapterFaParaCel(SensorFahrenheit sensorFahrenheit) {
        this.sensorFahrenheit = sensorFahrenheit;
    }

    @Override
    public void exibirTemperatura(double valorIgnorado) {
        double fahrenheit = sensorFahrenheit.lerTemperaturaFahrenheit();
        
        double celsius = (fahrenheit - 32) / 1.8;
        
        super.exibirTemperatura(celsius);
    }
}