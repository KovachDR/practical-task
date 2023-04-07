public class Task {
    public static void main(String[] args) {
        System.out.println(numberSquared(5));
        System.out.println(numberSquaredVersionTwo(5,2));
    }
public static int numberSquared(int number){
        return number*number;
}
public static double numberSquaredVersionTwo(double number, int numberPow){
        return Math.pow(number,numberPow);
}
}

