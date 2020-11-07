package com.mycompany.wif3007project1;

public class Pumpkin extends DecorativeAccessories implements DecorationInterface {
    private Animation animation;
    public void display(){
        System.out.println("Pumpkin is displayed");
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public Animation getAnimation() {
        return animation;
    }
}
