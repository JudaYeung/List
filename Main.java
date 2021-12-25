import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Frederick");
        list.add("Germantown");
        list.add("Arlington");
        list.add("Burbank");

        TestCalculator calculator = new TestCalculator();

        List<String> findWordsThatHasA = calculator.findWordsThatHasA(list);
        System.out.println(findWordsThatHasA);

        List<String> listA = new ArrayList<String>();
        listA.add("Apple");
        listA.add("mango");
        listA.add("Banana");

        List<String> findWordsThatStartsWithCapital = calculator.findWordsThatStartsWithCapital(listA);
        System.out.println(findWordsThatStartsWithCapital);

        List<Integer> listB = new ArrayList<Integer>();
        listB.add(2);
        listB.add(4);
        listB.add(6);
        listB.add(8);

        List<Integer> findNumbersThatGreaterThanX =calculator.findNumbersThatGreaterThanX(listB,3);
        System.out.println(findNumbersThatGreaterThanX);

    }
}