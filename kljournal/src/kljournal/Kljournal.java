 /**
 *
 * @author Kirill Korablin. RE.
 */

package kljournal;

import java.time.LocalDate;
 /* import java.time.Period;
    import java.util.Calendar;
    import java.util.Date; */
import java.util.Scanner;

public class Kljournal {


    public static void main(String[] args) {
        
        Scanner in;
        in = new Scanner(System.in); 
        System.out.print("Введите ФИО: ");
        String fio = in.nextLine();
      /*  System.out.print("Введите возраст: ");
        int age = in.nextInt(); */
        System.out.print("Введите день рождения: ");
         int birthday = in.nextInt();
        System.out.print("Введите месяц рождения: ");
         int birthmonth = in.nextInt();
        System.out.print("Введите год рождения: ");
         int birthyear = in.nextInt();
        System.out.print("Введите id человека: ");
         int id = in.nextInt(); 
    
    LocalDate birthdate = LocalDate.of(birthyear, birthmonth, birthday);
    LocalDate birthdate18 = birthdate.plusYears(18);
    LocalDate birthdate2018 = birthdate.withYear(2018);
      System.out.println(birthdate2018);
      System.out.println(birthdate18);
           
  AgeCalc age = new AgeCalc();
  System.out.println(age.calculateAge(birthdate, LocalDate.now() ));
      
    }
    
}
