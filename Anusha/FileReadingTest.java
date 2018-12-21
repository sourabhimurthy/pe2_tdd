package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.FileReading;
import org.junit.Test;

public class FileReadingTest {
    @Test
    public void readAFile(){
        FileReading fr = new FileReading();
        assertEquals("This program is to read a file as input and converts it to uppercase and prints the length of the file",fr.Filereading());
    }

}