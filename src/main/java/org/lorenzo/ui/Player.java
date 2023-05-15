/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.lorenzo.ui;
import org.lorenzo.conection.Conection;
import org.lorenzo.query.Sql;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

/**
 *
 * @author PC-LORENZO
 */
public class Player extends javax.swing.JInternalFrame {

    static ResultSet res;
    String playerId = "0";
    Sql sql = new Sql(new Conection());
    String titulos[];


    /**
     * Creates new form DatabaseUi
     */
    public Player() {
        initComponents();
        emptyTable();
        seeData();
        desabilitar();
        guardar.setEnabled(false);
        modify.setEnabled(false);
        delete.setEnabled(false);
        loadCBoxes();
    }

     public void desabilitar(){
        leagueComboBox.setEnabled(false);
        srtNameField.setEnabled(false);
        ageField.setEnabled(false);
        contractField.setEnabled(false);
        defField.setEnabled(false);
        driField.setEnabled(false);
        clubJoinDateField.setEnabled(false);
        divField.setEnabled(false);
        hanField.setEnabled(false);
        heightField.setEnabled(false);
        jNumberField.setEnabled(false);
        kicField.setEnabled(false);
        longNameField.setEnabled(false);
        overallField.setEnabled(false);
        pacField.setEnabled(false);
        pasField.setEnabled(false);
        phyField.setEnabled(false);
        poField.setEnabled(false);
        potentialField.setEnabled(false);
        refField.setEnabled(false);
        releaseField.setEnabled(false);
        shoField.setEnabled(false);
        valueField.setEnabled(false);
        wageField.setEnabled(false);
        weightField.setEnabled(false);
        skillCbox.setEnabled(false);
        iReputationCBox.setEnabled(false);
        teamLoanedComboBox.setEnabled(false);
        wFootCBox.setEnabled(false);
        loanCheckBox.setEnabled(false);
        nationComboBox.setEnabled(false);
        preferredFootComboBox.setEnabled(false);
        teamComboBox.setEnabled(false);
    }
    
    public void limpiar(){
        srtNameField.setText("");
        ageField.setText("");
        contractField.setText("");
        defField.setText("");
        driField.setText("");
        clubJoinDateField.setText("");
        divField.setText("");
        hanField.setText("");
        heightField.setText("");
        jNumberField.setText("");
        kicField.setText("");
        longNameField.setText("");
        overallField.setText("");
        pacField.setText("");
        pasField.setText("");
        phyField.setText("");
        poField.setText("");
        potentialField.setText("");
        refField.setText("");
        releaseField.setText("");
        shoField.setText("");
        valueField.setText("");
        wageField.setText("");
        weightField.setText("");
    }
    
    public void habilitar(){
        leagueComboBox.setEnabled(true);
        srtNameField.setEnabled(true);
        ageField.setEnabled(true);
        contractField.setEnabled(true);
        defField.setEnabled(true);
        driField.setEnabled(true);
        clubJoinDateField.setEnabled(true);
        divField.setEnabled(true);
        hanField.setEnabled(true);
        heightField.setEnabled(true);
        jNumberField.setEnabled(true);
        kicField.setEnabled(true);
        longNameField.setEnabled(true);
        overallField.setEnabled(true);
        pacField.setEnabled(true);
        pasField.setEnabled(true);
        phyField.setEnabled(true);
        poField.setEnabled(true);
        potentialField.setEnabled(true);
        refField.setEnabled(true);
        releaseField.setEnabled(true);
        shoField.setEnabled(true);
        valueField.setEnabled(true);
        wageField.setEnabled(true);
        weightField.setEnabled(true);
        skillCbox.setEnabled(true);
        iReputationCBox.setEnabled(true);
        teamLoanedComboBox.setEnabled(true);
        wFootCBox.setEnabled(true);
        loanCheckBox.setEnabled(true);
        nationComboBox.setEnabled(true);
        preferredFootComboBox.setEnabled(true);
        teamComboBox.setEnabled(true);
    }
    
