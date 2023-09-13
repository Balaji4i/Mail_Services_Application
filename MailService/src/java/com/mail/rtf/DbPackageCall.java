package com.mail.rtf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Priyanka
 */
public class DbPackageCall {
    
    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;
    static PreparedStatement ps;

        public static Connection getConnectionDS(String datasource) throws SQLException,
            NamingException {
        Connection con = null;
        DataSource data = null;
        Context initialContext = new InitialContext();
        if (initialContext == null) {

        }
        data = (DataSource) initialContext.lookup(datasource);
        if (data != null) {
            con = data.getConnection();
        } else {
            System.out.println("Failed to Find JDBC DataSource.");
        }
        return con;
    }
        
    
    public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
        Connection con = null;
        try { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            con = DriverManager.getConnection("jdbc:oracle:thin:@144.21.67.79:1533/omnipdb1.606532292.oraclecloud.internal", "xxpl_march", "Xxpl_Mar_30");
         } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return con;
    }
    
    /*
    * DB Initializer
    */
    
    public static void dbInitialization() throws SQLException, NamingException, ClassNotFoundException {
//        connection = getConnectionDS("PRISM_PL");
        connection=getDBConnection();     
    }

    
        public static void dbDestroy() throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
 
         public static String genericMailService(String p_receipt_Id ) {
        String xmlString = null;
        System.out.println("p_receipt_Id==>"+p_receipt_Id);
        try {
            dbInitialization();
            String sql = "select XXLEASE_REPORT_PKG.XXPL_RECEIPT_DETAIL_REPORT('"+ p_receipt_Id +"') xml from dual";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                xmlString = resultSet.getString("xml");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return xmlString;
        }
    }
          public static String renewalMailService(String P_BK_NO ) {
        String xmlString = null;
        System.out.println("p_receipt_Id==>"+P_BK_NO);
        try {
            dbInitialization();
            String sql = "select XXPL_NOTIFI_REPORT_PKG.XXPL_RENEWAL_NOTICE('"+ P_BK_NO +"') xml from dual";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                xmlString = resultSet.getString("xml");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return xmlString;
        }
    }
     
           public static String pdcMailService(String P_DATE ) {
        String xmlString = null;
        System.out.println("P_DATE==>"+P_DATE);
        try {
            dbInitialization();
            String sql = "select XXPL_NOTIFI_REPORT_PKG.XXPL_PDC_REMINDER('"+ P_DATE +"') xml from dual";
             System.out.println(sql);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                xmlString = resultSet.getString("xml");
                System.out.println(xmlString);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return xmlString;
        }
    }
            public static String comChargeMailService(String P_DATE ) {
        String xmlString = null;
        System.out.println("P_DATE==>"+P_DATE);
        try {
            dbInitialization();
            String sql = "select XXPL_NOTIFI_REPORT_PKG.XXPL_COMM_NOTIFI('"+ P_DATE +"') xml from dual";
             System.out.println(sql);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                xmlString = resultSet.getString("xml");
                System.out.println(xmlString);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return xmlString;
        }
    }
           
            public static String pmFeeMailService(String P_DATE ) {
        String xmlString = null;
        System.out.println("P_DATE==>"+P_DATE);
        try {
            dbInitialization();
            String sql = "select XXPL_NOTIFI_REPORT_PKG.XXPL_PMFEE_NOTIFI('"+ P_DATE +"') xml from dual";
             System.out.println(sql);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                xmlString = resultSet.getString("xml");
                System.out.println(xmlString);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return xmlString;
        }
    }
     //ccReceiptMailService
            
              public static String ccReceiptMailService(String P_BK_NO ) {
        String xmlString = null;
        System.out.println("p_receipt_Id==>"+P_BK_NO);
        try {
            dbInitialization();
            String sql = "select XXPL_NOTIFI_REPORT_PKG.XXPL_CC_RECEIPT('"+ P_BK_NO +"') xml from dual";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                xmlString = resultSet.getString("xml");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return xmlString;
        }
    }
    public static String getAddressFromLookup(String addressType) { 
        String toAddress = null;
        try {
            dbInitialization();
            String sql = null;
            sql = "SELECT LOOKUP_VALUE_NAME_DISP AS MAIl_ADDRESS FROM XXFND_LOOKUP_V WHERE LOOKUP_TYPE_NAME = 'AUTO_MAIL_ADDRESS' and LOOKUP_VALUE_NAME = '" + addressType +"'";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet != null) {
                while (resultSet.next()) {
                    toAddress = resultSet.getString("MAIl_ADDRESS") == null ? "" : resultSet.getString("MAIl_ADDRESS");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return toAddress;
        }
    }
    public static String cashCollectionMailService(String P_UNIT_ID ) {
        String xmlString = null;
        System.out.println("p_receipt_Id==>"+P_UNIT_ID);
        try {
            dbInitialization();
            String sql = "select XXPL_NOTIFI_REPORT_PKG.XXPL_CASH_COLLECTION('"+ P_UNIT_ID +"') xml from dual";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                xmlString = resultSet.getString("xml");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return xmlString;
        }
    }
    
    
    public static String MsMailService(String P_MS ) {
        String xmlString = null;
       // System.out.println("P_DATE==>"+P_DATE);
        try {
            dbInitialization();
            String sql = "select XXPL_NOTIFI_REPORT_PKG.XXPL_MS_NOTIFI('"+ P_MS +"') xml from dual";
             System.out.println(sql);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                xmlString = resultSet.getString("xml");
                System.out.println(xmlString);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return xmlString;
        }
    }
}
