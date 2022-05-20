/*Construtor privado
Instância estática acessível através de
método estático público
 */

package com.dio.singleton;

/**
 * Singleton "apressado"
 *
 * @author pedro3barossi
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super(); //não é necessário explicitar esta linha
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
