package org.studyeasy;

public class Main {
    public static void main(String[] args){
        Shop shop =new Shop();
        shop.ShopStatus();
        shop.getLock().setLocking(false);
        shop.ShopStatus();
    }
}
