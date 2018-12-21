package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.MemberVariable;
import org.junit.Test;

public class MemberVariableTest {
 @Test
    public void memberVariable () {
     MemberVariable m = new MemberVariable();
     assertEquals("Anusha 21 48000.0", m.memberVariable("Anusha", 21, 48000.0));
 }
}