package fr.arolla.java8esgi.partiel;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VilleTest {
    @Test
    public void name() throws Exception {
        String data = "1\t75\tParis\t2181371\n" +
                "2\t13\tMarseille\t839043\n" +
                "3\t69\tLyon\t472305\n" +
                "4\t31\tToulouse\t437715\n" +
                "5\t06\tNice\t347060\n" +
                "6\t44\tNantes\t282853\n" +
                "7\t67\tStrasbourg\t272975\n" +
                "8\t34\tMontpellier\t251634\n" +
                "9\t33\tBordeaux\t232260\n" +
                "10\t59\tLille\t226014\n" +
                "11\t35\tRennes\t209613\n" +
                "12\t51\tReims\t183837\n" +
                "13\t76\tLe Havre\t182580\n" +
                "14\t42\tSaint-Étienne\t177480\n" +
                "15\t83\tToulon\t167816\n" +
                "16\t38\tGrenoble\t156107\n" +
                "17\t49\tAngers\t152337\n" +
                "18\t21\tDijon\t151504\n" +
                "19\t29\tBrest\t144548\n" +
                "20\t72\tLe Mans\t144016\n" +
                "21\t30\tNîmes\t144092\n" +
                "22\t13\tAix-en-Provence\t142534\n" +
                "23\t63\tClermont-Ferrand\t138992\n" +
                "24\t37\tTours\t136942\n" +
                "25\t974\tSaint-Denis\t138314\n";

        System.out.println(data);


        printCityClasses(data);
    }

    private void printCityClasses(String data) {

        String[] split = data.split("\n");
        System.out.println(Arrays.toString(split));

        int countA = 0;

        for (String s : split) {
            String[] columns = s.split("\t");

            String column = columns[3];

            if (Integer.parseInt(column) > 1_000_000) {
                countA++;
            } else if (Integer.parseInt(column) > 500_000) {
                countB++;
                System.out.println("B");
            } else if (Integer.parseInt(column) > 200_000) {
                System.out.println("C");
            } else if (Integer.parseInt(column) > 100_000) {
                System.out.println("D");
            }
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", countA);
        map.put("B", 1);
        map.put("C", 9);
        map.put("D", 14);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s: %4d%n", entry.getKey(), map.get(entry.getKey()));
        }
    }
}
