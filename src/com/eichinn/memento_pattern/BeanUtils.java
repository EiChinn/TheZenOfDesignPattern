package com.eichinn.memento_pattern;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by ei_chinn on 2016/11/5.
 */
public class BeanUtils {
    /**
     * 把bean的所有属性及数值放入到HashMap中
     *
     * @param bean
     * @return
     */
    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            //获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
           //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            //遍历所有属性
            for (PropertyDescriptor descriptor : descriptors) {
                //属性名称
                String fieldName = descriptor.getName();
                //读取属性的方法
                Method getter = descriptor.getReadMethod();
                //读取属性值
                Object fieldValue = getter.invoke(bean, new Object[]{});
                if (!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName, fieldValue);
                }
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 把HashMap的值返回到bean中
     * @param bean
     * @param propMap
     */
    public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
        try {
            //获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            //遍历所有属性
            for (PropertyDescriptor descriptor : descriptors) {
                //属性名称
                String fieldName = descriptor.getName();
                //如果有这个属性
                if (propMap.containsKey(fieldName)) {
                    //设置属性方法
                    Method setter = descriptor.getWriteMethod();
                    //设置属性值
                    setter.invoke(bean, new Object[]{propMap.get(fieldName)});
                }
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
