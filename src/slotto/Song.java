/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotto;

/**
 *
 * @author zguledp16
 */
import java.util.ArrayList;
import java.io.FilenameFilter;
import java.io.File;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class Song extends Sound {
    Clip sClip=super.clip;
    AudioInputStream sAis=super.ais;
    boolean sCurrentlyPlaying;
    public Song(){
        try{
            clip=AudioSystem.getClip();
            sCurrentlyPlaying=false;
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
    
    public void play(){
        sClip.start();
    }
   
    public void pause(){
        sClip.stop();
    }
    
    public void stop(){
        sClip.stop();
        sClip.setMicrosecondPosition(0);
    }
}
