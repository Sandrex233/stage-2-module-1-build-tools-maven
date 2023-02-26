package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        return org.apache.commons.lang3.StringUtils.isNumeric(str) && Double.parseDouble(str) > 0;
    }
}
