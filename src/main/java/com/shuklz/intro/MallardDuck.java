package com.shuklz.intro;

import com.shuklz.intro.behavior.fly.FlyBehavior;
import com.shuklz.intro.behavior.fly.FlyWithWings;
import com.shuklz.intro.behavior.quack.Quack;
import com.shuklz.intro.behavior.quack.QuackBehavior;

public class MallardDuck extends Duck {
    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am mallard");
    }
}
