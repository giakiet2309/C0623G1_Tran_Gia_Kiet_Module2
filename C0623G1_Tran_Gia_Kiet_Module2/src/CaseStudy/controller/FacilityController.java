package CaseStudy.controller;

import java.util.Scanner;

public class FacilityController {
    public static void ShowMenuFacility() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("======Facility Manager======");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Delete facility");
            System.out.println("5. Return main menu");
            System.out.println("Choose number : ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Type number pls ! ");
            }
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Try again !");
            }
        } while (true);
    }
}
