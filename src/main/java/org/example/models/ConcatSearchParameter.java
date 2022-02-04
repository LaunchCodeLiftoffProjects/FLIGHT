package org.example.models;


public class ConcatSearchParameter {

    public static String concatSearchParameterApi(String userStr) {
        String newString;
        if (userStr.contains(" ")) {
            newString = userStr.replace(" ", "%20");
        } else {
            return userStr;
        }

        return newString;

    }
}