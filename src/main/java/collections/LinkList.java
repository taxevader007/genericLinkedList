package collections;

public class LinkList<T> {

    private Node<T> first;
    private Node<T> last;
    int size;

    public LinkList() {
        this.first = null;
        this.last = null;
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {


            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    //cambiar conta
    public boolean contains(T data){
        if(first == null){
            return false;
        }
        else{

            return contains(data, first);
            
        }
    

    }


    public boolean contains(T target, Node<T> current){
        if(current.getData().equals(target)){
            return true;
        }
        else if(current.getNext() == null){
            return false;
        }
        else{
            return contains(target, current.getNext());
        }

    }

    public boolean delete(T data){
        if(first == null){
            return false;
        }
        else{
            return delete(null, data, first);
        }

 

        
        


    }

    public boolean delete(Node<T> previous,T data, Node<T> current){

        if(data.equals(current.getData())){
            if(current == first){
                first = first.getNext();
                if(size == 1){
                    last = null;
                }
                size--;
                return true;
            }
            else if(current == last){
                last = previous;
                last.setNext(null);
                size--;
                return true;
            }
            else{
                previous.setNext(current.getNext());
                size--;
                return true;
            }
        }
        else if(current.getNext() == null){
            return false;
        }
        else{
            return delete(current, data, current.getNext());
        }


    
    }


    public boolean isEmpty() {
        return first == null;
    }

    public int getSize(){
        return size;
    }

    public Node<T> getLast() {
        return last;
    }

    public Node<T> getFirst() {
        return first;
    }

    public String toString() {
        String result = "";
        Node<T> current = first;
        while (current != null) {
            result += current.getData() + "\n";
            current = current.getNext();
        }
        return result;
    }
}