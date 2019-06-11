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


                itr.restart();
                while(itr.hasNext()){
                        Object obj = (String)itr.next();
                        System.out.println(obj);
                        itr.addHere(obj);
                }

                itr.restart();
                while(itr.hasNext()){
                        System.out.println(itr.next());
                }
        }
}
