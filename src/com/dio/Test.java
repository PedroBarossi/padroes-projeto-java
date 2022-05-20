package com.dio;

import com.dio.facade.Facade;
import com.dio.singleton.SingletonEager;
import com.dio.singleton.SingletonLazy;
import com.dio.singleton.SingletonLazyHolder;
import com.dio.strategy.*;

public class Test {

    public static void main(String[] args) {

        /*Teste Singleton
        SingletonLazy lazy= SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyhol = SingletonLazyHolder.getInstancia();
        System.out.println(lazyhol);
        lazyhol = SingletonLazyHolder.getInstancia();
        System.out.println(lazyhol);*/

        /*Teste Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);

        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();*/

        Facade facade = new Facade();
        facade.migrarCliente("Pedro","54786380");
    }

}
