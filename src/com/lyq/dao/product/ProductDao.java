package com.lyq.dao.product;

import java.util.List;

import com.lyq.dao.BaseDao;
import com.lyq.model.product.ProductInfo;

public interface ProductDao extends BaseDao<ProductInfo>{
	public List<ProductInfo> findCommend();//查询推荐商品的前10件，按上架时间降序排序
	public List<ProductInfo> findClickcount();//查询点击排名前10个商品
	public List<ProductInfo> findSellCount();//查询人气最好的前10件商品
}
