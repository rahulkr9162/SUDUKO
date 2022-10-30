
import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rahul kumar
 */
public class Suduko extends javax.swing.JFrame {

    /**
     * Creates new form Suduko
     */
    private String turn = "1";
    private boolean Globalflag = true;
    public String[][] solvedboard ={
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
    };  
    
    public Suduko() {
        initComponents();
    }
    public void ResetMoves(){
        JButton button[] = {Button4, Button7, Button8, Button9, Button10, Button14, Button15, Button16, Button18, Button19, Button21,
                            Button23, Button26, Button32, Button33, Button35, Button38, Button39, Button43, Button44, Button47, Button49,
                            Button50, Button56, Button59, Button61, Button63, Button64, Button66, Button67, Button68, Button72, Button73,
                            Button74, Button75, Button78};
        
        JButton board [][] = {
            {Button1, Button2,Button3, Button4, Button5, Button6, Button7, Button8, Button9},
            {Button10, Button11,Button12, Button13, Button14, Button15, Button16, Button17, Button18},
            {Button19, Button20,Button21, Button22, Button23, Button24, Button25, Button26, Button27},
            {Button28, Button29,Button30, Button31, Button32, Button33, Button34, Button35, Button36},
            {Button37, Button38,Button39, Button40, Button41, Button42, Button43, Button44, Button45},
            {Button46, Button47,Button48, Button49, Button50, Button51, Button52, Button53, Button54},
            {Button55, Button56,Button57, Button58, Button59, Button60, Button61, Button62, Button63},
            {Button64, Button65,Button66, Button67, Button68, Button69, Button70, Button71, Button72},
            {Button73, Button74,Button75, Button76, Button77, Button78, Button79, Button80, Button81},
        };
         
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                boolean flag = true;
                for(int k=0; k<button.length; k++){
                    if(board[i][j] == button[k]){
                        flag = false;
                        break;
                   
                    }      
            }
                if(flag == true){
                        board[i][j].setText("");
                        board[i][j].setBackground(white);
                    }
        }
        }
        
                
    }
    public void seeSolution(){
        JButton button[] = {Button4, Button7, Button8, Button9, Button10, Button14, Button15, Button16, Button18, Button19, Button21,
                            Button23, Button26, Button32, Button33, Button35, Button38, Button39, Button43, Button44, Button47, Button49,
                            Button50, Button56, Button59, Button61, Button63, Button64, Button66, Button67, Button68, Button72, Button73,
                            Button74, Button75, Button78};
        
        JButton board [][] = {
            {Button1, Button2,Button3, Button4, Button5, Button6, Button7, Button8, Button9},
            {Button10, Button11,Button12, Button13, Button14, Button15, Button16, Button17, Button18},
            {Button19, Button20,Button21, Button22, Button23, Button24, Button25, Button26, Button27},
            {Button28, Button29,Button30, Button31, Button32, Button33, Button34, Button35, Button36},
            {Button37, Button38,Button39, Button40, Button41, Button42, Button43, Button44, Button45},
            {Button46, Button47,Button48, Button49, Button50, Button51, Button52, Button53, Button54},
            {Button55, Button56,Button57, Button58, Button59, Button60, Button61, Button62, Button63},
            {Button64, Button65,Button66, Button67, Button68, Button69, Button70, Button71, Button72},
            {Button73, Button74,Button75, Button76, Button77, Button78, Button79, Button80, Button81},
        };
        if(Globalflag == true){
            jButton102.setText("HIDE SOlN");
            Globalflag = false;
             for(int i=0; i<9; i++){
             for(int j=0; j<9; j++){
                boolean flag = true;
                for(int k=0; k<button.length; k++){
                    if(board[i][j] == button[k]){
                        flag = false;
                        break;
                   
                    }      
            }
                if(flag == true){
                        board[i][j].setText(solvedboard[i][j]);
                        board[i][j].setForeground(white);
                        board[i][j].setBackground(black);
                    }
                
        }
        }    
        }
        else{
            jButton102.setText("SOLUTION");
             Globalflag = true;
             ResetMoves();
                }
    }
    public void checkMoves(){
         JButton button[] = {Button4, Button7, Button8, Button9, Button10, Button14, Button15, Button16, Button18, Button19, Button21,
                            Button23, Button26, Button32, Button33, Button35, Button38, Button39, Button43, Button44, Button47, Button49,
                            Button50, Button56, Button59, Button61, Button63, Button64, Button66, Button67, Button68, Button72, Button73,
                            Button74, Button75, Button78};
        
        JButton board [][] = {
            {Button1, Button2,Button3, Button4, Button5, Button6, Button7, Button8, Button9},
            {Button10, Button11,Button12, Button13, Button14, Button15, Button16, Button17, Button18},
            {Button19, Button20,Button21, Button22, Button23, Button24, Button25, Button26, Button27},
            {Button28, Button29,Button30, Button31, Button32, Button33, Button34, Button35, Button36},
            {Button37, Button38,Button39, Button40, Button41, Button42, Button43, Button44, Button45},
            {Button46, Button47,Button48, Button49, Button50, Button51, Button52, Button53, Button54},
            {Button55, Button56,Button57, Button58, Button59, Button60, Button61, Button62, Button63},
            {Button64, Button65,Button66, Button67, Button68, Button69, Button70, Button71, Button72},
            {Button73, Button74,Button75, Button76, Button77, Button78, Button79, Button80, Button81},
        };
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
        if(board[i][j].getText() != solvedboard[i][j] && board[i][j].getText() != ""){
            board[i][j].setBackground(red);
        }
        }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Button19 = new javax.swing.JButton();
        Button10 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button11 = new javax.swing.JButton();
        Button20 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button12 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button21 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Button22 = new javax.swing.JButton();
        Button13 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button14 = new javax.swing.JButton();
        Button23 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button15 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button24 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Button25 = new javax.swing.JButton();
        Button16 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button17 = new javax.swing.JButton();
        Button26 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button18 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button27 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Button52 = new javax.swing.JButton();
        Button43 = new javax.swing.JButton();
        Button35 = new javax.swing.JButton();
        Button44 = new javax.swing.JButton();
        Button53 = new javax.swing.JButton();
        Button36 = new javax.swing.JButton();
        Button45 = new javax.swing.JButton();
        Button34 = new javax.swing.JButton();
        Button54 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Button49 = new javax.swing.JButton();
        Button40 = new javax.swing.JButton();
        Button32 = new javax.swing.JButton();
        Button41 = new javax.swing.JButton();
        Button50 = new javax.swing.JButton();
        Button33 = new javax.swing.JButton();
        Button42 = new javax.swing.JButton();
        Button31 = new javax.swing.JButton();
        Button51 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Button46 = new javax.swing.JButton();
        Button37 = new javax.swing.JButton();
        Button29 = new javax.swing.JButton();
        Button38 = new javax.swing.JButton();
        Button47 = new javax.swing.JButton();
        Button30 = new javax.swing.JButton();
        Button39 = new javax.swing.JButton();
        Button28 = new javax.swing.JButton();
        Button48 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Button79 = new javax.swing.JButton();
        Button70 = new javax.swing.JButton();
        Button62 = new javax.swing.JButton();
        Button71 = new javax.swing.JButton();
        Button80 = new javax.swing.JButton();
        Button63 = new javax.swing.JButton();
        Button72 = new javax.swing.JButton();
        Button61 = new javax.swing.JButton();
        Button81 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        Button76 = new javax.swing.JButton();
        Button67 = new javax.swing.JButton();
        Button59 = new javax.swing.JButton();
        Button68 = new javax.swing.JButton();
        Button77 = new javax.swing.JButton();
        Button60 = new javax.swing.JButton();
        Button69 = new javax.swing.JButton();
        Button58 = new javax.swing.JButton();
        Button78 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        Button73 = new javax.swing.JButton();
        Button64 = new javax.swing.JButton();
        Button56 = new javax.swing.JButton();
        Button65 = new javax.swing.JButton();
        Button74 = new javax.swing.JButton();
        Button57 = new javax.swing.JButton();
        Button66 = new javax.swing.JButton();
        Button55 = new javax.swing.JButton();
        Button75 = new javax.swing.JButton();
        SelectButton2 = new javax.swing.JButton();
        SelectButton3 = new javax.swing.JButton();
        SelectButton1 = new javax.swing.JButton();
        SelectButton4 = new javax.swing.JButton();
        SelectButton5 = new javax.swing.JButton();
        SelectButton7 = new javax.swing.JButton();
        SelectButton6 = new javax.swing.JButton();
        SelectButton9 = new javax.swing.JButton();
        SelectButton8 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Suduko_Solver");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button19.setBackground(new java.awt.Color(204, 102, 255));
        Button19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button19.setText("7");
        Button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button19ActionPerformed(evt);
            }
        });

        Button10.setBackground(new java.awt.Color(204, 102, 255));
        Button10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button10.setText("4");
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });

        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });

        Button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button20ActionPerformed(evt);
            }
        });

        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });

        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button21.setBackground(new java.awt.Color(204, 102, 255));
        Button21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button21.setText("6");
        Button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button22ActionPerformed(evt);
            }
        });

        Button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button13ActionPerformed(evt);
            }
        });

        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button14.setBackground(new java.awt.Color(204, 102, 255));
        Button14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button14.setText("7");
        Button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button14ActionPerformed(evt);
            }
        });

        Button23.setBackground(new java.awt.Color(204, 102, 255));
        Button23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button23.setText("4");
        Button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button23ActionPerformed(evt);
            }
        });

        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button15.setBackground(new java.awt.Color(204, 102, 255));
        Button15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button15.setText("8");
        Button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button15ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(204, 102, 255));
        Button4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button4.setText("5");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Button22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Button13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button25ActionPerformed(evt);
            }
        });

        Button16.setBackground(new java.awt.Color(204, 102, 255));
        Button16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button16.setText("5");
        Button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button16ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(204, 102, 255));
        Button8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button8.setText("3");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button17ActionPerformed(evt);
            }
        });

        Button26.setBackground(new java.awt.Color(204, 102, 255));
        Button26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button26.setText("2");
        Button26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button26ActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(204, 102, 255));
        Button9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button9.setText("4");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button18.setBackground(new java.awt.Color(204, 102, 255));
        Button18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button18.setText("9");
        Button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button18ActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(204, 102, 255));
        Button7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Button25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Button16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button52ActionPerformed(evt);
            }
        });

        Button43.setBackground(new java.awt.Color(204, 102, 255));
        Button43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button43.setText("2");
        Button43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button43ActionPerformed(evt);
            }
        });

        Button35.setBackground(new java.awt.Color(204, 102, 255));
        Button35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button35.setText("9");
        Button35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button35ActionPerformed(evt);
            }
        });

        Button44.setBackground(new java.awt.Color(204, 102, 255));
        Button44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button44.setText("8");
        Button44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button44ActionPerformed(evt);
            }
        });

        Button53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button53ActionPerformed(evt);
            }
        });

        Button36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button36ActionPerformed(evt);
            }
        });

        Button45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button45ActionPerformed(evt);
            }
        });

        Button34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button34ActionPerformed(evt);
            }
        });

        Button54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button54ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Button43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Button52, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button53, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button54, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Button34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button44, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button53, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button54, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button49.setBackground(new java.awt.Color(204, 102, 255));
        Button49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button49.setText("1");
        Button49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button49ActionPerformed(evt);
            }
        });

        Button40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button40ActionPerformed(evt);
            }
        });

        Button32.setBackground(new java.awt.Color(204, 102, 255));
        Button32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button32.setText("3");
        Button32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button32ActionPerformed(evt);
            }
        });

        Button41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button41ActionPerformed(evt);
            }
        });

        Button50.setBackground(new java.awt.Color(204, 102, 255));
        Button50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button50.setText("8");
        Button50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button50ActionPerformed(evt);
            }
        });

        Button33.setBackground(new java.awt.Color(204, 102, 255));
        Button33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button33.setText("5");
        Button33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button33ActionPerformed(evt);
            }
        });

        Button42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button42ActionPerformed(evt);
            }
        });

        Button31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button31ActionPerformed(evt);
            }
        });

        Button51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button51ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Button31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Button49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button51, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Button40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button41, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button49, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button50, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button46ActionPerformed(evt);
            }
        });

        Button37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button37ActionPerformed(evt);
            }
        });

        Button29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button29ActionPerformed(evt);
            }
        });

        Button38.setBackground(new java.awt.Color(204, 102, 255));
        Button38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button38.setText("3");
        Button38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button38ActionPerformed(evt);
            }
        });

        Button47.setBackground(new java.awt.Color(204, 102, 255));
        Button47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button47.setText("6");
        Button47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button47ActionPerformed(evt);
            }
        });

        Button30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button30ActionPerformed(evt);
            }
        });

        Button39.setBackground(new java.awt.Color(204, 102, 255));
        Button39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button39.setText("4");
        Button39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button39ActionPerformed(evt);
            }
        });

        Button28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button28ActionPerformed(evt);
            }
        });

        Button48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Button28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Button46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Button37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button38, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button46, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button47, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button48, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button79ActionPerformed(evt);
            }
        });

        Button70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button70ActionPerformed(evt);
            }
        });

        Button62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button62ActionPerformed(evt);
            }
        });

        Button71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button71ActionPerformed(evt);
            }
        });

        Button80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button80ActionPerformed(evt);
            }
        });

        Button63.setBackground(new java.awt.Color(204, 102, 255));
        Button63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button63.setText("6");
        Button63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button63ActionPerformed(evt);
            }
        });

        Button72.setBackground(new java.awt.Color(204, 102, 255));
        Button72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button72.setText("2");
        Button72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button72ActionPerformed(evt);
            }
        });

        Button61.setBackground(new java.awt.Color(204, 102, 255));
        Button61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button61.setText("9");
        Button61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button61ActionPerformed(evt);
            }
        });

        Button81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button81ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Button61, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button62, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button63, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Button79, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button80, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button81, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Button70, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button71, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button72, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button62, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button63, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button61, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button70, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button71, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button72, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button79, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button80, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button81, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button76ActionPerformed(evt);
            }
        });

        Button67.setBackground(new java.awt.Color(204, 102, 255));
        Button67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button67.setText("9");
        Button67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button67ActionPerformed(evt);
            }
        });

        Button59.setBackground(new java.awt.Color(204, 102, 255));
        Button59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button59.setText("5");
        Button59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button59ActionPerformed(evt);
            }
        });

        Button68.setBackground(new java.awt.Color(204, 102, 255));
        Button68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button68.setText("6");
        Button68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button68ActionPerformed(evt);
            }
        });

        Button77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button77ActionPerformed(evt);
            }
        });

        Button60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button60ActionPerformed(evt);
            }
        });

        Button69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button69ActionPerformed(evt);
            }
        });

        Button58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button58ActionPerformed(evt);
            }
        });

        Button78.setBackground(new java.awt.Color(204, 102, 255));
        Button78.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button78.setText("1");
        Button78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button78ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Button58, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button59, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button60, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Button76, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button77, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button78, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Button67, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button68, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button69, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button59, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button60, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button58, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button67, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button68, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button69, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button76, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button77, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button78, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button73.setBackground(new java.awt.Color(204, 102, 255));
        Button73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button73.setText("6");
        Button73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button73ActionPerformed(evt);
            }
        });

        Button64.setBackground(new java.awt.Color(204, 102, 255));
        Button64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button64.setText("3");
        Button64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button64ActionPerformed(evt);
            }
        });

        Button56.setBackground(new java.awt.Color(204, 102, 255));
        Button56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button56.setText("4");
        Button56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button56ActionPerformed(evt);
            }
        });

        Button65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button65ActionPerformed(evt);
            }
        });

        Button74.setBackground(new java.awt.Color(204, 102, 255));
        Button74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button74.setText("8");
        Button74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button74ActionPerformed(evt);
            }
        });

        Button57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button57ActionPerformed(evt);
            }
        });

        Button66.setBackground(new java.awt.Color(204, 102, 255));
        Button66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button66.setText("5");
        Button66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button66ActionPerformed(evt);
            }
        });

        Button55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button55ActionPerformed(evt);
            }
        });

        Button75.setBackground(new java.awt.Color(204, 102, 255));
        Button75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Button75.setText("9");
        Button75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button75ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Button55, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button56, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button57, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Button73, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button74, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button75, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Button64, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Button65, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button66, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button57, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button55, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button64, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button65, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button66, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button73, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button74, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button75, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        SelectButton2.setBackground(new java.awt.Color(0, 204, 204));
        SelectButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SelectButton2.setForeground(new java.awt.Color(255, 255, 255));
        SelectButton2.setText("2");
        SelectButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton2ActionPerformed(evt);
            }
        });

        SelectButton3.setBackground(new java.awt.Color(0, 204, 204));
        SelectButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SelectButton3.setForeground(new java.awt.Color(255, 255, 255));
        SelectButton3.setText("3");
        SelectButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton3ActionPerformed(evt);
            }
        });

        SelectButton1.setBackground(new java.awt.Color(0, 51, 255));
        SelectButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SelectButton1.setForeground(new java.awt.Color(255, 255, 255));
        SelectButton1.setText("1");
        SelectButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton1ActionPerformed(evt);
            }
        });

        SelectButton4.setBackground(new java.awt.Color(0, 204, 204));
        SelectButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SelectButton4.setForeground(new java.awt.Color(255, 255, 255));
        SelectButton4.setText("4");
        SelectButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton4ActionPerformed(evt);
            }
        });

        SelectButton5.setBackground(new java.awt.Color(0, 204, 204));
        SelectButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SelectButton5.setForeground(new java.awt.Color(255, 255, 255));
        SelectButton5.setText("5");
        SelectButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton5ActionPerformed(evt);
            }
        });

        SelectButton7.setBackground(new java.awt.Color(0, 204, 204));
        SelectButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SelectButton7.setForeground(new java.awt.Color(255, 255, 255));
        SelectButton7.setText("7");
        SelectButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton7ActionPerformed(evt);
            }
        });

        SelectButton6.setBackground(new java.awt.Color(0, 204, 204));
        SelectButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SelectButton6.setForeground(new java.awt.Color(255, 255, 255));
        SelectButton6.setText("6");
        SelectButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton6ActionPerformed(evt);
            }
        });

        SelectButton9.setBackground(new java.awt.Color(0, 204, 204));
        SelectButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SelectButton9.setForeground(new java.awt.Color(255, 255, 255));
        SelectButton9.setText("9");
        SelectButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton9ActionPerformed(evt);
            }
        });

        SelectButton8.setBackground(new java.awt.Color(0, 204, 204));
        SelectButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SelectButton8.setForeground(new java.awt.Color(255, 255, 255));
        SelectButton8.setText("8");
        SelectButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton8ActionPerformed(evt);
            }
        });

        jButton100.setBackground(new java.awt.Color(51, 255, 204));
        jButton100.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton100.setText("CHECK MOVES");
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });

        jButton101.setBackground(new java.awt.Color(255, 51, 51));
        jButton101.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton101.setText("EXIT");
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });

        jButton102.setBackground(new java.awt.Color(255, 255, 102));
        jButton102.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton102.setText("SOLUTION");
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });

        jButton103.setBackground(new java.awt.Color(51, 255, 51));
        jButton103.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton103.setText("RESET");
        jButton103.setOpaque(true);
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton101)
                            .addComponent(jButton103)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SelectButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SelectButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SelectButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SelectButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(SelectButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SelectButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SelectButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SelectButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SelectButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton100))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton102)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button19ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button19ActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
           
    }//GEN-LAST:event_Button10ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
        Button2.setText(turn);
        Button2.setBackground(white);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button11ActionPerformed
        // TODO add your handling code here:
        Button11.setText(turn);
        Button11.setBackground(white);
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button20ActionPerformed
        // TODO add your handling code here:
        Button20.setText(turn);
        Button20.setBackground(white);
    }//GEN-LAST:event_Button20ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        Button3.setText(turn);
        Button3.setBackground(white);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button12ActionPerformed
        // TODO add your handling code here:
        Button12.setText(turn);
        Button12.setBackground(white);
    }//GEN-LAST:event_Button12ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        Button1.setText(turn);
        Button1.setBackground(white);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button21ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button21ActionPerformed

    private void Button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button22ActionPerformed
        // TODO add your handling code here:
        Button22.setText(turn);
        Button22.setBackground(white);
    }//GEN-LAST:event_Button22ActionPerformed

    private void Button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button13ActionPerformed
        // TODO add your handling code here:
        Button13.setText(turn);
        Button13.setBackground(white);
    }//GEN-LAST:event_Button13ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        Button5.setText(turn);
        Button5.setBackground(white);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button14ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button14ActionPerformed

    private void Button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button23ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
        Button6.setText(turn);
        Button6.setBackground(white);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button15ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button15ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button24ActionPerformed
        // TODO add your handling code here:
        Button24.setText(turn);
        Button24.setBackground(white);
    }//GEN-LAST:event_Button24ActionPerformed

    private void Button25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button25ActionPerformed
        // TODO add your handling code here:
        Button25.setText(turn);
        Button25.setBackground(white);
    }//GEN-LAST:event_Button25ActionPerformed

    private void Button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button16ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button16ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button17ActionPerformed
        // TODO add your handling code here:
        Button17.setText(turn);
        Button17.setBackground(white);
    }//GEN-LAST:event_Button17ActionPerformed

    private void Button26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button26ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button26ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button18ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button18ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button27ActionPerformed
        // TODO add your handling code here:
        Button27.setText(turn);
        Button27.setBackground(white);
    }//GEN-LAST:event_Button27ActionPerformed

    private void Button52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button52ActionPerformed
        // TODO add your handling code here:
        Button52.setText(turn);
        Button52.setBackground(white);
    }//GEN-LAST:event_Button52ActionPerformed

    private void Button43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button43ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button43ActionPerformed

    private void Button35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button35ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button35ActionPerformed

    private void Button44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button44ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button44ActionPerformed

    private void Button53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button53ActionPerformed
        // TODO add your handling code here:
        Button53.setText(turn);
        Button53.setBackground(white);
    }//GEN-LAST:event_Button53ActionPerformed

    private void Button36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button36ActionPerformed
        // TODO add your handling code here:
        Button36.setText(turn);
        Button36.setBackground(white);
    }//GEN-LAST:event_Button36ActionPerformed

    private void Button45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button45ActionPerformed
        // TODO add your handling code here:
        Button45.setText(turn);
        Button45.setBackground(white);
    }//GEN-LAST:event_Button45ActionPerformed

    private void Button34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button34ActionPerformed
        // TODO add your handling code here:
        Button34.setText(turn);
        Button34.setBackground(white);
    }//GEN-LAST:event_Button34ActionPerformed

    private void Button54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button54ActionPerformed
        // TODO add your handling code here:
        Button54.setText(turn);
        Button54.setBackground(white);
    }//GEN-LAST:event_Button54ActionPerformed

    private void Button49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button49ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button49ActionPerformed

    private void Button40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button40ActionPerformed
        // TODO add your handling code here:
        Button40.setText(turn);
        Button40.setBackground(white);
    }//GEN-LAST:event_Button40ActionPerformed

    private void Button32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button32ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button32ActionPerformed

    private void Button41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button41ActionPerformed
        // TODO add your handling code here:
        Button41.setText(turn);
        Button41.setBackground(white);
    }//GEN-LAST:event_Button41ActionPerformed

    private void Button50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button50ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button50ActionPerformed

    private void Button33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button33ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button33ActionPerformed

    private void Button42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button42ActionPerformed
        // TODO add your handling code here:
        Button42.setText(turn);
        Button42.setBackground(white);
    }//GEN-LAST:event_Button42ActionPerformed

    private void Button31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button31ActionPerformed
        // TODO add your handling code here:
        Button31.setText(turn);
        Button31.setBackground(white);
    }//GEN-LAST:event_Button31ActionPerformed

    private void Button51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button51ActionPerformed
        // TODO add your handling code here:
        Button51.setText(turn);
        Button51.setBackground(white);
    }//GEN-LAST:event_Button51ActionPerformed

    private void Button46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button46ActionPerformed
        // TODO add your handling code here:
        Button46.setText(turn);
        Button46.setBackground(white);
    }//GEN-LAST:event_Button46ActionPerformed

    private void Button37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button37ActionPerformed
        // TODO add your handling code here:
        Button37.setText(turn);
        Button37.setBackground(white);
    }//GEN-LAST:event_Button37ActionPerformed

    private void Button29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button29ActionPerformed
        // TODO add your handling code here:
        Button29.setText(turn);
        Button29.setBackground(white);
    }//GEN-LAST:event_Button29ActionPerformed

    private void Button38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button38ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button38ActionPerformed

    private void Button47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button47ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button47ActionPerformed

    private void Button30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button30ActionPerformed
        // TODO add your handling code here:
        Button30.setText(turn);
        Button30.setBackground(white);
    }//GEN-LAST:event_Button30ActionPerformed

    private void Button39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button39ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button39ActionPerformed

    private void Button28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button28ActionPerformed
        // TODO add your handling code here:
        Button28.setText(turn);
        Button28.setBackground(white);
    }//GEN-LAST:event_Button28ActionPerformed

    private void Button48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button48ActionPerformed
        // TODO add your handling code here:
        Button48.setText(turn);
        Button48.setBackground(white);
    }//GEN-LAST:event_Button48ActionPerformed

    private void Button79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button79ActionPerformed
        // TODO add your handling code here:
        Button79.setText(turn);
        Button79.setBackground(white);
    }//GEN-LAST:event_Button79ActionPerformed

    private void Button70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button70ActionPerformed
        // TODO add your handling code here:
        Button70.setText(turn);
        Button70.setBackground(white);
    }//GEN-LAST:event_Button70ActionPerformed

    private void Button62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button62ActionPerformed
        // TODO add your handling code here:
        Button62.setText(turn);
        Button62.setBackground(white);
    }//GEN-LAST:event_Button62ActionPerformed

    private void Button71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button71ActionPerformed
        // TODO add your handling code here:
        Button71.setText(turn);
        Button71.setBackground(white);
    }//GEN-LAST:event_Button71ActionPerformed

    private void Button80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button80ActionPerformed
        // TODO add your handling code here:
        Button80.setText(turn);
        Button80.setBackground(white);
    }//GEN-LAST:event_Button80ActionPerformed

    private void Button63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button63ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button63ActionPerformed

    private void Button72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button72ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button72ActionPerformed

    private void Button61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button61ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button61ActionPerformed

    private void Button81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button81ActionPerformed
        // TODO add your handling code here:
        Button81.setText(turn);
        Button81.setBackground(white);
    }//GEN-LAST:event_Button81ActionPerformed

    private void Button76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button76ActionPerformed
        // TODO add your handling code here:
        Button76.setText(turn);
        Button76.setBackground(white);
    }//GEN-LAST:event_Button76ActionPerformed

    private void Button67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button67ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button67ActionPerformed

    private void Button59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button59ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button59ActionPerformed

    private void Button68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button68ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button68ActionPerformed

    private void Button77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button77ActionPerformed
        // TODO add your handling code here:
        Button77.setText(turn);
        Button77.setBackground(white);
    }//GEN-LAST:event_Button77ActionPerformed

    private void Button60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button60ActionPerformed
        // TODO add your handling code here:
        Button60.setText(turn);
        Button60.setBackground(white);
    }//GEN-LAST:event_Button60ActionPerformed

    private void Button69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button69ActionPerformed
        // TODO add your handling code here:
        Button69.setText(turn);
        Button69.setBackground(white);
    }//GEN-LAST:event_Button69ActionPerformed

    private void Button58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button58ActionPerformed
        // TODO add your handling code here:
        Button58.setText(turn);
        Button58.setBackground(white);
    }//GEN-LAST:event_Button58ActionPerformed

    private void Button78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button78ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button78ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton81ActionPerformed

    private void Button73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button73ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button73ActionPerformed

    private void Button64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button64ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button64ActionPerformed

    private void Button56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button56ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button56ActionPerformed

    private void Button65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button65ActionPerformed
        // TODO add your handling code here:
        Button65.setText(turn);
        Button65.setBackground(white);
    }//GEN-LAST:event_Button65ActionPerformed

    private void Button74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button74ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button74ActionPerformed

    private void Button57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button57ActionPerformed
        // TODO add your handling code here:
        Button57.setText(turn);
        Button57.setBackground(white);
    }//GEN-LAST:event_Button57ActionPerformed

    private void Button66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button66ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button66ActionPerformed

    private void Button55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button55ActionPerformed
        // TODO add your handling code here:
        Button55.setText(turn);
        Button55.setBackground(white);
    }//GEN-LAST:event_Button55ActionPerformed

    private void Button75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button75ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "can not override", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Button75ActionPerformed

    private void SelectButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton2ActionPerformed
        // TODO add your handling code here:
        turn = "2";
        SelectButton2.setBackground(blue);
        
        SelectButton1.setBackground(black);
        SelectButton3.setBackground(black);
        SelectButton4.setBackground(black);
        SelectButton5.setBackground(black);
        SelectButton6.setBackground(black);
        SelectButton7.setBackground(black);
        SelectButton8.setBackground(black);
        SelectButton9.setBackground(black);
    }//GEN-LAST:event_SelectButton2ActionPerformed

    private void SelectButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton3ActionPerformed
        // TODO add your handling code here:
        turn = "3";
        SelectButton3.setBackground(blue);
        
        SelectButton2.setBackground(black);
        SelectButton1.setBackground(black);
        SelectButton4.setBackground(black);
        SelectButton5.setBackground(black);
        SelectButton6.setBackground(black);
        SelectButton7.setBackground(black);
        SelectButton8.setBackground(black);
        SelectButton9.setBackground(black);
    }//GEN-LAST:event_SelectButton3ActionPerformed

    private void SelectButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton1ActionPerformed
        // TODO add your handling code here:
        turn = "1";
        SelectButton1.setBackground(blue);
        
        SelectButton2.setBackground(black);
        SelectButton3.setBackground(black);
        SelectButton4.setBackground(black);
        SelectButton5.setBackground(black);
        SelectButton6.setBackground(black);
        SelectButton7.setBackground(black);
        SelectButton8.setBackground(black);
        SelectButton9.setBackground(black);
    }//GEN-LAST:event_SelectButton1ActionPerformed

    private void SelectButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton4ActionPerformed
        // TODO add your handling code here:
        turn = "4";
        SelectButton4.setBackground(blue);
        
        SelectButton2.setBackground(black);
        SelectButton3.setBackground(black);
        SelectButton1.setBackground(black);
        SelectButton5.setBackground(black);
        SelectButton6.setBackground(black);
        SelectButton7.setBackground(black);
        SelectButton8.setBackground(black);
        SelectButton9.setBackground(black);
    }//GEN-LAST:event_SelectButton4ActionPerformed

    private void SelectButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton5ActionPerformed
        // TODO add your handling code here:
        turn = "5";
        SelectButton5.setBackground(blue);
        
        SelectButton2.setBackground(black);
        SelectButton3.setBackground(black);
        SelectButton4.setBackground(black);
        SelectButton1.setBackground(black);
        SelectButton6.setBackground(black);
        SelectButton7.setBackground(black);
        SelectButton8.setBackground(black);
        SelectButton9.setBackground(black);
    }//GEN-LAST:event_SelectButton5ActionPerformed

    private void SelectButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton7ActionPerformed
        // TODO add your handling code here:
        turn = "7";
        SelectButton7.setBackground(blue);
        
        SelectButton2.setBackground(black);
        SelectButton3.setBackground(black);
        SelectButton4.setBackground(black);
        SelectButton5.setBackground(black);
        SelectButton6.setBackground(black);
        SelectButton1.setBackground(black);
        SelectButton8.setBackground(black);
        SelectButton9.setBackground(black);
    }//GEN-LAST:event_SelectButton7ActionPerformed

    private void SelectButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton6ActionPerformed
        // TODO add your handling code here:
        turn = "6";
        SelectButton6.setBackground(blue);
        
        SelectButton2.setBackground(black);
        SelectButton3.setBackground(black);
        SelectButton4.setBackground(black);
        SelectButton5.setBackground(black);
        SelectButton1.setBackground(black);
        SelectButton7.setBackground(black);
        SelectButton8.setBackground(black);
        SelectButton9.setBackground(black);
    }//GEN-LAST:event_SelectButton6ActionPerformed

    private void SelectButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton9ActionPerformed
        // TODO add your handling code here:
        turn = "9";
        SelectButton9.setBackground(blue);
        
        SelectButton2.setBackground(black);
        SelectButton3.setBackground(black);
        SelectButton4.setBackground(black);
        SelectButton5.setBackground(black);
        SelectButton6.setBackground(black);
        SelectButton7.setBackground(black);
        SelectButton8.setBackground(black);
        SelectButton1.setBackground(black);
    }//GEN-LAST:event_SelectButton9ActionPerformed

    private void SelectButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton8ActionPerformed
        // TODO add your handling code here:
        turn = "8";
        SelectButton8.setBackground(blue);
        
        SelectButton2.setBackground(black);
        SelectButton3.setBackground(black);
        SelectButton4.setBackground(black);
        SelectButton5.setBackground(black);
        SelectButton6.setBackground(black);
        SelectButton7.setBackground(black);
        SelectButton1.setBackground(black);
        SelectButton9.setBackground(black);
    }//GEN-LAST:event_SelectButton8ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        // TODO add your handling code here:
        checkMoves();
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Do you want to exit",
                "Suduko Solver",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        // TODO add your handling code here:
        JFrame jframe = new JFrame("RESET");
        if(JOptionPane.showConfirmDialog(jframe, "Do you want to RESET",
                "Suduko Solver",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            ResetMoves();
        }    
    }//GEN-LAST:event_jButton103ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Suduko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suduko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suduko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suduko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suduko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button11;
    private javax.swing.JButton Button12;
    private javax.swing.JButton Button13;
    private javax.swing.JButton Button14;
    private javax.swing.JButton Button15;
    private javax.swing.JButton Button16;
    private javax.swing.JButton Button17;
    private javax.swing.JButton Button18;
    private javax.swing.JButton Button19;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button20;
    private javax.swing.JButton Button21;
    private javax.swing.JButton Button22;
    private javax.swing.JButton Button23;
    private javax.swing.JButton Button24;
    private javax.swing.JButton Button25;
    private javax.swing.JButton Button26;
    private javax.swing.JButton Button27;
    private javax.swing.JButton Button28;
    private javax.swing.JButton Button29;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button30;
    private javax.swing.JButton Button31;
    private javax.swing.JButton Button32;
    private javax.swing.JButton Button33;
    private javax.swing.JButton Button34;
    private javax.swing.JButton Button35;
    private javax.swing.JButton Button36;
    private javax.swing.JButton Button37;
    private javax.swing.JButton Button38;
    private javax.swing.JButton Button39;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button40;
    private javax.swing.JButton Button41;
    private javax.swing.JButton Button42;
    private javax.swing.JButton Button43;
    private javax.swing.JButton Button44;
    private javax.swing.JButton Button45;
    private javax.swing.JButton Button46;
    private javax.swing.JButton Button47;
    private javax.swing.JButton Button48;
    private javax.swing.JButton Button49;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button50;
    private javax.swing.JButton Button51;
    private javax.swing.JButton Button52;
    private javax.swing.JButton Button53;
    private javax.swing.JButton Button54;
    private javax.swing.JButton Button55;
    private javax.swing.JButton Button56;
    private javax.swing.JButton Button57;
    private javax.swing.JButton Button58;
    private javax.swing.JButton Button59;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button60;
    private javax.swing.JButton Button61;
    private javax.swing.JButton Button62;
    private javax.swing.JButton Button63;
    private javax.swing.JButton Button64;
    private javax.swing.JButton Button65;
    private javax.swing.JButton Button66;
    private javax.swing.JButton Button67;
    private javax.swing.JButton Button68;
    private javax.swing.JButton Button69;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button70;
    private javax.swing.JButton Button71;
    private javax.swing.JButton Button72;
    private javax.swing.JButton Button73;
    private javax.swing.JButton Button74;
    private javax.swing.JButton Button75;
    private javax.swing.JButton Button76;
    private javax.swing.JButton Button77;
    private javax.swing.JButton Button78;
    private javax.swing.JButton Button79;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button80;
    private javax.swing.JButton Button81;
    private javax.swing.JButton Button9;
    private javax.swing.JButton SelectButton1;
    private javax.swing.JButton SelectButton2;
    private javax.swing.JButton SelectButton3;
    private javax.swing.JButton SelectButton4;
    private javax.swing.JButton SelectButton5;
    private javax.swing.JButton SelectButton6;
    private javax.swing.JButton SelectButton7;
    private javax.swing.JButton SelectButton8;
    private javax.swing.JButton SelectButton9;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
