package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.StudentsGrades;
import org.junit.Test;

public class StudentsGradesTest {
    @Test
    public void validInput_1(){
        StudentsGrades studentGrades = new StudentsGrades();
        int grades[]={98,90,87,95};
        assertEquals("error",sg.validInput(-4,grades));
    }
    @Test
    public void validInput_2(){
        StudentsGrades studentGrades = new StudentsGrades();
        int grades[]={100,120,25,97};
        assertEquals("error",sg.validInput(4,grades));
    }
    @Test
    public void averageGrade(){
        StudentsGrades studentGrades = new StudentsGrades();
        int grades[]={98,90,87,95};
        assertEquals(92.5,sg.averageGrade(4,grades));
    }
    @Test
    public void minGrade(){
        StudentsGrades studentGrades = new StudentsGrades();
        int grades[]={98,90,87,95};
        assertEquals(87,sg.minGrade(4,grades));
    }
    @Test
    public void maxGrade(){
        StudentsGrades studentGrades = new StudentsGrades();
        int grades[]={98,90,87,95};
        assertEquals(98,sg.maxGrade(4,grades));
    }

}