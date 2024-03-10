package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x ->  x.stream().map(each -> each/divider).collect(Collectors.toList());

    }
}
