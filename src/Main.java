import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        Integer array[]=new Integer[n];
        for(int i=0;i< array.length;i++){
            array[i]=(i%2==0)?(i):-(i+1);
        }
        List<Integer> list= Arrays.asList(array);
        Collections.shuffle(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}