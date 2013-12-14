/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomasjimenez.ebankdo.customer.data;

/**
 *
 * @author Tomas
 */
public class CustomerData {
   

     private Integer codcustomer;
     private String name;
     private String credit_card_number;
     private String status;

    public CustomerData() {
    }

    public CustomerData(Integer codcustomer, String name, String credit_card_number, String status) {
       this.codcustomer = codcustomer;
       this.name = name;
       this.credit_card_number = credit_card_number;
       this.status = status;
    }

    /**
     * @return the codcustomer
     */
    public Integer getCodcustomer() {
        return codcustomer;
    }

    /**
     * @param codcustomer the codcustomer to set
     */
    public void setCodcustomer(Integer codcustomer) {
        this.codcustomer = codcustomer;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the credit_card_number
     */
    public String getCredit_card_number() {
        return credit_card_number;
    }

    /**
     * @param credit_card_number the credit_card_number to set
     */
    public void setCredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
   


}


