/********************************************************************************
*                                                                               *
* Author: Ishav Sohal                                                           *
* Class: ICS 4U                                                                 * 
* Date: March 10th, 2020                                                        *                     
* Program: Hangman Game                                                         *
* Description: This is a program that will allow the user to play a game of     *
*              Hangman. This is a game where the user must try to guess a       *
*              random word by choosing letters of the alphabet in order to      *
*              uncover the letters of the random word. The user wins when they  *
*              guess the random word correctly. However, the user has a limited *
*              amount of incorrect guesses, so they must choose wisely.         *      
********************************************************************************/

// Imports all nesseasry Java libraries/classes for this program
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.JOptionPane;
import javax.xml.parsers.*;   
import javax.xml.transform.*;  
import javax.xml.transform.dom.DOMSource;       
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;  
import org.xml.sax.SAXException;

// Creates a class called "Hangman_Game" that extends "javax.swing.JFrame"
public class Hangman_Game extends javax.swing.JFrame {

        // Creates an String array of random words for the user to guess, called "words"
        String words [] = {"BASKETBALL", "EDUCATION", "ENCYCLOPEDIA", "ELEPHANT", "PROGRAMMING", 
        "PHOTOGRAPH", "GIRAFFE", "ZEBRA", "TELEPHONE", "AWKWARD", "GAZEBO", "KEYBOARD", "MONITOR",
        "CALCULATOR", "CROQUET", "BAGPIPES", "ABRUPT", "BEEKEEPER", "GROGGY", "ESPIONAGE", "GALVANIZE",
        "BANDWAGON", "KNAPSACK", "PNEUMONIA", "MEGAHERTZ", "XYLOPHONE", "TRANSPLANT", "BUZZING",
        "PENCIL", "CANADA", "CHINA", "BRAZIL", "ITALY", "SPAIN", "JAPAN", "TORONTO", "GREECE", "ENGLISH",
        "FRENCH", "BOTTLE", "AFRICA", "GREENLAND", "ICELAND", "FOOTBALL", "VOLLEYBALL", "NOVEL",
        "RUSSIA", "GERMANY", "COMPUTER", "MOUSE", "BLACK", "BLUE", "ORANGE", "MAGENTA", "PURPLE", 
        "CHILD", "CHIPS", "OXYGEN", "CARBON", "CHLORINE", "JAZZ", "AUSTRALIA", "SYDNEY", "VANCOUVER",
        "CALIFORNIA", "ARGENTINA", "CINEMATIC", "CONTEMPLATE", "WOLVERINE", "KANGAROO", "PUBLICLY", 
        "SEPARATE", "ACCOMMODATE", "RECEIVE", "GOVERNMENT", "DEFINITELY", "PHARAOH", "FIZZ", "BUZZ", 
        "QUIZ", "ADSORB", "ABSORB", "ABSORPTION", "JAZZED", "SPEAKER", "TISSUE", "TELEKINETIC"};
        
        // Creates a random variable, called "r"
        Random r = new Random ();
        
        /* Creates an int variable, called "random_index", that chooses a random index position of the 
        "words" array */
        int random_index = r.nextInt(words.length);
        
        /* Creates a String variable, called "chosen_word", that chooses a random word from the "words" 
        array, using the "random_index" index position. This will be the word that the user must guess */
        String chosen_word = words[random_index];

        /* Creates a String variable, called "hidden_word". This variable will be used to store the hidden
        letters (blank dahses) of "chosen_word" that the user must uncover */
        String hidden_word = "";
        
        /* Creates an int variable called "incorrect_guesses", which will be used to store the number of 
        incorrect guesses the user makes */
        int incorrect_guesses = 0;
        
        /* Creates an int variable called "missing_letters", which will be used to determine if there
        are any covered letters in the random word each time the user makes a guess. This will help 
        determine if the user has won, which is when they uncover all letters of the word. */
        int missing_letters = 0;
        
        /* Creates an int variable called "counter", which will be used to determine if a letter guessed
        by the user is within the random word */
        int counter = 0;
        
        // Creates an int variable called "wins", which counts the users number of wins 
        int wins = 0;
        
        // Creates an int variable called "losses", which counts the users number of losses  
        int losses = 0;
    
        
    // Creates new form, called "Hangman_Game" 
    public Hangman_Game() {

        initComponents();
    }

