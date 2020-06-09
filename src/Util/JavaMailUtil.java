/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author hocgioinhatlop
 */
public class JavaMailUtil {

    public static void sendMail(String nguoiNhan,String noidung) throws Exception {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.starttls.required", "true");
        String myAccountEmail = "ttphumail@gmail.com";
        String password = "aqqrynegtreaulbg";// pass aplication ko fai pass mail
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }

        });
       Message message= prepareMessage(session,myAccountEmail,nguoiNhan,noidung);
       Transport.send(message);
       System.out.print("message send success");
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String nguoiNhan, String noidung) {
        try {
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(nguoiNhan));
            message.setSubject("Mã xác nhận thi trắc nghiệm");
            message.setText("Bạn đang yêu cầu thay đổi mật khẩu, mã xác nhận của bạn là: "+noidung+" !!");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
