package Version1_0;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.sound.midi.*;
import javax.sound.sampled.*;

////ABOVE IS IMPORTS ONLY, NO OTHER CODE PLZ////////////////////////////////////

public class CoreStar {
    public static double nP1X, nP1Y, nP2X, nP2Y, nAILFX, nAILFY, nAIMFX, nAIMFY, nAIHFX, nAIHFY, nAIMBX, nAIMBY, nAICDX, nAICDY;
    public static int nShipSelect=1, nAIShipSelect=1, nAIDiff=1;
    public static boolean bossTrue=false;
    public static double dP1Hp, dP2Hp, dAIHp, dBossCoreHp, dBossOWP1Hp, dBossOWP2Hp, dBossOWP3Hp, dBossOWP4Hp, dBossOWP5Hp, dBossOWP6Hp, dBossOWP7Hp, dBossOWP8Hp, dBossCLF1Hp, dBossCLF2Hp;
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter clearQSave = new PrintWriter("QuickSave.txt");
        clearQSave.print("");
        clearQSave.close();
        while(true){
            if(nShipSelect==1){
                Player1.LFighter();
            }
            else if(nShipSelect==2){
                Player1.MFighter();
            }
            else if(nShipSelect==3){
                Player1.HFighter();
            }
            else if(nShipSelect==4){
                Player1.MBShip();
            }
            else if(nShipSelect==5){
                Player1.CDShip();
            }
            else{
                Player1.MystShip();
            }
            if(nAIShipSelect==1){
                if(nAIDiff==1){
                    ArtIntell_L1.LFighter();
                }
                if(nAIDiff==2){
                    ArtIntell_L2.LFighter();
                }
                if(nAIDiff==3){
                    ArtIntell_L3.LFighter();
                }
                if(nAIDiff==4){
                    ArtIntell_L4.LFighter();
                }
                if(nAIDiff==5){
                    ArtIntell_L5.LFighter();
                }
            }
            if(nAIShipSelect==2){
                if(nAIDiff==1){
                    ArtIntell_L1.MFighter();
                }
                if(nAIDiff==2){
                    ArtIntell_L2.MFighter();
                }
                if(nAIDiff==3){
                    ArtIntell_L3.MFighter();
                }
                if(nAIDiff==4){
                    ArtIntell_L4.MFighter();
                }
                if(nAIDiff==5){
                    ArtIntell_L5.MFighter();
                }
            }
            if(nAIShipSelect==3){
                if(nAIDiff==1){
                    ArtIntell_L1.HFighter();
                }
                if(nAIDiff==2){
                    ArtIntell_L2.HFighter();
                }
                if(nAIDiff==3){
                    ArtIntell_L3.HFighter();
                }
                if(nAIDiff==4){
                    ArtIntell_L4.HFighter();
                }
                if(nAIDiff==5){
                    ArtIntell_L5.HFighter();
                }
            }
            if(nAIShipSelect==4){
                if(nAIDiff==1){
                    ArtIntell_L1.MBShip();
                }
                if(nAIDiff==2){
                    ArtIntell_L2.MBShip();
                }
                if(nAIDiff==3){
                    ArtIntell_L3.MBShip();
                }
                if(nAIDiff==4){
                    ArtIntell_L4.MBShip();
                }
                if(nAIDiff==5){
                    ArtIntell_L5.MBShip();
                }
            }
            if(nAIShipSelect==5){
                if(nAIDiff==1){
                    ArtIntell_L1.CDShip();
                }
                if(nAIDiff==2){
                    ArtIntell_L2.CDShip();
                }
                if(nAIDiff==3){
                    ArtIntell_L3.CDShip();
                }
                if(nAIDiff==4){
                    ArtIntell_L4.CDShip();
                }
                if(nAIDiff==5){
                    ArtIntell_L5.CDShip();
                }
            }
            if(bossTrue){
                if(nAIDiff==1){
                    FinalBoss_L1.CapitalShip();
                    FinalBoss_L1.OrbitalWPs();
                    FinalBoss_L1.CapLFighter();
                }
                if(nAIDiff==2){
                    FinalBoss_L2.CapitalShip();
                    FinalBoss_L2.OrbitalWPs();
                    FinalBoss_L2.CapLFighter();
                }
                if(nAIDiff==3){
                    FinalBoss_L3.CapitalShip();
                    FinalBoss_L3.OrbitalWPs();
                    FinalBoss_L3.CapLFighter();
                }
                if(nAIDiff==4){
                    FinalBoss_L4.CapitalShip();
                    FinalBoss_L4.OrbitalWPs();
                    FinalBoss_L4.CapLFighter();
                }
                if(nAIDiff==5){
                    FinalBoss_L5.CapitalShip();
                    FinalBoss_L5.OrbitalWPs();
                    FinalBoss_L5.CapLFighter();
                }
            }
            JTextArea textArea = new JTextArea(50, 10);
            PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
            System.setOut(printStream);
            System.setErr(printStream);
            System.out.println("P1-X: " + nP1X + " = P1-Y: " + nP1Y);
            System.out.println("P2-X: " + nP2X + " = P2-Y: " + nP2Y);
            System.out.println("AI-LF-X: ");
            System.out.println("AI-MF-X: ");
            System.out.println("AI-HF-X: ");
            System.out.println("AI-MB-X: ");
            System.out.println("AI-CD-X: ");
            System.out.println("BOSS-CWS-MAIN-X: ");
            System.out.println("BOSS-CWS-T1-X: ");
            System.out.println("BOSS-CWS-T2-X: ");
            System.out.println("BOSS-CWS-T3-X: ");
            System.out.println("BOSS-CWS-T4-X: ");
            System.out.println("BOSS-CWS-T5-X: ");
            System.out.println("BOSS-CWS-T6-X: ");
            System.out.println("BOSS-CWS-T7-X: ");
            System.out.println("BOSS-CWS-T8-X: ");
            System.out.println("BOSS-CWS-CLF1-X: ");
            System.out.println("BOSS-CWS-CLF2-X: ");
            System.out.println("-------------------------------------------------");
        }
    }
}

