package Spring_BeanInheritance.Spring_BeanInheritance;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.Spring.akash.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        
        XmlBeanDefinitionReader rd= new XmlBeanDefinitionReader(factory);
//        
//         int i=rd.loadBeanDefinitions("com/Spring/cfg/applicationContext.xml");
//         System.out.println(i);
//         
//         Car car=factory.getBean("car",Car.class);
//         System.out.println(car);
//         
//         System.out.println("--------------------------------------------------------");
//         
//         Car car1=factory.getBean("car1",Car.class);
//         System.out.println(car1);
         
         int i=rd.loadBeanDefinitions("com/Spring/cfg/applicationContext2.xml");
         System.out.println(i);
         
         Car car=factory.getBean("car1",Car.class);
         System.out.println(car);
         
         System.out.println("--------------------------------------------------------");
         
         Car car1=factory.getBean("car2",Car.class);
         System.out.println(car1);
    }
}
