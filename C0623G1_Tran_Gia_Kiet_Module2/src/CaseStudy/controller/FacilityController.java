package CaseStudy.controller;

import CaseStudy.model.furama.Villa;
import CaseStudy.service.impl.FacilityService;
import CaseStudy.utils.Regex;
import CaseStudy.utils.Validator;

import java.util.Scanner;

public class FacilityController {
    private static FacilityService facilityService = new FacilityService();

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
                    facilityService.display();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    facilityService.maintenanceList();
                    break;
                case 4:
                    facilityService.delete();
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Try again !");
            }
        } while (true);
    }


    private static void addNewFacility() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("1. Thêm Villa");
            System.out.println("2. Thêm Room");
            System.out.println("3. Thêm House");
            System.out.println("4. Trở lại trang chính");
            System.out.println("Choose number : ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Type number pls !");
            }
            switch (select) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    ShowMenuFacility();
                    break;
                default:
                    System.out.println("Try again!");
                    break;
            }
        } while (true);
    }

    private static Villa addNewVilla() {
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        double area;
        double poolArea;
        double price;
        int capacity;
        String rentType;
        int floor;
        String roomStandard;
        boolean check;
        do {
            check = false;
            System.out.println("Nhập mã dịch vụ vào đây");
            id = scanner.nextLine();
            if (Regex.validateVillaId(id)) {
                check = true;
            } else {
                System.out.println("Id không đúng định dạng");
            }
        } while (!check);
        do {
            check = false;
            System.out.println("Nhập tên của dịch vụ vào đây ");
            name = scanner.nextLine();
            if (Validator.validateName(name)) {
                check = true;
            } else {
                System.out.println("Tên không đúng định dạng");
            }
        } while (!check);
        do {
            check = false;
            System.out.println("Nhập diện tích sử dụng vào đây");
            area = Double.parseDouble(scanner.nextLine());
            if (area > 30) {
                check = true;
            } else {
                System.out.println("Diện tích phải lớn hơn 30m vuông ");
            }
            do {
                check = false;
                System.out.println("Nhập diện tích hồ bơi vào đây");
                area = Double.parseDouble(scanner.nextLine());
                if (area > 30) {
                    check = true;
                } else {
                    System.out.println("Diện tích phải hồ bơi lớn hơn 30m vuông ");
                }
            } while (!check);
            do {
                check = false;
                System.out.println("Nhập chi phí thuê vào đây");
                price = Double.parseDouble(scanner.nextLine());
                if (price > 0) {
                    check = true;
                } else {
                    System.out.println("Chi phí thuê phải lớn hơn 0");
                }
            } while (!check);
            do {
                check = false;
                System.out.println("Nhập Số lượng người tối đa vào đây");
                capacity = Integer.parseInt(scanner.nextLine());
                if (capacity > 0 && capacity < 20) {
                    check = true;
                } else {
                    System.out.println("Số lượng người phải hơn 0 và bé hơn 20");
                }
            } while (!check);

            do {
                check = false;
                System.out.println("Nhập số tầng vào đây");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0){
                    check = true;
                }else {
                    System.out.println("Số tầng phải lớn hơn 0");
                }
            } while (!check);
            
        }
    }
