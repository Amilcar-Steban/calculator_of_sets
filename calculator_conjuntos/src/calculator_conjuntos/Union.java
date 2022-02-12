package calculator_conjuntos;
import java.util.*;


public class Union {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int da_ = sc.nextInt();
        int d2_ = sc.nextInt();
        Set<Integer>a= new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[]{da_}));
        Set<Integer>b= new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{d2_}));
        
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union de los dos conjuntos: "+union);
    }
    
}
