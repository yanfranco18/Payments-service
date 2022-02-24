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

    public static Payment getList(){
        Payment payment = new Payment();
        payment.setId("12233d");
        payment.setNameThird("Luis Ingaruca");
        payment.setNumberIdentity("34567889");
        payment.setAmountPay(20.00);
        payment.setIdAccount("1244555gg");
        payment.setCreateDate(new Date(2022-02-16));
        return payment;
    }
}
