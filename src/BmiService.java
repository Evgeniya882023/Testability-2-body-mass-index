public class BmiService {
    public int calculate(double meters, double kg) {
        double index = kg / (meters * meters);
        return (int) index;
    }
}

