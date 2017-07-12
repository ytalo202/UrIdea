package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;
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
    private String firstAddress;
    private String secondAddress;
    private Date paymentDate;
    private String location;
    private String country;
    private String codeZip;
    private String cellPhoneNumber;
    private float amount;

    public Payment() {
    }

    public Payment(int id, Company company, PaymentsType paymentsType, String cardNumber, String name, String lastNameF, String firstAddress, String secondAddress, Date paymentDate, String location, String country, String codeZip, String cellPhoneNumber, float amount) {
        this.id = id;
        this.company = company;
        this.paymentsType = paymentsType;
        this.cardNumber = cardNumber;
        this.name = name;
        this.lastNameF = lastNameF;
        this.firstAddress = firstAddress;
        this.secondAddress = secondAddress;
        this.paymentDate = paymentDate;
        this.location = location;
        this.country = country;
        this.codeZip = codeZip;
        this.cellPhoneNumber = cellPhoneNumber;
        this.amount = amount;
    }
    public String getCardNumberAsValue() {return "'" + getCardNumber() + "'"; }
    public String getIdAsString() { return String.valueOf(getId());  }
    public String getNameAsValue() {return "'" + getName() + "'"; }
    public String getLastNameFAsValue() {return "'" + getLastNameF() + "'"; }
    public String getFirstAddressFAsValue(){return "'"+ getFirstAddress()+"'";}
    public  String getSecondAddressFAsValue(){return"'"+ getSecondAddress()+"'";}
    public String getDateAsValue(){return String.valueOf(getPaymentDate());}
    public String getLocationAsValue(){return "'"+getLocation()+"'";}
    public String getCountryAsValue(){return "'"+getCountry()+"'";}
    public String getCodeZipAsValue(){return "'"+getCodeZip()+"'";}
    public String getCellPhoneNumberAsValue(){return "'"+getCellPhoneNumber()+"'";}
    public String getAmountAsValue(){return String.valueOf(getAmount());}


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

    public String getFirstAddress() {
        return firstAddress;
    }

    public Payment setFirstAddress(String firstAddress) {
        this.firstAddress = firstAddress;
        return this;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Payment setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
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
        return this;
    }

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

    public String getSecondAddress() {
        return secondAddress;
    }

    public Payment setSecondAddress(String secondAddress) {
        this.secondAddress = secondAddress;
        return this;
    }

    public float getAmount() {
        return amount;
    }

    public Payment setAmount(float amount) {
        this.amount = amount;
        return this;
    }


  public static Payment build(ResultSet rs,CompaniesEntity companiesEntity,PaymentsTypesEntity paymentsTypesEntity
                                ,EmailAddressesEntity emailAddressesEntity ) {

        try {
            return (new Payment())
                   .setId(rs.getInt("id"))
                   .setCompany(companiesEntity.findById(
                           rs.getInt("id_companies"), emailAddressesEntity))
                   .setPaymentsType(paymentsTypesEntity.findById(
                           rs.getInt("id_payment_type")))
                   .setCardNumber(rs.getString("card_number"))
                   .setName(rs.getString("name"))
                   .setLastNameF(rs.getString("last_name"))
                   .setFirstAddress(rs.getString("first_address"))
                   .setSecondAddress(rs.getString("second_address"))
                   .setPaymentDate(rs.getDate("payment_date"))
                   .setLocation(rs.getString("location"))
                   .setCountry(rs.getString("country"))
                   .setCodeZip(rs.getString("code_zip"))
                   .setCellPhoneNumber(rs.getString("cell_phone_number"))
                   .setAmount(rs.getFloat("payment_amount"))
                    ;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }




}