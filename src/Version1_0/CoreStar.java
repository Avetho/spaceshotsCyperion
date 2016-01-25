package Version1_0;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.sound.midi.*;
import javax.sound.sampled.*;

////ABOVE IS IMPORTS ONLY, NO OTHER CODE PLZ////////////////////////////////////

public class CoreStar extends JFrame {
    public static Stack vP1, vP2, vAILF, vAIMF, vAIHF, vAIMB, vAICD, vBCS, vBT1, vBT2, vBT3, vBT4, vBT5, vBT6, vBT7, vBT8, vCLF1, vCLF2;
    public static double nP1Rot=0, nP2Rot=0, nAILFRot=0, nAIMFRot=0, nAIHFRot=0, nAIMBRot=0, nAICDRot=0, nBCSRot=0, nCLF1Rot=0, nCLF2Rot=0;
    public static int nShipSelectP1=1, nShipSelectP2=1, nAIShipSelect=1, nAIDiff=1;
    public static int nScreenType=0; //0 - Title Screen, 1 - Ship Selection Screen, 2 - Game Screen, 3 - Pause Screen, 4 - Boss Battle Win, 5 - Battle Lost, 6 - Battle Win
    public static boolean bossTrue=false;
    public static double dLFHp=100, dMFHp=200, dHFHp=500, dMBHp=250, dCDHp=300, dCWPHp=2500, dOWPHp=200, dCLFHp=250;
    public static double dP1Hp, dP2Hp, dAIHp, dBossCoreHp, dBossOWP1Hp, dBossOWP2Hp, dBossOWP3Hp, dBossOWP4Hp, dBossOWP5Hp, dBossOWP6Hp, dBossOWP7Hp, dBossOWP8Hp, dBossCLF1Hp, dBossCLF2Hp;
    
    static JFrame frame = new JFrame("FrameDemo");

    public Setup() throws NullPointerException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(null, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        addKeyListener(this);
    }
    
    
        
//        setSize(640, 360);
//        setTitle("Space Battle (By: Philip G. and Samuel M.)");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter clearQSave = new PrintWriter("QuickSave.txt");
        clearQSave.print("");
        clearQSave.close();
        
        JTextArea textArea = new JTextArea(150, 100);
        PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
        System.setOut(printStream);
        System.setErr(printStream);
            
        FileReader loadSaveGame1 = new FileReader("Save1.txt");
        FileReader loadSaveGame2 = new FileReader("Save2.txt");
        FileReader loadSaveGame3 = new FileReader("Save3.txt");
        FileReader loadSaveGame4 = new FileReader("Save4.txt");
        FileReader loadSaveGame5 = new FileReader("Save5.txt");
        PrintWriter saveGameSlot1 = new PrintWriter("Save1.txt");
        PrintWriter saveGameSlot2 = new PrintWriter("Save2.txt");
        PrintWriter saveGameSlot3 = new PrintWriter("Save3.txt");
        PrintWriter saveGameSlot4 = new PrintWriter("Save4.txt");
        PrintWriter saveGameSlot5 = new PrintWriter("Save5.txt");
        
