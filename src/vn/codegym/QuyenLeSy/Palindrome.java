package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Nhập vào một số nguyên bất kỳ: ");
        number = scanner.nextInt();

        if(isPalindrome(number))
            System.out.println("Số vừa nhập là số đối xứng!");
        else
            System.out.println("Số vừa nhập không phải là số đối xứng!");

    }

    public static int reverse(int number){
        int reverser = 0;
        int temp = 0;
        while (number>0){
            temp = number%10;
            reverser = reverser*10 + temp;
            number/=10;
        }

        return reverser;
    }

    public static boolean isPalindrome(int number){
        if (number == reverse(number))
            return true;
        else
            return false;

    }
}
