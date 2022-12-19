package services;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainForServices {
    static Scanner scanner = new Scanner(System.in);

    public static int ChooseOne() {
        System.out.println("enter the category number");
        System.out.println("1.courses");
        System.out.println("2.teaches");
        System.out.println("3.students");
        System.out.println("4.lectures");
        return scanner.nextInt();
    }

    public static int ChooseTwo() {
        System.out.println("select");
        System.out.println("1 - create new");
        System.out.println("2 - open an existing");
        return scanner.nextInt();
    }

    public static int ChooseCategory (int insert) {
        return switch (insert) {
            case 1:
                System.out.println("you choose courses");
                yield 1;
            case 2:
                System.out.println("you choose teachers");
                yield 2;
            case 3:
                System.out.println("you choose students");
                yield 3;
            case 4:
                System.out.println("you choose lectures");
                yield 4;
            default:
                System.out.println("category does not exist, try again");
                System.out.println("1 - yes");
                System.out.println("2 - no");
                int option = scanner.nextInt();
                if (option == 1) {
                    yield ChooseCategory(ChooseOne());
                } else if (option == 2) {
                    System.out.println("you finish");
                    yield 2;
                } else {
                    System.out.println("error");
                    yield ChooseCategory(0);
                }

        };
    }

    public static void main(String[] args) {
        int categoryFinal = MainForServices.ChooseCategory(MainForServices.ChooseOne());
        int chooseCategoryFinal = MainForServices.ChooseTwo();


        }

    }







