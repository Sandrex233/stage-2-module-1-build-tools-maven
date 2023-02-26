package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream()
                .allMatch(arg -> NumberUtils.isCreatable(arg) && NumberUtils.createDouble(arg) > 0);
    }
}