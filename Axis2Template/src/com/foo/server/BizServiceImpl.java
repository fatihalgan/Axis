package com.foo.server;

import java.util.ArrayList;
import java.util.Collection;

import bar.org.InvalidProductId;
import bar.org.InvalidQty;
import bar.org.QueryItemType;
import bar.org.ResultItemType;

public class BizServiceImpl implements BizServiceSkeletonInterface {

	@Override
	public ResultItemType[] query(QueryItemType[] queryItem)
			throws QueryInvalidQty, QueryInvalidProductId {
		Collection<ResultItemType> results = new ArrayList<ResultItemType>();
		for(int i = 0; i < queryItem.length; i++) {
			QueryItemType item = queryItem[i];
			if (!item.getProductId().startsWith("p")) {
				QueryInvalidProductId fault = new QueryInvalidProductId();
				InvalidProductId part = new InvalidProductId();
				part.setInvalidProductId(item.getProductId());
				fault.setFaultMessage(part);
				throw fault;
			}
			if (item.getQty() <= 0) {
				QueryInvalidQty fault = new QueryInvalidQty();
				InvalidQty part = new InvalidQty();
				part.setInvalidQty(item.getQty());
				fault.setFaultMessage(part);
				throw fault;
			}
			if(item.getQty() <= 200) {
				ResultItemType resultItem = new ResultItemType();
				resultItem.setProductId(item.getProductId());
				resultItem.setPrice(20);
				results.add(resultItem);
			}
		}
		return results.toArray(new ResultItemType[results.size()]);
	}

}
