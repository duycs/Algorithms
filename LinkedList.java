public class LinkedList {
  private Note first;
  private Node last;
  
  public void addFirst(int item){
    var node = new Node(item);
    
    if (isEmpty()) {
      first = last = node;
    } else {
      node.next = first;
      first = node;
    }
  }
  
  public void addLast(int item){
    var node = new Node(item);
    
    if (isEmpty()) {
      first = last = node;
    } else {
      last.next = node;
      last = node;
    }
  }

  public void removeFirst(){
    if (isEmpty()) throw new NoSuchElementException();
    
    if (first == last) {
      first = last = null;
      return;
    }
    
    var second = first.next;
    first.next = null;
    first = second;
  }
  
  public void removeLast(){
    if (isEmpty()) throw new NoSuchElementException();
    
    var previous = getPrevious(last);
    last = previous;
    last.next = null;
  }
  
  public boolean contains(int item){
    return indexOf(item) != -1;
  }
  
  public int indexOf(int item){
    index = 0;
    var current = first;
    
    while(current != null) {
      if(current.value == item) return index;
      current = current.next;
      index++;
    }

    return -1;
  }
  
  private Node getPrevious(Node node){
    var current = first;
    
    while (current != null) {
      if (current.next == node) return current;
      current = current.next;
    }
    
    return null;
  }
  
  private boolean isEmpty(){
    return first == null;
  }
   
  private class Node {
    private int value;
    private Node next;
    
    public Node(int value){
      this.value = value;
    }
  }
  
}
