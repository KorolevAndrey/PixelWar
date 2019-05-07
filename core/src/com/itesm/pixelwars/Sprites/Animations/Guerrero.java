package com.itesm.pixelwars.Sprites.Animations;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Guerrero extends  AnimacionGuerrero{
    private int ataque;
    private static final float TIEMPO_BASE = 0.5f;
    private float tiempoAtaque = 0;

    public Guerrero(float x, float y, Texture guerreroCaminando, Texture guerreroParado, Texture guerreroAtacando, int caminandoWidth, int caminandoHeight, int paradoWidth, int paradoHeight, int atacandoWidth, int atacandoHeight, int hp, int ataque) {
        super(x, y, guerreroCaminando, guerreroParado, guerreroAtacando, caminandoWidth, caminandoHeight, paradoWidth, paradoHeight, atacandoWidth, atacandoHeight, hp, ataque);
        this.ataque = ataque;
    }

    public int Espadazo(int HP){
        tiempoAtaque+=Gdx.graphics.getDeltaTime();
        if (tiempoAtaque>=TIEMPO_BASE){
            HP-= ataque;
            tiempoAtaque = 0;
        }
        return HP;
    }


}