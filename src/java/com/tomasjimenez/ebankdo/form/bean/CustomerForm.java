/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomasjimenez.ebankdo.form.bean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Tomas
 */
public class CustomerForm extends org.apache.struts.action.ActionForm {
    
    private int codcustomer;
    private String name;
    private String credit_card_number	;
    private String status;
    private String Action;

    

    /**
     * @return the codcustomer
     */
    public int getCodcustomer() {
        return codcustomer;
    }

    /**
     * @param codcustomer the codcustomer to set
     */
    public void setCodcustomer(int codcustomer) {
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
    
        /**
     * @return the Action
     */
    public String getAction() {
        return Action;
    }

    /**
     * @param Action the Action to set
     */
    public void setAction(String Action) {
        this.Action = Action;
    }
    
    public CustomerForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }



}
