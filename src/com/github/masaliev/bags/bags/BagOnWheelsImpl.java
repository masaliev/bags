package com.github.masaliev.bags.bags;

import com.github.masaliev.bags.wheels.Wheel;

import java.util.List;

public abstract class BagOnWheelsImpl<T> extends BagImpl<T> implements BagOnWheels<T> {

    @Override
    public void run() {
        List<Wheel> wheels = getWheels();
        wheels.forEach(Wheel::run);
    }
}
