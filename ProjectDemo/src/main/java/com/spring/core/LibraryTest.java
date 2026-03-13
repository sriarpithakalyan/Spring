package com.spring.core;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("library.xml");
        Library lab = (Library) context.getBean("lab");
        
        List<Book> list = lab.getBooks();
        for (Book b : list) {
            System.out.println(b);
        }
        context.close();
    }
}