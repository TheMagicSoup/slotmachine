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
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Song {
    
    Clip clip;
    boolean currentlyPlaying;
    public Song(){
        try{
            clip=AudioSystem.getClip();
            currentlyPlaying=false;
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
    
    public void select(String fileName){
        if(currentlyPlaying){
            currentlyPlaying=false;
            clip.close();
        }
        try{
            clip.open(AudioSystem.getAudioInputStream(new File("src\\slotto\\sounds\\music\\"+fileName+".wav")));
            currentlyPlaying=true;
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e){
            e.printStackTrace();
        }
    }
    
    public void play(){
        clip.start();
    }
   
    public void pause(){
        clip.stop();
    }
    
    public void stop(){
        clip.stop();
        clip.setMicrosecondPosition(0);
    }
}
