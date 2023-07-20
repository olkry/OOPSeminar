public class App {
    public static void main(String[] args) throws Exception {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1); 
        meteoDb.save(ms200_1);

        SensorTemperature newSensor = new ST500Info().getData();
        AdapterST500 adapter = new AdapterST500(newSensor);

        meteoDb.save(adapter);

    }
}
