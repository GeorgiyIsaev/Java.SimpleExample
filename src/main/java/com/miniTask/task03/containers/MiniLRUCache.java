package com.miniTask.task03.containers;

public class MiniLRUCache<K, T> {
    private Entry<K,T> head;
    private  Entry<K,T> last;
    private  int size;
    private final static int MAX_SIZE = 4;
    public MiniLRUCache(){
        this.size = 0;
    }
    public int getSize() {
        return size;
    }


    /**
     * Функция - добавляет элемент в конец списка Сложность O(1);
     * (одна итерация)
     * @param key - ключ
     * @param value - значение
     * */
    public void put(K key, T value) {
       if(size>=MAX_SIZE){
           //несуществующий размер (возможно стоит другой Exception поставить)
           throw new ArrayIndexOutOfBoundsException();
       }
       Entry<K,T> exists = this.get(key);
        if(exists != null){
            exists.setValue(value);
            return;
       }


        if (this.head == null) {
            Entry<K,T> entry = new Entry<K,T>(key, value);
            this.head = entry;
            this.last = entry;
        } else {
            Entry<K,T> oldLast = last;
            last.setNext(new Entry<K,T>(key, value));
            this.last = last.getNext();
            this.last.setPrev(oldLast);

        }
        size++;
    }


    /**
     * Функция - перебирает список элементов O(n);
     * (Количество необходимых итераций растет с размером)
     * @param key - ключ
     * @return возвращает Entry<ключ,значение>
     * */
    public Entry<K,T> get(K key){
        Entry<K,T> entry = head;
        while(entry != null){
            if (head.getKey() == key){
                return entry;
            }
            entry=entry.getNext();
        }
        return null;
    }

    /**
     * Функция - удаляет элемент из начала списка - Сложность O(1);
     * (одна итерация)
     * @return возвращает удаленный Entry<ключ,значение>
     * */
    public Entry<K,T> remove(){
        if (this.head == null) {
            throw new IllegalArgumentException();
        }
        Entry<K,T> removeValue = this.head;
        size--;
        this.head = this.head.getNext();
        if(head == null){
            this.last = null;
        }
        else {
            this.head.setPrev(null);
        }

        return removeValue;
    }
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        Entry<K,T>  temp = head;
        while(temp != null){
            string.append("(");
            string.append(temp.getKey());
            string.append(", ");
            string.append(temp.getValue());
            string.append(")");

            if(temp.getNext() != null){
                string.append(",");
            }
            temp=temp.getNext();
        }
        string.append("]");
        return string.toString();
    }



}