    public void emptyTable(){
        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        titulos = new String[]{"id", "sofifaid", "short_name", "long_name", "player_position", "overall", "potential", "value_eur", "wage_eur", "age", "height_cm", "weight_kg", "club_team_id", "club_jersey_number", "club_loaned_from", "club_joined", "contract_valid_until", "preferred_foot", "nation_id", "weak_foot", "skill_moves", "international_reputation", "release_clause_eur", "player_traits", "pace", "shooting", "passing", "dribbling", "defending","physic","goalkeeping_diving", "goalkeeping_handling", "goalkeeping_kicking", "goalkeeping_positioning", "goalkeeping_reflexes"};
        Modelo = new DefaultTableModel(null,titulos);
        jTable1.setModel(Modelo);
    }

    public void seeData(){
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) jTable1.getModel();
            Conection conect1 = new Conection();
            con1 = conect1.getConnection();
            String dts[] = new String[titulos.length];
            String sql = "select * from player";
            java.sql.Statement st = con1.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                for (int i = 1; i <= dts.length; i++){
                    dts[i-1] = rs.getString(i);
                }
                miModelo.addRow(dts);
            }
            jTable1.setModel(miModelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", JOptionPane.ERROR_MESSAGE);
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
        leagueComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        srtNameField = new javax.swing.JTextField();
        leagueLabel = new javax.swing.JLabel();
        potentialField = new javax.swing.JTextField();
        longNameLabel = new javax.swing.JLabel();
        overallLabel = new javax.swing.JLabel();
        potentialLabel = new javax.swing.JLabel();
        longNameField = new javax.swing.JTextField();
        overallField = new javax.swing.JTextField();
        wageField = new javax.swing.JTextField();
        wageLabel = new javax.swing.JLabel();
        valueField = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        pacField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        heightLabel = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        weightLabel = new javax.swing.JLabel();
        srtNameLabel = new javax.swing.JLabel();
        teamLabel = new javax.swing.JLabel();
        teamComboBox = new javax.swing.JComboBox<>();
        nationLabel = new javax.swing.JLabel();
        nationComboBox = new javax.swing.JComboBox<>();
        releaseLabel = new javax.swing.JLabel();
        releaseField = new javax.swing.JTextField();
        contractField = new javax.swing.JTextField();
        contractLabel = new javax.swing.JLabel();
        loanCheckBox = new javax.swing.JCheckBox();
        traitsLabel = new javax.swing.JLabel();
        positionsCBox = new javax.swing.JComboBox<>();
        teamLoanedComboBox = new javax.swing.JComboBox<>();
        jnumberLabel = new javax.swing.JLabel();
        jNumberField = new javax.swing.JTextField();
        clubJoinDateField = new javax.swing.JTextField();
        clubJoinDateLabel = new javax.swing.JLabel();
        pacLabel = new javax.swing.JLabel();
        preferredFootComboBox = new javax.swing.JComboBox<>();
        skillCbox = new javax.swing.JComboBox<>();
        wFootLabel = new javax.swing.JLabel();
        sMovesLabel = new javax.swing.JLabel();
        wFootCBox = new javax.swing.JComboBox<>();
        iReputationCBox = new javax.swing.JComboBox<>();
        positionsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        traitsTArea = new javax.swing.JTextArea();
        teamLoanedFromLabel = new javax.swing.JLabel();
        pfootLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        shoLabel = new javax.swing.JLabel();
        shoField = new javax.swing.JTextField();
        pasLabel = new javax.swing.JLabel();
        pasField = new javax.swing.JTextField();
        defLabel = new javax.swing.JLabel();
        defField = new javax.swing.JTextField();
        driLabel = new javax.swing.JLabel();
        driField = new javax.swing.JTextField();
        phyLabel = new javax.swing.JLabel();
        phyField = new javax.swing.JTextField();
        divField = new javax.swing.JTextField();
        divLabel = new javax.swing.JLabel();
        hanField = new javax.swing.JTextField();
        hanLabel = new javax.swing.JLabel();
        kicField = new javax.swing.JTextField();
        kicLabel = new javax.swing.JLabel();
        refField = new javax.swing.JTextField();
        refLabel = new javax.swing.JLabel();
        poField = new javax.swing.JTextField();
        poLabel = new javax.swing.JLabel();
        iReputationLabel = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        idNumberLabel = new javax.swing.JLabel();
        playerStatsLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leagueComboBox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        leagueComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        leagueComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leagueComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(leagueComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 280, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1900, 330));

        srtNameField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        srtNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srtNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(srtNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 30));

        leagueLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        leagueLabel.setText("league");
        jPanel1.add(leagueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 30));

        potentialField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        potentialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potentialFieldActionPerformed(evt);
            }
        });
        jPanel1.add(potentialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 50, 30));

        longNameLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        longNameLabel.setText("long Name");
        jPanel1.add(longNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 30));

        overallLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        overallLabel.setText("overall");
        jPanel1.add(overallLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, 30));

        potentialLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        potentialLabel.setText("potential");
        jPanel1.add(potentialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 90, 30));

        longNameField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        longNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(longNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, 30));

        overallField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        overallField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overallFieldActionPerformed(evt);
            }
        });
        jPanel1.add(overallField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 50, 30));

        wageField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        wageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wageFieldActionPerformed(evt);
            }
        });
        jPanel1.add(wageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 280, 30));

        wageLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        wageLabel.setText("wage in eur");
        jPanel1.add(wageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 170, 30));

        valueField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        valueField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueFieldActionPerformed(evt);
            }
        });
        jPanel1.add(valueField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 280, 30));

        valueLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        valueLabel.setText("value in eur");
        jPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 170, 30));

        pacField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        pacField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pacField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 100, 50, 30));

        ageLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        ageLabel.setText("age");
        jPanel1.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 50, 30));

        heightField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        heightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightFieldActionPerformed(evt);
            }
        });
        jPanel1.add(heightField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 50, 30));

        heightLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        heightLabel.setText("height in cm,");
        jPanel1.add(heightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 110, 30));

        weightField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        weightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightFieldActionPerformed(evt);
            }
        });
        jPanel1.add(weightField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 50, 30));

        weightLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        weightLabel.setText("weight in kg");
        jPanel1.add(weightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 120, 30));

        srtNameLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        srtNameLabel.setText("Short Name");
        jPanel1.add(srtNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 30));

        teamLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        teamLabel.setText("team");
        jPanel1.add(teamLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 170, 30));

        teamComboBox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        teamComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        teamComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(teamComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 280, 30));

        nationLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        nationLabel.setText("nation");
        jPanel1.add(nationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 170, 30));

        nationComboBox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        nationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(nationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 280, 30));

        releaseLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        releaseLabel.setText("release clause in eur");
        jPanel1.add(releaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 210, 30));

        releaseField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        releaseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releaseFieldActionPerformed(evt);
            }
        });
        jPanel1.add(releaseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 280, 30));

        contractField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        contractField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contractFieldActionPerformed(evt);
            }
        });
        jPanel1.add(contractField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 280, 30));

        contractLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        contractLabel.setText("contract valid until");
        jPanel1.add(contractLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 210, 30));

        loanCheckBox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        loanCheckBox.setText("LOAN");
        loanCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(loanCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 80, 30));

        traitsLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        traitsLabel.setText("player traits");
        jPanel1.add(traitsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 170, 30));

        positionsCBox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        positionsCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GK", "LB", "LWB.CB", "RB", "RWB", "MCD", "MC", "MI", "MD", "MCO", "SD", "DC", "EI", "ED", "SUBGK", "LB", "LWB.CB", "RB", "RWB", "MCD", "MC", "MI", "MD", "MCO", "SD", "DC", "EI", "ED", "SUB" }));
        positionsCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionsCBoxActionPerformed(evt);
            }
        });
        jPanel1.add(positionsCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 400, 60, 30));

        teamLoanedComboBox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        teamLoanedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        teamLoanedComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamLoanedComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(teamLoanedComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 280, 30));

        jnumberLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        jnumberLabel.setText("JERSEY NUMBER");
        jPanel1.add(jnumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 140, 30));

        jNumberField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        jNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumberFieldActionPerformed(evt);
            }
        });
        jPanel1.add(jNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 50, 30));

        clubJoinDateField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        clubJoinDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubJoinDateFieldActionPerformed(evt);
            }
        });
        jPanel1.add(clubJoinDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 240, 30));

        clubJoinDateLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        clubJoinDateLabel.setText("club join date");
        jPanel1.add(clubJoinDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 210, 30));

        pacLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        pacLabel.setText("pac");
        jPanel1.add(pacLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 100, 40, 30));

        preferredFootComboBox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        preferredFootComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Left", "Right" }));
        preferredFootComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferredFootComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(preferredFootComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 230, 120, 30));

        skillCbox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        skillCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        skillCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillCboxActionPerformed(evt);
            }
        });
        jPanel1.add(skillCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 400, 120, 30));

        wFootLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        wFootLabel.setText("weak foot");
        jPanel1.add(wFootLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280, 170, 30));

        sMovesLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        sMovesLabel.setText("skill moves");
        jPanel1.add(sMovesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 360, 170, 30));

        wFootCBox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        wFootCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        wFootCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wFootCBoxActionPerformed(evt);
            }
        });
        jPanel1.add(wFootCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 320, 120, 30));

        iReputationCBox.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        iReputationCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        iReputationCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iReputationCBoxActionPerformed(evt);
            }
        });
        jPanel1.add(iReputationCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 130, 120, 30));

        positionsLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        positionsLabel.setText("position");
        jPanel1.add(positionsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 400, 80, 30));

        traitsTArea.setColumns(20);
        traitsTArea.setRows(5);
        jScrollPane2.setViewportView(traitsTArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 280, -1));

        teamLoanedFromLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        teamLoanedFromLabel.setText("team LOANED FROM");
        jPanel1.add(teamLoanedFromLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 170, 30));

        pfootLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        pfootLabel.setText("preferred foot");
        jPanel1.add(pfootLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 170, 30));

        ageField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        jPanel1.add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 50, 30));

        shoLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        shoLabel.setText("sho");
        jPanel1.add(shoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 160, 40, 30));

        shoField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        shoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoFieldActionPerformed(evt);
            }
        });
        jPanel1.add(shoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 160, 50, 30));

        pasLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        pasLabel.setText("pas");
        jPanel1.add(pasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 220, 40, 30));

        pasField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        pasField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 220, 50, 30));

        defLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        defLabel.setText("def");
        jPanel1.add(defLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 160, 40, 30));

        defField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        defField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defFieldActionPerformed(evt);
            }
        });
        jPanel1.add(defField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 160, 50, 30));

        driLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        driLabel.setText("dri");
        jPanel1.add(driLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 100, 40, 30));

        driField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        driField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driFieldActionPerformed(evt);
            }
        });
        jPanel1.add(driField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 100, 50, 30));

        phyLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        phyLabel.setText("phy");
        jPanel1.add(phyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 220, 40, 30));

        phyField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        phyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phyFieldActionPerformed(evt);
            }
        });
        jPanel1.add(phyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 220, 50, 30));

        divField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        divField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divFieldActionPerformed(evt);
            }
        });
        jPanel1.add(divField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 280, 50, 30));

        divLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        divLabel.setText("div");
        jPanel1.add(divLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 280, 40, 30));

        hanField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        hanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanFieldActionPerformed(evt);
            }
        });
        jPanel1.add(hanField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 340, 50, 30));

        hanLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        hanLabel.setText("han");
        jPanel1.add(hanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 340, 40, 30));

        kicField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        kicField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kicFieldActionPerformed(evt);
            }
        });
        jPanel1.add(kicField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 400, 50, 30));

        kicLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        kicLabel.setText("kic");
        jPanel1.add(kicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 400, 40, 30));

        refField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        refField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refFieldActionPerformed(evt);
            }
        });
        jPanel1.add(refField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 280, 50, 30));

        refLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        refLabel.setText("ref");
        jPanel1.add(refLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 280, 40, 30));

        poField.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        poField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poFieldActionPerformed(evt);
            }
        });
        jPanel1.add(poField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 340, 50, 30));

        poLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        poLabel.setText("po");
        jPanel1.add(poLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 340, 40, 30));

        iReputationLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        iReputationLabel.setText("international reputation");
        jPanel1.add(iReputationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 100, 250, 30));

        nuevo.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\Boletines\\DatabaseMan\\src\\iconos\\auxiliar\\nuevo.png")); // NOI18N
        nuevo.setText("New");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 110, 170, -1));

        guardar.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\Boletines\\DatabaseMan\\src\\iconos\\auxiliar\\interface.png")); // NOI18N
        guardar.setText("SAVE");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 180, 170, -1));

        modify.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        modify.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\Boletines\\DatabaseMan\\src\\iconos\\auxiliar\\edit-document.png")); // NOI18N
        modify.setText("MODIFY");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });
        jPanel1.add(modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 250, 170, -1));

        delete.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\Boletines\\DatabaseMan\\src\\iconos\\auxiliar\\dvavd.png")); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 320, 170, -1));

        idNumberLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        idNumberLabel.setText("0000");
        jPanel1.add(idNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 10, 80, 30));

        playerStatsLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        playerStatsLabel.setText("player stats");
        jPanel1.add(playerStatsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 40, 250, 30));

        idLabel.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        idLabel.setText("id ");
        jPanel1.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void loadCBoxes(){
        try {
            Connection con1 = null;
            Conection conect1 = new Conection();
            con1 = conect1.getConnection();
            String sql = "select club_name from team";
            java.sql.Statement st = con1.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            teamComboBox.removeAllItems();
            teamLoanedComboBox.removeAllItems();
            while(rs.next()){
                teamComboBox.addItem(rs.getString("club_name"));
                teamLoanedComboBox.addItem(rs.getString("club_name"));
            }
            sql = "select * from league";
            st = con1.createStatement();
            st.execute(sql);
            rs = st.getResultSet();
            leagueComboBox.removeAllItems();
            while(rs.next()){
                leagueComboBox.addItem(rs.getString("league_name"));
            }
            sql = "select * from nation";
            st = con1.createStatement();
            st.execute(sql);
            rs = st.getResultSet();
            nationComboBox.removeAllItems();
            while(rs.next()){
                nationComboBox.addItem(rs.getString("nation_name"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LOS CBOX", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loanCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanCheckBoxActionPerformed
        // TODO add your handling code here:
        teamLoanedComboBox.setEnabled(true);
    }//GEN-LAST:event_loanCheckBoxActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        habilitar();
        nuevo.setEnabled(false);
        guardar.setEnabled(true);
        emptyTable();
        seeData();
    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
            try
            {
                Connection con = null;
                Conection conect = new Conection();
                con = conect.getConnection();
                Statement st = con.createStatement();
                st.execute("select max(sofifaid) from player");
                String id="0";
                ResultSet rs = st.getResultSet();
                while (rs.next()){
                    id= rs.getString(1);
                }
                String sql = "insert into player (sofifaid, short_name, long_name, player_position, overall, potential, value_eur, wage_eur, age, height_cm, weight_kg, club_jersey_number, club_joined, contract_valid_until, preferred_foot, weak_foot, skill_moves, international_reputation, release_clause_eur, player_traits, pace, shooting, passing, dribbling, defending,physic, goalkeeping_diving, goalkeeping_handling, goalkeeping_kicking, goalkeeping_positioning, goalkeeping_reflexes,club_team_id,nation_id) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, String.valueOf(Integer.parseInt(id)+1));
                pst.setString(2, srtNameField.getText());
                pst.setString(3, longNameField.getText());
                pst.setString(4, (String) positionsCBox.getSelectedItem());
                pst.setString(5, overallField.getText());
                pst.setString(6, potentialField.getText());
                pst.setString(7, valueField.getText());
                pst.setString(8, wageField.getText());
                pst.setString(9, ageField.getText());
                pst.setString(10, heightField.getText());
                pst.setString(11, weightField.getText());
                pst.setString(12, jNumberField.getText());
                pst.setString(13, clubJoinDateField.getText());
                pst.setString(14, contractField.getText());
                pst.setString(15, (String) preferredFootComboBox.getSelectedItem());
                pst.setString(16, (String) wFootCBox.getSelectedItem());
                pst.setString(17, (String) skillCbox.getSelectedItem());
                pst.setString(18, (String) iReputationCBox.getSelectedItem());
                pst.setString(19, releaseField.getText());
                pst.setString(20, traitsLabel.getText());
                pst.setString(21, pacField.getText());
                pst.setString(22, shoField.getText());
                pst.setString(23, pasField.getText());
                pst.setString(24, driField.getText());
                pst.setString(25, defField.getText());
                pst.setString(26,phyField.getText());
                pst.setString(27, divField.getText());
                pst.setString(28, hanField.getText());
                pst.setString(29, kicField.getText());
                pst.setString(30, poField.getText());
                pst.setString(31, refField.getText());
                pst.setString(32, String.valueOf(this.sql.getTeamId((String) teamComboBox.getSelectedItem())));
                pst.setString(33, String.valueOf(this.sql.getNationId((String) nationComboBox.getSelectedItem())));
                int n = pst.executeUpdate();
                if (n > 0)
                {
                    JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
                    limpiar();
                    emptyTable();
                    seeData();
                    nuevo.setEnabled(true);
                    guardar.setEnabled(false);
                    modify.setEnabled(false);
                    delete.setEnabled(false);
                    desabilitar();
                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
//GEN-LAST:event_guardarActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con = null;
            Conection conect = new Conection();
            con = conect.getConnection();
            Statement st = con.createStatement();
            String sql = "update player set sofifaid=?, short_name=?, long_name=?, player_position=?, overall=?, potential=?, value_eur=?, wage_eur=?, age=?, height_cm=?, weight_kg=?, club_jersey_number=?, club_joined=?, contract_valid_until=?, preferred_foot=?, weak_foot=?, skill_moves=?, international_reputation=?, release_clause_eur=?, player_traits=?, pace=?, shooting=?, passing=?, dribbling=?, defending=?, physic=?, goalkeeping_diving=?, goalkeeping_handling=?, goalkeeping_kicking=?, goalkeeping_positioning=?, goalkeeping_reflexes=?, club_team_id=?,nation_id=? where id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idNumberLabel.getText());
            pst.setString(2, srtNameField.getText());
            pst.setString(3, longNameField.getText());
            pst.setString(4, (String) positionsCBox.getSelectedItem());
            pst.setString(5, overallField.getText());
            pst.setString(6, potentialField.getText());
            pst.setString(7, valueField.getText());
            pst.setString(8, wageField.getText());
            pst.setString(9, ageField.getText());
            pst.setString(10, heightField.getText());
            pst.setString(11, weightField.getText());
            pst.setString(12, jNumberField.getText());
            pst.setString(13, clubJoinDateField.getText());
            pst.setString(14, contractField.getText());
            pst.setString(15, (String) preferredFootComboBox.getSelectedItem());
            pst.setString(16, (String) wFootCBox.getSelectedItem());
            pst.setString(17, (String) skillCbox.getSelectedItem());
            pst.setString(18, (String) iReputationCBox.getSelectedItem());
            pst.setString(19, releaseField.getText());
            pst.setString(20, traitsLabel.getText());
            pst.setString(21, pacField.getText());
            pst.setString(22, shoField.getText());
            pst.setString(23, pasField.getText());
            pst.setString(24, driField.getText());
            pst.setString(25, defField.getText());
            pst.setString(26, phyField.getText());
            pst.setString(27, divField.getText());
            pst.setString(28, hanField.getText());
            pst.setString(29, kicField.getText());
            pst.setString(30, poField.getText());
            pst.setString(31, refField.getText());
            pst.setString(32, String.valueOf(this.sql.getTeamId((String) teamComboBox.getSelectedItem())));
            pst.setString(33, String.valueOf(this.sql.getNationId((String) nationComboBox.getSelectedItem())));
            pst.setString(34, playerId);
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
                limpiar();
                emptyTable();
                seeData();
                nuevo.setEnabled(true);
                guardar.setEnabled(false);
                modify.setEnabled(false);
                delete.setEnabled(false);
                desabilitar();
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_modifyActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();
        if (fila == -1)
        {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN REGISTRO", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int opc = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO QUE DESEA ELIMINAR ESTE REGISTRO?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opc == JOptionPane.YES_OPTION)
            {
                try
                {
                    Connection con = null;
                    Conection conect = new Conection();
                    con = conect.getConnection();
                    Statement st = con.createStatement();
                    String sql = "delete from player where sofifaid = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(idNumberLabel.getText()));
                    int n = pst.executeUpdate();
                    if (n > 0)
                    {
                        JOptionPane.showMessageDialog(this, "DATOS ELIMINADOS CORRECTAMENTE");
                        limpiar();
                        emptyTable();
                        seeData();
                        nuevo.setEnabled(true);
                        guardar.setEnabled(false);
                        modify.setEnabled(false);
                        delete.setEnabled(false);
                        desabilitar();
                    }
                } catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(this, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void srtNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srtNameFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_srtNameFieldActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        try
        {
            int fila = jTable1.getSelectedRow();
            playerId = jTable1.getValueAt(fila, 0).toString();
            idNumberLabel.setText(jTable1.getValueAt(fila, 1).toString());
            srtNameField.setText(jTable1.getValueAt(fila, 2).toString());
            longNameField.setText(jTable1.getValueAt(fila, 3).toString());
            positionsCBox.setSelectedItem(jTable1.getValueAt(fila, 4).toString());
            overallField.setText(jTable1.getValueAt(fila, 5).toString());
            potentialField.setText(jTable1.getValueAt(fila, 6).toString());
            valueField.setText(jTable1.getValueAt(fila, 7).toString());
            wageField.setText(jTable1.getValueAt(fila, 8).toString());
            ageField.setText(jTable1.getValueAt(fila, 9).toString());
            heightField.setText(jTable1.getValueAt(fila, 10).toString());
            weightField.setText(jTable1.getValueAt(fila, 11).toString());
            jNumberField.setText(jTable1.getValueAt(fila, 13).toString());
            clubJoinDateField.setText(jTable1.getValueAt(fila, 15).toString());
            contractField.setText(jTable1.getValueAt(fila, 16).toString());
            preferredFootComboBox.setSelectedItem(jTable1.getValueAt(fila, 17).toString());
            wFootCBox.setSelectedItem(jTable1.getValueAt(fila, 19).toString());
            skillCbox.setSelectedItem(jTable1.getValueAt(fila, 20).toString());
            iReputationCBox.setSelectedItem(jTable1.getValueAt(fila, 21).toString());
            releaseField.setText(jTable1.getValueAt(fila, 22).toString());
            traitsTArea.setText(jTable1.getValueAt(fila, 23).toString());
            pacField.setText(jTable1.getValueAt(fila, 24).toString());
            shoField.setText(jTable1.getValueAt(fila, 25).toString());
            pasField.setText(jTable1.getValueAt(fila, 26).toString());
            driField.setText(jTable1.getValueAt(fila, 27).toString());
            defField.setText(jTable1.getValueAt(fila, 28).toString());
            divField.setText(jTable1.getValueAt(fila, 30).toString());
            hanField.setText(jTable1.getValueAt(fila, 31).toString());
            kicField.setText(jTable1.getValueAt(fila, 32).toString());
            poField.setText(jTable1.getValueAt(fila, 33).toString());
            refField.setText(jTable1.getValueAt(fila, 34).toString());
            phyField.setText(jTable1.getValueAt(fila, 29).toString());
            teamComboBox.setSelectedItem(this.sql.getTeamName(Integer.parseInt(jTable1.getValueAt(fila, 12).toString())));
            nationComboBox.setSelectedItem(this.sql.getNationName(Integer.parseInt(jTable1.getValueAt(fila, 18).toString())));
            nuevo.setEnabled(false);
            guardar.setEnabled(false);
            modify.setEnabled(true);
            delete.setEnabled(true);
            habilitar();
        } catch (Exception ex)
        {
            System.out.println("ERROR AL SELECCIONAR UN EQUIPO : " + ex.getMessage());
        }
    }

    private void longNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longNameFieldActionPerformed

    private void overallFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overallFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_overallFieldActionPerformed

    private void potentialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potentialFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potentialFieldActionPerformed

    private void leagueComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leagueComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leagueComboBoxActionPerformed

    private void teamComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamComboBoxActionPerformed

    private void valueFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueFieldActionPerformed

    private void wageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wageFieldActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void heightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightFieldActionPerformed

    private void weightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightFieldActionPerformed

    private void nationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationComboBoxActionPerformed

    private void jNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNumberFieldActionPerformed

    private void releaseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releaseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_releaseFieldActionPerformed

    private void contractFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contractFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contractFieldActionPerformed

    private void teamLoanedComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamLoanedComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamLoanedComboBoxActionPerformed

    private void clubJoinDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubJoinDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clubJoinDateFieldActionPerformed

    private void iReputationCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iReputationCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iReputationCBoxActionPerformed

    private void preferredFootComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferredFootComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preferredFootComboBoxActionPerformed

    private void wFootCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wFootCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wFootCBoxActionPerformed

    private void skillCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skillCboxActionPerformed

    private void pacFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacFieldActionPerformed

    private void driFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driFieldActionPerformed

    private void shoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoFieldActionPerformed

    private void pasFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasFieldActionPerformed

    private void divFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divFieldActionPerformed

    private void hanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hanFieldActionPerformed

    private void kicFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kicFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kicFieldActionPerformed

    private void defFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defFieldActionPerformed

    private void phyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phyFieldActionPerformed

    private void refFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refFieldActionPerformed

    private void poFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poFieldActionPerformed

    private void positionsCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionsCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionsCBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField clubJoinDateField;
    private javax.swing.JLabel clubJoinDateLabel;
    private javax.swing.JTextField contractField;
    private javax.swing.JLabel contractLabel;
    private javax.swing.JTextField defField;
    private javax.swing.JLabel defLabel;
    private javax.swing.JButton delete;
    private javax.swing.JTextField divField;
    private javax.swing.JLabel divLabel;
    private javax.swing.JTextField driField;
    private javax.swing.JLabel driLabel;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField hanField;
    private javax.swing.JLabel hanLabel;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JComboBox<String> iReputationCBox;
    private javax.swing.JLabel iReputationLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idNumberLabel;
    private javax.swing.JTextField jNumberField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jnumberLabel;
    private javax.swing.JTextField kicField;
    private javax.swing.JLabel kicLabel;
    private javax.swing.JComboBox<String> leagueComboBox;
    private javax.swing.JLabel leagueLabel;
    private javax.swing.JCheckBox loanCheckBox;
    private javax.swing.JTextField longNameField;
    private javax.swing.JLabel longNameLabel;
    private javax.swing.JButton modify;
    private javax.swing.JComboBox<String> nationComboBox;
    private javax.swing.JLabel nationLabel;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField overallField;
    private javax.swing.JLabel overallLabel;
    private javax.swing.JTextField pacField;
    private javax.swing.JLabel pacLabel;
    private javax.swing.JTextField pasField;
    private javax.swing.JLabel pasLabel;
    private javax.swing.JLabel pfootLabel;
    private javax.swing.JTextField phyField;
    private javax.swing.JLabel phyLabel;
    private javax.swing.JLabel playerStatsLabel;
    private javax.swing.JTextField poField;
    private javax.swing.JLabel poLabel;
    private javax.swing.JComboBox<String> positionsCBox;
    private javax.swing.JLabel positionsLabel;
    private javax.swing.JTextField potentialField;
    private javax.swing.JLabel potentialLabel;
    private javax.swing.JComboBox<String> preferredFootComboBox;
    private javax.swing.JTextField refField;
    private javax.swing.JLabel refLabel;
    private javax.swing.JTextField releaseField;
    private javax.swing.JLabel releaseLabel;
    private javax.swing.JLabel sMovesLabel;
    private javax.swing.JTextField shoField;
    private javax.swing.JLabel shoLabel;
    private javax.swing.JComboBox<String> skillCbox;
    private javax.swing.JTextField srtNameField;
    private javax.swing.JLabel srtNameLabel;
    private javax.swing.JComboBox<String> teamComboBox;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JComboBox<String> teamLoanedComboBox;
    private javax.swing.JLabel teamLoanedFromLabel;
    private javax.swing.JLabel traitsLabel;
    private javax.swing.JTextArea traitsTArea;
    private javax.swing.JTextField valueField;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JComboBox<String> wFootCBox;
    private javax.swing.JLabel wFootLabel;
    private javax.swing.JTextField wageField;
    private javax.swing.JLabel wageLabel;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
