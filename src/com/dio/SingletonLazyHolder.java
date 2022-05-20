package com.dio;

/**
 * Singleton com encapsulamento por classe estática
 *
 * @author pedro3barossi
 */
public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder(){
        super(); //não é necessário explicitar esta linha
    }

    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }
}
