import java.util.Scanner;

public class ExamplesSwich {
    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        day = scanner.nextInt();
        swich_1(day);

        System.out.println("Введите число: ");
        day = scanner.nextInt();
        swich_2(day);

        System.out.println("Введите число: ");
        day = scanner.nextInt();
        swich_3(day);

        System.out.println("Введите число: ");
        day = scanner.nextInt();
        swich_4(day);


        scanner.close();



    }

    public static void swich_1(int day) {


        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break; // Выход из switch
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Неизвестный день");
        }
    }

    public static void swich_2(int day) {
        String dayName = switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            default -> "Неизвестный день";
        };

        System.out.println(dayName);

    }

    public static void swich_3(int day) {
        switch (day) {
            case 1, 2, 3 -> System.out.println("Начало недели");
            default -> System.out.println("Неизвестный день");
        }
    }

    public static void swich_4(int day) {
        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            default -> System.out.println("Неизвестный день");
        };
    }


}
