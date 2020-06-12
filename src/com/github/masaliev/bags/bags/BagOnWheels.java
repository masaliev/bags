package com.github.masaliev.bags.bags;

import com.github.masaliev.bags.wheels.Wheel;

import java.util.List;

public interface BagOnWheels<T> extends Bag<T> {
    List<Wheel> getWheels();
    void run();
}
