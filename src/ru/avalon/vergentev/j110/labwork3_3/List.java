package ru.avalon.vergentev.j110.labwork3_3;

public class List {
    private Linker head;
    private Linker tail;
    int i = 0;


    //Constructors
    public List() {
        head = null;
    }

    //Methods
    //����� ������������ �������� �� ������� ������
    public boolean isEmpty() {
        return head == null;
    }

    //����� ���������� �������� � ������ ������
    public void addToBegin (String data) {
        if (i==0 && head == null) {
            Linker element = new Linker(new String[5]);
//            for (int j = 0; j < element.array.length; j++) {
//            element.array[j] = null;
//            }
            element.array[i] = data;
            head = element;
            tail = element;
            i++;
            System.out.println("111");
        } else if (i==0 && head != null) {
            Linker element = new Linker(new String[5]);
//            for (int j = 0; j < element.array.length; j++) {
//                element.array[j] = null;
//            }
            element.array[i] = data;
            i++;
            System.out.println("222");
        } else {
            Linker element = head;
            element.array[i] = data;
            if (element.array[element.array.length - 1] == null) {
                i++;
                System.out.println("333");
            } else {
                element.next = head;
                i = 0;
                System.out.println("444");
            }
        }
    }
    //����� ���������� �������� � ����� ������
//    public void addToEnd (String data) {
//        Linker element = new Linker(new String[5]);
//        element.array[i] = data;
//        if (isEmpty()) {
//            head = element;
//            tail = element;
//            i++;
//        } else if (element.array[element.array.length - 1] == null) {
//            i++;
//        } else if (element.array[element.array.length - 1] != null) {
//            tail.next = element;
//            tail = element;
//            i = 0;
//        }
//    }

    //����� ��������� ��������� � main ������ � ��������� ��� �������
    public void print () {
        Linker element = head;
        if (element != null) {
            while (element != null) {
                for (int j = 0; j < element.array.length; j++) {
                    System.out.print(element.array[j] + ", ");
                }
                System.out.println('\n');
                element = element.next;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
    }

//    //����� ���������� �������� �� ������ ������
//    public void extractionFromBegin () {
//        Linker element = head;
//        System.out.println(element.data);
//    }
//    //����� ���������� �������� �� ����� ������
//    public void extractionFromEnd () {
//        Linker element = tail;
//        System.out.println(element.data);
//    }
//
//    //����� �������� �������� �� ������ ������
//    public void removingFromBegin () {
//        head = head.next;
//    }
//    //����� �������� �������� �� ����� ������
//    public void removingFromEnd () {
//        Linker element = head;
//        while (element != tail) {
//            if (element.next == tail) {
//                tail = element;
//                tail.next = null; break;
//            }
//            element = element.next;
//        }
//    }
//
//    //����� ����������� �� ���������� ��������� ��������
//    public void keySearch (String key) {
//        Linker element = head;
//        while (element != null) {
//            if (element.data == key) {
//                System.out.println("There is the searching element " + key + " at the list. ");
//                System.out.print('\n');
//            }
//            element = element.next;
//        }
//    }
//
//    //����� �������� �� ������ ��������� ��������
//    public void keySearchAndRemove (String key) {
//        Linker element = head;
//        Linker previousElement = head;
//        while (element.data != null && element.data != key) {
//            previousElement = element;
//            element = element.next;
//        }
//
//        if (isEmpty()) {
//            head = head.next;
//        } else {
//            previousElement.next = element.next;
//        }
//    }
//
//    //����� ���������� � ��������� ������ ��������� ��������
//    public void modifyElement (String mod) {
//        Linker element = head;
//        if (element != null) {
//            while (element != null) {
//                element.data = element.data + mod;
//                element = element.next;
//            }
//            System.out.print('\n');
//        } else {
//            throw new IllegalArgumentException("The list is null. ");
//        }
//    }


    //Getters and Setters

}
