package me.yasiru.algorithms.sorting;

/**
 * Created by wik2kassa on 2/5/2016.
 */
public class MergeSort<T extends Comparable<T>> {
    private T[] subject;
    boolean ascending;
    public MergeSort() {
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
        sort(0, subject.length -1);
    }
    private void sort(int start, int end) {
        if(start == end)
            return;

    }
    private void merge(int start, int middle, int end) {
        
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