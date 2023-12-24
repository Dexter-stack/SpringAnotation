package org.dexter;

import org.core.BeanConfig;
import org.core.Doctor;
import org.core.Nurse;
import org.core.Staff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


//        ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
//        Nurse doctor = context.getBean(Nurse.class);
//        doctor.assist();

        ApplicationContext context =  new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor =  context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
//        System.out.println(doctor);
//
//        Doctor doctor1 =  context.getBean(Doctor.class);
//
//        System.out.println(doctor1);


    }
}