    /* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JFrame_Game = new javax.swing.JFrame();
        labelHangmanStructure = new javax.swing.JLabel();
        labelHead = new javax.swing.JLabel();
        labelBody = new javax.swing.JLabel();
        labelArm1 = new javax.swing.JLabel();
        labelArm2 = new javax.swing.JLabel();
        labelLeg1 = new javax.swing.JLabel();
        labelLeg2 = new javax.swing.JLabel();
        labelHiddenWord = new javax.swing.JLabel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        labelWins = new javax.swing.JLabel();
        labelLosses = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        labelHangmanTitle = new javax.swing.JLabel();
        btnClearRecords = new javax.swing.JButton();
        labelMessage = new javax.swing.JLabel();
        JFrame_Win = new javax.swing.JFrame();
        labelWinTitle = new javax.swing.JLabel();
        labelSubtitle = new javax.swing.JLabel();
        labelPlayAgain = new javax.swing.JLabel();
        btnYesWon = new javax.swing.JButton();
        btnNoWon = new javax.swing.JButton();
        labelVictory = new javax.swing.JLabel();
        labelMissionPassed = new javax.swing.JLabel();
        JFrame_Lose = new javax.swing.JFrame();
        labelLoseTitle = new javax.swing.JLabel();
        labelSubtitle2 = new javax.swing.JLabel();
        labelPlayAgain2 = new javax.swing.JLabel();
        btnYesLost = new javax.swing.JButton();
        btnNoLost = new javax.swing.JButton();
        labelMissionFailed = new javax.swing.JLabel();
        labelGameOver = new javax.swing.JLabel();
        JFrame_Instructions = new javax.swing.JFrame();
        labelInstructionsTitle = new javax.swing.JLabel();
        labelInstruction1 = new javax.swing.JLabel();
        labelInstruction2 = new javax.swing.JLabel();
        labelInstruction3 = new javax.swing.JLabel();
        labelInstruction4 = new javax.swing.JLabel();
        labelInstruction5 = new javax.swing.JLabel();
        labelInstruction6 = new javax.swing.JLabel();
        labelQuestionMark = new javax.swing.JLabel();
        labelHowToPlay = new javax.swing.JLabel();
        labelUnderline = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        btnInstructions = new javax.swing.JButton();
        btnPlayGame = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        labelImage1 = new javax.swing.JLabel();
        labelImage2 = new javax.swing.JLabel();
        labelBackgroundImage = new javax.swing.JLabel();

        JFrame_Game.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JFrame_Game.setSize(new java.awt.Dimension(780, 660));

        labelHangmanStructure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hangman_Structure.png"))); // NOI18N
        labelHangmanStructure.setPreferredSize(new java.awt.Dimension(300, 300));

        labelHead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hangman_Face.png"))); // NOI18N

        labelBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hangman_Body.png"))); // NOI18N

        labelArm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hangman_Arm2.png"))); // NOI18N

        labelArm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hangman_Arm1.png"))); // NOI18N

        labelLeg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hangman_Leg1.png"))); // NOI18N

        labelLeg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hangman_Leg2.png"))); // NOI18N

        labelHiddenWord.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelHiddenWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnA.setBackground(new java.awt.Color(255, 153, 0));
        btnA.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnB.setBackground(new java.awt.Color(255, 153, 0));
        btnB.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(255, 153, 0));
        btnC.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnD.setBackground(new java.awt.Color(255, 153, 0));
        btnD.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnE.setBackground(new java.awt.Color(255, 153, 0));
        btnE.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnF.setBackground(new java.awt.Color(255, 153, 0));
        btnF.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        btnG.setBackground(new java.awt.Color(255, 153, 0));
        btnG.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnG.setText("G");
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });

        btnH.setBackground(new java.awt.Color(255, 153, 0));
        btnH.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnH.setText("H");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        btnI.setBackground(new java.awt.Color(255, 153, 0));
        btnI.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnI.setText("I");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        btnJ.setBackground(new java.awt.Color(255, 153, 0));
        btnJ.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnJ.setText("J");
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });

        btnK.setBackground(new java.awt.Color(255, 153, 0));
        btnK.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnK.setText("K");
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });

        btnL.setBackground(new java.awt.Color(255, 153, 0));
        btnL.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnL.setText("L");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        btnM.setBackground(new java.awt.Color(255, 153, 0));
        btnM.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnM.setText("M");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });

        btnN.setBackground(new java.awt.Color(255, 153, 0));
        btnN.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnN.setText("N");
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });

        btnO.setBackground(new java.awt.Color(255, 153, 0));
        btnO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnO.setText("O");
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });

        btnP.setBackground(new java.awt.Color(255, 153, 0));
        btnP.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });

        btnQ.setBackground(new java.awt.Color(255, 153, 0));
        btnQ.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnQ.setText("Q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });

        btnR.setBackground(new java.awt.Color(255, 153, 0));
        btnR.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnR.setText("R");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });

        btnS.setBackground(new java.awt.Color(255, 153, 0));
        btnS.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnS.setText("S");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        btnT.setBackground(new java.awt.Color(255, 153, 0));
        btnT.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnT.setText("T");
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });

        btnU.setBackground(new java.awt.Color(255, 153, 0));
        btnU.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnU.setText("U");
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });

        btnV.setBackground(new java.awt.Color(255, 153, 0));
        btnV.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnV.setText("V");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });

        btnW.setBackground(new java.awt.Color(255, 153, 0));
        btnW.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnW.setText("W");
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });

        btnX.setBackground(new java.awt.Color(255, 153, 0));
        btnX.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

        btnY.setBackground(new java.awt.Color(255, 153, 0));
        btnY.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnY.setText("Y");
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });

        btnZ.setBackground(new java.awt.Color(255, 153, 0));
        btnZ.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnZ.setText("Z");
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });

        labelWins.setBackground(new java.awt.Color(51, 204, 0));
        labelWins.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelWins.setForeground(new java.awt.Color(0, 153, 0));
        labelWins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWins.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        labelLosses.setBackground(new java.awt.Color(204, 0, 0));
        labelLosses.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelLosses.setForeground(new java.awt.Color(204, 0, 0));
        labelLosses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLosses.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnBack.setText("<-- Exit");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelHangmanTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangmanTitle_Image.png"))); // NOI18N

        btnClearRecords.setBackground(new java.awt.Color(0, 102, 204));
        btnClearRecords.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnClearRecords.setText("Clear Win/Loss Records");
        btnClearRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearRecordsActionPerformed(evt);
            }
        });

        labelMessage.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelMessage.setForeground(new java.awt.Color(255, 0, 0));
        labelMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout JFrame_GameLayout = new javax.swing.GroupLayout(JFrame_Game.getContentPane());
        JFrame_Game.getContentPane().setLayout(JFrame_GameLayout);
        JFrame_GameLayout.setHorizontalGroup(
            JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrame_GameLayout.createSequentialGroup()
                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JFrame_GameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addComponent(labelHangmanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClearRecords)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelWins, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelLosses, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JFrame_GameLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(labelHead, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(labelArm2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(labelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelHangmanStructure, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(labelLeg1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(labelArm1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(labelLeg2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHiddenWord, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JFrame_GameLayout.setVerticalGroup(
            JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrame_GameLayout.createSequentialGroup()
                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHangmanTitle)
                    .addGroup(JFrame_GameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWins, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(labelLosses, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JFrame_GameLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addComponent(labelHiddenWord, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JFrame_GameLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(labelLeg2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JFrame_GameLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelHead, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(labelArm2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(labelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelHangmanStructure, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JFrame_GameLayout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(labelLeg1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JFrame_GameLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(labelArm1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(JFrame_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JFrame_Win.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JFrame_Win.setSize(new java.awt.Dimension(703, 510));

        labelWinTitle.setFont(new java.awt.Font("Verdana", 3, 64)); // NOI18N
        labelWinTitle.setForeground(new java.awt.Color(255, 153, 0));
        labelWinTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWinTitle.setText("You Won!");

        labelSubtitle.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubtitle.setText("Congratulation! You guessed the word _______ correctly! ");

        labelPlayAgain.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelPlayAgain.setForeground(new java.awt.Color(0, 153, 204));
        labelPlayAgain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayAgain.setText("Would you like to play again?");

        btnYesWon.setBackground(new java.awt.Color(0, 204, 51));
        btnYesWon.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnYesWon.setText("Yes");
        btnYesWon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesWonActionPerformed(evt);
            }
        });

        btnNoWon.setBackground(new java.awt.Color(255, 0, 0));
        btnNoWon.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnNoWon.setText("No");
        btnNoWon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoWonActionPerformed(evt);
            }
        });

        labelVictory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Victory_Image.jpg"))); // NOI18N

        labelMissionPassed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mission_Passed.jpg"))); // NOI18N

        javax.swing.GroupLayout JFrame_WinLayout = new javax.swing.GroupLayout(JFrame_Win.getContentPane());
        JFrame_Win.getContentPane().setLayout(JFrame_WinLayout);
        JFrame_WinLayout.setHorizontalGroup(
            JFrame_WinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JFrame_WinLayout.createSequentialGroup()
                .addComponent(labelVictory, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMissionPassed)
                .addContainerGap())
            .addGroup(JFrame_WinLayout.createSequentialGroup()
                .addGroup(JFrame_WinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JFrame_WinLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelWinTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JFrame_WinLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnYesWon, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNoWon, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JFrame_WinLayout.setVerticalGroup(
            JFrame_WinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrame_WinLayout.createSequentialGroup()
                .addGroup(JFrame_WinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVictory, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMissionPassed, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(labelWinTitle)
                .addGap(34, 34, 34)
                .addComponent(labelSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labelPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(JFrame_WinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnYesWon, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoWon, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        JFrame_Lose.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JFrame_Lose.setBackground(new java.awt.Color(235, 178, 58));
        JFrame_Lose.setSize(new java.awt.Dimension(650, 495));

        labelLoseTitle.setFont(new java.awt.Font("Verdana", 3, 64)); // NOI18N
        labelLoseTitle.setForeground(new java.awt.Color(0, 51, 255));
        labelLoseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLoseTitle.setText("You Lost");

        labelSubtitle2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelSubtitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubtitle2.setText("Sorry! You did not guess the word _______ correctly");

        labelPlayAgain2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelPlayAgain2.setForeground(new java.awt.Color(255, 102, 0));
        labelPlayAgain2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayAgain2.setText("Would you like to play again?");

        btnYesLost.setBackground(new java.awt.Color(0, 204, 51));
        btnYesLost.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnYesLost.setText("Yes");
        btnYesLost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesLostActionPerformed(evt);
            }
        });

        btnNoLost.setBackground(new java.awt.Color(255, 0, 0));
        btnNoLost.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnNoLost.setText("No");
        btnNoLost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoLostActionPerformed(evt);
            }
        });

        labelMissionFailed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mission_Failed.jpg"))); // NOI18N

        labelGameOver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game_Over.jpg"))); // NOI18N

        javax.swing.GroupLayout JFrame_LoseLayout = new javax.swing.GroupLayout(JFrame_Lose.getContentPane());
        JFrame_Lose.getContentPane().setLayout(JFrame_LoseLayout);
        JFrame_LoseLayout.setHorizontalGroup(
            JFrame_LoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSubtitle2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addComponent(labelPlayAgain2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JFrame_LoseLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnYesLost, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNoLost, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JFrame_LoseLayout.createSequentialGroup()
                .addComponent(labelGameOver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMissionFailed)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JFrame_LoseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLoseTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        JFrame_LoseLayout.setVerticalGroup(
            JFrame_LoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JFrame_LoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JFrame_LoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMissionFailed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelGameOver, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(labelLoseTitle)
                .addGap(18, 18, 18)
                .addComponent(labelSubtitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(labelPlayAgain2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JFrame_LoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoLost, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYesLost, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        JFrame_Instructions.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JFrame_Instructions.setSize(new java.awt.Dimension(820, 805));

        labelInstructionsTitle.setFont(new java.awt.Font("Verdana", 3, 64)); // NOI18N
        labelInstructionsTitle.setForeground(new java.awt.Color(0, 204, 0));
        labelInstructionsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInstructionsTitle.setText("Instructions ");

        labelInstruction1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelInstruction1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInstruction1.setText("<html>1) In this game, a mystery word will be randomly chosen from a list of words. All of the letters of this mystery word will be hidden from you.  </html>");

        labelInstruction2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelInstruction2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInstruction2.setText("<html>2) You must try to determine what this mystery word is,  by guessing letters of the alphabet in order to uncover the letters of this hidden word.</html>");

        labelInstruction3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelInstruction3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInstruction3.setText("<html>3) Once all of the letters of the mystery word are revealed, you will have won!<html> ");

        labelInstruction4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelInstruction4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInstruction4.setText("<html>4) However, you have a limited number of incorrect guesses.  Everytime you guess a letter that is not in the hidden word, a body part is added to the “Hangman” image. <html>");

        labelInstruction5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelInstruction5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInstruction5.setText("<html>5) Once the full body of the hanged man is revealed, you will have lost. Essentially, you will be able to guess 6 incorrect letters. <html>");

        labelInstruction6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelInstruction6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInstruction6.setText("<html>6) Enjoy, and have fun!!<html>");

        labelQuestionMark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarioQuestionMark.png"))); // NOI18N

        labelHowToPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HowToPlay.png"))); // NOI18N

        labelUnderline.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        labelUnderline.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        btnBack2.setBackground(new java.awt.Color(255, 0, 0));
        btnBack2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnBack2.setText("<-- Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JFrame_InstructionsLayout = new javax.swing.GroupLayout(JFrame_Instructions.getContentPane());
        JFrame_Instructions.getContentPane().setLayout(JFrame_InstructionsLayout);
        JFrame_InstructionsLayout.setHorizontalGroup(
            JFrame_InstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelQuestionMark, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(JFrame_InstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelInstructionsTitle))
                    .addComponent(labelUnderline, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(labelHowToPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(labelInstruction1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(labelInstruction2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(labelInstruction3, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(labelInstruction4, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(labelInstruction5, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(labelInstruction6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JFrame_InstructionsLayout.setVerticalGroup(
            JFrame_InstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                .addGroup(JFrame_InstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(labelInstructionsTitle)
                        .addGap(0, 0, 0)
                        .addComponent(labelUnderline))
                    .addGroup(JFrame_InstructionsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelHowToPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelQuestionMark, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(labelInstruction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(labelInstruction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(labelInstruction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(labelInstruction4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(labelInstruction5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(labelInstruction6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(730, 480));

        labelTitle.setBackground(new java.awt.Color(204, 102, 0));
        labelTitle.setFont(new java.awt.Font("Verdana", 3, 54)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 153, 204));
        labelTitle.setText("Hangman Game!");

        btnInstructions.setBackground(new java.awt.Color(0, 153, 0));
        btnInstructions.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnInstructions.setText("Instructions");
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });

        btnPlayGame.setBackground(new java.awt.Color(255, 153, 0));
        btnPlayGame.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnPlayGame.setText("Play Game");
        btnPlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayGameActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelName.setText("By: Ishav Sohal");

        labelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IntroScreen_Image1.jpg"))); // NOI18N

        labelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IntroScreen_Image2.png"))); // NOI18N

        labelBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Orange_Gradient.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(labelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPlayGame, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(labelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelBackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnPlayGame, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(labelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(labelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelBackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Creates a method called "playSoundEffect", which takes a sound effect with a specified volume adjustment, and plays it 
    public void playSoundEffect(String soundName, float volume){
    
        // Try and Catch structure, which looks for any exceptions
        try {

            // Obtains a WAVE sound file, adjusts its volume, and plays it 
            AudioInputStream audioInputStream = 
                    AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
            Clip clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(volume); 
            clip.start( );
        }

        
        catch(Exception ex){

            // Tells us that there has been an error with the sound trying to be played
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    
    }
   
    // Creates a method called "enableLetters", which enables all of the letter buttons, from A to Z
    public void enableLetters (){
        
        // Enables all letters from A-Z
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
        btnG.setEnabled(true);
        btnH.setEnabled(true);
        btnI.setEnabled(true);
        btnJ.setEnabled(true);
        btnK.setEnabled(true);
        btnL.setEnabled(true);
        btnM.setEnabled(true);
        btnN.setEnabled(true);
        btnO.setEnabled(true);
        btnP.setEnabled(true);
        btnQ.setEnabled(true);
        btnR.setEnabled(true);
        btnS.setEnabled(true);
        btnT.setEnabled(true);
        btnU.setEnabled(true);
        btnV.setEnabled(true);
        btnW.setEnabled(true);
        btnX.setEnabled(true);
        btnY.setEnabled(true);
        btnZ.setEnabled(true);
    }

    /* Creates a method, called "letter_selection", which obtains a letter guessed by the user, and 
    checks if this letter is within the chosen mystery word */
    public int letter_selection (char x){

        // Sets "missing_letters" to 0
        missing_letters = 0;
        
        // Increments "incorrect_guesses" by 1
        incorrect_guesses ++;

       // Accesses each letter of the chosen word 
        for (int i = 0; i < chosen_word.length(); i ++){
            
            /* If the letter of the mystery word that the for loop is currently on is equal to the 
            letter guessed by the user */
            if ((chosen_word.charAt(i))==(x)){

                /* Replaces the blank position of the string "hidden_word" (string of blank dashes) that
                the for loop is currently on with the letter guessed by the user, as that would be the 
                exact location of the correctly guessed letter within the mystery word. This line would essentially
                uncover all of the positons of the mystery word that have the specific letter guessed by the user */
                hidden_word = hidden_word.substring(0, (i*2)) + x + hidden_word.substring((i*2) + 1); 
                
                // Sets "counter" to 1
                counter = 1;
            }
        }
        
        // Sets "labelHiddenWord" to the new hidden word, now with the blanks possibly updated
        labelHiddenWord.setText(hidden_word);
        
        
        
        // If counter is equal to 1, meaning if the users letter guess is within the chosen word
        if (counter == 1){ 
            
            
            // Checks how many missing letters are left in the word
            for (int j = 0; j < hidden_word.length(); j ++){
            
                // If there is a missing letter found in the word
                if ((hidden_word.charAt(j))==('_')){

                    // Increments "missing letters" by 1
                    missing_letters ++;
                }
            }
            
            
            // If there are no missing letters in the word
            if (missing_letters == 0){

                // Increment "wins" by 1, meaning that the user has successfully guessed the chosen word
                wins ++;
                
                // Close the "JFrame_Game" Frame, open the "JFrame_Win" frame, and centralize its position
                JFrame_Game.setVisible(false);
                JFrame_Win.setVisible(true);
                JFrame_Win.setLocationRelativeTo(null);

                /* Calls the "playSoundEffect" method, with the "GTASanAndreas_MissionPassedSound.wav" 
                sound file that has its volume decreased by 10 decibals */
                playSoundEffect ("GTASanAndreas_MissionPassedSound.wav", -10.0f);

                // Tells the user that they have successfully guessed the chosen word
                labelSubtitle.setText("Congratulation! You guessed the word " + chosen_word + " correctly!");
                
  
            }
            
            // Else, if there still are missing letters in the word 
            else if (missing_letters != 0){
                
                /* Calls the "playSoundEffect" method, with the "Ding_SoundEffect.wav" sound
                file that has its volume decreased by 20 decibals */
                playSoundEffect("Ding_SoundEffect.wav", -20f);
                
            }
            
            // Decrements "incorrect_guesses" by 1
            incorrect_guesses --;

        }
        
        
        
        // If counter is equal to 0, meaning if the users letter guess is not within the chosen word
        else if (counter == 0){
  
            // If this is the users first incorrect guess
            if (incorrect_guesses == 1){

                /* Calls the "playSoundEffect" method, with the "Keyboard_Button_1.wav" sound
                 file that has its volume decreased by 5 decibals */
                playSoundEffect("Keyboard_Button_1.wav", -5.0f);
                
                // Makes the head of the hangman appear
                labelHead.setVisible(true);

            }

            // If this is the users second incorrect guess
            if (incorrect_guesses == 2){

                /* Calls the "playSoundEffect" method, with the "Keyboard_Button_1.wav" sound
                 file that has its volume decreased by 5 decibals */
                playSoundEffect("Keyboard_Button_1.wav", -5.0f);

                // Makes the body of the hangman appear
                labelBody.setVisible(true);

            }

            // If this is the users third incorrect guess
            if (incorrect_guesses == 3){

                /* Calls the "playSoundEffect" method, with the "Keyboard_Button_1.wav" sound        
                 file that has its volume decreased by 5 decibals */
                playSoundEffect("Keyboard_Button_1.wav", -5.0f);

                // Makes the first arm of the hangman appear
                labelArm1.setVisible(true);

            }

            // If this is the users fourth incorrect guess
            if (incorrect_guesses == 4){

                /* Calls the "playSoundEffect" method, with the "Keyboard_Button_1.wav" sound
                 file that has its volume decreased by 5 decibals */
                playSoundEffect("Keyboard_Button_1.wav", -5.0f);

                // Makes the second arm of the hangman appear
                labelArm2.setVisible(true);

            }

            // If this is the users fifth incorrect guess
            if (incorrect_guesses == 5){

                /* Calls the "playSoundEffect" method, with the "Keyboard_Button_1.wav" sound
                 file that has its volume decreased by 5 decibals */
                playSoundEffect("Keyboard_Button_1.wav", -5.0f);

                // Makes the first leg of the hangman appear
                labelLeg1.setVisible(true);

            }

            // If this is the users sixth, and last incorrect guess
            if (incorrect_guesses == 6){

                // Makes the second leg of the hangman appear
                labelLeg2.setVisible(true);

                // Increment "losses" by 1, meaning that the user has not successfully guessed the chosen word   
                losses ++;

                 // Close the "JFrame_Game" Frame, open the "JFrame_Lose" frame, and centralize its position
                JFrame_Game.setVisible(false);
                JFrame_Lose.setVisible(true);
                JFrame_Lose.setLocationRelativeTo(null);

                /* Calls the "playSoundEffect" method, with the "SuperMarioBros._GameOverSoundEffect.wav"
                sound file that has its volume decreased by 30 decibals */
                playSoundEffect ("SuperMarioBros._GameOverSoundEffect.wav", -30.0f);

                // Tells the user that they have not successfully guessed the chosen word
                labelSubtitle2.setText("Sorry! You did not guess the word " + chosen_word + " correctly");
                
            }
        }

        // Sets "counter" to 0, so it is ready for the next time a letter is chosen by the user 
        counter = 0;
        
        // Clears the "labelMessage" label
        labelMessage.setText ("");
        
        /* Returns 1, a random number, just because it is required in order to have this method accept 
        a value within its parameters */
        return 1;
    }


