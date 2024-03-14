package lab_list3;

import java.util.AbstractList;

public class OneWayLinkedListWithHead<E> extends AbstractList<E> {
    private class Element{
        private E value;
        private Element next;
        public E getValue() {
            return value;}
        public void setValue(E value) {
            this.value = value;}
        public Element getNext() {
            return next;}
        public void setNext(Element next) {
            this.next = next;}
        Element(E data){
            this.value=data;}
    }
    Element head=null;
    public OneWayLinkedListWithHead(){}
    public boolean isEmpty(){
        return head==null;}
    @Override
    public void clear() {
        head=null;
    }
    private Element getElement(int index){
        if(index<0) throw new IndexOutOfBoundsException();
        Element actElem=head;
        while(index>0 && actElem!=null){
            index--;
            actElem=actElem.getNext();
        }
        if (actElem==null)
            throw new IndexOutOfBoundsException();
        return actElem;
    }
    @Override
    public boolean add(E e) {
        Element newElem=new Element(e);
        if(head==null){
            head=newElem;
            return true;
        }
        Element tail=head;
        while(tail.getNext()!=null)
            tail=tail.getNext();
        tail.setNext(newElem);
        return true;
    }
    @Override
    public void add(int index, E data) {
        if(index<0) throw new IndexOutOfBoundsException();
        Element newElem=new Element(data);
        if(index==0)
        {
            newElem.setNext(head);
            head=newElem;
        }
        Element actElem=getElement(index-1);
        newElem.setNext(actElem.getNext());
        actElem.setNext(newElem);
    }
    @Override
    public E get(int index) {
        Element actElem = getElement(index);
        return actElem.getValue();
    }
    @Override
    public E set(int index, E data) {
        Element actElem=getElement(index);
        E elemData=actElem.getValue();
        actElem.setValue(data);
        return elemData;
    }
    @Override
    public E remove(int index) {
        if(index<0 || head==null) throw new IndexOutOfBoundsException();
        if(index==0){
            E retValue=head.getValue();
            head=head.getNext();
            return retValue;}
        Element actElem=getElement(index-1);
        if(actElem.getNext()==null)
            throw new IndexOutOfBoundsException();
        E retValue=actElem.getNext().getValue();
        actElem.setNext(actElem.getNext().getNext());
        return retValue;
    }
    @Override
    public int size() {
        int pos=0;
        Element actElem=head;
        while(actElem!=null)
        {
            pos++;
            actElem=actElem.getNext();
        }
        return pos;
    }
}
