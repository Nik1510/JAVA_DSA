package Linked_List.Double_LL;

import Linked_List.LL;

public class Main {
    public static void main(String[] args) {
      DLL list = new DLL();
      list.insertFirst(3);
      list.insertFirst(2);
      list.insertFirst(8);
      list.insertFirst(17);

      list.insertLast(99);

      list.insert(8,65);

      list.display();
    }
}

