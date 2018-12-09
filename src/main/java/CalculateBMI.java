import java.util.Arrays;

public class CalculateBMI implements Calculate<Double> {
    private double weight;
    private double height;

    public CalculateBMI(double weight, double height) {
        if (weight > 0 && height > 0) {
            this.weight = weight;
            this.height = height;
        } else {
            throw new IllegalArgumentException("Please enter weight and height > 0!");
        }
    }

    @Override
    public Double calculate() {
        double bmi = weight / Math.pow(height / 100, 2);
        return bmi;
    }

    @Override
    public String interpret(double bmiResult) {
        double[] bmiIndexes = {15, 16, 18.5, 25, 30, 40, 45, 50, 60, 1000};
        String[] bmiNames = {"Very severely underweight",
                "Severely underweight",
                "Underweight",
                "Normal (healthy weight)",
                "Overweight",
                "Obese Class I (Moderately obese)",
                "Obese Class II (Severely obese)",
                "Obese Class III (Very severely obese)",
                "Obese Class IV (Morbidly Obese)",
                "Obese Class V (Super Obese)",
                "Obese Class VI (Hyper Obese)"};
        return bmiNames[Math.abs(Arrays.binarySearch(bmiIndexes,
                bmiResult) + 1)];
    }
}
