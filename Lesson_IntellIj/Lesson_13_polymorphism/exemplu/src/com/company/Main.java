package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        byte[] cont = {1, 5, 7, 8};
        File file = new ImagineFile("Picture", 18, 17,cont);

        file.printFileInfo();
    }
}
