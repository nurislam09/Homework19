import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "Дуйшонбу" -> System.out.println(Days.MONDAY.getDay());
            case "Шейшемби" -> System.out.println(Days.TUESDAY.getDay());
            case "Шаршемби" -> System.out.println(Days.WEDNESDAY.getDay());
            case "Бейшемби" -> System.out.println(Days.THURSDAY.getDay());
            case "Жума" -> System.out.println(Days.FRIDAY.getDay());
            case "Ишемби" -> System.out.println(Days.SATURDAY.getDay());
            case "Жекшемби" -> System.out.println(Days.SUNDAY.getDay());
            default -> System.err.println("Бир жумада 7 эле кун бар");
        }
    }
}