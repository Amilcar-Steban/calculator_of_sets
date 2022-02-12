
package calculator_conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class diferencia_2 {
    public static void main(String[] args) {
            
        Set<String> a= new HashSet<String>();
        a.addAll(Arrays.asList(new String[]{"a","b","c","d","e"}));
        Set<String>b= new HashSet<String>();
        b.addAll(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h"}));
        
        Set<String> diferencia_a_b = new HashSet<>(b);
        diferencia_a_b.removeAll(a);
        System.out.println("Interseccion de los dos conjuntos: "+diferencia_a_b);
    
    }
}
