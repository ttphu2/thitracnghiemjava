/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Map;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author hocgioinhatlop
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
     public static Object[] buildNameQuery(Map<String,Object> property){
        StringBuilder nameQuery= new StringBuilder();
        if(property !=null && property.size()>0){
            String[] params=new String[property.size()];
            Object[] values=new Object[property.size()];
            int i=0;
            for(Map.Entry<String,Object> item: property.entrySet()){
                params[i]=item.getKey();
                values[i]=item.getValue();
                i++;
            }
            for(int i1=0;i1<params.length;i1++){
                nameQuery.append(" and ").append(" LOWER("+params[i1]+") LIKE '%' || :"+params[i1]+" || '%'");
                // || trong hQL là hàm nối chuỗi để bth hibernate sẽ ko hiểu dc
            }

            return new Object[]{nameQuery,params,values};
        }

        return new Object[]{nameQuery.toString()};
    }
}
