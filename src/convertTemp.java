import java.util.Arrays;

public class convertTemp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }
    public static double[] convertTemperature(double celsius) {
        return new double[] { celsius+273.15,celsius*1.80+32.00};
    }
}
