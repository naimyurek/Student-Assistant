package com.hns.oop.exam;

import com.hns.oop.exceptions.ParserException;
import java.util.ArrayList;
import org.junit.Test;

public class OsymParserTest {
    
    @Test
    public void testGetList() {
        System.out.println("getList");
        try {
            ArrayList<Exam> result = ÖsymParser.getParser().getList();
            //result.forEach(System.out::println);
        } catch (ParserException ex) {
            System.out.println(ex);
        }
    }
    
}
