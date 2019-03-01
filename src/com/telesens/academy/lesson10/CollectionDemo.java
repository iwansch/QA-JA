package com.telesens.academy.lesson10;

import com.telesens.academy.lesson06.Abonent;
import com.telesens.academy.lesson06.AbonentParser;
import com.telesens.academy.lesson08.ParseAbonentException;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        String[] abonentRawArray = {
                " heLen iVanova 35 f 0501234567",
                " Андрей Сидоров 26 m 0501234568",
                " Peter Lvovich 37 m 0501234569",
        };

        try {
            Abonent[] abonentArray = parseAbonents(abonentRawArray);

            List<Abonent> abonentList = new ArrayList<>();

            for (Abonent abonent : abonentArray);
            Abonent abonent;

            List<Abonent> abonentList2 = new ArrayList<>();

            System.out.println(abonentList.equals(abonentList2));


            System.out.println(abonentList);

            System.out.println(abonentList2);

            System.out.println (Arrays.toString(abonentArray));

        } catch (ParseAbonentException e) {
            e.printStackTrace();
        }
    }

    private static Abonent[] parseAbonents(String[] abonentRawArray) throws ParseAbonentException {
        Abonent[] abonents = new Abonent[abonentRawArray.length];
        for (int i = 0; i < abonentRawArray.length; i++) {

            abonents[i] = AbonentParser.parseAbonent(abonentRawArray[i]);
        }
        return abonents;

    }

}