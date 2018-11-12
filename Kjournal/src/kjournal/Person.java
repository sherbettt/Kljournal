
package kjournal;

import java.time.LocalDate;
import java.util.Scanner;


public class Person {
  
    public void exmlp(String[] args) {
    
        Scanner v = new Scanner(System.in);  
        System.out.print("Введите ФИО: ");
        String fio = v.nextLine();
        System.out.print("Введите день рождения: ");
         int birthday = v.nextInt();
        System.out.print("Введите месяц рождения: ");
         int birthmonth = v.nextInt();
        System.out.print("Введите год рождения: ");
         int birthyear = v.nextInt();
        System.out.print("Введите id человека: ");
         int id = v.nextInt(); 
    
    LocalDate birthdate = LocalDate.of(birthyear, birthmonth, birthday);
    LocalDate birthdate18 = birthdate.plusYears(18);
    LocalDate birthdate2018 = birthdate.withYear(2018);
      System.out.println(birthdate2018);
      System.out.println(birthdate18);
           
    AgeCalc age = new AgeCalc();
    System.out.println(age.calculateAge(birthdate, LocalDate.now() ));
      
 }
}    

