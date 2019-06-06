import java.util.NoSuchElementException;
import java.util.Iterator;

//Generic LinkedList class with generic Node inner class
public class LinkedList<T>{

    private Node<T> head;

    public LinkedList(){head = null;}

    public LinkedList(T data){
        head = new Node<T>(data);
    }


/**
    public LinkedList(Collection<? extends T> c){
       this(); //sets head = null by invoking empty constructor
       this.addAll(c);  //have to write and addAll() function
                        //implementing this addAll(Collection<? extends T> c) method is necessary when extending/implementing Java Collection Framework
                        //more specifically, the ACTUAL LinkedList class extends AbstractSequentialList<> and implements List<> interface
                        //requiring the definition of addAll() and many other methods
                        //The point with this constructor is working with the Java Collection Framework and making my LinkedList class 'practical'
    }
*/



    public void append(T data){
        if(head == null) return;

        Node<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node<T>(data);
    }


    //just creates new head node
    public void prepend(T data){
        head = new Node<T>(data, head);
    }


    //deletes the node containing 'data' if exists
    public void deleteWithValue(T data){
        if(head == null) return;
        if(head.data.equals(data)){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.data.equals(data)){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }


    public ListIterator<T> iterator(){
        return new ListIterator<T>();
    }



    public class ListIterator<T>{
        private Node<T> current, previous;

        public ListIterator(){
                current = (Node<T>)head;
                previous = null;
        }

        public void restart(){
                current = (Node<T>)head;
                previous = null;
        }

        public <T> T next(){
                if(!hasNext()) throw new NoSuchElementException();

                T temp = (T)current.data;
                previous = current;
                current = current.next;
                return temp;
        }

        public boolean hasNext(){
                return (!(current == null));
        }

        public <T> T peek(){
                if(!hasNext()) throw new IllegalStateException();

                return (T)current.data;
        }

        public void delete(){
                if(current == null) throw new IllegalStateException();
                else if(previous == null){ //meaning that current points to head node
                        head = head.next;
                        current = (Node<T>)head;
                        //prevoius is still null
                }
        }


        public void addHere(T data){
                if(current == null && previous != null){ //if at end of list
                        previous.next = new Node<T>(data);
                }else if(current == null || previous == null){ //if list is empty of current points to head
                        LinkedList.this.prepend((T)data);
                }else{
                        Node<T> temp = new Node(data, current);
                        previous.next = temp;
                        previous = temp;
                }

        }


        public void changeHere(T data){
                if(current == null) throw new IllegalStateException();
                else current.data = data;
        }
    }






    //Node inner class
    private class Node<T>{
        private T data;
        private Node<T> next;

        public Node(){
            data = null;
            next = null;
        }

        public Node(T data){
            this.data = data;
            next = null;
        }

        public Node(T data, Node<T> ref){
            this.data = data;
            next = ref;
        }
    }//End of Node class

}