        while(true){
            if(nShipSelectP1==1){
                Player1.LFighter(e);
            }
            else if(nShipSelectP1==2){
                Player1.MFighter(e);
            }
            else if(nShipSelectP1==3){
                Player1.HFighter(e);
            }
            else if(nShipSelectP1==4){
                Player1.MBShip(e);
            }
            else if(nShipSelectP1==5){
                Player1.CDShip(e);
            }
            else{
                Player1.MystShip(e);
            }
            
            if(nShipSelectP2==1){
                Player2.LFighter(e);
            }
            else if(nShipSelectP2==2){
                Player2.MFighter(e);
            }
            else if(nShipSelectP2==3){
                Player2.HFighter(e);
            }
            else if(nShipSelectP2==4){
                Player2.MBShip(e);
            }
            else if(nShipSelectP2==5){
                Player2.CDShip(e);
            }
            else{
                Player2.MystShip(e);
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
                    FinalBoss_L1.OrbitalWP1();
                    FinalBoss_L1.OrbitalWP2();
                    FinalBoss_L1.OrbitalWP3();
                    FinalBoss_L1.OrbitalWP4();
                    FinalBoss_L1.OrbitalWP5();
                    FinalBoss_L1.OrbitalWP6();
                    FinalBoss_L1.OrbitalWP7();
                    FinalBoss_L1.OrbitalWP8();
                    FinalBoss_L1.CapLFighter1();
                    FinalBoss_L1.CapLFighter2();
                }
                if(nAIDiff==2){
                    FinalBoss_L2.CapitalShip();
                    FinalBoss_L2.OrbitalWP1();
                    FinalBoss_L2.OrbitalWP2();
                    FinalBoss_L2.OrbitalWP3();
                    FinalBoss_L2.OrbitalWP4();
                    FinalBoss_L2.OrbitalWP5();
                    FinalBoss_L2.OrbitalWP6();
                    FinalBoss_L2.OrbitalWP7();
                    FinalBoss_L2.OrbitalWP8();
                    FinalBoss_L2.CapLFighter1();
                    FinalBoss_L2.CapLFighter2();
                }
                if(nAIDiff==3){
                    FinalBoss_L3.CapitalShip();
                    FinalBoss_L3.OrbitalWP1();
                    FinalBoss_L3.OrbitalWP2();
                    FinalBoss_L3.OrbitalWP3();
                    FinalBoss_L3.OrbitalWP4();
                    FinalBoss_L3.OrbitalWP5();
                    FinalBoss_L3.OrbitalWP6();
                    FinalBoss_L3.OrbitalWP7();
                    FinalBoss_L3.OrbitalWP8();
                    FinalBoss_L3.CapLFighter1();
                    FinalBoss_L3.CapLFighter2();
                }
                if(nAIDiff==4){
                    FinalBoss_L4.CapitalShip();
                    FinalBoss_L4.OrbitalWP1();
                    FinalBoss_L4.OrbitalWP2();
                    FinalBoss_L4.OrbitalWP3();
                    FinalBoss_L4.OrbitalWP4();
                    FinalBoss_L4.OrbitalWP5();
                    FinalBoss_L4.OrbitalWP6();
                    FinalBoss_L4.OrbitalWP7();
                    FinalBoss_L4.OrbitalWP8();
                    FinalBoss_L4.CapLFighter1();
                    FinalBoss_L4.CapLFighter2();
                }
                if(nAIDiff==5){
                    FinalBoss_L5.CapitalShip();
                    FinalBoss_L5.OrbitalWP1();
                    FinalBoss_L5.OrbitalWP2();
                    FinalBoss_L5.OrbitalWP3();
                    FinalBoss_L5.OrbitalWP4();
                    FinalBoss_L5.OrbitalWP5();
                    FinalBoss_L5.OrbitalWP6();
                    FinalBoss_L5.OrbitalWP7();
                    FinalBoss_L5.OrbitalWP8();
                    FinalBoss_L5.CapLFighter1();
                    FinalBoss_L5.CapLFighter2();
                }
            }
            
            System.out.println("P1-Pos: " + vP1);
            System.out.println("P2-Pos: " + vP2);
            System.out.println("AI-LF-Pos: " + vAILF);
            System.out.println("AI-MF-Pos: " + vAIMF);
            System.out.println("AI-HF-Pos: " + vAIHF);
            System.out.println("AI-MB-Pos: " + vAIMB);
            System.out.println("AI-CD-Pos: " + vAICD);
            System.out.println("BOSS-CWS-MAIN-Pos: " + vBCS);
            System.out.println("BOSS-CWS-T1-Pos: " + vBT1);
            System.out.println("BOSS-CWS-T2-Pos: " + vBT2);
            System.out.println("BOSS-CWS-T3-Pos: " + vBT3);
            System.out.println("BOSS-CWS-T4-Pos: " + vBT4);
            System.out.println("BOSS-CWS-T5-Pos: " + vBT5);
            System.out.println("BOSS-CWS-T6-Pos: " + vBT6);
            System.out.println("BOSS-CWS-T7-Pos: " + vBT7);
            System.out.println("BOSS-CWS-T8-Pos: " + vBT8);
            System.out.println("BOSS-CWS-CLF1-Pos: " + vCLF1);
            System.out.println("BOSS-CWS-CLF2-Pos: " + vCLF2);
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
    public static void LFighter(KeyEvent e){
        
    }
    public static void MFighter(KeyEvent e){
        
    }
    public static void HFighter(KeyEvent e){
        
    }
    public static void MBShip(KeyEvent e){
        
    }
    public static void CDShip(KeyEvent e){
        
    }
    public static void MystShip(KeyEvent e){
        
    }
}

