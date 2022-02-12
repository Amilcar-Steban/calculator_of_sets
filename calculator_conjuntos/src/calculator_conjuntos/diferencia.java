
package calculator_conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class diferencia {
    public static void main(String[] args) {
            
        Set<String> a= new HashSet<String>();
        a.addAll(Arrays.asList(new String[]{"2","5","3"}));
        Set<String>b= new HashSet<String>();
        b.addAll(Arrays.asList(new String[]{"4","2","3","7"}));
        
        Set<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        
        Set<String> diferencia_a_b = new HashSet<>(a);
        diferencia_a_b.removeAll(intersection);
        
        Set<String> diferencia_b_a = new HashSet<>(b);
        diferencia_b_a.removeAll(intersection);
        
        Set<String> union = new HashSet<String>(diferencia_a_b);
        union.addAll(diferencia_b_a);
        
        
        System.out.println("Diferencia Simétrica de los dos conjuntos: " + union);
        /**
        Set<String> diferencia_a_b = new HashSet<>(a);
        diferencia_a_b.removeAll(b);
        System.out.println("Interseccion de los dos conjuntos: "+diferencia_a_b);
        * */
    
    }
    
    
}
