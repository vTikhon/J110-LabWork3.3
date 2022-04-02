package ru.avalon.vergentev.j110.labwork3_3;

public class Main {
    public static void main(String[] args) {
        //������ �� �������, ������� ����������� � ����������� ��������� � ������
        List myList1 = new List();
        myList1.addToBegin("AAA");
        myList1.addToBegin("BBB");
        myList1.addToBegin("CCC");
        myList1.addToBegin("DDD");
        myList1.print(); //������� �������������� ������
        myList1.extractionFromBegin(); //���������� �� ������ ������ ��� ��������
        System.out.print('\n');
        myList1.print(); // �������� ���� ��� �������� �� ���������
        myList1.removingFromBegin(); //�������� �������� � ������ ������
        myList1.print(); // ������� ���������� ������ �� �����

        //������ �� �������, ������� ����������� � ����������� ��������� � �����
        List myList2 = new List();
        myList2.addToEnd("aaa");
        myList2.addToEnd("bbb");
        myList2.addToEnd("ccc");
        myList2.addToEnd("ddd");
        myList2.print(); //������� �������������� ������
        myList2.extractionFromEnd(); //���������� �� ����� ������ ��� ��������
        System.out.print('\n');
        myList2.print(); // �������� ���� ��� �������� �� ���������
        myList2.removingFromEnd(); //�������� �������� � ����� ������
        myList2.print(); // ������� ���������� ������ �� �����

        //������ �� �������, � ������� �������� � ���������� ���������
        List myList3 = new List();
        myList3.addToEnd("aaAAaa");
        myList3.addToEnd("bbBBbb");
        myList3.addToEnd("ccCCcc");
        myList3.addToEnd("ddDDdd");
        myList3.print(); //������� �������� ������
        myList3.keySearch("ccCCcc"); //��������� ���� �� � ������ �������
        myList3.keySearch("bBb"); //��������� ���� �� � ������ �������
        myList3.keySearchAndRemove("ccCCcc"); //������� �������� �������
        myList3.print(); //������� �������� ������ � �������� ���������

        //������ �� �������, � ������� �������� � ���������� ���������
        List myList4 = new List();
        myList4.addToEnd("aaAAaa");
        myList4.addToEnd("bbBBbb");
        myList4.addToEnd("ccCCcc");
        myList4.addToEnd("ddDDdd");
        myList4.print(); //������� �������� ������
        myList4.modifyElement("GGG"); //��������� � ��������� ������ GGG
        myList4.print(); //������� ��������� ������


    }
}
