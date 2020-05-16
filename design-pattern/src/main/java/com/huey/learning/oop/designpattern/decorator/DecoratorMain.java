package com.huey.learning.oop.designpattern.decorator;

import com.huey.learning.oop.designpattern.decorator.component.Bread;
import com.huey.learning.oop.designpattern.decorator.component.Cake;
import com.huey.learning.oop.designpattern.decorator.component.Dessert;
import com.huey.learning.oop.designpattern.decorator.component.decorator.MustardSauce;
import com.huey.learning.oop.designpattern.decorator.component.decorator.PeanutButter;
import com.huey.learning.oop.designpattern.decorator.component.decorator.TomatoSauce;

public class DecoratorMain {

    public static void main(String[] args) {

        Dessert cake = new Cake();
        cake.display();

        Dessert mustardCake = new MustardSauce(new Cake());
        mustardCake.display();

        Dessert peanutTomatoBread = new PeanutButter(new TomatoSauce(new Bread()));
        peanutTomatoBread.display();

    }

}
