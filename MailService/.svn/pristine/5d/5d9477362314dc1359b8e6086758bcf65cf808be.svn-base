package com.mail.rtf;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Priyanka
 */
public class BaseClass {
     public static String getSysdate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String strDate = formatter.format(date);
        return strDate;
    }
    

//TO mail details
    //  public static final String TO_ADDRESS = "priyanka.jothi@4iapps.com,ibrahim.hb@4iapps.com";
     // public static final String CC_ADDRESS = "priyanka.jothi@4iapps.com";
  //  public static final String TO_ADDRESS = DbPackageCall.getAddressFromLookup("OA_INVOICE_TO");
      public static final String MS_DETAIL_CC = DbPackageCall.getAddressFromLookup("MS_DETAIL_CC");
  public static final String RECEIPT_DETAIL_CC = DbPackageCall.getAddressFromLookup("RECEIPT_DETAIL_CC");
  public static final String RENEWAL_NOTICE_CC = DbPackageCall.getAddressFromLookup("RENEWAL_NOTICE_CC");
  public static final String PDC_REMINDER_CC = DbPackageCall.getAddressFromLookup("PDC_REMINDER_CC");
  public static final String COMM_NOTIFI_CC = DbPackageCall.getAddressFromLookup("COMM_NOTIFI_CC");
  public static final String PMFEE_NOTIFI_CC = DbPackageCall.getAddressFromLookup("PMFEE_NOTIFI_CC");
  public static final String CC_RECEIPT_CC = DbPackageCall.getAddressFromLookup("CC_RECEIPT_CC");
  
 //From mail details 
    public static final String FromMailId ="prismalerts@omniyat.com"; 
    public static final String password ="Or@cl3alert"; 
    public static final String hostName ="smtp.office365.com"; 
    
      //Subject
    public static final String SUB ="with attachment";
    
     public static String getErrorMailSubject(String tab) {
        
        if("XXPL_BOOKING_MILESTONES".equals(tab)){
            return "Lease - Integration Error Report";
        }
        if("XXPL_OA_CONTRACT_HDR".equals(tab)){
            return "AP Owner Invoice - Integration Error Report";
        }
        if("XXPL_OWNER_INVOICE".equals(tab)){
            return "Owner Invoice - Integration Error Report";
        }
        if("XXPL_OTHER_CHARGE_HDR".equals(tab)){
            return "Other Charge - Integration Error Report";
        }
        
        return "Integration Error Report";
    }

}