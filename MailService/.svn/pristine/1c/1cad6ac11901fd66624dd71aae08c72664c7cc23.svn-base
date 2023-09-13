/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mail.rtf;

import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

/**
 *
 * @author Priyanka
 */
public class MailServices {
    
     public static String mailNotificationWithAttachment(String username, String password,
            String toAddress, String ccAddress, String subject, Object mailContent, ArrayList receipts, String filePath, String fileType) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
           
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress));
//            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccAddress));

            message.setSubject(subject);
            MimeMultipart mimeMultipart = new MimeMultipart();
           for (int i = 0; i < receipts.size(); i++) {
             String receiptNo = receipts.get(i).toString();
             String xmlData = DbPackageCall.genericMailService(receiptNo);
             byte[] bytes =GenericRTF.rtfReport(xmlData, filePath, fileType);
             String fileName ="Receipt - RT - "+receiptNo+".pdf";
             DataSource dataSource
                     = new ByteArrayDataSource(bytes, "application/pdf");
             MimeBodyPart pdfBodyPart = new MimeBodyPart();
             pdfBodyPart.setDataHandler(new DataHandler(dataSource));
             pdfBodyPart.setFileName(fileName);
             mimeMultipart.addBodyPart(pdfBodyPart);
             //
         }
            BodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setContent(mailContent, "text/html");
            mimeMultipart.addBodyPart(textBodyPart);
            message.setContent(mimeMultipart);
            message.saveChanges();

            Transport.send(message);
            return "Mail Send Successfully";

        } catch (AddressException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (MessagingException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (Exception e) {
            return "Error : " + e.toString();
        }
    } 
    
     public static String renewalmailNotificationWithAttachment(String username, String password,
            String toAddress, String ccAddress, String subject, Object mailContent, ArrayList renewal, String filePath, String fileType) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
           
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress));
//            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccAddress));

            message.setSubject(subject);
            MimeMultipart mimeMultipart = new MimeMultipart();
           for (int i = 0; i < renewal.size(); i++) {
             String bookNO = renewal.get(i).toString();
             String xmlData = DbPackageCall.renewalMailService(bookNO);
             byte[] bytes =GenericRTF.rtfReport(xmlData, filePath, fileType);
             String fileName ="Renewal - BK - "+bookNO+".pdf";
             DataSource dataSource
                     = new ByteArrayDataSource(bytes, "application/pdf");
             MimeBodyPart pdfBodyPart = new MimeBodyPart();
             pdfBodyPart.setDataHandler(new DataHandler(dataSource));
             pdfBodyPart.setFileName(fileName);
             mimeMultipart.addBodyPart(pdfBodyPart);
             //
         }
            BodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setContent(mailContent, "text/html");
            mimeMultipart.addBodyPart(textBodyPart);
            message.setContent(mimeMultipart);
            message.saveChanges();

            Transport.send(message);
            return "Mail Send Successfully";

        } catch (AddressException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (MessagingException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } 
        catch (Exception e) {
            return "Error : " + e.toString();
        }
    } 
      public static String ccReceiptmailNotificationWithAttachment(String username, String password,
            String toAddress, String ccAddress, String subject, Object mailContent, ArrayList renewal, String filePath, String fileType) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
           
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress));
//            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccAddress));

            message.setSubject(subject);
            MimeMultipart mimeMultipart = new MimeMultipart();
           for (int i = 0; i < renewal.size(); i++) {
             String bookNO = renewal.get(i).toString();
             String xmlData = DbPackageCall.ccReceiptMailService(bookNO);
             byte[] bytes =GenericRTF.rtfReport(xmlData, filePath, fileType);
             String fileName ="Receipt - BK - "+bookNO+".pdf";
             DataSource dataSource
                     = new ByteArrayDataSource(bytes, "application/pdf");
             MimeBodyPart pdfBodyPart = new MimeBodyPart();
             pdfBodyPart.setDataHandler(new DataHandler(dataSource));
             pdfBodyPart.setFileName(fileName);
             mimeMultipart.addBodyPart(pdfBodyPart);
             //
         }
            BodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setContent(mailContent, "text/html");
            mimeMultipart.addBodyPart(textBodyPart);
            message.setContent(mimeMultipart);
            message.saveChanges();

            Transport.send(message);
            return "Mail Send Successfully";

        } catch (AddressException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (MessagingException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } 
        catch (Exception e) {
            return "Error : " + e.toString();
        }
    } 
    
     public static String pdcmailNotificationWithAttachment(String username, String password,
            String toAddress, String ccAddress, String subject, Object mailContent, ArrayList P_DATE, String filePath, String fileType) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
           
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress));
//            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccAddress));

            message.setSubject(subject);
            MimeMultipart mimeMultipart = new MimeMultipart();
           for (int i = 0; i < P_DATE.size(); i++) {
             String date = P_DATE.get(i).toString();
             String xmlData = DbPackageCall.pdcMailService(date);
             byte[] bytes =GenericRTF.rtfReport(xmlData, filePath, fileType);
             String fileName ="PDC - "+date+".pdf";
             DataSource dataSource
                     = new ByteArrayDataSource(bytes, "application/pdf");
             MimeBodyPart pdfBodyPart = new MimeBodyPart();
             pdfBodyPart.setDataHandler(new DataHandler(dataSource));
             pdfBodyPart.setFileName(fileName);
             mimeMultipart.addBodyPart(pdfBodyPart);
             //
         }
            BodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setContent(mailContent, "text/html");
            mimeMultipart.addBodyPart(textBodyPart);
            message.setContent(mimeMultipart);
            message.saveChanges();

            Transport.send(message);
            return "Mail Send Successfully";

        } catch (AddressException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (MessagingException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } 
        catch (Exception e) {
            return "Error : " + e.toString();
        }
    } 

     
     public static String communityChargemailNotificationWithAttachment(String username, String password,
            String toAddress, String ccAddress, String subject, Object mailContent, ArrayList P_DATE, String filePath, String fileType) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
           
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress));
//            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccAddress));

            message.setSubject(subject);
            MimeMultipart mimeMultipart = new MimeMultipart();
           for (int i = 0; i < P_DATE.size(); i++) {
             String date = P_DATE.get(i).toString();
             String xmlData = DbPackageCall.comChargeMailService(date);
             byte[] bytes =GenericRTF.rtfReport(xmlData, filePath, fileType);
             String fileName ="Community Charge- "+date+".pdf";
             DataSource dataSource
                     = new ByteArrayDataSource(bytes, "application/pdf");
             MimeBodyPart pdfBodyPart = new MimeBodyPart();
             pdfBodyPart.setDataHandler(new DataHandler(dataSource));
             pdfBodyPart.setFileName(fileName);
             mimeMultipart.addBodyPart(pdfBodyPart);
             //
         }
            BodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setContent(mailContent, "text/html");
            mimeMultipart.addBodyPart(textBodyPart);
            message.setContent(mimeMultipart);
            message.saveChanges();

            Transport.send(message);
            return "Mail Send Successfully";

        } catch (AddressException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (MessagingException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } 
        catch (Exception e) {
            return "Error : " + e.toString();
        }
    } 

             
     public static String pmFeeNotificationWithAttachment(String username, String password,
            String toAddress, String ccAddress, String subject, Object mailContent, ArrayList P_DATE, String filePath, String fileType) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
           
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress));
//            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccAddress));

            message.setSubject(subject);
            MimeMultipart mimeMultipart = new MimeMultipart();
           for (int i = 0; i < P_DATE.size(); i++) {
             String date = P_DATE.get(i).toString();
             String xmlData = DbPackageCall.pmFeeMailService(date);
             byte[] bytes =GenericRTF.rtfReport(xmlData, filePath, fileType);
             String fileName ="PM_FEE- "+date+".pdf";
             DataSource dataSource
                     = new ByteArrayDataSource(bytes, "application/pdf");
             MimeBodyPart pdfBodyPart = new MimeBodyPart();
             pdfBodyPart.setDataHandler(new DataHandler(dataSource));
             pdfBodyPart.setFileName(fileName);
             mimeMultipart.addBodyPart(pdfBodyPart);
             //
         }
            BodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setContent(mailContent, "text/html");
            mimeMultipart.addBodyPart(textBodyPart);
            message.setContent(mimeMultipart);
            message.saveChanges();

            Transport.send(message);
            return "Mail Send Successfully";

        } catch (AddressException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (MessagingException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } 
        catch (Exception e) {
            return "Error : " + e.toString();
        }
    } 

       public static String cashMailNotificationWithAttachment(String username, String password,
            String toAddress, String ccAddress, String subject, Object mailContent, ArrayList units, String filePath, String fileType) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
           
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress));
//            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccAddress));

            message.setSubject(subject);
            MimeMultipart mimeMultipart = new MimeMultipart();
           for (int i = 0; i < units.size(); i++) {
             String unitNo = units.get(i).toString();
             String xmlData = DbPackageCall.cashCollectionMailService(unitNo);
             byte[] bytes =GenericRTF.rtfReport(xmlData, filePath, fileType);
             String fileName ="Unit-Id - "+unitNo+".pdf";
             DataSource dataSource
                     = new ByteArrayDataSource(bytes, "application/pdf");
             MimeBodyPart pdfBodyPart = new MimeBodyPart();
             pdfBodyPart.setDataHandler(new DataHandler(dataSource));
             pdfBodyPart.setFileName(fileName);
             mimeMultipart.addBodyPart(pdfBodyPart);
             //
         }
            BodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setContent(mailContent, "text/html");
            mimeMultipart.addBodyPart(textBodyPart);
            message.setContent(mimeMultipart);
            message.saveChanges();

            Transport.send(message);
            return "Mail Send Successfully";

        } catch (AddressException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (MessagingException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (Exception e) {
            return "Error : " + e.toString();
        }
    } 
    
       
         public static String MsmailNotificationWithAttachment(String username, String password,
            String toAddress, String ccAddress, String subject, Object mailContent, ArrayList MS_id, String filePath, String fileType) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
           
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress));
//            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccAddress));

            message.setSubject(subject);
            MimeMultipart mimeMultipart = new MimeMultipart();
           for (int i = 0; i < MS_id.size(); i++) {
             String id = MS_id.get(i).toString();
             String xmlData = DbPackageCall.MsMailService(id);
             byte[] bytes =GenericRTF.rtfReport(xmlData, filePath, fileType);
             String fileName ="MS - "+id+".pdf";
             DataSource dataSource
                     = new ByteArrayDataSource(bytes, "application/pdf");
             MimeBodyPart pdfBodyPart = new MimeBodyPart();
             pdfBodyPart.setDataHandler(new DataHandler(dataSource));
             pdfBodyPart.setFileName(fileName);
             mimeMultipart.addBodyPart(pdfBodyPart);
             //
         }
            BodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setContent(mailContent, "text/html");
            mimeMultipart.addBodyPart(textBodyPart);
            message.setContent(mimeMultipart);
            message.saveChanges();

            Transport.send(message);
            return "Mail Send Successfully";

        } catch (AddressException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } catch (MessagingException ex) {
            Logger.getLogger(MailServices.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.toString();
        } 
        catch (Exception e) {
            return "Error : " + e.toString();
        }
    } 

   
}
