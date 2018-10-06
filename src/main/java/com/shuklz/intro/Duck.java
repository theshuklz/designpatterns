package com.shuklz.intro;

import com.shuklz.intro.behavior.fly.FlyBehavior;
import com.shuklz.intro.behavior.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("Swimming");
    }

    void performFly() {
        //delegate the implementation to some other class
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();
}
