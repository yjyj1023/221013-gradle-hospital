package org.example;

public interface Parser<T> {
    T parse(String str);
}