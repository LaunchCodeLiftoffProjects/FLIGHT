package org.example.models;

import java.util.ArrayList;

public class SmoothieRecipes {

//    public static ArrayList<Smoothies> findValue(String value, Iterable<Smoothies> allSmoothies) {
//
//        ArrayList<Smoothies> results = new ArrayList<>();
//
//        if (value.toLowerCase().equals("all")) {
//            return (ArrayList<Smoothies>) allSmoothies;
//        }
//
//        for (Smoothies smoothies : allSmoothies) {
//            String aValue=getValue(smoothies);
//            if (aValue !=null && aValue.toLowerCase().contains(value.toLowerCase())) {
//                results.add(smoothies);
//            }
//        }
//
//        return results;
//    }
//***different function****
//    public static String getValue(Smoothies smoothies, String fieldName) {
//        String theValue;
//        if (fieldName.equals("smoothies")) {
//            theValue=smoothies.getName();
//        }
//        return theValue;
//    }

    public static ArrayList<Smoothies> findValueWithLowercase(String value, Iterable<Smoothies> allSmoothies) {
        String lowercase=value.toLowerCase();

        ArrayList<Smoothies> results=new ArrayList<>();

        for (Smoothies smoothies : allSmoothies) {
            if (smoothies.getName().toLowerCase().contains(lowercase)) {
                results.add(smoothies);
            }
        }
        return results;
    }

}
