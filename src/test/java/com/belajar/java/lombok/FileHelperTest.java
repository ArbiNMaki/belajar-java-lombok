package com.belajar.java.lombok;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileHelperTest {

    @Test
    void testPom() throws Exception {
        String text = FileHelper.loadFile("pom.xml");
        System.out.println(text);
    }
}
