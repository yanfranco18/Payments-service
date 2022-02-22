package app.payments;

import app.payments.models.Payment;

import java.util.Date;

public class DataPayments {

    public static Payment savePaymentThird(){
        Payment pay = new Payment();
        pay.setId("12233d");
        pay.setAmountPay(20.0);
        pay.setNameThird("Luis Ingaruca");
        pay.setNumberIdentity("45885678");
        pay.setCreateDate(new Date());
        pay.setIdAccount("1234556789");
        return pay;
    }
}
