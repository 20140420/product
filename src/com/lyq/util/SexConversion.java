package com.lyq.util;

import java.util.Map;
import ognl.DefaultTypeConverter;
import org.apache.struts2.util.StrutsTypeConverter;
import java.util.List;
import java.util.ArrayList;

import com.lyq.model.Sex;
/**
 * �Ա�����ת����
 * @author Li Yongqiang
 */
public class SexConversion extends StrutsTypeConverter {
	
	//����Ƕ������飬���ڣ�����ȶ����������������
	@SuppressWarnings("unchecked")
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		//�Ѵ����һ���ַ���������һ������Ȼ�󷵻ظ���Ӧ���ֶΡ�
		Sex sexs[] = Sex.values();
		for (Sex sex : sexs) {
			if(sex.getName().equals(arg1[0])){
				System.out.println("OK~~��������ɣ����ض���");
				return sex;
			}
		}
		return null;
	}
	
	//�����name ��Ӧ�� java�ֶ�  ֻ���ַ���
	@SuppressWarnings("unchecked")
	@Override
	public String convertToString(Map arg0, Object arg1) {
		Sex sex = (Sex) arg1;
		return sex.getName();
	}
}
