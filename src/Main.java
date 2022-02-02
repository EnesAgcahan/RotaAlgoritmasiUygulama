
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Main extends javax.swing.JFrame {

    char [] harfler = {'a','b','c','d','e','f','g','h','ı','j','k','l','m','n','o','p','r','s','t','v','y','z'};
    
    String sonuc = "π = { ";
    
    int x ;
    int y;
    JButton[][] buttons;
    JLabel numX[], numY[];
    
    
    public Main() {
        initComponents();
        this.setTitle("Sezgisel Kapsama (Rota) Algoritması");
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        satirsayisiLabel = new javax.swing.JLabel();
        sütunsayisiLabel = new javax.swing.JLabel();
        xsatirText = new javax.swing.JTextField();
        ysütunText = new javax.swing.JTextField();
        olusturButton = new javax.swing.JButton();
        sonucText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hesaplaButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ciktiArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        satirsayisiLabel.setText("Satır (X) : ");

        sütunsayisiLabel.setText("Sütun(Y) : ");

        xsatirText.setBackground(new java.awt.Color(153, 255, 153));
        xsatirText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xsatirTextActionPerformed(evt);
            }
        });

        ysütunText.setBackground(new java.awt.Color(153, 255, 153));
        ysütunText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ysütunTextActionPerformed(evt);
            }
        });

        olusturButton.setBackground(new java.awt.Color(153, 255, 153));
        olusturButton.setText("Matrisi Oluştur");
        olusturButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButtonActionPerformed(evt);
            }
        });

        sonucText.setEditable(false);
        sonucText.setBackground(new java.awt.Color(153, 255, 153));
        sonucText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonucTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Cevap:");

        hesaplaButton.setBackground(new java.awt.Color(153, 255, 153));
        hesaplaButton.setText("Hesapla");
        hesaplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaButtonActionPerformed(evt);
            }
        });

        restartButton.setBackground(new java.awt.Color(153, 255, 153));
        restartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restart2.png"))); // NOI18N
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        ciktiArea.setEditable(false);
        ciktiArea.setBackground(new java.awt.Color(153, 255, 153));
        ciktiArea.setColumns(20);
        ciktiArea.setRows(5);
        jScrollPane1.setViewportView(ciktiArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(satirsayisiLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(xsatirText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sütunsayisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ysütunText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sonucText, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hesaplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(restartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(satirsayisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xsatirText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sütunsayisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ysütunText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sonucText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hesaplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(419, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xsatirTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xsatirTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xsatirTextActionPerformed

    private void ysütunTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ysütunTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ysütunTextActionPerformed

    private void sonucTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonucTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonucTextActionPerformed

    private void olusturButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButtonActionPerformed
        
        x = Integer.parseInt(xsatirText.getText());
        y = Integer.parseInt(ysütunText.getText());
        
        numX = new JLabel[x];
        numY = new JLabel[y];
        buttons = new JButton[y][x];
        Action action = new Action();
        
        //x satır uzunluğu
        
        for (int i = 0; i < x; i++) 
        {
            numX[i] = new JLabel();
            numX[i].setText(String.valueOf(harfler[i])); // satır isimlerini harf olarak yazdırılıyor.
            numX[i].setForeground(Color.BLACK);
            numX[i].setBounds(200 + i * 80, 185, 50, 50); 
            numX[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            this.add(numX[i]);
        }
        
        // y sütun uzunluğu
        
        for (int i = 0; i < y; i++) 
        {
            numY[i] = new JLabel();
            numY[i].setText(String.valueOf(i + 1));
            numY[i].setForeground(Color.RED);
            numY[i].setBounds(150, i * 80 + 230, 50, 50);
            numY[i].setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            this.add(numY[i]);
        }        
        
        //matrisin değerini değişterecek butonların işlemleri.
        
        for (int i = 0; i < y; i++) 
        {
            for (int j = 0; j < x; j++) 
            {   
                
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground(Color.ORANGE);
                buttons[i][j].setText(String.valueOf(" "));
                buttons[i][j].setBounds(200 + j * 80, i * 80 + 230, 50, 50);
                buttons[i][j].addActionListener(action);
                this.add(buttons[i][j]);
                
            }
        }
       
        this.update(this.getGraphics());
        
        olusturButton.setVisible(false);
        
    }//GEN-LAST:event_olusturButtonActionPerformed

    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButtonActionPerformed
        
        hesaplaButton.setText("Hesaplamaya Devam Et");
        
        GenelKapsamaAlgoritması();
        
        
        //ilk işlemlerden sonra butonların tekrar kullanılmasını engelleme
        
        for (int i = 0; i < y; i++) 
        {
            for (int j = 0; j < x; j++) 
            {    
                buttons[i][j].setEnabled(false);
                buttons[i][j].invalidate();                
            }
        }
        

        sonucText.setText(sonuc + " }");
        
    }//GEN-LAST:event_hesaplaButtonActionPerformed

    private void GenelKapsamaAlgoritması() {
        
        // Mutlak satır bulma 
        for (int i = 0; i < x; i++) 
        {
            if (numX[i].getForeground() == Color.BLUE)
                continue;

            int mutlak = 0;
            int tempJ = 0;

            for (int j = 0; j < y; j++)
            {
                if (numY[j].getForeground() == Color.BLUE)
                    continue;

                String buton = (buttons[j][i].getText());
                if (buton.equals("1"))
                {
                    mutlak++;
                    tempJ = j;
                }
            }

            if (mutlak == 1) {
                numY[tempJ].setForeground(Color.BLUE);

                for (int k = 0;k < x;k++) {
                    String buton = (buttons[tempJ][k].getText());
                    if (buton.equals("1")) {
                        numX[k].setForeground(Color.BLUE);
                    }
                }

                sonuc += (tempJ + 1) + " ,";
                ciktiArea.setText("Mutlak satır : " + (tempJ + 1));
                return;
            }
        }

        // Satır kapsamalarını bulup silme (boyama)
        

        for (int i = 0; i < y; i++) 
        {
            if (numY[i].getForeground() == Color.BLUE)
                continue;

            int kapsayanSyc = 0;

            for (int t = 0; t < x; t++) 
            {
                if (numX[t].getForeground() == Color.BLUE)
                    continue;

                if (buttons[i][t].getText().equals("1")) 
                {
                    kapsayanSyc++;
                }
            }
            for (int j = 0; j < y; j++) 
            {
                int test = 0;
                if (i == j || numY[j].getForeground() == Color.BLUE)
                    continue;

                int kapsananSyc = 0, syc = 0;
                
                if (kapsayanSyc > 0) 
                {
                    for (int k = 0; k < x; k++) 
                    {
                        if (numX[k].getForeground() == Color.BLUE)
                            continue;

                        if (buttons[i][k].getText().equals(" ") && buttons[j][k].getText().equals("1")) 
                        {
                            syc++;
                        }
                        if (buttons[j][k].getText().equals("1") && buttons[i][k].getText().equals("1")) 
                        {
                            kapsananSyc++;
                        }
                    }
                    if (syc > 0)
                    {
                        kapsananSyc = 0;
                        syc = 0;
                        continue;
                    }
                    if (kapsayanSyc >= kapsananSyc && kapsananSyc != 0) 
                    {
                        numY[j].setForeground(Color.BLUE);
                        ciktiArea.setText("Kapsanan satır : " + (j + 1));
                        return;
                    }
                    kapsananSyc = 0;
                }
            }
            kapsayanSyc = 0;
        }

        // Sütun kapsamalarını bulup silme (boyama)
 
        for (int i = 0; i < x; i++) 
        {
            if (numX[i].getForeground() == Color.BLUE)
                continue;

            int kapsayanSyc = 0;

            for (int t = 0; t < y; t++) 
            {
                if (buttons[t][i].getText().equals("1")) 
                {
                    kapsayanSyc++;
                }
            }
            for (int j = 0; j < x; j++) 
            {
                if (i == j || numX[j].getForeground() == Color.BLUE)
                    continue;

                int kapsananSyc = 0, syc = 0;
                
                if (kapsayanSyc > 0) 
                {
                    for (int k = 0; k < y; k++) 
                    {
                        if (numY[k].getForeground() == Color.BLUE)
                            continue;

                        if (buttons[k][i].getText().equals(" ") && buttons[k][j].getText().equals("1")) 
                        {
                            syc++;
                        }
                        if (buttons[k][j].getText().equals("1") && buttons[k][i].getText().equals("1")) 
                        {
                            kapsananSyc++;
                        }
                    }
                    if (syc > 0) 
                    {
                        kapsananSyc = 0;
                        syc = 0;
                        continue;
                    }
                    if (kapsayanSyc >= kapsananSyc && kapsananSyc != 0) 
                    {
                        numX[i].setForeground(Color.BLUE);
                        ciktiArea.setText("Kapsanan sütun : " + (i + 1));
                        return;
                    }
                    
                    kapsananSyc = 0;
                }
            }
            kapsayanSyc = 0;
        }

        // Rota algoritması
        
        ArrayList<Integer> minWeight = new ArrayList<>();
        
        int minWeightSum = 0;        
        
        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < y; j++) 
            {
                if ((buttons[j][i].getText().equals("1")) && numY[j].getForeground() != Color.BLUE && numX[i].getForeground() != Color.BLUE) 
                {
                    minWeightSum++;
                }
            }
            minWeight.add(minWeightSum);
            minWeightSum = 0;
        }

        ArrayList<Integer> yedek = new ArrayList<>();
        
        for (int i : minWeight) 
        {
            if (i == 0)
                continue;

            yedek.add(i);
        }
        
        Collections.sort(yedek);
        int labelYrowSize = 0;

        for (int i = 0; i < y; i++) 
        {
            if (numY[i].getForeground() != Color.BLUE) 
            {
                labelYrowSize++;
            }
        }

        float Stoplam = 0;
        
        ArrayList<Float> Sarr = new ArrayList<>();
        ArrayList<Integer> SarrIndexi = new ArrayList<>();

        for (int i = 0; i < minWeight.size(); i++) 
        {
            if (Objects.equals(minWeight.get(i), yedek.get(0))) 
            {
                // küçük olanı bul
                for (int k = 0; k < y; k++) 
                {
                    if (buttons[k][i].getText().equals("1")) 
                    {
                      
                        for (int j = 0; j < x; j++) 
                        {
                            if (numY[k].getForeground() != Color.BLUE && numX[j].getForeground() != Color.BLUE && buttons[k][j].getText().equals("1")) 
                            {
                                Stoplam += ((float) 1 / (float) minWeight.get(j));
                            }
                        }
                    }
                    if (buttons[k][i].getText().equals("1")) 
                    {
                        Sarr.add(((float) Stoplam * (float) labelYrowSize));
                        SarrIndexi.add(k);
                        Stoplam = 0;
                    }
                }
            }
        }

        float tempSmaxsize = 0;
        int tempSmaxsizeIndex = 0;

        ArrayList<Float> yedek2 = new ArrayList<>();
        for (float i : Sarr) 
        {
            if (i == 0)
                continue;

            yedek2.add(i);
        }
        Collections.sort(yedek2);

        int tempMinIndex = 0;
        for (int i = 0; i < Sarr.size(); i++) 
        {
            if (Sarr.get(i).equals(yedek2.get(0))) 
            {
                tempMinIndex = i;
            }
        }

        int asilIndex = SarrIndexi.get(tempMinIndex);
        numY[asilIndex].setForeground(Color.BLUE);
        ciktiArea.setText("ROTA : " + (asilIndex + 1));
    }
    
    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        //restart butonu 
        
    if(evt.getSource() == restartButton)
    {
        dispose();
        Main game = new Main();
        game.setVisible(true);
    }
        
    }//GEN-LAST:event_restartButtonActionPerformed

    class Action implements ActionListener {    
        public void actionPerformed(ActionEvent e) 
        {
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (e.getSource() == buttons[i][j]) {
                        if (buttons[i][j].getText().equals("1")) {
                            buttons[i][j].setText(" ");
                        } else {
                            buttons[i][j].setText("1");
                        }
                    }
                }
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ciktiArea;
    private javax.swing.JButton hesaplaButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton olusturButton;
    private javax.swing.JButton restartButton;
    private javax.swing.JLabel satirsayisiLabel;
    private javax.swing.JTextField sonucText;
    private javax.swing.JLabel sütunsayisiLabel;
    private javax.swing.JTextField xsatirText;
    private javax.swing.JTextField ysütunText;
    // End of variables declaration//GEN-END:variables
}
