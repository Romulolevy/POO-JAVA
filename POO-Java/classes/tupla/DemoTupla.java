package classes.tupla;

public class DemoTupla {
    
    public static void main(String[] args) {
        Tupla<String,Double> t1 = new Tupla <>("UFERSA", 145.89);
        System.out.println(t1);

        Tupla<Character,Integer> t2 = new Tupla<>('F', 35);
        System.out.println(t2);
    }
}
