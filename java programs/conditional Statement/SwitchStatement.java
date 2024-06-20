public class SwitchStatement {
    public static void main(String[] args) {
    int dayOfWeek = 3;

    // Basic switch statement
    switch (dayOfWeek) {
        case 1:
            System.out.println("Today is Monday");
            break;
        case 2:
            System.out.println("Today is Tuesday");
            break;
        case 3:
            System.out.println("Today is Wednesday");
            break;
        case 4:
            System.out.println("Today is Thursday");
            break;
        case 5:
            System.out.println("Today is Friday");
            break;
        default:
            System.out.println("It's a weekend day");
    }
}
}
