package by.grechny.junit;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public static void main (String args []) {

        Sum main = new Sum();
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (String arg : args) {
            num.add(Integer.parseInt(arg));
        }

        System.out.println("sum is " + main.getSum(num));

    }

    public int getSum (List<Integer> num){

        int sum =0;
        for (int aNum : num) {
            sum += aNum;
        }

        return sum;
    }

}
