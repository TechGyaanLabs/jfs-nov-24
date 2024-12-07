package com.careerit.cj.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssignmentQuestion1 {

    public static void main(String[] args) {

        List<String> friendsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. add 2.delete 3. view 4. exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter the name of the friend :");
                    String name = sc.nextLine();
                    friendsList.add(name);
                    break;
                case 2:
                    System.out.println("Enter the name of the friend to delete :");
                    String delName = sc.nextLine();
                    if(friendsList.contains(delName)) {
                        friendsList.remove(delName);
                    }else{
                        System.out.println("Name "+delName+" not found");
                    }
                    break;
                case 3:
                    if(friendsList.isEmpty()){
                        System.out.println("No friends found");
                    }else {
                        System.out.println(String.join(", ", friendsList));
                    }
                    break;
                case 4:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Enter valid option");
                    sc.close();
            }

        }
    }
}
