package array;

public class Main {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();

        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println("myList = " + myList);

        System.out.println("myList.get(1) = " + myList.get(1));

        System.out.println("indexOf(5) = " + myList.indexOf(5));

        System.out.println("indexOf(4) = " + myList.indexOf(4));

        myList.set(1, 100);
        System.out.println("myList.get(1) = " + myList.get(1));

        myList.remove(4);
        System.out.println("myList.remove(4);");
        System.out.println("myList = " + myList);
    }
}
