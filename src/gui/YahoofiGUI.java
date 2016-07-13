/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 *
 * @author Nikolay Vasilev
 */
public class YahoofiGUI extends javax.swing.JFrame {

    /**
     * Creates new form YahoofiGUI
     */
    public YahoofiGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ticker = new javax.swing.JLabel();
        tickerTextField = new javax.swing.JTextField();
        hae = new javax.swing.JButton();
        companyName = new javax.swing.JLabel();
        companyNameValue = new javax.swing.JLabel();
        bid = new javax.swing.JLabel();
        ask = new javax.swing.JLabel();
        bidPrice = new javax.swing.JLabel();
        askPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ticker.setText("ticker");

        tickerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tickerTextFieldActionPerformed(evt);
            }
        });

        hae.setText("Hae");
        hae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haeActionPerformed(evt);
            }
        });

        companyName.setText("company name");

        companyNameValue.setText("jLabel3");

        bid.setText("Bid");

        ask.setText("Ask");

        bidPrice.setText("jLabel1");

        askPrice.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(companyName)
                        .addGap(18, 18, 18)
                        .addComponent(companyNameValue))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bid)
                                .addGap(88, 88, 88)
                                .addComponent(ask))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ticker)
                                .addGap(18, 18, 18)
                                .addComponent(tickerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(hae))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bidPrice)
                        .addGap(68, 68, 68)
                        .addComponent(askPrice)))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bid, bidPrice});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticker)
                    .addComponent(tickerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hae))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyName)
                    .addComponent(companyNameValue))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bid)
                    .addComponent(ask))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bidPrice)
                    .addComponent(askPrice))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void haeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haeActionPerformed
        String companyTicker = tickerTextField.getText();
        //Stock stock = null;
        try {
            Stock stock = YahooFinance.get(companyTicker);
            companyNameValue.setText(stock.getName());
            bidPrice.setText(String.valueOf(stock.getQuote().getBid().doubleValue()));
            askPrice.setText(String.valueOf(stock.getQuote().getAsk().doubleValue()));
        } catch (IOException ex) {
            companyNameValue.setText("company cannot be retrieved");
            Logger.getLogger(YahoofiGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex){
            companyNameValue.setText("company cannot be retrieved");
        }

    }//GEN-LAST:event_haeActionPerformed

    private void tickerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tickerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tickerTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(YahoofiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YahoofiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YahoofiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YahoofiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YahoofiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ask;
    private javax.swing.JLabel askPrice;
    private javax.swing.JLabel bid;
    private javax.swing.JLabel bidPrice;
    private javax.swing.JLabel companyName;
    private javax.swing.JLabel companyNameValue;
    private javax.swing.JButton hae;
    private javax.swing.JLabel ticker;
    private javax.swing.JTextField tickerTextField;
    // End of variables declaration//GEN-END:variables
}
