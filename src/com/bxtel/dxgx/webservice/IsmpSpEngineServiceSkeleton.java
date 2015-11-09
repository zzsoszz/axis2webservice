/**
 * IsmpSpEngineServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.bxtel.dxgx.webservice;

import java.util.Arrays;


import org.apache.axis2.extensions.spring.receivers.ApplicationContextHolder;
import org.apache.commons.lang3.StringUtils;
import com.bxtel.bxdatadxgxdg.bo.BxDataDxGxDgTBO;
import com.bxtel.bxdatadxgxdg.model.BxDataDxGxDgT;
import com.bxtel.exception.BusinessException;
import dinamica.util.DateHelper;

/**
 * IsmpSpEngineServiceSkeleton java skeleton for the axisService
 */
public class IsmpSpEngineServiceSkeleton implements
		IsmpSpEngineServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param orderRelationUpdateNotifyReq0
	 * @return orderRelationUpdateNotifyReturn1
	 */

	public com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn orderRelationUpdateNotify(
			com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReq orderRelationUpdateNotifyReq0) {
		
		BxDataDxGxDgTBO dxgxbo=ApplicationContextHolder.getContext().getBean(com.bxtel.bxdatadxgxdg.bo.BxDataDxGxDgTBO.class);
		BxDataDxGxDgT model=new BxDataDxGxDgT();
		model.setOldpackageid(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getOldPackageID());
		model.setOldproductid(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getOldProductID());
		model.setOptype(new Integer(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getOPType()).toString());
		model.setPackageid(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getPackageID());
		model.setProductid(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getProductID());
		model.setStreamingno(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getStreamingNo());
		model.setUserid(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getUserID());
		model.setUseridtype(new Integer(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getUserIDType()).toString());
		model.setVeruserid(StringUtils.join(Arrays.asList(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getVerUserID()), ","));
		model.setCreatedate(DateHelper.getTime());
		com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn resp=new com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn();
		com.chinatelecom.ismp.sp.rsp.Response param=new com.chinatelecom.ismp.sp.rsp.Response();
		try {
			dxgxbo.add(model);
			param.setStreamingNo(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getStreamingNo());
			param.setResultCode(0);
		}
		catch(BusinessException e) 
		{
			e.printStackTrace();
			param.setStreamingNo(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getStreamingNo());
			param.setResultCode(99);
		}
		resp.setOrderRelationUpdateNotifyReturn(param);
		return resp;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param spWithdrawSubscriptionReqPara2
	 * @return spWithdrawSubscriptionReturn3
	 */

	public com.chinatelecom.ismp.sp.SpWithdrawSubscriptionReturn spWithdrawSubscription(
			com.chinatelecom.ismp.sp.SpWithdrawSubscriptionReqPara spWithdrawSubscriptionReqPara2) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#spWithdrawSubscription");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param serviceConsumeNotifyReqPara4
	 * @return serviceConsumeNotifyReturn5
	 */

	public com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn serviceConsumeNotify(
			com.chinatelecom.ismp.sp.ServiceConsumeNotifyReqPara serviceConsumeNotifyReqPara4) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#serviceConsumeNotify");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param notifyManagementInfoReq6
	 * @return notifyManagementInfoReturn7
	 */

	public com.chinatelecom.ismp.sp.NotifyManagementInfoReturn notifyManagementInfo(
			com.chinatelecom.ismp.sp.NotifyManagementInfoReq notifyManagementInfoReq6) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#notifyManagementInfo");
	}

}
