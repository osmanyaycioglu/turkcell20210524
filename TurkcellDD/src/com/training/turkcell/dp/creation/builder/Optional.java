package com.training.turkcell.dp.creation.builder;


public class Optional<T> {

    private T value;


    public T getValue() {
        return this.value;
    }


    public void setValue(final T valueParam) {
        this.value = valueParam;
    }

}
