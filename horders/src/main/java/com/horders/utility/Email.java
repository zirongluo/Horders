package com.horders.utility;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
/**
 * -----------------------------------------
 * @�ļ�: Email.java
 * @����: fancy
 * @����: fancydeepin@yeah.net
 * @ʱ��: 2012-6-12
 * @����: ����Email������
 * -----------------------------------------
 */
public class Email {
    
    private JavaMailSender javaMailSender;
    private SimpleMailMessage simpleMailMessage;
    
  /**
     * @throws MessagingException 
 * @������: sendMail 
     * @��������@param subject �ʼ�����
     * @��������@param content �ʼ���������
     * @��������@param to        �ռ���Email��ַ
     * @������:  �����ʼ�
     */
    public void sendMail(String subject, String content, String to) throws MessagingException {
        
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
          /**
             * new MimeMessageHelper(mimeMessage,true)֮true���˼��⣺
             * ����true����,�ٷ��ĵ����������͵ģ�
             * use the true flag to indicate you need a multipart message
             * ����������ǣ�ʹ��true,�Ա�������Ҫ�����Ϣ
             * ��ȥ��һ��MimeMessageHelper��API,�ҵ�����һ�仰��
             * supporting alternative texts, inline elements and attachments
             * Ҳ����˵,���Ҫ֧������Ԫ�غ͸����ͱ�������ڶ�������Ϊtrue
             * �����׳� java.lang.IllegalStateException �쳣
             */
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);
            messageHelper.setFrom(simpleMailMessage.getFrom()); //���÷�����Email
            messageHelper.setSubject(subject); //�����ʼ�����
            messageHelper.setText(content);   //�����ʼ���������
            //messageHelper.setText("<html><body><img src='cid:identifier1234'></body></html>", true);
            messageHelper.setTo(to);          //�趨�ռ���Email
          /**
             * ClassPathResource�������Ծ�����·����Դ,������ĸ���������Ŀ���,������Ҫ��ClassPathResource
             * �����ϵͳ�ļ���Դ�Ͳ�����ClassPathResource,��Ҫ��FileSystemResource,����
             * FileSystemResource file = new FileSystemResource(new File("D:/Readme.txt"));
             */
            //ClassPathResource file = new ClassPathResource("attachment/Readme.txt");
          /**
             * MimeMessageHelper��addAttachment������
             * addAttachment(String attachmentFilename, InputStreamSource inputStreamSource)
             * InputStreamSource��һ���ӿ�,ClassPathResource��FileSystemResource��ʵ��������ӿ�
             */
            //messageHelper.addAttachment(file.getFilename(), file); //��Ӹ���
            javaMailSender.send(mimeMessage);    //���͸����ʼ�
            
    }
      //Spring ����ע��
    public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
        this.simpleMailMessage = simpleMailMessage;
    }
      //Spring ����ע��
    public void setJavaMailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
}