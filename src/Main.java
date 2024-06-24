public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meters = 1.87;
        double kg = 98;
        int index = service.calculate(meters, kg);// должно получиться 28
        System.out.println(index);
    }
}

