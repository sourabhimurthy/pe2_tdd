package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;
public class MemberVariableTest {

    @Test
    public void CompleteDetails() {
        MemberVariable v = new MemberVariable();

        String result = v.addMember("Unknown",24,24.0);

        assertArrayEquals("Unknown 24 24.0", result);
    }

    @Test
    public void InCompleteDetailsName() {
        MemberVariable v = new MemberVariable();

        String result = v.addMember(" ",24,24.0);

        assertArrayEquals("  24 24.0", result);
    }

    @Test
    public void InCompleteDetailsAge() {
        MemberVariable v = new MemberVariable();
        Scanner sc = new Scanner("");

        String result = v.addMember("Unknown", sc.nextInt(),24.0);

        assertArrayEquals("Unknown 24.0", result);
    }

    @Test
    public void InCompleteDetailsSalary() {
        MemberVariable v = new MemberVariable();
        Scanner sc = new Scanner("");

        String result = v.addMember("Unknown", 24,sc.nextInt());

        assertArrayEquals("Unknown 24", result);
    }



}
