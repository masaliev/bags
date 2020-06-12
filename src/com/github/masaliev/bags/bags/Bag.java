package com.github.masaliev.bags.bags;

import com.github.masaliev.bags.handles.Handle;

import java.util.List;

public interface Bag<T> {
    float getVolume();
    void setVolume(float volume);
    Handle getHandle();
    void setHandle(Handle handle);
    void put(T t);
    List<T> getAll();
}
