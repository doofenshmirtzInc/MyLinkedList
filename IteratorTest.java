import java.util.*;

public class IteratorTest{
        public static void main(String[] args){
                LinkedList<String> myList = new LinkedList<String>();
                LinkedList.ListIterator itr = myList.iterator();

                itr.addHere("Joe");
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

                itr.addHere("Joe");
                itr.addHere("John");
                itr.addHere("Maxamillion");
                itr.addHere("Herbert");
                itr.addHere("Angela");
                itr.addHere("Kyle");
                itr.addHere("Margaret");
                itr.addHere("Marissa");
                itr.addHere("Sally");
                itr.addHere("Jenny");
                itr.addHere("Harry");

                itr.restart();
                while(itr.hasNext()){
                        System.out.println(itr.next());
                }
        }
}
