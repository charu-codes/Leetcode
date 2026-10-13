class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = 0;
        double fahrenheit = 0;
        kelvin = celsius + 273.15;
        fahrenheit = celsius * 1.80 + 32.00;
        double[] arr = {kelvin, fahrenheit};
        return arr;
    }
}