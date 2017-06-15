package dbUrIdea.models;

import java.util.Date;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class Payment {
    private int id;
    private Company company;
    private PaymentsType paymentsType;
    private String cardNumber;
    private String name;
    private String lastNameF;
    private String firstAddressF;
    private String secondAddressF;
    private Date date;
    private String location;
    private String country;
    private String codeZip;
    private String cellPhoneNumber;
    private float amount;

    public Payment() {
    }

    public Payment(int id, Company company, PaymentsType paymentsType, String cardNumber, String name, String lastNameF, String firstAddressF, String secondAddressF, Date date, String location, String country, String codeZip, String cellPhoneNumber, float amount) {
        this.id = id;
        this.company = company;
        this.paymentsType = paymentsType;
        this.cardNumber = cardNumber;
        this.name = name;
        this.lastNameF = lastNameF;
        this.firstAddressF = firstAddressF;
        this.secondAddressF = secondAddressF;
        this.date = date;
        this.location = location;
        this.country = country;
        this.codeZip = codeZip;
        this.cellPhoneNumber = cellPhoneNumber;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Payment setId(int id) {
        this.id = id;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Payment setCompany(Company company) {
        this.company = company;
        return this;
    }

    public PaymentsType getPaymentsType() {
        return paymentsType;
    }

    public Payment setPaymentsType(PaymentsType paymentsType) {
        this.paymentsType = paymentsType;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Payment setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public Payment setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastNameF() {
        return lastNameF;
    }

    public Payment setLastNameF(String lastNameF) {
        this.lastNameF = lastNameF;
        return this;
    }

    public String getFirstAddressF() {
        return firstAddressF;
    }

    public Payment setFirstAddressF(String firstAddressF) {
        this.firstAddressF = firstAddressF;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Payment setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Payment setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Payment setCountry(String country) {
        this.country = country;
        return this;    }

    public String getCodeZip() {
        return codeZip;
    }

    public Payment setCodeZip(String codeZip) {
        this.codeZip = codeZip;
        return this;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public Payment setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        return this;
    }

    public String getSecondAddressF() {
        return secondAddressF;
    }

    public Payment setSecondAddressF(String secondAddressF) {
        this.secondAddressF = secondAddressF;
        return this;
    }

    public float getAmount() {
        return amount;
    }

    public Payment setAmount(float amount) {
        this.amount = amount;
        return this;
    }
}
