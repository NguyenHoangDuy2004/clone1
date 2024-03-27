package demo1.ulti;

import java.util.Scanner;

public class CheckInputData {

    private static Scanner scanner = new Scanner(System.in);
    public static int CheckInputOption(String message, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                int option = Integer.parseInt(scanner.nextLine());
                if (option < min || option > max) {
                    System.out.printf("Option chỉ từ 1 đến 5 ", min, max);
                    continue;
                }
                return option;
            } catch (Exception e) {
                System.out.println("Option phải là số.");
            }
        }
    }

    public static int checkInputInt(String message, int min) {
        while (true) {
            try {
                System.out.println(message);
                int id = Integer.parseInt(scanner.nextLine());
                if (id < min) {
                    System.out.printf("Id phải lớn ", min);
                    continue;
                }
                return id;
            } catch (Exception e) {
                System.out.println("Id phải là số.");
            }
        }
    }

    public static String checkInputNull(String message, String warn) {
        while (true) {
            System.out.println(message);
            String result = scanner.nextLine();
            if(result.length() == 0 || result == null) {
                System.out.println(warn + "Không tìm thấy.");
                continue;
            }
            return result;
        }
    }

    public static String checkInputnameProductNK(String message) {
        while (true) {
            System.out.println(message);
            String nameProduct = scanner.nextLine();
            if(nameProduct.equalsIgnoreCase("Giay Adidas") || nameProduct.equalsIgnoreCase("Dong ho Rolex") || nameProduct.equalsIgnoreCase("Iphone XS")) {
                return nameProduct;
            } else {
                System.out.println("Tên sản phẩm nhập khẩu phải là Giay adidas , dong ho rolex hoặc Iphone XS.");
            }
        }
    }

    public static double checkInputDouble(String message, double min, String warn) {
        while (true) {
            try {
                System.out.println(message);
                double result = Double.parseDouble(scanner.nextLine());
                if (result < min ) {
                    System.out.printf(warn + "pháº£i lá»›n hÆ¡n 0.");
                    continue;
                }
                return result;
            } catch (Exception e) {
                System.out.println(warn + "pháº£i lÃ  sá»‘.");
            }
        }
    }

    public static String checkInputnameProductXK(String message) {
        while (true) {
            System.out.println(message);
            String nameProduct = scanner.nextLine();
            if(nameProduct.equalsIgnoreCase("Ao dai") || nameProduct.equalsIgnoreCase("Gao")) {
                return nameProduct;
            } else {
                System.out.println("Tên sản phẩm phải là Ao dai hoặc Gao.");
            }
        }
    }

}
