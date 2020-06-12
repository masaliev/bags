package com.github.masaliev.bags.bags;

import com.github.masaliev.bags.wheels.Wheel;

import java.util.ArrayList;
import java.util.List;

public class GrandmasBagOnWheels<T> extends BagOnWheelsImpl<T> {
    private List<Wheel> wheels = new ArrayList<>();

    @Override
    public List<Wheel> getWheels() {
        return this.wheels;
    }
}
