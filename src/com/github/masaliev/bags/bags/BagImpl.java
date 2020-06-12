package com.github.masaliev.bags.bags;

import com.github.masaliev.bags.handles.Handle;

import java.util.ArrayList;
import java.util.List;

public class BagImpl<T> implements Bag<T> {
    private float volume;
    private Handle handle;
    private List<T> content = new ArrayList<>();

    @Override
    public float getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public Handle getHandle() {
        return this.handle;
    }

    @Override
    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    @Override
    public void put(T t) {
        this.content.add(t);
    }

    @Override
    public List<T> getAll() {
        return this.content;
    }
}
