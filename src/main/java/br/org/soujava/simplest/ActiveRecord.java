package br.org.soujava.simplest;

import java.util.Collections;
import java.util.List;

public abstract class ActiveRecord {

    public Long id;

    public void insert(){

    }

    public static<T extends ActiveRecord>  List<T> findAll() {
        return Collections.emptyList();
    }
}
