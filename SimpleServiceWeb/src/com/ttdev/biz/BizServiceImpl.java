package com.ttdev.biz;

import com.ttdev.biz.purchasing.InvalidProductId;
import com.ttdev.biz.purchasing.InvalidQty;
import com.ttdev.biz.purchasing.ProductQuery;
import com.ttdev.biz.purchasing.ProductQueryResult;
import com.ttdev.biz.purchasing.QueryItemComplexType;
import com.ttdev.biz.purchasing.ResultItemComplexType;

public class BizServiceImpl implements BizServiceSkeletonInterface {

	
	public ProductQueryResult query(ProductQuery productQuery) throws QueryInvalidQty, QueryInvalidProductId {
		ProductQueryResult result = new ProductQueryResult();
		QueryItemComplexType[] queryItems = productQuery.getQueryItem();
		for (int i = 0; i < queryItems.length; i++) {
			QueryItemComplexType queryItem = queryItems[i];
			if (!queryItem.getProductId().startsWith("p")) {
				QueryInvalidProductId fault = new QueryInvalidProductId();
				InvalidProductId part = new InvalidProductId();
				part.setInvalidProductId(queryItem.getProductId());
				fault.setFaultMessage(part);
				throw fault;
			}
			if (queryItem.getQty() <= 0) {
				QueryInvalidQty fault = new QueryInvalidQty();
				InvalidQty part = new InvalidQty();
				part.setInvalidQty(queryItem.getQty());
				fault.setFaultMessage(part);
				throw fault;
			}
			if (queryItem.getQty() <= 200) {
				ResultItemComplexType resultItem = new ResultItemComplexType();
				resultItem.setProductId(queryItem.getProductId());
				resultItem.setPrice(20);
				result.addResultItem(resultItem);
			}
		}
		return result;
	}
}
