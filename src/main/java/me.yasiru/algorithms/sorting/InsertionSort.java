package me.yasiru.algorithms.sorting;

/**
 * Created by wik2kassa on 1/20/2016.
 */
public class InsertionSort<T extends Comparable<T>> {
    private T[] subject;
    boolean ascending;
    public InsertionSort() {
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
        if(subject != null) {
            for (int i = 0; i < subject.length;i++) {
                for (int j = i+1; j < subject.length;j++) {
                    if(compare(subject[i],subject[j])) {
                        temp = subject[i];
                        subject[i] = subject[j];
                        subject[j] = temp;
                    }
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

