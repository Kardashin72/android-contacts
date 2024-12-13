package ru.yandex.practicum.contacts.presentation.base;


public interface ListDiffInterface<O> {
    public boolean theSameAs(O object);
    public boolean equals(Object object);
}
