package com.msb.bofanqi;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestPlayer {
    public static void main(String[] args) throws JavaLayerException, FileNotFoundException {
        boolean isRun=true;
        while (isRun){

            FileInputStream fis=new FileInputStream("c://m/孤难眠.mp3.mp3");
            Player player=new Player(fis);
            player.play();

        }

    }
    }