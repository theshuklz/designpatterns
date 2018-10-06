package com.shuklz.intro.behavior.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("mute");
    }
}
