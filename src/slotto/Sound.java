/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotto;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.sound.sampled.*;
public class Sound {
    
     Clip clip;
     boolean currentlyPlaying;
    
    public Sound (){
        try{
            clip=AudioSystem.getClip();
            currentlyPlaying=false;
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
    public void playAudio(String fileName){
        if(currentlyPlaying){
            clip.close();
            currentlyPlaying=false;
        }
        try{
            AudioInputStream ais=AudioSystem.getAudioInputStream(new File("src\\slotto\\sounds\\"+fileName+".wav"));
            clip.open(ais);
            clip.start();
            currentlyPlaying=true;
        }catch (IOException | LineUnavailableException | UnsupportedAudioFileException err){
            err.printStackTrace();
        }
    }
    /*
        public void playMusic(String fileName) {
        if (songCurrentlyPlaying) {
            songClip.close();
            songCurrentlyPlaying = false;
        }
        try {
            File songFile = new File("src\\slotto\\sounds\\music\\" + fileName + ".wav");
            songStream = AudioSystem.getAudioInputStream(songFile);
            songClip = AudioSystem.getClip();
            songClip.open(songStream);
            songClip.start();
            songCurrentlyPlaying = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    */
}
