import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Input n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ArrayList<ArrayList<Integer>> fullArray = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            fullArray.add(makeLine(n));
        }

        ArrayList<String> answer = new ArrayList<String>();
        int q = s.nextInt();
        for (int i = 1; i <= q; i++) {
            System.out.print("Input x for Query" + i + ": ");
            int x = s.nextInt();

            System.out.print("Input y for Query" + i + ": ");
            int y = s.nextInt();

            if (y < fullArray.size()) {
                answer.add(Integer.toString())
            }
        }
    }

    public static ArrayList<Integer> makeLine(int n) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Input d for Line" + i + ": ");
            int d = s.nextInt();
            numList.add(d);

            for (int a = 0; a < d; a++) {
                System.out.println("Input a number for Line" + i + ": ");
                numList.add(s.nextInt());
            }
        }
        return numList;
    }
}
