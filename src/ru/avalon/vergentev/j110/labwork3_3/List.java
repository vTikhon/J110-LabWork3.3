package ru.avalon.vergentev.j110.labwork3_3;

public class List {
    private Linker head;
    private Linker tail;
    private Linker headTemp;
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
            System.out.println("begin 111 " + element.array[i]);
            i++;
        } else if (i==0) {
            Linker element = new Linker(new String[5]);
            element.next = head;
            headTemp = element;

            while (element.next != null) {
                for (int s = 1; s < element.array.length; s++) {
                    element.array[s] = element.next.array[s-1];
                    element.next.array[s-1] = null;
                }
                element.next.array[0] = element.next.array[element.array.length-1];
                element.next.array[element.array.length-1] = null;
                if (element.next != null) {
                    element = element.next;
                }
            }

            element = headTemp;
            head = element;

            element.array[i] = data;
            System.out.println("begin 222 " + element.array[i]);
            i++;
        } else {
            Linker element = head;


            headTemp = element;
            while (element.next != null) {
                for (int s = i; s > 0; s--) {
                    element.next.array[s] = element.next.array[s-1];
                }
                element.next.array[0] = element.array[element.array.length-1];
                for (int s = element.array.length-1; s > i; s--) {
                    element.array[s] = element.array[s-1];
                }
                if (element.next != null) {
                    element = element.next;
                }
            }
            element = headTemp;
            head = element;

//            if (element != tail) {
//                for (int s = i; s > 0; s--) {
//                    tail.array[s] = tail.array[s-1];
//                }
//                tail.array[0] = element.array[element.array.length-1];
//                for (int s = element.array.length-1; s > i; s--) {
//                    element.array[s] = element.array[s-1];
//                }
//            }

            element.array[i] = data;
            if (tail.array[tail.array.length - 1] == null) {
                System.out.println("begin 333 " + element.array[i]);
                i++;
            } else {
                System.out.println("begin 444 " + element.array[i]);
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
            System.out.println("end 111 " + element.array[i]);
            i++;
        } else if (i==0) {
            Linker element = new Linker(new String[5]);
            tail.next = element;
            tail = element;
            element.array[i] = data;
            System.out.println("end 222 " + element.array[i]);
            i++;
        } else {
            Linker element = tail;
            element.array[i] = data;
            if (element.array[element.array.length - 1] == null) {
                System.out.println("end 333 " + element.array[i]);
                i++;
            } else {
                System.out.println("end 444 " + element.array[i]);
                i = 0;
            }
        }
    }

    //метод печатания заданного списка с проверкой его пустоты
    public void print () {
        Linker element = head;
        if (element != null) {
            while (element != null) {
                for (int i = 0; i < element.array.length-1; i++) {
                    System.out.print(element.array[i] + ", ");
                }
                System.out.println(element.array[element.array.length-1]);
                element = element.next;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
    }

    //метод извлечения элемента списка (массива) из начала списка
    public void extractionFromBegin () {
        Linker element = head;
        for (int i = 0; i < element.array.length - 1; i++) {
            System.out.print(element.array[i] + ", ");
        }
        System.out.println(element.array[element.array.length-1]);
    }
    //метод извлечения элемента списка (массива) из конца списка
    public void extractionFromEnd () {
        Linker element = tail;
        for (int i = 0; i < element.array.length - 1; i++) {
            System.out.print(element.array[i] + ", ");
        }
        System.out.println(element.array[element.array.length-1]);
    }

    //метод удаления элемента из начала списка
    public void removingFromBegin () {
        head = head.next;
    }
    //метод удаления элемента списка (массива) из конца списка
    public void removingFromEnd () {
        Linker element = head;
        while (element != tail) {
            if (element.next == tail) {
                tail = element;
                tail.next = null; break;
            }
            element = element.next;
        }
    }

    //метод определения на содержание заданного значения
    public void keySearch (String key) {
        Linker element = head;
        while (element != null) {
            for (String i : element.array) {
                if (i == key) {
                    System.out.println("There is the searching element " + key + " at the list. ");
                    System.out.print('\n');
                }
            }
            element = element.next;
        }
    }

    //метод удаления из массива элемента списка заданного значения
    public void keySearchAndRemove (String key) {
        Linker element = head;
        Linker elementPrevious;
        while (element != null) {
            for (int i = 0; i < element.array.length; i++) {
                if (element.array[i] == key) {
                    while (element.array[i] != null) {
                        if (i == (element.array.length-1)) {
                            elementPrevious = element;
                            element = element.next;
                            elementPrevious.array[elementPrevious.array.length-1] = element.array[0];
                            i = 0;
                        } else {
                            element.array[i] = element.array[i + 1];
                            i++;
                        }
                    }
                }
            }
            element = element.next;
        }
    }

    //метод добавления к элементам массива списка заданного значения
    public void modifyElement (String mod) {
        Linker element = head;
        while (element != null) {
            for (int i = 0; i < element.array.length; i++) {
                element.array[i] = element.array[i] + mod;
            }
            element = element.next;
        }
    }



//        Linker elementNew = new Linker(new String[5]);
//        while (element != null) {
//            for (int i = 0; i < element.array.length; i++) {
//                if (i==0) {
//
//                    elementOld.array[i] = element.array[i];
//                    element.array[i] = elementOld.array[i] + mod;
//                }
//                elementOld.array[i] = element.array[i];
//                element.array[i] = elementOld.array[i] + mod;
//            }
//            element = element.next;
//        }
//    }

    //Getters and Setters
//            if (i==0 && head == null) {
//        Linker element = new Linker(new String[5]);
//        element.array[i] = data;
//        head = element;
//        tail = element;
//        i++;
//    } else if (i==0) {
//        Linker element = new Linker(new String[5]);
//        tail.next = element;
//        tail = element;
//        element.array[i] = data;
//        i++;
//    } else {
//        Linker element = tail;
//        element.array[i] = data;
//        if (element.array[element.array.length - 1] == null) {
//            i++;
//        } else {
//            i = 0;
//        }
//    }

}
