/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mail.rtf;

import java.util.ArrayList;
import HtmlContent.HTML;

/**
 *
 * @author Priyanka
 */
public class WebserviceProcess {
    
     public static String otherChargeInvoice (ArrayList receipts,String to){
        String returnval=null;
        String filePath = "/u01/data/reports/lease/Receipt_Detail.rtf" ;
//        String filePath = "C:/Users/Priyanka/Downloads/Receipt_Detail.rtf" ;
        String fileType = "pdf"; 
        //Mail Attachment     
        String bodyMsg= HTML.getReceiptMailBody(receipts.toString());
        //send mail
        returnval=MailServices.mailNotificationWithAttachment(
                BaseClass.FromMailId, 
                BaseClass.password,
                to,
               // BaseClass.TO_ADDRESS, 
                BaseClass.RECEIPT_DETAIL_CC,
                BaseClass.SUB, 
                bodyMsg, receipts, filePath, fileType);
                
       return returnval; 
    }
       public static String renewalMail (ArrayList renewal,String to){
        String returnval=null;
        String filePath = "/u01/data/reports/lease/Renewal_Notice.rtf";
//        String filePath = "C:/Users/Priyanka/Downloads/Renewal_Notice.rtf" ;
        String fileType = "pdf"; 
        //Mail Attachment     
        String bodyMsg= HTML.getRenewalMailBody(renewal.toString());
        //send mail
        returnval=MailServices.renewalmailNotificationWithAttachment(
                BaseClass.FromMailId, 
                BaseClass.password,
                to,
               // BaseClass.TO_ADDRESS, 
                BaseClass.RENEWAL_NOTICE_CC,
                BaseClass.SUB, 
                bodyMsg, renewal, filePath, fileType);
                
       return returnval; 
    }
       
        public static String pdccMail(ArrayList P_DATE,String to){
        String returnval=null;
        String filePath = "/u01/data/reports/lease/PDC_Reminder.rtf";
//        String filePath = "C:/Users/Priyanka/Downloads/PDC_Reminder.rtf" ;
        String fileType = "pdf"; 
        //Mail Attachment     
        String bodyMsg= HTML.getpdcMailBody(P_DATE.toString());
        //send mail
        returnval=MailServices.pdcmailNotificationWithAttachment(
                BaseClass.FromMailId, 
                BaseClass.password,
                to,
               // BaseClass.TO_ADDRESS, 
                BaseClass.PDC_REMINDER_CC,
                BaseClass.SUB, 
                bodyMsg, P_DATE, filePath, fileType);
                
       return returnval; 
    }
    
         public static String communityChargeMail(ArrayList P_DATE,String to){
        String returnval=null;
        String filePath = "/u01/data/reports/lease/Community_Notification.rtf";
//        String filePath = "C:/Users/Priyanka/Downloads/Community_Notification.rtf" ;
        String fileType = "pdf"; 
        //Mail Attachment     
        String bodyMsg= HTML.getcommunityChargeMailBody(P_DATE.toString());
        //send mail
        returnval=MailServices.communityChargemailNotificationWithAttachment(
                BaseClass.FromMailId, 
                BaseClass.password,
                to,
               // BaseClass.TO_ADDRESS, 
                BaseClass.COMM_NOTIFI_CC,
                BaseClass.SUB, 
                bodyMsg, P_DATE, filePath, fileType);
                
       return returnval; 
    }
         
          public static String pmFeeMail(ArrayList P_DATE,String to){ 
        String returnval=null;
        String filePath = "/u01/data/reports/lease/PM_FEE.rtf";
//        String filePath = "C:/Users/Priyanka/Downloads/PM_FEE.rtf" ;
        String fileType = "pdf"; 
        //Mail Attachment     
        String bodyMsg= HTML.getpmFeeMailBody(P_DATE.toString());
        //send mail
        returnval=MailServices.pmFeeNotificationWithAttachment(
                BaseClass.FromMailId, 
                BaseClass.password,
                to,
               // BaseClass.TO_ADDRESS, 
                BaseClass.PMFEE_NOTIFI_CC,
                BaseClass.SUB, 
                bodyMsg, P_DATE, filePath, fileType);
                
       return returnval; 
    }
 
  public static String ccReceiptMailService(ArrayList renewal,String to){
        String returnval=null;
        String filePath = "/u01/data/reports/lease/CC_RECEIPT.rtf";
       // String filePath = "C:/Users/Priyanka/Downloads/CC_RECEIPT.rtf" ;
        String fileType = "pdf"; 
        //Mail Attachment     
        String bodyMsg= HTML.getccReceiptMailBody(renewal.toString());
        //send mail
        returnval=MailServices.ccReceiptmailNotificationWithAttachment(
                BaseClass.FromMailId, 
                BaseClass.password,
                to,
               // BaseClass.TO_ADDRESS, 
                BaseClass.CC_RECEIPT_CC,
                BaseClass.SUB, 
                bodyMsg, renewal, filePath, fileType);
                
       return returnval; 
    }
  
    public static String cashCollectiontMailService(ArrayList units,String to){
        String returnval=null;
        String filePath = "/u01/data/reports/lease/Cash_Collection.rtf" ;
//        String filePath = "C:/Users/Priyanka/Downloads/Receipt_Detail.rtf" ;
        String fileType = "pdf"; 
        //Mail Attachment     
        String bodyMsg= HTML.getCashCollectionMailBody(units.toString());
        //send mail
        returnval=MailServices.cashMailNotificationWithAttachment(
                BaseClass.FromMailId, 
                BaseClass.password,
                to,
               // BaseClass.TO_ADDRESS, 
                BaseClass.RECEIPT_DETAIL_CC,
                BaseClass.SUB, 
                bodyMsg, units, filePath, fileType);
                
       return returnval; 
    }
    
      public static String MsMailService(ArrayList receipts,String to){
        String returnval=null;
        String filePath = "/u01/data/reports/lease/MS_INV.rtf" ;
//        String filePath = "C:/Users/Priyanka/Downloads/Receipt_Detail.rtf" ;
        String fileType = "pdf"; 
        //Mail Attachment     
        String bodyMsg= HTML.getMsMailBody(receipts.toString());
        //send mail
        returnval=MailServices.MsmailNotificationWithAttachment(
                BaseClass.FromMailId, 
                BaseClass.password,
                to,
               // BaseClass.TO_ADDRESS, 
                BaseClass.MS_DETAIL_CC,
                BaseClass.SUB, 
                bodyMsg, receipts, filePath, fileType);
                
       return returnval; 
    }
}
