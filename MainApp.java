package com.fittrack.main;

import com.fittrack.service.GymService;
import com.fittrack.util.BMIUtil;

import java.util.Scanner;

public class MainApp 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        GymService service = new GymService();

        while (true) 
        {
            try 
            {
                System.out.println("\n===== Personal Fitness Tracker =====");
                System.out.println("1. Create Profile");
                System.out.println("2. View Profile");
                System.out.println("3. Add Weight");
                System.out.println("4. View Progress");
                System.out.println("5. Mark Attendance");
                System.out.println("6. View Attendance");
                System.out.println("7. Add Payment");
                System.out.println("8. View Payments");
                System.out.println("9. Calculate BMI");
                System.out.println("10. Exit");
                System.out.print("Enter choice: ");

                int ch = sc.nextInt();

                switch (ch) 
                {

                    case 1:
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        System.out.print("Enter Height (m): ");
                        double h = sc.nextDouble();
                        service.createProfile(name, age, h);
                        break;

                    case 2:
                        service.viewProfile();
                        break;

                    case 3:
                        System.out.print("Enter Weight (kg): ");
                        service.addWeight(sc.nextDouble());
                        break;

                    case 4:
                        service.viewProgress();
                        break;

                    case 5:
                        service.markAttendance();
                        break;

                    case 6:
                        service.viewAttendance();
                        break;

                    case 7:
                        System.out.print("Enter Amount: ");
                        service.addPayment(sc.nextDouble());
                        break;

                    case 8:
                        service.viewPayments();
                        break;

                    case 9:
                        double bmi = service.calculateBMI();
                        if (bmi != 0) 
                        {
                            System.out.printf("BMI = %.2f\n", bmi);
                            System.out.println("Category: " + BMIUtil.getCategory(bmi));
                        }
                        break;

                    case 10:
                        System.out.println("Exiting... Thank you!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }

            } 
            catch (Exception e) 
            {
                System.out.println("Invalid input! Please try again.");
                sc.nextLine(); 
            }
             sc.close();
        }
        
    }
   
}