////Custom Console Window, Allows Cheats and replaces standard console./////////

class CustomOutputStream extends OutputStream {
    private JTextArea textArea;
     
    public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }
     
    @Override
    public void write(int b) throws IOException {
        // redirects data to the text area
        textArea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}

////Below is ships; Players and AI./////////////////////////////////////////////

class Player1 {
    static double nXVel, nYVel;
    public static void LFighter(){
        
    }
    public static void MFighter(){
        
    }
    public static void HFighter(){
        
    }
    public static void MBShip(){
        
    }
    public static void CDShip(){
        
    }
    public static void MystShip(){
        
    }
}

class Player2 {
    static double nXVel, nYVel;
    public static void LFighter(){
        
    }
    public static void MFighter(){
        
    }
    public static void HFighter(){
        
    }
    public static void MBShip(){
        
    }
    public static void CDShip(){
        
    }
    public static void MystShip(){
        
    }
}

////////////////////////////////////////////////////////////////////////////////
////THIS IS THE AI DIVIDER-BELOW IS AI SHIPS-ABOVE IS PLAYERS AND GAME SETUP////
////////////////////////////////////////////////////////////////////////////////

class ArtIntell_L1 {//EASY AI
    public static void LFighter(){
        
    }
    public static void MFighter(){
        
    }
    public static void HFighter(){
        
    }
    public static void MBShip(){
        
    }
    public static void CDShip(){
        
    }
}

class ArtIntell_L2 {//MEDIUM AI
    public static void LFighter(){
        
    }
    public static void MFighter(){
        
    }
    public static void HFighter(){
        
    }
    public static void MBShip(){
        
    }
    public static void CDShip(){
        
    }
}

class ArtIntell_L3 {//HARD AI
    public static void LFighter(){
        
    }
    public static void MFighter(){
        
    }
    public static void HFighter(){
        
    }
    public static void MBShip(){
        
    }
    public static void CDShip(){
        
    }
}

class ArtIntell_L4 {//EXTREME AI
    public static void LFighter(){
        
    }
    public static void MFighter(){
        
    }
    public static void HFighter(){
        
    }
    public static void MBShip(){
        
    }
    public static void CDShip(){
        
    }
}

class ArtIntell_L5 {//MLG HARDCORE AI lol wow nyan doge
    public static void LFighter(){
        
    }
    public static void MFighter(){
        
    }
    public static void HFighter(){
        
    }
    public static void MBShip(){
        
    }
    public static void CDShip(){
        
    }
}

////////////////////////////////////////////////////////////////////////////////
////BELOW IS BOSSES ONLY, NO MUNDANE AI SHIPS ALLOWED///lol XD puny ships ha////
////////////////////////////////////////////////////////////////////////////////

class FinalBoss_L1 {//EASY AI
    public static void CapitalShip(){
        
    }
    public static void OrbitalWPs(){
        
    }
    public static void CapLFighter(){
        
    }
}

class FinalBoss_L2 {//MEDIUM AI
    public static void CapitalShip(){
        
    }
    public static void OrbitalWPs(){
        
    }
    public static void CapLFighter(){
        
    }
}

class FinalBoss_L3 {//HARD AI
    public static void CapitalShip(){
        
    }
    public static void OrbitalWPs(){
        
    }
    public static void CapLFighter(){
        
    }
}

class FinalBoss_L4 {//EXTREME AI
    public static void CapitalShip(){
        
    }
    public static void OrbitalWPs(){
        
    }
    public static void CapLFighter(){
        
    }
}

class FinalBoss_L5 {//MLG HARDCORE AI lol wow nyan doge
    public static void CapitalShip(){
        
    }
    public static void OrbitalWPs(){
        
    }
    public static void CapLFighter(){
        
    }
}

////////////////////////////////////////////////////////////////////////////////
////BELOW IS FILE IO - SAVEGAMES, QUICKLOADS, AND LOADING EXTERNAL FILES////////
////////////////////////////////////////////////////////////////////////////////

class loadSave {
    public static void loadGame(){
        
    }
    public static void saveGame(){
        
    }
    public static void quickLoad(){
        
    }
    public static void quickSave(){
        
    }
    public static void deleteSave(){
        
    }
    public static void loadExternalSave(){
        
    }
}