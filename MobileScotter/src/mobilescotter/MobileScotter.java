/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilescotter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author mustafasamil.ileri
 */
public class MobileScotter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);

        System.out.println("            WELCOME TO SHAMIL BIKE");
        System.out.println("                                Date ,Time: " + formattedDate);
        System.out.println("Find a bike(f)\nExit(e)");
        System.out.print("Choose : ");
        while (true) {

            String checkC = scan.next();
            if (checkC.equals("f") || checkC.equals("F")) {
                System.out.println("you have not an account ");
                Client c1 = new Client();
                Functions f1 = new Functions();
                Pay p1 = new Pay();

                f1.Add_Client(c1, p1);
                c1.clientAdd(c1);
                p1.addPay(p1);
                System.out.println("You account was created");

                System.out.println("rent a bike(r)\nsee your account(a)");

                String Cbike = scan.next();

                if (Cbike.equals("r")) {
                    String a = f1.passwordClient();
                    System.out.println("your pin :" + a + "\nPin :");
                    String pin = scan.next();
                    if (pin.equals(a)) {
                        f1.rentaScotter(c1);
                    }

                }
                if (Cbike.equals("a")) {
                    System.out.println("********************");
                    c1.showClient();
                    p1.showPay();
                    System.out.println("********************");
                }
                f1.endTheRent();
            }
            if (checkC.equals("e") || checkC.equals("E")) {
                break;
            }
        }

    }

}
