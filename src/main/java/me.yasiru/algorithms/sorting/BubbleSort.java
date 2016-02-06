package me.yasiru.algorithms.sorting;

/**
 * Created by wik2kassa on 1/20/2016.
 */
public class BubbleSort<T extends Comparable<T>> {
    private T[] subject;
    boolean ascending;
    public BubbleSort() {
        ascending = true;
    }
    public  T[] sort(T[] array) {
        subject = array;
        sort();
        return subject;
    }
    public  T[] sort(T[] array, boolean order) {
        ascending = order;
        subject = array;
        sort();
        return subject;
    }

    public void sort() {
        T temp;
        boolean swapped = true; //assume we need to swap two elements the least
        while(swapped) {
            swapped = false;
            for (int i = 1; i < subject.length; i++) {
                if(compare(subject[i-1], subject[i])){
                    temp = subject[i-1];
                    subject[i-1] = subject[i];
                    subject[i] = temp;
                    swapped = true;
                }
            }
        }
    }

    public void setSubject(T[] subject) {
        this.subject = subject;
    }

    public T[] getSubject() {
        return subject;
    }
    private boolean compare(T obj1, T obj2) {
        return ascending ? obj1.compareTo(obj2) > 0 :obj1.compareTo(obj2) < 0;
    }
}

