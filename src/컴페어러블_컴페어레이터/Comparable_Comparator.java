package 컴페어러블_컴페어레이터;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Comparable_Comparator {
    public static void main(String[] args){
        int[] intArr = {10, 30 ,6, 4, 7, 9};
        int[] intArr2 = {5, 7, 0, 12, 45, 6};

        HashSet<Integer> intSet = new HashSet<>();
        for(int e : intArr) intSet.add(e);
        for(int e : intArr2) intSet.add(e);

//        for(Integer e : intSet) System.out.print(e + " ");
//        System.out.println();
        List<Integer> intList = new ArrayList<>(intSet);

//        intList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 > o2) return 1;
//                else return -1;
//            }
//        });
//        for(Integer e : intList) System.out.print(e + " ");
//        System.out.println();

    }
}
