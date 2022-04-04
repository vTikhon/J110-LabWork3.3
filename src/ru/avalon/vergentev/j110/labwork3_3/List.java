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
    //метод определяющий является ли элемент пустым
    public boolean isEmpty() {
        return head == null;
    }

    //метод добавления элемента в начало списка
    public void addToBegin (String data) {
        if (i==0 && head == null) {
            Linker element = new Linker(new String[5]);
            element.array[i] = data;
            head = element;
            tail = element;
            i++;
        } else if (i==0) {
            Linker element = new Linker(new String[5]);
            element.next = head;
            head = element;
            element.array[i] = data;
            i++;
        } else {
            Linker element = head;
            element.array[i] = data;
            if (element.array[element.array.length - 1] == null) {
                i++;
            } else {
                i = 0;
            }
        }
    }
    //метод добавления элемента в конец списка
    public void addToEnd (String data) {
        if (i==0 && head == null) {
            Linker element = new Linker(new String[5]);
            element.array[i] = data;
            head = element;
            tail = element;
            i++;
        } else if (i==0) {
            Linker element = new Linker(new String[5]);
            tail.next = element;
            tail = element;
            element.array[i] = data;
            i++;
        } else {
            Linker element = tail;
            element.array[i] = data;
            if (element.array[element.array.length - 1] == null) {
                i++;
            } else {
                i = 0;
            }
        }
    }

    //метод печатания заданного в main списка с проверкой его пустоты
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

//    //метод извлечения элемента из начала списка
//    public void extractionFromBegin () {
//        Linker element = head;
//        System.out.println(element.data);
//    }
//    //метод извлечения элемента из конца списка
//    public void extractionFromEnd () {
//        Linker element = tail;
//        System.out.println(element.data);
//    }
//
//    //метод удаления элемента из начала списка
//    public void removingFromBegin () {
//        head = head.next;
//    }
//    //метод удаления элемента из конца списка
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
//    //метод определения на содержание заданного значения
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
//    //метод удаления из списка заданного значения
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
//    //метод добавления к элементам списка заданного значения
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
