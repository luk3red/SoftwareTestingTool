package com.dariotintore.tesi;

import java.util.ArrayList;  
import java.util.List;  

public class Coverage<T> {  

    private List<T> items = new ArrayList<T>();

    // Metodo per aggiungere un elemento alla lista
    public boolean create(T item) {
    
    try{
        items.add(item); 
        }catch(Exception e){
        return false;
        }
        return true;
    }

    // Metodo per leggere tutti gli elementi nella lista
    public List<T> readAll() {
        return items;
    }

    // Metodo per leggere un elemento specifico dalla lista
    public T read(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    // Metodo per aggiornare un elemento nella lista
    public boolean update(int index, T newItem) {
        if (index >= 0 && index < items.size()) {
            items.set(index, newItem);
            return true;
        }
        return false;
    }

    // Metodo per rimuovere un elemento dalla lista
    public boolean delete(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            return true;
        }
        return false;
    }

    // Metodo per ottenere il numero di elementi nella lista
    public int size() {
        return items.size();
    }

    // Metodo per verificare se la lista è vuota
    public boolean isEmpty() {
        return items.isEmpty();
    }






}
