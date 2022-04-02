package ru.avalon.vergentev.j110.labwork3_3;

public class Main {
    public static void main(String[] args) {
        //работа со списком, который формируется с добавлением элементов в начало
        List myList1 = new List();
        myList1.addToBegin("AAA");
        myList1.addToBegin("BBB");
        myList1.addToBegin("CCC");
        myList1.addToBegin("DDD");
        myList1.print(); //выводим сформированный список
        myList1.extractionFromBegin(); //извлечение из начала списка без удаления
        System.out.print('\n');
        myList1.print(); // проверка того что удаления не произошло
        myList1.removingFromBegin(); //удаление элемента в начале списка
        myList1.print(); // выводим оставшийся список на экран

        //работа со списком, который формируется с добавлением элементов в конец
        List myList2 = new List();
        myList2.addToEnd("aaa");
        myList2.addToEnd("bbb");
        myList2.addToEnd("ccc");
        myList2.addToEnd("ddd");
        myList2.print(); //выводим сформированный список
        myList2.extractionFromEnd(); //извлечение из конца списка без удаления
        System.out.print('\n');
        myList2.print(); // проверка того что удаления не произошло
        myList2.removingFromEnd(); //удаление элемента в конце списка
        myList2.print(); // выводим оставшийся список на экран

        //работа со списком, в котором работает с конкретным элементом
        List myList3 = new List();
        myList3.addToEnd("aaAAaa");
        myList3.addToEnd("bbBBbb");
        myList3.addToEnd("ccCCcc");
        myList3.addToEnd("ddDDdd");
        myList3.print(); //выводим заданный список
        myList3.keySearch("ccCCcc"); //проверяем есть ли в списке элемент
        myList3.keySearch("bBb"); //проверяем есть ли в списке элемент
        myList3.keySearchAndRemove("ccCCcc"); //удаляем заданный элемент
        myList3.print(); //выводим заданный список с удалённым элементом

        //работа со списком, в котором работает с конкретным элементом
        List myList4 = new List();
        myList4.addToEnd("aaAAaa");
        myList4.addToEnd("bbBBbb");
        myList4.addToEnd("ccCCcc");
        myList4.addToEnd("ddDDdd");
        myList4.print(); //выводим заданный список
        myList4.modifyElement("GGG"); //Добавляем к элементам списка GGG
        myList4.print(); //выводим изменённый список


    }
}
