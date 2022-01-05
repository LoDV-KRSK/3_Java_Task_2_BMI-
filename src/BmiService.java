public class BmiService {
    public float calculate(float growth, int weight) {
        float bmi = (weight / (growth * growth));
        return bmi;
    }
}
