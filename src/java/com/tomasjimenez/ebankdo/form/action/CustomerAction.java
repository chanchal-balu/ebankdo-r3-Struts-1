/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomasjimenez.ebankdo.form.action;

import com.tomasjimenez.ebankdo.form.bean.CustomerForm;
import com.tomasjimenez.ebankdo.hibernate.table.Customer;
import com.tomasjimenez.ebankdo.crud.DsnCrud;
import com.tomasjimenez.ebankdo.customer.data.CustomerData;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Tomas
 */
public class CustomerAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CustomerForm df = (CustomerForm) form;
        DsnCrud dc = new DsnCrud();
        
        if(df.getAction().equals("submit")){
            dc.insert( df.getName(), df.getCredit_card_number(),df.getStatus());
        }else if(df.getAction().equals("update")){
            dc.update(df.getCodcustomer(), df.getName(), df.getCredit_card_number(),df.getStatus());
        }else if(df.getAction().equals("delete")){
            dc.delete(df.getCodcustomer());
        }

        return mapping.findForward(SUCCESS);
    }
}
