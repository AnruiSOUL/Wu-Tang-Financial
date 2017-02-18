package WuTangFinancial;



/**
 * Created by randallcrame on 1/11/17.
 */
public class CurrencyConverter {



    public static Double convertCurrency (Double currencyFrom, Double currencyTo){
        return CurrencyRates.getUsDollar()/currencyFrom * currencyTo;
    }
}
