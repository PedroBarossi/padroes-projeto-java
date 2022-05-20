package com.dio.singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author pedro3barossi
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super(); //não é necessário explicitar esta linha
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) instancia = new SingletonLazy();
        return instancia;
    }
}
