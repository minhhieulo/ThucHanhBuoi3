package Cau1;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Order order = new Order();
        System.out.print("Nhap ma hoa don: ");
        int orderID = sc.nextInt();
        order.setOrderID(orderID);
        order.setOrderDate(LocalDate.now());
        
        boolean running = true;
        while (running) {
        	
            System.out.println("1. Them San Pham 1 ");
            System.out.println("2. In hoa don");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: 
                	order.Nhap();
                	break;
                case 2:
                	order.in();
                	break;
                case 0: 
                	running = false;
                	break;
                default:
                System.out.println("Lua chon khong hop le!");
                break;
            }
            sc.nextLine(); 
        }
        
        System.out.println("Cam on da su dung chuong trinh!");
    }
}
