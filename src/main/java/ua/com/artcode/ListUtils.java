package ua.com.artcode;

public class ListUtils {

    public static A<String> createStringList() {
        A<String> head = new Node<>("A");
        A<String> second = new Node<>("B");
        A<String> third = new Node<>("C");
        A<String> fourth = new Node<>("D");
        A<String> fifth = new Node<>("E");
        A<String> sixth = new Node<>("F");
        A<String> seventh = new Node<>("G");
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        return head;
    }

    public static <T> A<T> reversion(A<T> head) {
        //return Node.reverse((Node) head);
        A<T> tail = head;

        int size = 0;

        while (tail.getNext() != null) {//находим хвост который станет головой
            tail = tail.getNext();
            size++;//подсчет размера списка(нужен для того что бы  цикле  for  бежать по списку.
        }

        A<T> copyTail = tail;

        for (int i = 1; i <= size; i++) {

            A<T> copyHead = head;
            while (copyHead.getNext() != tail) {//находим предпоследний елемент
                copyHead = copyHead.getNext();
            }
            tail.setNext(copyHead);//устанавливаем следующий на предедущий
            tail = copyHead;
            copyHead.setNext(null);
        }

        return copyTail;
    }
}
