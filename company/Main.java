package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    var i = 0;
        List<Integer> resultList = new ArrayList<>();
        List<Integer> ageList = new ArrayList<Integer>(Arrays.asList(18, 20, 21, 21, 23));

        Collections.sort(ageList);
        while (ageList.size() >= 2) {
            var sumResult = 2 + ageList.get(i);
            if (sumResult >= ageList.get(i + 1)) {
                resultList.add(ageList.get(i + 1));
                ageList.remove(i+1);
            } else {
                resultList.add(ageList.get(i));
                ageList.remove(i);
                Collections.sort(resultList);
                System.out.println(resultList);
                resultList.clear();
            }
        }
        resultList.add(ageList.get(i));
        Collections.sort(resultList);
        System.out.println(resultList);
    }
}
