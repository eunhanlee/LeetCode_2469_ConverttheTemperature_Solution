public class Solution {

    /**
     * Converts a temperature value from Celsius to Kelvin and Fahrenheit.
     *
     * @param celsius the temperature value in Celsius
     * @return an array containing the converted temperature values in Kelvin and Fahrenheit,
     *         where the first element is the Kelvin value and the second element is the Fahrenheit value
     */
    public double[] convertTemperature(double celsius) {
        //    Kelvin = Celsius + 273.15
        //    Fahrenheit = Celsius * 1.80 + 32.00
        double[] result = new double[2];
        result[0] = celsius + 273.15;
        result[1] = celsius * 1.80 + 32.00;
        return result;
    }
}
