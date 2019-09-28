package com.yisui;
import com.yisui.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        {
            MessageService service = new MessageService();
            service.PrintName();
            System.out.println( "Hello World!" );
        }

        {
            ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        }
    }
}
