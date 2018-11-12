
package kjournal;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalc  {
    /**
 * Подсчёт возраста.                           (1)
 * <p>
 * Берутся две даты, затем вычисляются между ними разница   (2)
 * в годах.
 * </p>
 * And even more explanations to follow in consecutive
 * paragraphs separated by HTML paragraph breaks.
 *
 * @param  birthDate дата рождения человека.          (3)
 * @param  currentDate текущая дата системы, например.
 * @return Кол-во лет.
 */
        public int calculateAge(LocalDate birthDate, LocalDate currentDate) {            
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
    
}