
package calculator_conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class interseccion {
    
        public static void main(String[] args) {
            
        Set<String> a= new HashSet<String>();
        a.addAll(Arrays.asList(new String[]{"a","b","c","d","e"}));
        Set<String>b= new HashSet<String>();
        b.addAll(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h"}));
        
        Set<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Interseccion de los dos conjuntos: "+intersection);
    }
}
