package ss10_dsa_list_set.Thuc_Hanh.MyArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(10);
        System.out.println(listInteger.get(2));
        listInteger.remove(2);
        System.out.println(listInteger.get(2));
        System.out.println(listInteger.size());
        System.out.println(listInteger.contain(11));
        System.out.println(listInteger.indexOf(10));
        listInteger.clear();
        System.out.println(listInteger.get(3));
    }
}
