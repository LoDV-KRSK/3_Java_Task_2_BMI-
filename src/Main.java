public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float growth = (float) 1.73;   // рост (м)
        int weight = 75;              // вес (кг)
        float bmi = service.calculate(growth, (int) weight);

        System.out.println("Ваш индекс массы тела (ИМТ) равен " + bmi);
    }
}