    // Code Stub for "btnPlayGame" - Exeucted when the user clicks the "Play" button
    private void btnPlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayGameActionPerformed

        /* Calls the "playSoundEffect" method, with the "MenuSelection_ChangeG.wav" sound file that has
        its volume increased by 0.0 decibals */
        playSoundEffect("MenuSelection_ChangeG.wav", +0.0f);

        // Closes the main introduction Frame
        super.dispose();

        // Opens the "JFrame_Game" Frame, and centralizes its location
        JFrame_Game.setVisible(true);
        JFrame_Game.setLocationRelativeTo(null);

        // Accesses each letter of "chosen_word", which contains the word that the user must guess
        for (int x = 0; x < chosen_word.length(); x ++){

            // For every letter of the chosen word, a blank dash is added to the "hidden_word" variable.
            String A = "_ ";
            hidden_word = A + hidden_word;
        }

        /* Sets "labelHiddenWord" to "hidden_word". This will essentially show the users the blank spaces
        of the word that they must guess, which will give them the length of the word, as well as the
        positions of any correct letters that they may guess within the word. */
        labelHiddenWord.setText (hidden_word);

        // Makes the hangman figure invisible
        labelHead.setVisible(false);
        labelArm1.setVisible(false);
        labelArm2.setVisible(false);
        labelBody.setVisible(false);
        labelLeg1.setVisible(false);
        labelLeg2.setVisible(false);

