
import java.io.*;


/*
 * Zamanlayıcı.java
 *
 * Created on 11.Haz.2012, 20:58:57
 */
/**
 *
 * @author Acer
 */
public class Zamanlayıcı extends javax.swing.JFrame {
    /** Creates new form Zamanlayıcı */
    public Zamanlayıcı() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        İptalEt = new javax.swing.JButton();
        Kapat = new javax.swing.JButton();
        YenidenBaşlat = new javax.swing.JButton();
        başlık = new javax.swing.JLabel();
        uyarı = new javax.swing.JLabel();
        dk = new javax.swing.JLabel();
        zaman = new java.awt.TextField();
        yor = new java.awt.Label();
        offsimge = new javax.swing.JLabel();
        restartsimge = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        simge = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kac = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zamanlayıcı™");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        İptalEt.setFont(new java.awt.Font("Times New Roman", 1, 12));
        İptalEt.setText("İptal Et");
        İptalEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                İptalEtActionPerformed(evt);
            }
        });

        Kapat.setText("Kapat");
        Kapat.setNextFocusableComponent(İptalEt);
        Kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KapatActionPerformed(evt);
            }
        });

        YenidenBaşlat.setText("Yeniden Başlat");
        YenidenBaşlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YenidenBaşlatActionPerformed(evt);
            }
        });

        başlık.setFont(new java.awt.Font("Times New Roman", 1, 36));
        başlık.setText("ZAMANLAYICI™");

        uyarı.setFont(new java.awt.Font("Times New Roman", 1, 12));
        uyarı.setText("Kapatma süresini dakika olarak giriniz.");

        dk.setFont(new java.awt.Font("Times New Roman", 1, 12));
        dk.setText("Dk");

        zaman.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        zaman.setFont(new java.awt.Font("Times New Roman", 0, 18));
        zaman.setText("0");
        zaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamanActionPerformed(evt);
            }
        });

        yor.setAlignment(java.awt.Label.CENTER);
        yor.setFont(new java.awt.Font("Times New Roman", 1, 24));
        yor.setText("");

        offsimge.setIcon(new javax.swing.ImageIcon("F:\\Yazılım mühendisliği Proje\\yazılımprojesi\\Yazılım Proje\\Butonoff.png")); // NOI18N
        offsimge.setText("");

        restartsimge.setIcon(new javax.swing.ImageIcon("F:\\Yazılım mühendisliği Proje\\yazılımprojesi\\Yazılım Proje\\butonrestart.png")); // NOI18N
        restartsimge.setText("");

        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\Yazılım mühendisliği Proje\\yazılımprojesi\\Yazılım Proje\\f.png")); // NOI18N
        jLabel5.setText("");

        simge.setIcon(new javax.swing.ImageIcon("F:\\Yazılım mühendisliği Proje\\yazılımprojesi\\Yazılım Proje\\simge.png")); // NOI18N
        simge.setText("");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel7.setText("FIRAT ÜNİVERSİTESİ YAZILIM MÜHENDİSLİĞİ ÖĞRENCİSİ:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel8.setText("ÖMER YAZIR TARAFINDAN PROJE ÖDEVİ OLARAK YAPILMIŞTIR.");

        kac.setFont(new java.awt.Font("Times New Roman", 1, 18));
        kac.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zaman, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dk)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)))
                .addGap(73, 73, 73)
                .addComponent(YenidenBaşlat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(İptalEt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(offsimge, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(simge, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(restartsimge, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(başlık)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel8)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yor, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyarı))
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(kac, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(başlık)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simge)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(restartsimge, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(offsimge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(YenidenBaşlat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Kapat, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(uyarı)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zaman, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(İptalEt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(kac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void İptalEtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_İptalEtActionPerformed
    /**İptal et butonunda 2 tane label bulunuyor 
    *1.yor labeli butona basınca iptal edildi yazısını aktif duruma getiriyor
    *2.kac labeli  ise kapatma veya yeniden başlatma butonları sonucu çıkan kac dakika sonra kapanıyor
    yazısını kaldırıyor*/
       yor.setText("   İptal Edildi.");
       kac.setText("");
    /**Burada shutdown kodu bilgisayarı verilen bir karardan geri dönülmesini sağlıyor*/
       try {
Process s = Runtime.getRuntime().exec("shutdown -a");
BufferedReader in = new BufferedReader(
new InputStreamReader(s.getInputStream()));

} catch (IOException e) {
e.printStackTrace();
}   
}//GEN-LAST:event_İptalEtActionPerformed

private void KapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KapatActionPerformed
    /**Kapat butonunda ilk olarak "zaman"adlı textfield 
     * için 2 tane kullanmak üzere string tanımlayıp çağrıllabilir duruma getidim
     */
    String t1=zaman.getText();
    String t2=zaman.getText();
    /**Aşağıda ise "sayı1" ve "k" için Integer belirledim.
     */
    int sayi1=Integer.parseInt(t1);
    int k=Integer.parseInt(t1);
    /**Aşsğıdaki işlemde textfield e girdiğimiz sayıyı dakikaya çevirebilmek için
     * otomatik olarak 60 ile çarpılmasını sağlamaya çalıştım
     */ 
    sayi1=k*60;
    /**Aşağıda "dakika" ve  "saat" i Integer tanımlamamın sebebi 
     * girilen dakikayı;
     * if metodu ile eğer 60 dan küçükse dakika olarak
     * şayet 60 dan büyük ise kaç saat ve  kaç dakika olmasının ayarlamaktır.
     * ve son  olarak "yor" labeli ile ktuşa bastıktan sonra kapatılıyor 
     * yazısı geliyor.
     */
    int dakika=Integer.parseInt(t2);
    int saat=Integer.parseInt(t2);
    dakika=k%60;
    saat=k/60;
    if(k<60){
    kac.setText("       "+k+" dakika sonra");}
    else if(k%60==0){
    kac.setText("           "+saat+" saat sonra");    
    }
    else if(sayi1>=60){
    kac.setText(+saat+" saat "+dakika+" dakika sonra");
    }
    
     yor.setText("    Kapatılıyor...");
    try {
Process s = Runtime.getRuntime().exec("shutdown -s -f -t "+sayi1+"");
BufferedReader in = new BufferedReader(
new InputStreamReader(s.getInputStream()));

} catch (IOException e) {
e.printStackTrace();
}
    
}//GEN-LAST:event_KapatActionPerformed

private void YenidenBaşlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YenidenBaşlatActionPerformed
    /**Burada da Kapat butonu ile hemen hemen aynı şeyleri uyguladım 
     * öncelikle;
     * ilk olarak "zaman"adlı textfield için kullanmak üzere 
     * 2 tane string tanımlayıp çağrılabilir duruma getidim
     */
    String t1=zaman.getText();
    String t2=zaman.getText();
    /**Aşağıda ise "sayı1" ve "k" için Integer belirledim.
     */
    int sayi1=Integer.parseInt(t1);
    int k=Integer.parseInt(t2);
    /**Aşsğıdaki işlemde textfield e girdiğimiz sayıyı dakikaya çevirebilmek için
     * otomatik olarak 60 ile çarpılmasını sağlamaya çalıştım
     */        
    sayi1=k*60;
     /**Aşağıda "dakika" ve  "saat" i Integer tanımlamamın sebebi 
     * girilen dakikayı;
     * if metodu ile eğer 60 dan küçükse dakika olarak
     * şayet 60 dan büyük ise kaç saat ve  kaç dakika olmasının ayarlamaktır.
     * ve son  olarak "yor" labeli ile ktuşa bastıktan sonra Yeniden Başlatılacak 
     * yazısı geliyor.
     */
    int dakika=Integer.parseInt(t2);
    int saat=Integer.parseInt(t2);
    dakika=k%60;
    saat=k/60;
    if(k<60){
    kac.setText("       "+k+" dakika sonra");}
    else if(k%60==0){
    kac.setText("           "+saat+" saat sonra");    
    }
    else if(sayi1>=60){
    kac.setText(+saat+" saat "+dakika+" dakika sonra");
  
    }
    
    yor.setText("Yeniden Başlatılacak.");
    try {
Process r = Runtime.getRuntime().exec("shutdown -r -f -t "+sayi1+"");
BufferedReader in = new BufferedReader(
new InputStreamReader(r.getInputStream()));

} catch (IOException e) {
e.printStackTrace();
    
}//GEN-LAST:event_YenidenBaşlatActionPerformed
    }
private void zamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamanActionPerformed
  
}//GEN-LAST:event_zamanActionPerformed

private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
// TODO add your handling code here:
}//GEN-LAST:event_formMouseEntered

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
            java.util.logging.Logger.getLogger(Zamanlayıcı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zamanlayıcı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zamanlayıcı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zamanlayıcı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Zamanlayıcı().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kapat;
    private javax.swing.JButton YenidenBaşlat;
    private javax.swing.JLabel başlık;
    private javax.swing.JLabel dk;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.Label kac;
    private javax.swing.JLabel offsimge;
    private javax.swing.JLabel restartsimge;
    private javax.swing.JLabel simge;
    private javax.swing.JLabel uyarı;
    private java.awt.Label yor;
    private java.awt.TextField zaman;
    private javax.swing.JButton İptalEt;
    // End of variables declaration//GEN-END:variables
}
