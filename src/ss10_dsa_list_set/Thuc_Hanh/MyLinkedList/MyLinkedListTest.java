package ss10_dsa_list_set.Thuc_Hanh.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(0);
        for (int i = 1; i < 5; i++) {
            list.add(i, i);
        }
        list.addFirst(-1);
        list.printList();
        System.out.println(list.get(2));
    }
}