        /* Sets "labelWins" to the "wins" variable. This will show the user the number of wins they
        have as they continue to play the game */
        labelWins.setText("Wins: " + wins);

        /* Sets "labelLosses" to the "losses" variable. This will show the user the number of losses
        they have as they continue to play the game */
        labelLosses.setText ("Losses: " + losses);

        // Clears the "labelMessage" label
        labelMessage.setText ("");
    }//GEN-LAST:event_btnPlayGameActionPerformed

    // Code Stub for "btnInstructions" - Execucted when the user clicks the "Instructions" button
    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionsActionPerformed

        /* Calls the "playSoundEffect" method, with the "MenuSelection_ChangeC.wav" sound file that has
        its volume increased by 0.0 decibals */
        playSoundEffect("MenuSelection_ChangeC.wav", +0.0f);

        // Closes the main introduction Frame
        super.dispose();

        // Opens the "JFrame_Instructions" Frame, and centralizes its location
        JFrame_Instructions.setVisible(true);
        JFrame_Instructions.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInstructionsActionPerformed

    // Code Stub for btnExit - Executed when the user clicks the "Exit" button on the main screen
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        // Try and Catch Structure, whcih looks for any exceptions
        try {
            /* Calls the "ScoreUpdate" method, which creates a Win/Loss record (within the "Score.xml" file)
            for the current game that has now ended, since the user has exited the game */
            ScoreUpdate ();
        }

        catch (IOException ex) {
            Logger.getLogger(Hangman_Game.class.getName()).log(Level.SEVERE, null, ex);
        }

        catch (SAXException ex) {
            Logger.getLogger(Hangman_Game.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Exits the program
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

  
    
    // Code Stub for "btnA" - Executed when the user clicks the "A" button
    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed

        /* Calls the "letter_selection" method with the character 'A' in its parameters. This will check
        if the letter "A" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('A');

        // Disables the "A" button, because once the user has guessed this letter, they cannot guess it again
        btnA.setEnabled(false);
    }//GEN-LAST:event_btnAActionPerformed

    // Code Stub for "btnB" - Executed when the user clicks the "B" button
    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed

        /* Calls the "letter_selection" method with the character 'B' in its parameters. This will check
        if the letter "B" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('B');

        // Disables the "B" button, because once the user has guessed this letter, they cannot guess it again
        btnB.setEnabled(false);
    }//GEN-LAST:event_btnBActionPerformed

    // Code Stub for "btnC" - Executed when the user clicks the "C" button
    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed

        /* Calls the "letter_selection" method with the character 'C' in its parameters. This will check
        if the letter "C" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('C');

        // Disables the "C" button, because once the user has guessed this letter, they cannot guess it again
        btnC.setEnabled(false);
    }//GEN-LAST:event_btnCActionPerformed

    // Code Stub for "btnD" - Executed when the user clicks the "D" button
    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed

        /* Calls the "letter_selection" method with the character 'D' in its parameters. This will check
        if the letter "D" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('D');

        // Disables the "D" button, because once the user has guessed this letter, they cannot guess it again
        btnD.setEnabled(false);
    }//GEN-LAST:event_btnDActionPerformed

    // Code Stub for "btnE" - Executed when the user clicks the "E" button
    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed

        /* Calls the "letter_selection" method with the character 'E' in its parameters. This will check
        if the letter "E" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('E');

        // Disables the "E" button, because once the user has guessed this letter, they cannot guess it again
        btnE.setEnabled(false);
    }//GEN-LAST:event_btnEActionPerformed

    // Code Stub for "btnF" - Executed when the user clicks the "F" button
    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed

        /* Calls the "letter_selection" method with the character 'F' in its parameters. This will check
        if the letter "F" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('F');

        // Disables the "F" button, because once the user has guessed this letter, they cannot guess it again
        btnF.setEnabled(false);
    }//GEN-LAST:event_btnFActionPerformed

    // Code Stub for "btnG" - Executed when the user clicks the "G" button
    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed

        /* Calls the "letter_selection" method with the character 'G' in its parameters. This will check
        if the letter "G" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('G');

        // Disables the "G" button, because once the user has guessed this letter, they cannot guess it again
        btnG.setEnabled(false);
    }//GEN-LAST:event_btnGActionPerformed

    // Code Stub for "btnH" - Executed when the user clicks the "H" button
    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed

        /* Calls the "letter_selection" method with the character 'H' in its parameters. This will check
        if the letter "H" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('H');

        // Disables the "H" button, because once the user has guessed this letter, they cannot guess it again
        btnH.setEnabled(false);
    }//GEN-LAST:event_btnHActionPerformed

    // Code Stub for "btnI" - Executed when the user clicks the "I" button
    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed

        /* Calls the "letter_selection" method with the character 'I' in its parameters. This will check
        if the letter "I" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('I');

        // Disables the "I" button, because once the user has guessed this letter, they cannot guess it again
        btnI.setEnabled(false);
    }//GEN-LAST:event_btnIActionPerformed

    // Code Stub for "btnJ" - Executed when the user clicks the "J" button
    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed

        /* Calls the "letter_selection" method with the character 'J' in its parameters. This will check
        if the letter "J" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('J');

        // Disables the "J" button, because once the user has guessed this letter, they cannot guess it again
        btnJ.setEnabled(false);
    }//GEN-LAST:event_btnJActionPerformed

    // Code Stub for "btnK" - Executed when the user clicks the "K" button
    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed

        /* Calls the "letter_selection" method with the character 'K' in its parameters. This will check
        if the letter "K" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('K');

        // Disables the "K" button, because once the user has guessed this letter, they cannot guess it again
        btnK.setEnabled(false);
    }//GEN-LAST:event_btnKActionPerformed

    // Code Stub for "btnL" - Executed when the user clicks the "L" button
    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed

        /* Calls the "letter_selection" method with the character 'L' in its parameters. This will check
        if the letter "L" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('L');

        // Disables the "L" button, because once the user has guessed this letter, they cannot guess it again
        btnL.setEnabled(false);
    }//GEN-LAST:event_btnLActionPerformed

    // Code Stub for "btnM" - Executed when the user clicks the "M" button
    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed

        /* Calls the "letter_selection" method with the character 'M' in its parameters. This will check
        if the letter "M" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('M');

        // Disables the "M" button, because once the user has guessed this letter, they cannot guess it again
        btnM.setEnabled(false);
    }//GEN-LAST:event_btnMActionPerformed

    // Code Stub for "btnN" - Executed when the user clicks the "N" button
    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed

        /* Calls the "letter_selection" method with the character 'N' in its parameters. This will check
        if the letter "N" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('N');

        // Disables the "N" button, because once the user has guessed this letter, they cannot guess it again
        btnN.setEnabled(false);
    }//GEN-LAST:event_btnNActionPerformed

    // Code Stub for "btnO" - Executed when the user clicks the "O" button
    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed

        /* Calls the "letter_selection" method with the character 'O' in its parameters. This will check
        if the letter "O" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('O');

        // Disables the "O" button, because once the user has guessed this letter, they cannot guess it again
        btnO.setEnabled(false);
    }//GEN-LAST:event_btnOActionPerformed

    // Code Stub for "btnP" - Executed when the user clicks the "P" button
    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed

        /* Calls the "letter_selection" method with the character 'P' in its parameters. This will check
        if the letter "P" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('P');

        // Disables the "P" button, because once the user has guessed this letter, they cannot guess it again
        btnP.setEnabled(false);
    }//GEN-LAST:event_btnPActionPerformed

    // Code Stub for "btnQ" - Executed when the user clicks the "Q" button
    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed

        /* Calls the "letter_selection" method with the character 'Q' in its parameters. This will check
        if the letter "Q" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('Q');

        // Disables the "Q" button, because once the user has guessed this letter, they cannot guess it again
        btnQ.setEnabled(false);
    }//GEN-LAST:event_btnQActionPerformed

    // Code Stub for "btnR" - Executed when the user clicks the "R" button
    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed

        /* Calls the "letter_selection" method with the character 'R' in its parameters. This will check
        if the letter "R" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('R');

        // Disables the "R" button, because once the user has guessed this letter, they cannot guess it again
        btnR.setEnabled(false);
    }//GEN-LAST:event_btnRActionPerformed

    // Code Stub for "btnS" - Executed when the user clicks the "S" button
    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed

        /* Calls the "letter_selection" method with the character 'S' in its parameters. This will check
        if the letter "S" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('S');

        // Disables the "S" button, because once the user has guessed this letter, they cannot guess it again
        btnS.setEnabled(false);
    }//GEN-LAST:event_btnSActionPerformed

    // Code Stub for "btnT" - Executed when the user clicks the "T" button
    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed

        /* Calls the "letter_selection" method with the character 'T' in its parameters. This will check
        if the letter "T" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('T');

        // Disables the "T" button, because once the user has guessed this letter, they cannot guess it again
        btnT.setEnabled(false);
    }//GEN-LAST:event_btnTActionPerformed

    // Code Stub for "btnU" - Executed when the user clicks the "U" button
    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed

        /* Calls the "letter_selection" method with the character 'U' in its parameters. This will check
        if the letter "U" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('U');

        // Disables the "U" button, because once the user has guessed this letter, they cannot guess it again
        btnU.setEnabled(false);
    }//GEN-LAST:event_btnUActionPerformed

    // Code Stub for "btnV" - Executed when the user clicks the "V" button
    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed

        /* Calls the "letter_selection" method with the character 'V' in its parameters. This will check
        if the letter "V" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('V');

        // Disables the "V" button, because once the user has guessed this letter, they cannot guess it again
        btnV.setEnabled(false);
    }//GEN-LAST:event_btnVActionPerformed

    // Code Stub for "btnW" - Executed when the user clicks the "W" button
    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed

        /* Calls the "letter_selection" method with the character 'W' in its parameters. This will check
        if the letter "W" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('W');

        // Disables the "W" button, because once the user has guessed this letter, they cannot guess it again
        btnW.setEnabled(false);
    }//GEN-LAST:event_btnWActionPerformed

    // Code Stub for "btnX" - Executed when the user clicks the "X" button
    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed

        /* Calls the "letter_selection" method with the character 'X' in its parameters. This will check
        if the letter "X" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('X');

        // Disables the "X" button, because once the user has guessed this letter, they cannot guess it again
        btnX.setEnabled(false);
    }//GEN-LAST:event_btnXActionPerformed

    // Code Stub for "btnY" - Executed when the user clicks the "Y" button
    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed

        /* Calls the "letter_selection" method with the character 'Y' in its parameters. This will check
        if the letter "Y" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('Y');

        // Disables the "Y" button, because once the user has guessed this letter, they cannot guess it again
        btnY.setEnabled(false);
    }//GEN-LAST:event_btnYActionPerformed

    // Code Stub for "btnZ" - Executed when the user clicks the "Z" button
    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed

        /* Calls the "letter_selection" method with the character 'Z' in its parameters. This will check
        if the letter "Z" is within the specific chosen word, and will uncover its position(s) within the 
        word if it is, in fact, in the word.*/
        letter_selection('Z');

        // Disables the "Z" button, because once the user has guessed this letter, they cannot guess it again
        btnZ.setEnabled(false);
    }//GEN-LAST:event_btnZActionPerformed

   
   
    /* Code Stub for "btnYesWon" - Execuetd when the user clicks the "Yes" button on the win screen when 
    asked if they would like to play again */
    private void btnYesWonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesWonActionPerformed

        /* Calls the "playSoundEffect" method, with the "MenuSelection_ChangeG.wav" sound file that has
        its volume increased by 0.0 decibals */
        playSoundEffect("MenuSelection_ChangeG.wav", +0.0f);

        // Closes the "JFrame_Win" Frame, and opens the "JFrame_Game" Frame
        JFrame_Win.setVisible(false);
        JFrame_Game.setVisible(true);

        // Chooses a new random mystery word for the user to guess
        random_index = r.nextInt(words.length);
        chosen_word = words[random_index];

        // Clears the "hidden_word" variable, so it is reasy for the next mystery word
        hidden_word = "";

        // Accesses each letter of the chosen word
        for (int x = 0; x < chosen_word.length(); x ++){

            // For every letter of the chosen word, a blank space is added to the "hidden_word" variable
            String A = "_ ";
            hidden_word = A + hidden_word;
        }

        /* Sets "labelHiddenWord" to "hidden_word". This will essentially show the users the blank spaces
        of the word that they must guess, which will give them the length of the word, as well as the
        positions of any correct letters that they may guess within the word. */
        labelHiddenWord.setText (hidden_word);

        // Makes the hangman figure invisible
        labelHead.setVisible(false);
        labelArm1.setVisible(false);
        labelArm2.setVisible(false);
        labelBody.setVisible(false);
        labelLeg1.setVisible(false);
        labelLeg2.setVisible(false);

        // Calls the "enableLetters" method, whcih enables all of the letter buttons
        enableLetters ();

        // Sets "incorrect_guesses" to 0
        incorrect_guesses = 0;

        // Sets "missing_letters" to 0
        missing_letters = 0;

        // Sets "counter" to 0
        counter = 0;

        // Updates the labels that show the number of wins and losses
        labelWins.setText("Wins: " + wins);
        labelLosses.setText ("Losses: " + losses);
    }//GEN-LAST:event_btnYesWonActionPerformed

    /* Code Stub for "btnNoWon" - Execuetd when the user clicks the "No" button on the win screen when 
    asked if they would like to play again */
    private void btnNoWonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoWonActionPerformed

        // Try and Catch Structure, whcih looks for any exceptions
        try {
            /* Calls the "ScoreUpdate" method, which creates a Win/Loss record (within the "Score.xml" file)
            for the current game that has now ended, since the user has exited the game */
            ScoreUpdate ();
        }

        catch (IOException ex) {
            Logger.getLogger(Hangman_Game.class.getName()).log(Level.SEVERE, null, ex);
        }

        catch (SAXException ex) {
            Logger.getLogger(Hangman_Game.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Calls the "playSoundEffect" method, with the "MenuSelection_ChangeC.wav" sound file that has
        its volume increased by 0.0 decibals */
        playSoundEffect("MenuSelection_ChangeC.wav", +0.0f);

        // Thanks the user for playing
        JOptionPane.showMessageDialog (null, "Thank you for playing !!!");

        // Exits the program
        System.exit (0);
    }//GEN-LAST:event_btnNoWonActionPerformed

    /* Code Stub for "btnYesLost" - Execuetd when the user clicks the "Yes" button on the lose screen when 
    asked if they would like to play again */
    private void btnYesLostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesLostActionPerformed

        /* Calls the "playSoundEffect" method, with the "MenuSelection_ChangeG.wav" sound file that has
        its volume increased by 0.0 decibals */
        playSoundEffect("MenuSelection_ChangeG.wav", +0.0f);

        // Closes the "JFrame_Win" Frame, and opens the "JFrame_Game" Frame
        JFrame_Lose.setVisible(false);
        JFrame_Game.setVisible(true);

        // Chooses a new random mystery word for the user to guess
        random_index = r.nextInt(words.length);
        chosen_word = words[random_index];

        // Clears the "hidden_word" variable, so it is reasy for the next mystery word
        hidden_word = "";

        // Accesses each letter of the chosen word
        for (int x = 0; x < chosen_word.length(); x ++){

            // For every letter of the chosen word, a blank space is added to the "hidden_word" variable
            String A = "_ ";
            hidden_word = A + hidden_word;
        }

        /* Sets "labelHiddenWord" to "hidden_word". This will essentially show the users the blank spaces
        of the word that they must guess, which will give them the length of the word, as well as the
        positions of any correct letters that they may guess within the word. */
        labelHiddenWord.setText (hidden_word);

        // Makes the hangman figure invisible
        labelHead.setVisible(false);
        labelArm1.setVisible(false);
        labelArm2.setVisible(false);
        labelBody.setVisible(false);
        labelLeg1.setVisible(false);
        labelLeg2.setVisible(false);

        // Calls the "enableLetters" method, whcih enables all of the letter buttons
        enableLetters ();

        // Sets "incorrect_guesses" to 0
        incorrect_guesses = 0;

        // Sets "missing_letters" to 0
        missing_letters = 0;

        // Sets "counter" to 0
        counter = 0;

        // Updates the labels that show the number of wins and losses
        labelWins.setText("Wins: " + wins);
        labelLosses.setText ("Losses: " + losses);

    }//GEN-LAST:event_btnYesLostActionPerformed

    /* Code Stub for "btnNoLost" - Execuetd when the user clicks the "No" button on the lose screen when 
    asked if they would like to play again */
    private void btnNoLostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoLostActionPerformed

        // Try and Catch Structure, whcih looks for any exceptions
        try {
            /* Calls the "ScoreUpdate" method, which creates a Win/Loss record (within the "Score.xml" file)
            for the current game that has now ended, since the user has exited the game */
            ScoreUpdate ();
        }

        catch (IOException ex) {
            Logger.getLogger(Hangman_Game.class.getName()).log(Level.SEVERE, null, ex);
        }

        catch (SAXException ex) {
            Logger.getLogger(Hangman_Game.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Calls the "playSoundEffect" method, with the "MenuSelection_ChangeC.wav" sound file that has
        its volume increased by 0.0 decibals */
        playSoundEffect("MenuSelection_ChangeC.wav", +0.0f);

        // Thanks the user for playing
        JOptionPane.showMessageDialog (null, "Thank you for playing !!!");

        // Exits the program
        System.exit (0);
    }//GEN-LAST:event_btnNoLostActionPerformed

    /* Code Stub for "btnClearRecords" - Executed when the user clicks the "Clear Win/Loss Records" button.
    This code will simply clear the "Score.xml" file of all of the users Win/Loss records. */
    private void btnClearRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearRecordsActionPerformed

        /* Calls the "playSoundEffect" method, with the "MenuSelection_ChangeG.wav" sound file that has
        its volume increased by 0.0 decibals */
        playSoundEffect("MenuSelection_ChangeG.wav", +0.0f);

        // Try and Catch structure, which trys to catch any exceptions in the code
        try {

            // Allows for the creation of the XML file
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();

            // Enables information to read from XML file
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Creates an XML file, called "doc"
            Document doc = docBuilder.newDocument();

            // Creates an element, called "GameScores"
            Element GameScores = doc.createElement("GameScores");

            // Sets the element "GameScores" as the root element of the XML file
            doc.appendChild(GameScores);

            // Write the content into XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            // Makes sure the XML file is formatted nicely with indentation
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            // Makes sure the XML file is formatted nicely with indent space of 4
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            // Creates the XML, and calls it "Score.xml"
            StreamResult result = new StreamResult(new File("Score.xml"));
            
            //labelWins.setText("Wins: " + 0);
            //labelLosses.setText("Losses: " + 0);
            
            //wins = 0;
            //losses = 0;
          

            try {
                // Outputs to console screen
                transformer.transform(source, result);
            }

            catch (TransformerException ex) {
                Logger.getLogger(Hangman_Game.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        // Trys to catch any exceptions
        catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }

        catch (TransformerException tfe) {
            tfe.printStackTrace();
        }

        // Tells the user that their Win/Loss records have successfully been cleared
        labelMessage.setText ("Win/Loss Records successfully cleared!");
    }//GEN-LAST:event_btnClearRecordsActionPerformed

    // Code Stub for "btnBack" - Executed when the user clicks the "Back" button on the Game screen
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        /* Calls the "playSoundEffect" method, with the "MenuSelection_ChangeC.wav" sound file that has
        its volume increased by 0.0 decibals */
        playSoundEffect("MenuSelection_ChangeC.wav", +0.0f);

        // Asks the user if they are sure that they would like to return to the main menu
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure? Your current game data "
            + "will not be saved.", "Are You Sure?", dialogButton);

        // If they answer with "Yes"
        if (dialogResult == 0){

            // Closes the "JFrame_Game" screen, and opens the main menu screen
            JFrame_Game.setVisible(false);
            setVisible(true);

            // Chooses a new word for the user to guess
            random_index = r.nextInt(words.length);
            chosen_word = words[random_index];

            // Clears the "hidden_word" variable, so it is reasy for the next word
            hidden_word = "";

            // Sets "incorrect_guesses" to 0
            incorrect_guesses = 0;

            // Sets "missing_letters" to 0
            missing_letters = 0;

            // Sets "counter" to 0
            counter = 0;

            // Calls the "enableLetters" method, whcih enables all of the letter buttons
            enableLetters ();

        }

        // Clears the "labelMessage" label
        labelMessage.setText ("");
    }//GEN-LAST:event_btnBackActionPerformed

    // Code Stub for "btnBack2" - Executed when the user clicks the "Back" button on the Instructions Screen
    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed

        /* Calls the "playSoundEffect" method, with the "MenuSelection_ChangeC.wav" sound file that has
        its volume increased by 0.0 decibals */
        playSoundEffect("MenuSelection_ChangeC.wav", +0.0f);

        // Closes the "JFrame_Instructions" screen, and opens the main menu screen
        JFrame_Instructions.setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_btnBack2ActionPerformed


    
    /* Creates a method called "ScoreUpdate". This will update the "Score.xml" file, which stores
    the amount of wins and losses that have occured every time that the game is played. This method 
    will be called every time the user exits the program, and it will essentially get the final amount 
    of wins and losses of that specific game run, and store it in the XML file as a record for that 
    specific time the game was played */
    public void ScoreUpdate () throws IOException, SAXException {

         // Try and Catch Structure, which trys to catch any exceptions in the code
	try {  
 
             // Brings the "Score.xml" XML file into the program
            String filepath = "Score.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            
            /* Gets the root element, "GameScores", from the "Score.xml" XML file, and stores it in a
            variable called "GameScores" */
            Node GameScores = doc.getFirstChild();
            
            
            // Creates an element, named "game"
            Element game = doc.createElement("Game");

            // Adds the element "game" as a child/sub-element of the "GameScores" root element  
            GameScores.appendChild(game);
            
            
            // Creates an element, called "wins_count"
            Element wins_count = doc.createElement ("Wins");
            
            /* Adds the variable "wins" as a child element of the "wins_count" element. This will add
            the final number of wins, for this current game run, to the XML file, under a specific "Game"
            heading. */
            wins_count.appendChild (doc.createTextNode(Integer.toString(wins)));
            
            // Adds the element "wins_count" as a child/sub-element of the "game" element
            game.appendChild(wins_count);
            
            
            // Creates an element, called "losses_count"
            Element losses_count = doc.createElement ("Losses");
            
            /* Adds the variable "losses" as a child element of the "losses_count" element. This will add
            the final number of losses, for this current game run, to the XML file, under a specific "Game"
            heading. */
            losses_count.appendChild (doc.createTextNode(Integer.toString(losses)));
           
            // Adds the element "losses_count" as a child/sub-element of the "game" element
            game.appendChild(losses_count);
            


            // Writes the content into the XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            
            // Makes sure the XML file is formatted nicely with indentation
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");  
            
            // Makes sure the XML file is formatted nicely with indent space of 4 
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");  
            StreamResult result = new StreamResult(new File(filepath));
	    transformer.transform(source, result);
               
        } 
        
        // Trys to catch any exceptions
        catch (ParserConfigurationException pce) {   
            pce.printStackTrace();
        }      
        catch (TransformerException tfe) {
            tfe.printStackTrace();
        } 
        catch (IOException ioe) {
            ioe.printStackTrace();
	} 
        catch (SAXException sae) {
            sae.printStackTrace();
	}
    }
    
    // MAIN METHOD
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hangman_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hangman_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hangman_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hangman_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hangman_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame JFrame_Game;
    private javax.swing.JFrame JFrame_Instructions;
    private javax.swing.JFrame JFrame_Lose;
    private javax.swing.JFrame JFrame_Win;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnClearRecords;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnInstructions;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnNoLost;
    private javax.swing.JButton btnNoWon;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnPlayGame;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnYesLost;
    private javax.swing.JButton btnYesWon;
    private javax.swing.JButton btnZ;
    private javax.swing.JLabel labelArm1;
    private javax.swing.JLabel labelArm2;
    private javax.swing.JLabel labelBackgroundImage;
    private javax.swing.JLabel labelBody;
    private javax.swing.JLabel labelGameOver;
    private javax.swing.JLabel labelHangmanStructure;
    private javax.swing.JLabel labelHangmanTitle;
    private javax.swing.JLabel labelHead;
    private javax.swing.JLabel labelHiddenWord;
    private javax.swing.JLabel labelHowToPlay;
    private javax.swing.JLabel labelImage1;
    private javax.swing.JLabel labelImage2;
    private javax.swing.JLabel labelInstruction1;
    private javax.swing.JLabel labelInstruction2;
    private javax.swing.JLabel labelInstruction3;
    private javax.swing.JLabel labelInstruction4;
    private javax.swing.JLabel labelInstruction5;
    private javax.swing.JLabel labelInstruction6;
    private javax.swing.JLabel labelInstructionsTitle;
    private javax.swing.JLabel labelLeg1;
    private javax.swing.JLabel labelLeg2;
    private javax.swing.JLabel labelLoseTitle;
    private javax.swing.JLabel labelLosses;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JLabel labelMissionFailed;
    private javax.swing.JLabel labelMissionPassed;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPlayAgain;
    private javax.swing.JLabel labelPlayAgain2;
    private javax.swing.JLabel labelQuestionMark;
    private javax.swing.JLabel labelSubtitle;
    private javax.swing.JLabel labelSubtitle2;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUnderline;
    private javax.swing.JLabel labelVictory;
    private javax.swing.JLabel labelWinTitle;
    private javax.swing.JLabel labelWins;
    // End of variables declaration//GEN-END:variables
}
