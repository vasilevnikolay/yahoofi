/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahoofi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 *
 * @author Nikolay Vasilev
 */
public class Yahoofi {

    /**
     * @param args the command line arguments
     */
    public static void main1(String[] args) {
        Stock stock = null;
        try {
            stock = YahooFinance.get("VOD");
        } catch (IOException ex) {
            Logger.getLogger(Yahoofi.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        BigDecimal price = stock.getQuote().getPrice();
        BigDecimal change = stock.getQuote().getChangeInPercent();
        BigDecimal peg = stock.getStats().getPeg();
        BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
 
stock.print();
    }
    
}
