/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomasjimenez.ebankdo.form.action;

import com.tomasjimenez.ebankdo.hibernate.table.Customer;
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
public class CustomerDataAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "success";

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
        Session session = com.tomasjimenez.ebankdo.hibernate.config.NewHibernateUtil.getSessionFactory().openSession();
        
        ArrayList<CustomerData> list1 = new ArrayList<CustomerData>();
        try {
            session.beginTransaction();
            Query q = session.createQuery("from Customer");  //Class Customer, Not exist table Cutomer !!
            List list = q.list();
            for (int i = 0; i < list.size(); i++) {
                Customer ds = (Customer) list.get(i);
//                System.out.println("getCodcustomer : "+ds.getCodcustomer());
//                System.out.println("getName : "+ds.getName());
//                System.out.println("getCredit_card_number : "+ds.getCredit_card_number());
//                System.out.println("getStatus : "+ds.getStatus());
                list1.add(new CustomerData(ds.getCodcustomer(), ds.getName(), ds.getCredit_card_number(), ds.getStatus()));
            }

        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        request.setAttribute("list1", list1);
        return mapping.findForward(SUCCESS);
    }
}