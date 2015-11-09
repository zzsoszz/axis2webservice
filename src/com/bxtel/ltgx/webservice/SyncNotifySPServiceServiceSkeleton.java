/**
 * SyncNotifySPServiceServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.bxtel.ltgx.webservice;

import org.apache.axis2.extensions.spring.receivers.ApplicationContextHolder;

import com.bxtel.bxdataltgxdg.bo.BxDataLtGxDgTBO;
import com.bxtel.bxdataltgxdg.model.BxDataLtGxDgT;
import com.bxtel.exception.BusinessException;
import com.unicom.vac.bossagent.soap.sync.rsp.OrderRelationUpdateNotifyResponse;

/**
 * SyncNotifySPServiceServiceSkeleton java skeleton for the axisService
 */
public class SyncNotifySPServiceServiceSkeleton implements
		SyncNotifySPServiceServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param orderRelationUpdateNotify0
	 * @return orderRelationUpdateNotifyResponse1
	 */

	public com.unicom.vac.bossagent.soap.OrderRelationUpdateNotifyResponse orderRelationUpdateNotify(
			com.unicom.vac.bossagent.soap.OrderRelationUpdateNotify orderRelationUpdateNotify0) {
		com.unicom.vac.bossagent.soap.OrderRelationUpdateNotifyResponse resp = new com.unicom.vac.bossagent.soap.OrderRelationUpdateNotifyResponse();
		BxDataLtGxDgTBO ltgxbo = ApplicationContextHolder.getContext().getBean(com.bxtel.bxdataltgxdg.bo.BxDataLtGxDgTBO.class);
		BxDataLtGxDgT model = new BxDataLtGxDgT();
		try {
			model.setRecordsequenceid(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getRecordSequenceId().toString());
			model.setUseridtype(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getUserIdType().toString());
			model.setUserid(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getUserId().toString());
			model.setServicetype(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getServiceType().toString());
			model.setSpid(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest().getSpId()
					.toString());
			model.setProductid(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getProductId().toString());
			model.setUpdatetype(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getUpdateType().toString());
			model.setUpdatetime(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getUpdateTime().toString());
			model.setUpdatedesc(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getUpdateDesc().toString());
			model.setLinkid(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getLinkId().toString());
			model.setVcontent(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getContent().toString());
			model.setEffectivedate(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getEffectiveDate().toString());
			model.setExpiredate(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getExpireDate().toString());
			model.setVtimestamp(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getTime_stamp().toString());
			model.setEncodestr(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getEncodeStr().toString());
			model = ltgxbo.add(model);

			com.unicom.vac.bossagent.soap.sync.rsp.OrderRelationUpdateNotifyResponse param = new com.unicom.vac.bossagent.soap.sync.rsp.OrderRelationUpdateNotifyResponse();
			param.setRecordSequenceId(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest().getRecordSequenceId());
			param.setResultCode(0);
			resp.setOrderRelationUpdateNotifyReturn(param);
		} catch (BusinessException e) {
			OrderRelationUpdateNotifyResponse param = new OrderRelationUpdateNotifyResponse();
			param.setRecordSequenceId(orderRelationUpdateNotify0.getOrderRelationUpdateNotifyRequest()
					.getRecordSequenceId());
			param.setResultCode(1);
			resp.setOrderRelationUpdateNotifyReturn(param);
			e.printStackTrace();
		}
		return resp;
	}

}
