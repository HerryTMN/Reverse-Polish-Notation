/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RPN_Calculator;

import java.awt.Color;

public class Calculator_Frame extends javax.swing.JFrame {

    public Calculator_Frame() {
        getContentPane().setBackground(new java.awt.Color(51, 51, 51));
        initComponents();
        CloseGUI();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        ButtonZero = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        EnterButton = new javax.swing.JButton();
        PlusButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NumberLine3 = new javax.swing.JLabel();
        NumberLine1 = new javax.swing.JLabel();
        NumberLine2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        javax.swing.JButton SubtractButton = new javax.swing.JButton();
        javax.swing.JButton MultiplyButton = new javax.swing.JButton();
        javax.swing.JButton DotButton = new javax.swing.JButton();
        javax.swing.JButton DivideButton = new javax.swing.JButton();
        CancelEntryButton = new javax.swing.JButton();
        SquareRootButton = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        PowerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ToggleButton = new javax.swing.JToggleButton();
        SwapButton = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        ButtonZero.setBackground(new java.awt.Color(0, 0, 0));
        ButtonZero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonZero.setForeground(new java.awt.Color(255, 255, 255));
        ButtonZero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ButtonZero.setLabel("0");
        ButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZeroActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(0, 0, 0));
        Button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button1.setLabel("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        EnterButton.setBackground(new java.awt.Color(0, 0, 0));
        EnterButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EnterButton.setForeground(new java.awt.Color(255, 255, 255));
        EnterButton.setText("ENTER");
        EnterButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });

        PlusButton.setBackground(new java.awt.Color(0, 0, 0));
        PlusButton.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        PlusButton.setForeground(new java.awt.Color(255, 255, 255));
        PlusButton.setActionCommand("Plus");
        PlusButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PlusButton.setIconTextGap(6);
        PlusButton.setLabel("+");
        PlusButton.setMaximumSize(new java.awt.Dimension(26, 26));
        PlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        NumberLine3.setBackground(new java.awt.Color(0, 0, 0));
        NumberLine3.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        NumberLine3.setForeground(new java.awt.Color(255, 255, 255));
        NumberLine3.setText("3rd LINE");
        NumberLine3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        NumberLine1.setBackground(new java.awt.Color(54, 31, 31));
        NumberLine1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        NumberLine1.setForeground(new java.awt.Color(255, 255, 255));
        NumberLine1.setText("1st LINE");

        NumberLine2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        NumberLine2.setForeground(new java.awt.Color(255, 255, 255));
        NumberLine2.setText("2nd LINE");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NumberLine1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NumberLine2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(NumberLine3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(NumberLine3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumberLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumberLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SubtractButton.setBackground(new java.awt.Color(0, 0, 0));
        SubtractButton.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        SubtractButton.setForeground(new java.awt.Color(255, 255, 255));
        SubtractButton.setActionCommand("Plus");
        SubtractButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SubtractButton.setIconTextGap(6);
        SubtractButton.setLabel("-");
        SubtractButton.setMaximumSize(new java.awt.Dimension(26, 26));
        SubtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtractButtonActionPerformed(evt);
            }
        });

        MultiplyButton.setBackground(new java.awt.Color(0, 0, 0));
        MultiplyButton.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        MultiplyButton.setForeground(new java.awt.Color(255, 255, 255));
        MultiplyButton.setText("X");
        MultiplyButton.setActionCommand("Plus");
        MultiplyButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MultiplyButton.setIconTextGap(6);
        MultiplyButton.setMaximumSize(new java.awt.Dimension(26, 26));
        MultiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyButtonActionPerformed(evt);
            }
        });

        DotButton.setBackground(new java.awt.Color(0, 0, 0));
        DotButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DotButton.setForeground(new java.awt.Color(255, 255, 255));
        DotButton.setActionCommand("Plus");
        DotButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DotButton.setLabel(".");
        DotButton.setMaximumSize(new java.awt.Dimension(27, 27));
        DotButton.setPreferredSize(new java.awt.Dimension(27, 27));
        DotButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotButtonActionPerformed(evt);
            }
        });

        DivideButton.setBackground(new java.awt.Color(0, 0, 0));
        DivideButton.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        DivideButton.setForeground(new java.awt.Color(255, 255, 255));
        DivideButton.setText("/");
        DivideButton.setActionCommand("Plus");
        DivideButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DivideButton.setIconTextGap(6);
        DivideButton.setMaximumSize(new java.awt.Dimension(26, 26));
        DivideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideButtonActionPerformed(evt);
            }
        });

        CancelEntryButton.setBackground(new java.awt.Color(0, 0, 0));
        CancelEntryButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CancelEntryButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelEntryButton.setText("CE");
        CancelEntryButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CancelEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelEntryButtonActionPerformed(evt);
            }
        });

        SquareRootButton.setBackground(new java.awt.Color(0, 0, 0));
        SquareRootButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SquareRootButton.setForeground(new java.awt.Color(255, 255, 255));
        SquareRootButton.setText("√");
        SquareRootButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SquareRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareRootButtonActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(0, 0, 0));
        Button2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 255, 255));
        Button2.setText("2");
        Button2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(0, 0, 0));
        Button3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 255));
        Button3.setText("3");
        Button3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(0, 0, 0));
        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("C");
        ClearButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(0, 0, 0));
        Button4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 255, 255));
        Button4.setText("4");
        Button4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(0, 0, 0));
        Button5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 255, 255));
        Button5.setText("5");
        Button5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(0, 0, 0));
        Button6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setText("6");
        Button6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(0, 0, 0));
        Button7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setText("7");
        Button7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(0, 0, 0));
        Button8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 255, 255));
        Button8.setText("8");
        Button8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(0, 0, 0));
        Button9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button9.setForeground(new java.awt.Color(255, 255, 255));
        Button9.setText("9");
        Button9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        PowerButton.setBackground(new java.awt.Color(0, 0, 0));
        PowerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PowerButton.setForeground(new java.awt.Color(255, 255, 255));
        PowerButton.setText("x²");
        PowerButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PowerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RPN                                                   v0.1");

        ToggleButton.setBackground(new java.awt.Color(0, 0, 0));
        ToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        ToggleButton.setText("▶");
        ToggleButton.setToolTipText("");
        ToggleButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonActionPerformed(evt);
            }
        });

        SwapButton.setBackground(new java.awt.Color(0, 0, 0));
        SwapButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SwapButton.setForeground(new java.awt.Color(255, 255, 255));
        SwapButton.setText("SWAP");
        SwapButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SwapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwapButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SubtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PowerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button8, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(SquareRootButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SwapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MultiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(DivideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DivideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PowerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SquareRootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SwapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MultiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SubtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private StringBuilder numberLine1 = new StringBuilder();
    private StringBuilder numberLine2 = new StringBuilder();
    private StringBuilder numberLine3 = new StringBuilder();
    private boolean ToggleYet = false;

    private void updateGUI() {
        NumberLine1.setText(numberLine1.toString());
        NumberLine2.setText(numberLine2.toString());
        NumberLine3.setText(numberLine3.toString());
    }

    private void OpenGUI() {
        if (numberLine1 != null) {
            numberLine1.setLength(0);
        }
        if (numberLine2 != null) {
            numberLine2.setLength(0);
        }
        if (numberLine3 != null) {
            numberLine3.setLength(0);
        }
        NumberLine1.setForeground(new java.awt.Color(255, 255, 255));
        NumberLine2.setForeground(new java.awt.Color(255, 255, 255));
        NumberLine3.setForeground(new java.awt.Color(255, 255, 255));
        updateGUI();
    }

    private void CloseGUI() {
        ToggleButton.setText("∎");
        ToggleButton.setBackground(Color.RED);
        if (numberLine1 != null) {
            numberLine1.setLength(0);
        }
        if (numberLine2 != null) {
            numberLine2.setLength(0);
        }
        if (numberLine3 != null) {
            numberLine3.setLength(0);
        }
        NumberLine1.setForeground(new java.awt.Color(102, 102, 102));
        NumberLine2.setForeground(new java.awt.Color(102, 102, 102));
        NumberLine3.setForeground(new java.awt.Color(102, 102, 102));
        updateGUI();
    }

    private void ButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZeroActionPerformed
        numberLine1.append("0");
        updateGUI();
    }//GEN-LAST:event_ButtonZeroActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        numberLine1.append("1");
        updateGUI();
    }//GEN-LAST:event_Button1ActionPerformed

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        numberLine3.setLength(0);
        numberLine3.append(numberLine2);
        numberLine2.setLength(0);
        numberLine2.append(numberLine1);
        numberLine1.setLength(0);
        updateGUI();

    }//GEN-LAST:event_EnterButtonActionPerformed

    private void PlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusButtonActionPerformed
        double result = 0.0;
        if (numberLine1 != null && numberLine2 != null) {
            double operand1, operand2;
            try {
                operand1 = Double.parseDouble(numberLine1.toString());
                operand2 = Double.parseDouble(numberLine2.toString());
                result = operand2 + operand1;
                numberLine1.setLength(0);
                numberLine2.setLength(0);
                if (numberLine3 != null) {
                    numberLine2.append(numberLine3.toString());
                    numberLine3.setLength(0);
                }
                if (result % 1 == 0) {
                    numberLine1.append(String.valueOf((int) result));
                } else {
                    numberLine1.append(String.format("%.2f", result));
                }
            } catch (NumberFormatException e) {
                return;
            }
        }
        updateGUI();
    }//GEN-LAST:event_PlusButtonActionPerformed

    private void SubtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtractButtonActionPerformed
        double result = 0.0;
        double operand1, operand2;
