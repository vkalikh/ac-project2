package Homework3;

import com.sun.deploy.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Card_Validator {
    String number;
    String type;
    String ownerName;
    Date date;
    int cvv;

    public Card_Validator(String number, String type, String ownerName, Date date, int cvv) {
        this.number = number;
        this.type = type;
        this.ownerName = ownerName;
        this.date = date;
        this.cvv = cvv;
    }

    public Card_Validator() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public boolean numValidation(Card_Validator obj) {
        String num = obj.getNumber();
        int size = num.length();
        if (size != 16) {
            System.out.println("Number is invalid");
            System.exit(0);
            return false;
        } else
            return true;
    }

    public boolean typeValidation(Card_Validator obj) {
        String t = obj.getType();
        if (t.equalsIgnoreCase("visa")) {
            return true;
        } else if (t.equalsIgnoreCase("mastercard")) {
            return true;
        } else {
            System.out.println("Type is invalid");
            System.exit(0);
            return false;
        }
    }

    public boolean nameValidation(Card_Validator obj) {
        String str = obj.getOwnerName();
        if (str.trim().isEmpty()) {
            System.out.println("Owner name is empty");
            System.exit(0);
            return false;
        } else {
            return true;
        }
    }

    public boolean dateValidator(Card_Validator obj) {
        Date d = obj.getDate();
        Date current = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        if (d.after(current)) {
            return true;
        } else {
            System.out.println("Date is expared");
            System.exit(0);
            return false;
        }
    }

    public boolean cvvValidation(Card_Validator obj) {
        int num = obj.getCvv();
        if (num > 99 && num < 1000) {
            return true;
        } else {
            System.out.println("CVV is invalid");
            System.exit(0);
            return false;
        }
    }

    public static void main(String[] args) {
        Card_Validator cv = new Card_Validator();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a card number:");
        cv.setNumber(in.nextLine());
        cv.numValidation(cv);

        System.out.println("Enter a card type:");
        cv.setType(in.nextLine());
        cv.typeValidation(cv);

        System.out.println("Enter a owner name:");
        cv.setOwnerName(in.nextLine());
        cv.nameValidation(cv);

        System.out.println("Enter a date in format dd.MM.yyyy:");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String strDate = in.nextLine();
        Date d = null;
        try {
            d = sdf.parse(strDate);
        } catch (ParseException e) {
            System.out.println("Invalid date!!!");
        }
        cv.setDate(d);
        cv.dateValidator(cv);

        System.out.println("Enter a cvv number:");
        cv.setCvv(in.nextInt());
        cv.cvvValidation(cv);

        System.out.println("Card data is valid");

    }
}
