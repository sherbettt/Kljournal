
package kjournal;

import java.util.Arrays;

public class PersonRep {
    
    PersonRep(int dim) {
      Person[] p = new Person[dim];
      Person[] temp_p = null;
     
    /* вычисление пустой ячейки массива */  
    int free = 0; 
     while (p[free] != null && free < p.length) {
    free = free + 1;
    }
     
    /* создание промежуточного массива и его расширение на одну ячейку вправо */ 
    if (free != p.length-1) {
        p[free] = new Person ("Vasya");
    } else 
        temp_p = new Person[p.length];
        for (i=0;i<p.length;i++); {
        temp_p[i] = p[i];
        System.out.println(Arrays.toString(temp_p));
    }
    
    /* возврат значений в исходный массив */    
    p = new Person[1 + temp_p.length];  
      for (int i=0;i<temp_p.length;i++){
          p[i] = temp_p[i];
      }
    
    p[p.length - 1] = new Person ("Vasya"); 
      
   }
         PersonRep rep1 = new PersonRep(5);
        
}
