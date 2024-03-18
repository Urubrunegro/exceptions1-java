package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/NN/yyyy");

    System.out.print("Room number: ");
    int number = sc.nextInt();
    System.out.print("Check-in date: ");
    Date checkIn = sdf.parse(sc.next());

    System.out.print("Check-out date: ");
    Date checkOut = sdf.parse(sc.next());



    sc.close();
    }
}
