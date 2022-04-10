package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>(3);
        color.add("Red");
        color.add("Green");
        color.add("Black");

        color.ensureCapacity(6);
        color.add("White");
        color.add("Pink");
        color.add("Yellow");

        Collections.reverse(color);

        Collections.shuffle(color);
    }
}