class Player2 {
    static double nXVel, nYVel;
    public static void LFighter(KeyEvent e){
        
    }
    public static void MFighter(KeyEvent e){
        
    }
    public static void HFighter(KeyEvent e){
        
    }
    public static void MBShip(KeyEvent e){
        
    }
    public static void CDShip(KeyEvent e){
        
    }
    public static void MystShip(KeyEvent e){
        
    }
}

////////////////////////////////////////////////////////////////////////////////
////THIS IS THE AI DIVIDER-BELOW IS AI SHIPS-ABOVE IS PLAYERS AND GAME SETUP////
////////////////////////////////////////////////////////////////////////////////

class ArtIntell_L1 {//EASY AI
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
}

class ArtIntell_L2 {//MEDIUM AI
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
}

class ArtIntell_L3 {//HARD AI
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
}

class ArtIntell_L4 {//EXTREME AI
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
}

class ArtIntell_L5 {//MLG HARDCORE AI lol wow nyan doge
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
}

////////////////////////////////////////////////////////////////////////////////
////BELOW IS BOSSES ONLY, NO MUNDANE AI SHIPS ALLOWED///lol XD puny ships ha////
////////////////////////////////////////////////////////////////////////////////

class FinalBoss_L1 {//EASY AI
    static double nXVel, nYVel;
    public static void CapitalShip(){
        
    }
    public static void OrbitalWP1(){
        
    }
    public static void OrbitalWP2(){
        
    }
    public static void OrbitalWP3(){
        
    }
    public static void OrbitalWP4(){
        
    }
    public static void OrbitalWP5(){
        
    }
    public static void OrbitalWP6(){
        
    }
    public static void OrbitalWP7(){
        
    }
    public static void OrbitalWP8(){
        
    }
    public static void CapLFighter1(){
        
    }
    public static void CapLFighter2(){
        
    }
}

class FinalBoss_L2 {//MEDIUM AI
    static double nXVel, nYVel;
    public static void CapitalShip(){
        
    }
    public static void OrbitalWP1(){
        
    }
    public static void OrbitalWP2(){
        
    }
    public static void OrbitalWP3(){
        
    }
    public static void OrbitalWP4(){
        
    }
    public static void OrbitalWP5(){
        
    }
    public static void OrbitalWP6(){
        
    }
    public static void OrbitalWP7(){
        
    }
    public static void OrbitalWP8(){
        
    }
    public static void CapLFighter1(){
        
    }
    public static void CapLFighter2(){
        
    }
}

class FinalBoss_L3 {//HARD AI
    static double nXVel, nYVel;
    public static void CapitalShip(){
        
    }
    public static void OrbitalWP1(){
        
    }
    public static void OrbitalWP2(){
        
    }
    public static void OrbitalWP3(){
        
    }
    public static void OrbitalWP4(){
        
    }
    public static void OrbitalWP5(){
        
    }
    public static void OrbitalWP6(){
        
    }
    public static void OrbitalWP7(){
        
    }
    public static void OrbitalWP8(){
        
    }
    public static void CapLFighter1(){
        
    }
    public static void CapLFighter2(){
        
    }
}

class FinalBoss_L4 {//EXTREME AI
    static double nXVel, nYVel;
    public static void CapitalShip(){
        
    }
    public static void OrbitalWP1(){
        
    }
    public static void OrbitalWP2(){
        
    }
    public static void OrbitalWP3(){
        
    }
    public static void OrbitalWP4(){
        
    }
    public static void OrbitalWP5(){
        
    }
    public static void OrbitalWP6(){
        
    }
    public static void OrbitalWP7(){
        
    }
    public static void OrbitalWP8(){
        
    }
    public static void CapLFighter1(){
        
    }
    public static void CapLFighter2(){
        
    }
}

class FinalBoss_L5 {//MLG HARDCORE AI lol wow nyan doge
    static double nXVel, nYVel;
    public static void CapitalShip(){
        
    }
    public static void OrbitalWP1(){
        
    }
    public static void OrbitalWP2(){
        
    }
    public static void OrbitalWP3(){
        
    }
    public static void OrbitalWP4(){
        
    }
    public static void OrbitalWP5(){
        
    }
    public static void OrbitalWP6(){
        
    }
    public static void OrbitalWP7(){
        
    }
    public static void OrbitalWP8(){
        
    }
    public static void CapLFighter1(){
        
    }
    public static void CapLFighter2(){
        
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