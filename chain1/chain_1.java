/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain1;

import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author evely
 */
public class chain_1 extends javax.swing.JFrame {

    /**
     * Creates new form chain_1
     */
    public chain_1() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/chain1/cubo.png")).getImage());
        this.setTitle("String manager");
        
        //PASO UNO
        btnShow.setEnabled(false);
        btnReset.setEnabled(false);
    }
    //PASO DOS    
    public void habilitarBoton() {
        //(!txtN1.getText().isEmpty()::::CON ESTO SE QUIERE DECIR QUE, TRAER TEXTO SI ESTA VACIO
        //VALIDAMOS LA PRIERA CAJA txtN1 Y ASI CON TODAS LAS CAJAS QUE TENGAMOS
        if (!lblSearch.getText().isEmpty()) {

            btnShow.setEnabled(true);
            btnReset.setEnabled(true);
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
        jPanel2 = new javax.swing.JPanel();
        btnSp = new javax.swing.JButton();
        btnEn = new javax.swing.JButton();
        lblYour = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnShow = new javax.swing.JButton();
        JPinf = new javax.swing.JPanel();
        lblYname = new javax.swing.JLabel();
        lblYmay = new javax.swing.JLabel();
        lblTchar = new javax.swing.JLabel();
        lblYmin = new javax.swing.JLabel();
        lblInit = new javax.swing.JLabel();
        JPlett = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnMay = new javax.swing.JButton();
        lblNameis = new javax.swing.JLabel();
        lblMay = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblInitial = new javax.swing.JLabel();
        lblCharacters = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        btnSp.setBackground(new java.awt.Color(0, 0, 255));
        btnSp.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnSp.setForeground(new java.awt.Color(255, 255, 255));
        btnSp.setText("SP");
        btnSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpActionPerformed(evt);
            }
        });

        btnEn.setBackground(new java.awt.Color(255, 51, 0));
        btnEn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnEn.setForeground(new java.awt.Color(255, 255, 255));
        btnEn.setText("EN");
        btnEn.setEnabled(false);
        btnEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnActionPerformed(evt);
            }
        });

        lblYour.setBackground(new java.awt.Color(255, 255, 255));
        lblYour.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblYour.setForeground(new java.awt.Color(255, 255, 255));
        lblYour.setText("Your Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSp)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblYour, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSp)
                    .addComponent(btnEn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblYour, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        btnShow.setBackground(new java.awt.Color(255, 51, 0));
        btnShow.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("SHOW");
        btnShow.setEnabled(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        JPinf.setBackground(new java.awt.Color(0, 0, 51));
        JPinf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        JPinf.setForeground(new java.awt.Color(255, 255, 255));
        JPinf.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        lblYname.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblYname.setForeground(new java.awt.Color(255, 255, 255));
        lblYname.setText("Your name is:");

        lblYmay.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblYmay.setForeground(new java.awt.Color(255, 255, 255));
        lblYmay.setText("Your name in MAY:");

        lblTchar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblTchar.setForeground(new java.awt.Color(255, 255, 255));
        lblTchar.setText("Total characters:");

        lblYmin.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblYmin.setForeground(new java.awt.Color(255, 255, 255));
        lblYmin.setText("Your name in MIN:");

        lblInit.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblInit.setForeground(new java.awt.Color(255, 255, 255));
        lblInit.setText("Initial capital letters:");

        JPlett.setBackground(new java.awt.Color(0, 0, 51));
        JPlett.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Letter finder", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        JPlett.setForeground(new java.awt.Color(255, 255, 255));
        JPlett.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        lblType.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblType.setForeground(new java.awt.Color(255, 255, 255));
        lblType.setText("Type a number:");

        btnSearch.setBackground(new java.awt.Color(255, 0, 153));
        btnSearch.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnMin.setBackground(new java.awt.Color(0, 0, 255));
        btnMin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnMin.setForeground(new java.awt.Color(255, 255, 255));
        btnMin.setText("MIN");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblSearch.setText("?");

        btnMay.setBackground(new java.awt.Color(255, 51, 0));
        btnMay.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnMay.setForeground(new java.awt.Color(255, 255, 255));
        btnMay.setText("MAY");
        btnMay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPlettLayout = new javax.swing.GroupLayout(JPlett);
        JPlett.setLayout(JPlettLayout);
        JPlettLayout.setHorizontalGroup(
            JPlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPlettLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(JPlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPlettLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMin))
                    .addComponent(btnMay))
                .addGap(20, 20, 20))
        );
        JPlettLayout.setVerticalGroup(
            JPlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPlettLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JPlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPlettLayout.createSequentialGroup()
                        .addComponent(lblType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addGroup(JPlettLayout.createSequentialGroup()
                        .addComponent(btnMay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMin)
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        lblNameis.setForeground(new java.awt.Color(255, 255, 255));
        lblNameis.setText("-");

        lblMay.setForeground(new java.awt.Color(255, 255, 255));
        lblMay.setText("-");

        lblMin.setForeground(new java.awt.Color(255, 255, 255));
        lblMin.setText("-");

        lblInitial.setForeground(new java.awt.Color(255, 255, 255));
        lblInitial.setText("-");

        lblCharacters.setForeground(new java.awt.Color(255, 255, 255));
        lblCharacters.setText("-");

        javax.swing.GroupLayout JPinfLayout = new javax.swing.GroupLayout(JPinf);
        JPinf.setLayout(JPinfLayout);
        JPinfLayout.setHorizontalGroup(
            JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPinfLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPinfLayout.createSequentialGroup()
                            .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblYname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblYmay, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(JPinfLayout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(lblMay, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPinfLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNameis, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(JPinfLayout.createSequentialGroup()
                            .addComponent(lblInit)
                            .addGap(11, 11, 11)
                            .addComponent(lblInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPinfLayout.createSequentialGroup()
                        .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblYmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTchar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCharacters, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JPlett, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        JPinfLayout.setVerticalGroup(
            JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPinfLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYmay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYmin))
                .addGap(7, 7, 7)
                .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTchar)
                    .addComponent(lblCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInit)
                    .addComponent(lblInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPlett, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnReset.setBackground(new java.awt.Color(0, 0, 255));
        btnReset.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        btnReset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnResetKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JPinf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addGap(18, 18, 18)
                .addComponent(JPinf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        String Name=txtName.getText();//getText, PARA OBTENER EL TEXTO DIGITADO POR TECLADO
        System.out.println("Your name is: "+Name);
        lblNameis.setText(""+Name);
        
        System.out.println("Your name in MAY: "+Name.toUpperCase());//MAYUSULAS, MUESTRA INTERNAMENTE
        lblMay.setText(""+Name.toUpperCase());//MUESTRA EN A INTERFAZ
        
        System.out.println("Your name in MIN: "+Name.toLowerCase());//MINUSCULAS, MUESTRA INTERNAMENTE
        lblMin.setText(""+Name.toLowerCase());//MUESTRA EN INTERFAZ
        
        System.out.println("Total characters: "+Name.length());//IMPRIME INTERNAMENTE
        lblCharacters.setText(""+Name.length());//IMRPIME EN LA INTERFAZ
       
        Scanner sc = new Scanner(System.in);
              
        String[] split = Name.split("");
        for (int i = 0; i < split.length; i++) {
            if(i == 0 || split[i-1].equals(" ")) {
                split[i] = split[i].toUpperCase();
            }else{
                split[i] = split[i].toLowerCase();
            }
        }
        lblInitial.setText(String.join("", split));
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnMayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayActionPerformed
        // TODO add your handling code here:
        String activar="";
        activar=lblSearch.getText();
        lblSearch.setText(""+activar.toUpperCase());//MAYUSCULAS
        btnMay.setEnabled(false);
        btnMin.setEnabled(true);
    }//GEN-LAST:event_btnMayActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        // TODO add your handling code here:
        String activar="";
        activar=lblSearch.getText();
        lblSearch.setText(""+activar.toLowerCase());//MINUSCULAS
        btnMay.setEnabled(true);
        btnMin.setEnabled(false);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String Name=txtName.getText();// LLAMAR AL TEXTO
        int btnSearch=Integer.parseInt(txtSearch.getText());//LLAMAR EL NUMERO DE POSICION
        lblSearch.setText(""+Name.charAt(btnSearch-1));//CharAT ME DICE LA POSICION
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtName.setText("");//LIMPIAR CAJA, A LA CAJA ASIGNELE UN VALOR SET ES PARA BORRAR
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnResetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnResetKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_txtNameKeyReleased

    private void btnEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnActionPerformed
        // TODO add your handling code here:
        lblYour.setText("Your Name:");
        lblYname.setText("Your name is:");
        lblYmay.setText("Your name in May:");
        lblYmin.setText("Your name in Min:");
        lblTchar.setText("Total characters:");
        lblInit.setText("Initial capital letters:");
        lblType.setText("Type a number");
        //JPinf.Enable("Informaciòn:");
        //pnlLett.setText("Buscador de letras:");
        btnShow.setText("SHOW");
        btnReset.setText("RESET");
        btnSearch.setText("SEARCH");
        this.setTitle("String manager");
        
        btnSp.setEnabled(true);
        btnEn.setEnabled(false); 
        
    }//GEN-LAST:event_btnEnActionPerformed

    private void btnSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpActionPerformed
        // TODO add your handling code here:        
        lblYour.setText("Tu Nombre:");
        lblYname.setText("Tu Nombre es:");
        lblYmay.setText("Tu Nombre en May:");
        lblYmin.setText("Tu Nombre en Min:");
        lblTchar.setText("Total Caracteres:");
        lblInit.setText("Iniciales Mayùsculas:");
        lblType.setText("Digite nùmero:");
        //JPinf.("Informaciòn:");
        //jpLett.setText("Buscador de letras:");
        btnShow.setText("MOSTRAR");
        btnReset.setText("LIMPIAR");
        btnSearch.setText("BUSCAR");
        this.setTitle("Administrador de cadenas");
        
        btnSp.setEnabled(false);
        btnEn.setEnabled(true);        
    }//GEN-LAST:event_btnSpActionPerformed

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
            java.util.logging.Logger.getLogger(chain_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chain_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chain_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chain_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chain_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPinf;
    private javax.swing.JPanel JPlett;
    private javax.swing.JButton btnEn;
    private javax.swing.JButton btnMay;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCharacters;
    private javax.swing.JLabel lblInit;
    private javax.swing.JLabel lblInitial;
    private javax.swing.JLabel lblMay;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNameis;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTchar;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblYmay;
    private javax.swing.JLabel lblYmin;
    private javax.swing.JLabel lblYname;
    private javax.swing.JLabel lblYour;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private String español(String su_nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
