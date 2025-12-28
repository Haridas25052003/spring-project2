package spring_project2.spring_project2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        
        StudentDao sd=context.getBean(StudentDao.class);
        
        Student s=new Student ();
        
        s.setName("Haridas Shinde");
        s.setCity("pusad");
        s.setPercentage(67.00);
        
        System.out.println(sd.insertStudent(s));
    }
}