// Case 1: numberLine1 is not empty, numberLine2 is empty
        if (numberLine1.length() > 0 && numberLine2.length() == 0) {
            operand1 = Double.parseDouble(numberLine1.toString());
            result = -operand1;
            numberLine1.setLength(0);
            if (result % 1 == 0) {
                numberLine1.append(String.valueOf((int) result));
            } else {
                numberLine1.append(String.format("%.2f", result));
            }
        } // Case 2: both numberLine1 and numberLine2 have values
        else if (numberLine1.length() > 0 && numberLine2.length() > 0) {
            try {
                operand1 = Double.parseDouble(numberLine1.toString());
                operand2 = Double.parseDouble(numberLine2.toString());
                result = operand2 - operand1;
                numberLine1.setLength(0);
                numberLine2.setLength(0);
                if (numberLine3 != null) {
                    numberLine2.append(numberLine3.toString());
                    numberLine3.setLength(0);
                }
                if (result % 1 == 0) {
                    numberLine1.append(String.valueOf((int) result));

                } else {
                    numberLine1.append(String.format("%.2f", result));
                }
            } catch (NumberFormatException e) {
                return;
            }
        }

        updateGUI();
    }//GEN-LAST:event_SubtractButtonActionPerformed

    private void MultiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyButtonActionPerformed
        double result = 0.0;
        if (numberLine1 != null && numberLine1 != null) {
            double operand1, operand2;
            try {
                operand1 = Double.parseDouble(numberLine1.toString());
                operand2 = Double.parseDouble(numberLine2.toString());
                result = operand2 * operand1;
                numberLine1.setLength(0);
                numberLine2.setLength(0);
                if (numberLine3 != null) {
                    numberLine2.append(numberLine3.toString());
                    numberLine3.setLength(0);
                }
                if (result % 1 == 0) {
                    numberLine1.append(String.valueOf((int) result));
                } else {
                    numberLine1.append(String.format("%.2f", result));
                }
            } catch (NumberFormatException e) {
                return;
            }
        }
        updateGUI();
    }//GEN-LAST:event_MultiplyButtonActionPerformed

    private void DotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DotButtonActionPerformed
        if (numberLine1 == null) {
            numberLine1 = new StringBuilder("0.");
        } else if (!numberLine1.toString().contains(".")) {
            int cursorPos = numberLine1.length();
            numberLine1.insert(cursorPos, ".");
        }
        updateGUI();
    }//GEN-LAST:event_DotButtonActionPerformed

    private void DivideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideButtonActionPerformed
        double result = 0.0;
        if (numberLine1 != null && numberLine2 != null) {
            double num1, num2;
            try {
                num1 = Double.parseDouble(numberLine1.toString());
                num2 = Double.parseDouble(numberLine2.toString());
                if (num2 == 0) {
                    // Handle division by zero
                    numberLine1.append("Error");
                    updateGUI();
                    return;
                }
                result = num2 / num1;
                numberLine1.setLength(0);
                numberLine2.setLength(0);
                if (numberLine3 != null) {
                    numberLine2.append(numberLine3.toString());
                    numberLine3.setLength(0);
                }
                if (result % 1 == 0) {
                    numberLine1.append(String.valueOf((int) result));
                } else {
                    numberLine1.append(String.format("%.2f", result));
                }
            } catch (NumberFormatException e) {
                return;
            }
        }
        updateGUI();
    }//GEN-LAST:event_DivideButtonActionPerformed

    private void CancelEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelEntryButtonActionPerformed
        if (numberLine1 != null && numberLine1.length() > 0) {
            int lastIndex = numberLine1.length() - 1;
            if (numberLine1.charAt(lastIndex) == '.') {
                // If the last character is a decimal point, remove it
                numberLine1.setLength(lastIndex);
            } else {
                // Remove the last character
                numberLine1.deleteCharAt(lastIndex);
                if (numberLine1.length() == 1 && numberLine1.charAt(0) == '0') {
                    // If the number is now just '0', set the length to 0
                    numberLine1.setLength(0);
                } else if (numberLine1.length() > 0 && numberLine1.charAt(0) == '0' && numberLine1.charAt(1) != '.') {
                    // If the number starts with '0' and the second character is not a decimal point, remove the '0'
                    numberLine1.deleteCharAt(0);
                }
            }
        }
        updateGUI();
    }//GEN-LAST:event_CancelEntryButtonActionPerformed

    private void SquareRootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareRootButtonActionPerformed
        double result = 0.0;
        if (numberLine1 != null) {
            try {
                double num = Double.parseDouble(numberLine1.toString());
                if (num < 0) {
                    updateGUI();
                    return;
                }
                result = Math.sqrt(num);
                numberLine1.setLength(0);
                if (result % 1 == 0) {
                    numberLine1.append(String.valueOf((int) result));
                } else {
                    numberLine1.append(String.format("%.2f", result));
                }
            } catch (NumberFormatException e) {
                return;
            }
        }
        updateGUI();
    }//GEN-LAST:event_SquareRootButtonActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        numberLine1.append("2");
        updateGUI();
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        numberLine1.append("3");
        updateGUI();
    }//GEN-LAST:event_Button3ActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        if (numberLine1 != null) {
            numberLine1.setLength(0);
        }
        if (numberLine2 != null) {
            numberLine2.setLength(0);
        }
        if (numberLine3 != null) {
            numberLine3.setLength(0);
        }
        updateGUI();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        numberLine1.append("4");
        updateGUI();
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        numberLine1.append("5");
        updateGUI();
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        numberLine1.append("6");
        updateGUI();
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        numberLine1.append("7");
        updateGUI();
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        numberLine1.append("9");
        updateGUI();
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        numberLine1.append("9");
        updateGUI();
    }//GEN-LAST:event_Button9ActionPerformed

    private void PowerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerButtonActionPerformed
        double input, result;
        input = Double.parseDouble(numberLine1.toString());
        result = input * input;
        numberLine1.setLength(0);
        if (result % 1 == 0) {
            numberLine1.append(String.valueOf((int) result));
        } else {
            numberLine1.append(String.format("%.2f", result));
        }
        updateGUI();
    }//GEN-LAST:event_PowerButtonActionPerformed

    private void ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonActionPerformed
        if (ToggleYet) {
            ToggleYet = false;
            ToggleButton.setText("∎");
            ToggleButton.setBackground(Color.RED);
            CloseGUI();
        } else {
            ToggleYet = true;
            ToggleButton.setText("▶");
            ToggleButton.setBackground(Color.GREEN);
            OpenGUI();
        }
    }//GEN-LAST:event_ToggleButtonActionPerformed

    private void SwapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwapButtonActionPerformed
        if (numberLine1 != null && numberLine2 != null) {
            double newValue1 = Double.parseDouble(numberLine2.toString());
            double newValue2 = Double.parseDouble(numberLine1.toString());
            numberLine1.setLength(0);
            numberLine2.setLength(0);
            //NEW VALUE1 FROM NUMBERLINE2
            if (newValue1 % 1 == 0) {
                numberLine1.append(String.valueOf((int) newValue1));
            } else {
                numberLine1.append(String.format("%.2f", newValue1));
            }
            //NEW VALUE 2 FROM NUMBERLINE1
            if (newValue2 % 1 == 0) {
                numberLine2.append(String.valueOf((int) newValue2));
            } else {
                numberLine2.append(String.format("%.2f", newValue2));
            }
        }
        updateGUI();
    }//GEN-LAST:event_SwapButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator_Frame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonZero;
    private javax.swing.JButton CancelEntryButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton EnterButton;
    private javax.swing.JLabel NumberLine1;
    private javax.swing.JLabel NumberLine2;
    private javax.swing.JLabel NumberLine3;
    private javax.swing.JButton PlusButton;
    private javax.swing.JButton PowerButton;
    private javax.swing.JButton SquareRootButton;
    private javax.swing.JButton SwapButton;
    private javax.swing.JToggleButton ToggleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
