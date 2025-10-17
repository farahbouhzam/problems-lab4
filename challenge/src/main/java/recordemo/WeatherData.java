package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {


    public double temperatureFahrenheit() {
        return (temperatureCelsius * 9 / 5) + 32;
    }


    public String getSummary() {
        return String.format("Current weather: %.2f°C (%.2f°F) and %s",
                temperatureCelsius, temperatureFahrenheit(), conditions);
    }


    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double celsius = (tempFahrenheit - 32) * 5 / 9;
        return new WeatherData(celsius, conditions);
    }


    public static void main(String[] args) {
        WeatherData today = new WeatherData(25.0, "Sunny");
        WeatherData yesterday = WeatherData.fromFahrenheit(50.0, "Cloudy");

        System.out.println("Today's weather: " + today.getSummary());
        System.out.println("Yesterday's weather: " + yesterday.getSummary());
    }
}
