import java.util.*;

public class IteratorTest{
        public static void main(String[] args){
                LinkedList<String> myList = new LinkedList<String>();
                LinkedList.ListIterator itr = myList.iterator();

                myList.append("Joe");
                myList.append("John");
                myList.append("Maxamillion");
                myList.append("Herbert");
                myList.append("Angela");
                myList.append("Kyle");
                myList.append("Margaret");
                myList.append("Marissa");
                myList.append("Sally");
                myList.append("Jenny");
                myList.append("Harry");


                while(itr.hasNext()){
                        System.out.println(itr.next());
                }
        }
}
