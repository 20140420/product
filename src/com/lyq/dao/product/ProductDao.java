package com.lyq.dao.product;

import java.util.List;

import com.lyq.dao.BaseDao;
import com.lyq.model.product.ProductInfo;

public interface ProductDao extends BaseDao<ProductInfo>{
	public List<ProductInfo> findCommend();//��ѯ�Ƽ���Ʒ��ǰ10�������ϼ�ʱ�併������
	public List<ProductInfo> findClickcount();//��ѯ�������ǰ10����Ʒ
	public List<ProductInfo> findSellCount();//��ѯ������õ�ǰ10����Ʒ
}
