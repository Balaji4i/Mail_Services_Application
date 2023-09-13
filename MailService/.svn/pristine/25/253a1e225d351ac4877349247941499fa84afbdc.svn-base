/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mail.rtf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.xml.parsers.ParserConfigurationException;
import oracle.xdo.XDOException;
import oracle.xdo.template.FOProcessor;
import oracle.xdo.template.RTFProcessor;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Priyanka
 */
@Path("generic")
public class GenericMailService {
     @Context
    private UriInfo context;
    DbPackageCall dbPackageCall = new DbPackageCall();

    

    /**
     * Creates a new instance of GenericMailService
     */
    public GenericMailService() {}
         @Path("/review")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response genericMailService(
           // @QueryParam(value = "P_BLOCK_NUM") String P_BLOCK_NUM,p_report_type 
           //  @QueryParam(value = "P_MAIL") String p_mail,
            @QueryParam(value = "p") String p_receipt_Id ,
           @QueryParam(value = "to") String toAdd ,
             @QueryParam(value = "P_File_Type") String P_File_Type)throws ParserConfigurationException, ParseException, SQLException{
        String fileName = "";
        if(P_File_Type.equals("pdf")){
        fileName = "HMO Review"+p_receipt_Id +".pdf";
        }
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(p_receipt_Id.split(",")));
//        System.out.println("p_receipt_Id-->"+p_receipt_Id);
//        System.out.println("myList-->"+myList);
//        System.out.println("myList 0 -->"+myList.get(0));
         String message=WebserviceProcess.otherChargeInvoice(myList,toAdd);
       return Response.ok().entity(message).build();
       
       
    }
    
     @Path("/renewal")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response renewalMailService(
           // @QueryParam(value = "P_BLOCK_NUM") String P_BLOCK_NUM,p_report_type 
           //  @QueryParam(value = "P_MAIL") String p_mail,
            @QueryParam(value = "book_id") String p_book_Id ,
           @QueryParam(value = "to") String toAdd ,
             @QueryParam(value = "P_File_Type") String P_File_Type)throws ParserConfigurationException, ParseException, SQLException{
        String fileName = "";
        if(P_File_Type.equals("pdf")){
        fileName = "Renewal"+ p_book_Id +".pdf";
        }
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(p_book_Id.split(",")));
        System.out.println("p_book_Id-->"+p_book_Id);
        System.out.println("myList-->"+myList);
        System.out.println("myList 0 -->"+myList.get(0));
         String message=WebserviceProcess.renewalMail(myList,toAdd);
       return Response.ok().entity(message).build();
       
       
    }
    
    
     @Path("/PDC")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response pdcMailService(
           // @QueryParam(value = "P_BLOCK_NUM") String P_BLOCK_NUM,p_report_type 
           //  @QueryParam(value = "P_MAIL") String p_mail,
            @QueryParam(value = "p_date") String P_DATE ,
           @QueryParam(value = "to") String toAdd ,
             @QueryParam(value = "P_File_Type") String P_File_Type)throws ParserConfigurationException, ParseException, SQLException{
        String fileName = "";
        if(P_File_Type.equals("pdf")){
        fileName = "Renewal"+ P_DATE +".pdf";
        }
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(P_DATE.split(",")));
        System.out.println("P_DATE-->"+P_DATE);
        System.out.println("myList-->"+myList);
        System.out.println("myList 0 -->"+myList.get(0));
         String message=WebserviceProcess.pdccMail(myList,toAdd);
       return Response.ok().entity(message).build();
       
       
    }
    
    
    
     @Path("/CommunityCharge")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response communityChargeMailService(
           // @QueryParam(value = "P_BLOCK_NUM") String P_BLOCK_NUM,p_report_type 
           //  @QueryParam(value = "P_MAIL") String p_mail,
            @QueryParam(value = "p_date") String P_DATE ,
           @QueryParam(value = "to") String toAdd ,
             @QueryParam(value = "P_File_Type") String P_File_Type)throws ParserConfigurationException, ParseException, SQLException{
        String fileName = "";
        if(P_File_Type.equals("pdf")){
        fileName = "Community Charge"+ P_DATE +".pdf";
        }
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(P_DATE.split(",")));
        System.out.println("P_DATE-->"+P_DATE);
        System.out.println("myList-->"+myList);
        System.out.println("myList 0 -->"+myList.get(0));
         String message=WebserviceProcess.communityChargeMail(myList,toAdd);
       return Response.ok().entity(message).build();
       
       
    }
    
     @Path("/pmFee")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response pmFeeMailService(
           // @QueryParam(value = "P_BLOCK_NUM") String P_BLOCK_NUM,p_report_type 
           //  @QueryParam(value = "P_MAIL") String p_mail,
            @QueryParam(value = "p_date") String P_DATE ,
           @QueryParam(value = "to") String toAdd ,
             @QueryParam(value = "P_File_Type") String P_File_Type)throws ParserConfigurationException, ParseException, SQLException{
        String fileName = "";
        if(P_File_Type.equals("pdf")){
        fileName = "PM Fee"+ P_DATE +".pdf";
        }
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(P_DATE.split(",")));
        System.out.println("P_DATE-->"+P_DATE);
        System.out.println("myList-->"+myList);
        System.out.println("myList 0 -->"+myList.get(0));
         String message=WebserviceProcess.pmFeeMail(myList,toAdd);
       return Response.ok().entity(message).build();
       
       
    }
    
      @Path("/ccReceipt")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response ccReceiptMailService(
           // @QueryParam(value = "P_BLOCK_NUM") String P_BLOCK_NUM,p_report_type 
           //  @QueryParam(value = "P_MAIL") String p_mail,
          @QueryParam(value = "book_id") String p_book_Id ,
           @QueryParam(value = "to") String toAdd ,
             @QueryParam(value = "P_File_Type") String P_File_Type)throws ParserConfigurationException, ParseException, SQLException{
        String fileName = "";
        if(P_File_Type.equals("pdf")){
        fileName = "Booking Number"+ p_book_Id +".pdf";
        }
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(p_book_Id.split(",")));
        System.out.println("p_book_Id-->"+p_book_Id);
        System.out.println("myList-->"+myList);
        System.out.println("myList 0 -->"+myList.get(0));
         String message=WebserviceProcess.ccReceiptMailService(myList,toAdd);
       return Response.ok().entity(message).build();
    }
    
     @Path("/cashCollection")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response cashCollectionMailService(
           // @QueryParam(value = "P_BLOCK_NUM") String P_BLOCK_NUM,p_report_type 
           //  @QueryParam(value = "P_MAIL") String p_mail,
          @QueryParam(value = "unit_id") String p_unit_Id ,
           @QueryParam(value = "to") String toAdd ,
             @QueryParam(value = "P_File_Type") String P_File_Type)throws ParserConfigurationException, ParseException, SQLException{
        String fileName = "";
        if(P_File_Type.equals("pdf")){
        fileName = "Booking Number"+ p_unit_Id +".pdf";
        }
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(p_unit_Id.split(",")));
        System.out.println("p_unit_Id-->"+p_unit_Id);
        System.out.println("myList-->"+myList);
        System.out.println("myList 0 -->"+myList.get(0));
         String message=WebserviceProcess.cashCollectiontMailService(myList,toAdd);
       return Response.ok().entity(message).build();
    }
    
     @Path("/MS")
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response MSMailService(
           // @QueryParam(value = "P_BLOCK_NUM") String P_BLOCK_NUM,p_report_type 
           //  @QueryParam(value = "P_MAIL") String p_mail,
         @QueryParam(value = "MS_id") String MS_id,
           @QueryParam(value = "to") String toAdd ,
             @QueryParam(value = "P_File_Type") String P_File_Type)throws ParserConfigurationException, ParseException, SQLException{
        String fileName = "";
        if(P_File_Type.equals("pdf")){
        fileName = "Booking Number"+ MS_id +".pdf";
        }
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(MS_id.split(",")));
        System.out.println("P_DATE-->"+MS_id);
        System.out.println("myList-->"+myList);
        System.out.println("myList 0 -->"+myList.get(0));
         String message=WebserviceProcess.MsMailService(myList,toAdd);
       return Response.ok().entity(message).build();
    }
    
   
    
}
