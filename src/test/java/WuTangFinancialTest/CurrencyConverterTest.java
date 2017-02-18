package WuTangFinancialTest;

import WuTangFinancial.CurrencyConverter;
import WuTangFinancial.CurrencyRates;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by randallcrame on 1/11/17.
 */
public class CurrencyConverterTest {

    @Before
    public  void setUp(){
    }
    @Test
    public void convertDollarToEuro() {
        Double expected = 0.94;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getUsDollar(), CurrencyRates.getEuro());
        assertEquals(expected, actual, 0);
    }

    @Test
    public void convertEuroToDollar() {
        Double expected = 1.06;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getEuro(), CurrencyRates.getUsDollar());
        assertEquals(expected, actual, 0.004);
    }

    @Test
    public void convertEuroToBritishPound() {
        Double expected = 0.87;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getEuro(), CurrencyRates.getBritishPound());
        assertEquals(expected, actual, 0.003);
    }

    @Test
    public void convertBritishPoundToIndianRupee() {
        Double expected = 83.31;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getBritishPound(), CurrencyRates.getIndianRupee());
        assertEquals(expected, actual, 0.008);
    }

    @Test
    public void convertIndianRupeeToCanadianDollar() {
        Double expected = 0.01;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getIndianRupee(), CurrencyRates.getCanadianDollar());
        assertEquals(expected, actual, 0.02);
    }

    @Test
    public void convertCanadianDollarToSingaporeDollar() {
        Double expected = 1.08;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getCanadianDollar(), CurrencyRates.getSingaporeDollar());
        assertEquals(expected, actual, 0.004);
    }

    @Test
    public void convertSingaporeDollarToSwissFranc() {
        Double expected = 0.70;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getSingaporeDollar(), CurrencyRates.getSwissFranc());
        assertEquals(expected, actual, 0.007);
    }

    @Test
    public void convertSwissFrancToMalaysianRinggit() {
        Double expected = 4.42;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getSwissFranc(), CurrencyRates.getMalaysianRinggit());
        assertEquals(expected, actual, 0.03);
    }

    @Test
    public void convertMalaysianRinggitToJapaneseYen() {
        Double expected = 25.91;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getMalaysianRinggit(), CurrencyRates.getJapaneseYen());
        assertEquals(expected, actual, 0.02);
    }

    @Test
    public void convertJapaneseYenToChineseYuanRenminbi() {
        Double expected = 0.05;
        Double actual = CurrencyConverter.convertCurrency(CurrencyRates.getJapaneseYen(), CurrencyRates.getChineseYuanRenminbi());
        assertEquals(expected, actual, 0.06);
    }
}

