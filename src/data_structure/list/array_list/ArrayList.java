package data_structure.list.array_list;

import java.util.Arrays;

/**
 * @author Jeff Li, Kong Shuen
 * @description
 * @date 22/8/2021 - 17:59
 */
public class ArrayList {
    private int size;
    private int capacity = 16;
    private Object[] list;
    public ArrayList() {
        list = new Object[capacity];
    }

    public ArrayList(int capacity) {
        this.capacity = capacity;
        list = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public Object[] getList() {
        return list;
    }

    private void expendCapacity(){
        capacity *= 2;
        Object[] list2 = new Object[capacity];
        for (int i = 0; i < size; i++) {
            list2[i] = list[i];
        }
        list = list2;
        list2 = null;
    }

    public boolean add(Object ele){
        if (size >= capacity){
            expendCapacity();
        }
        list[size] = ele;
        size += 1;
        return true;
    }

    public boolean remove(int index){
        if (size == 0 || index >= size){
            return false;
        }
        for (int i = index; i < size-1; i++) {
            list[i] = list[i+1];
        }
        size -= 1;
        return true;
    }

    public boolean remove(Object ele){
        int index = indexOf(ele);
        if (index == -1) {
            return false;
        }else{
            remove(index);
            return true;
        }
    }

    public Object set(int index, Object ele){
        Object oldEle = list[index];
        list[index] = ele;
        return oldEle;
    }

    public void clear(){
        list = new Object[capacity];
        size = 0;
    }

    public boolean contains(Object ele){
        for (int i = 0; i < size; i++) {
            if (list[i].equals(ele)){ return true;}
        }
        return false;
    }

    public Object get(int index){
        try {
            return list[index];
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int indexOf(Object ele){
        for (int i = 0; i < size; i++) {
            if (list[i].equals(ele)) {return i;}
        }
        return -1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int lastIndexOf(){
        return size-1;
    }

    public void display(){
        for (int i = 0; i < size-1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[size-1]);
    }

    public ArrayList clone(){
        ArrayList newList = new ArrayList(capacity);
        for (int i = 0; i < size; i++) {
            newList.list[i] = list[i];
        }
        newList.size = size;
        return newList;
    }

    public Object[] toArray(){
        Object[] array = new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = list[i];
        }
        return array;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && this.getClass() != obj.getClass()) return false;
        ArrayList list = (ArrayList) obj;
        return (size == list.size) && (capacity == list.capacity) && Arrays.equals(toArray(), list.toArray());
    }

}
