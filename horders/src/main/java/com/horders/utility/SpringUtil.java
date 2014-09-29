package com.horders.utility;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spring IOC�����Ĺ�����
 * 
 * @author Ryan Shaw
 * 
 */
public class SpringUtil implements ApplicationContextAware {

    /**
     * ��ǰIOC
     */
    private static ApplicationContext applicationContext;

    /**
     * ���õ�ǰ�����Ļ������˷�����spring�Զ�װ��
     */
    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        applicationContext = arg0;
    }

    /**
     * �ӵ�ǰIOC��ȡbean
     * 
     * @param id
     *            bean��id
     * @return
     */
    public static Object getObject(String id) {
        Object object = null;
        object = applicationContext.getBean(id);
        return object;
    }

}