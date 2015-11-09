D:\bxdev\trunck\tool\axis2-1.5.4\bin\dxgx
wsdl2java -uri IsmpSpEngine.wsdl   -p com.bxtel.dxgx.webservice  -d adb -s -ss -sd -ssi -o build\service
cd build\service

http://127.0.0.1:9001/axiswebservice/services/IsmpSpEngineService?wsdl
http://119.254.84.182:9071/axiswebservice/services/IsmpSpEngineService?wsdl
select * from bx_data_dx_gx_dg_t











/**
 * IsmpSpEngineServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */
package com.bxtel.dxgx.webservice;
import java.util.Arrays;
import org.apache.axis2.extensions.spring.receivers.ApplicationContextHolder;
import org.jsoup.helper.StringUtil;
import com.bxtel.bxdatadxgxdg.bo.BxDataDxGxDgTBO;
import com.bxtel.bxdatadxgxdg.model.BxDataDxGxDgT;
import com.bxtel.exception.BusinessException;
import com.chinatelecom.ismp.sp.rsp.NotifyManagementInfoRsp;
import com.chinatelecom.ismp.sp.rsp.Response;

import dinamica.util.DateHelper;

/**
 * 广西电信
 * IsmpSpEngineServiceSkeleton java skeleton for the axisService
 */
public class IsmpSpEngineServiceSkeleton implements
		IsmpSpEngineServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 订购关系更新通知
	 * @param orderRelationUpdateNotifyReq0
	 */

	public com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn orderRelationUpdateNotify(
			com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReqE orderRelationUpdateNotifyReq0) {
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
		model.setVeruserid(StringUtil.join(Arrays.asList(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getVerUserID()), ","));
		model.setCreatedate(DateHelper.getTime());
		com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn resp=new com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn();
		Response param=new Response();
		try {
			dxgxbo.add(model);
			param.setStreamingNo(orderRelationUpdateNotifyReq0.getOrderRelationUpdateNotifyReq().getStreamingNo());
			param.setResultCode(0);
		}catch(BusinessException e) {
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
	 */

	public com.chinatelecom.ismp.sp.SpWithdrawSubscriptionReturn spWithdrawSubscription(
			com.chinatelecom.ismp.sp.SpWithdrawSubscriptionReqPara spWithdrawSubscriptionReqPara2) {
			spWithdrawSubscriptionReqPara2.getSpWithdrawSubscriptionReqPara().getID();
			spWithdrawSubscriptionReqPara2.getSpWithdrawSubscriptionReqPara().getIDType();
			spWithdrawSubscriptionReqPara2.getSpWithdrawSubscriptionReqPara().getSPAdmin();
			spWithdrawSubscriptionReqPara2.getSpWithdrawSubscriptionReqPara().getSPAdminPwd();
			spWithdrawSubscriptionReqPara2.getSpWithdrawSubscriptionReqPara().getSPID();
			spWithdrawSubscriptionReqPara2.getSpWithdrawSubscriptionReqPara().getStreamingNo();
			spWithdrawSubscriptionReqPara2.getSpWithdrawSubscriptionReqPara().getUserID();
			
			com.chinatelecom.ismp.sp.SpWithdrawSubscriptionReturn resp=new com.chinatelecom.ismp.sp.SpWithdrawSubscriptionReturn();
			Response param=new Response();
			param.setStreamingNo(spWithdrawSubscriptionReqPara2.getSpWithdrawSubscriptionReqPara().getStreamingNo());
			param.setResultCode(0);
			resp.setSpWithdrawSubscriptionReturn(param);
			return resp;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param serviceConsumeNotifyReqPara4
	 */

	public com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn serviceConsumeNotify(
			com.chinatelecom.ismp.sp.ServiceConsumeNotifyReqPara serviceConsumeNotifyReqPara4) {
		serviceConsumeNotifyReqPara4.getServiceConsumeNotifyReqPara().getFeatureStr();
		serviceConsumeNotifyReqPara4.getServiceConsumeNotifyReqPara().getLinkID();
		serviceConsumeNotifyReqPara4.getServiceConsumeNotifyReqPara().getProductID();
		serviceConsumeNotifyReqPara4.getServiceConsumeNotifyReqPara().getStreamingNo();
		serviceConsumeNotifyReqPara4.getServiceConsumeNotifyReqPara().getUserID();
		serviceConsumeNotifyReqPara4.getServiceConsumeNotifyReqPara().getUserIDType();
		
		
		
		
		com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn resp=new com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn();
		Response param=new Response();
		param.setResultCode(0);
		param.setStreamingNo(serviceConsumeNotifyReqPara4.getServiceConsumeNotifyReqPara().getStreamingNo());
		resp.setServiceConsumeNotifyReturn(param);
		return resp;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param notifyManagementInfoReq6
	 */

	public com.chinatelecom.ismp.sp.NotifyManagementInfoReturn notifyManagementInfo(
			com.chinatelecom.ismp.sp.NotifyManagementInfoReqE notifyManagementInfoReq6) {
		// TODO : fill this with the necessary business logic
		notifyManagementInfoReq6.getNotifyManagementInfoReq().getID();
		notifyManagementInfoReq6.getNotifyManagementInfoReq().getIDType();
		notifyManagementInfoReq6.getNotifyManagementInfoReq().getStreamingNo();
		notifyManagementInfoReq6.getNotifyManagementInfoReq().getStatus();
		
		com.chinatelecom.ismp.sp.NotifyManagementInfoReturn resp=new com.chinatelecom.ismp.sp.NotifyManagementInfoReturn();
		NotifyManagementInfoRsp param=new NotifyManagementInfoRsp();
		param.setStreamingNo(notifyManagementInfoReq6.getNotifyManagementInfoReq().getStreamingNo());
		param.setResultCode(0);
		resp.setNotifyManagementInfoReturn(param);
		return resp;
	}

}




---------------------


wsdl2java -uri ctcc_sms_notification_service_2_1.wsdl   -p com.bxtel.dxgx.webservice  -d adb -s -ss -sd -ssi -o build\service

SmsNotificationServiceSkeleton

	/**
	 * Auto generated method signature
	 * @param notifySmsDeliveryReceipt0
	 */
	
	public cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsDeliveryReceiptResponseE notifySmsDeliveryReceipt(
			cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsDeliveryReceiptE notifySmsDeliveryReceipt0) {
		System.out.println(notifySmsDeliveryReceipt0.getNotifySmsDeliveryReceipt().getCorrelator());
		System.out.println(notifySmsDeliveryReceipt0.getNotifySmsDeliveryReceipt().getDeliveryStatus().getDeliveryStatus());
		cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsDeliveryReceiptResponseE resp=new cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsDeliveryReceiptResponseE();
		cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsDeliveryReceiptResponse param=new cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsDeliveryReceiptResponse();
		resp.setNotifySmsDeliveryReceiptResponse(param);
		return resp;
	}
	
	/**
	 * Auto generated method signature
	 * 
	 * @param notifySmsReception2
	 */
	public cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponseE notifySmsReception(cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionE notifySmsReception2) {
		System.out.println(notifySmsReception2.getNotifySmsReception().getMessage().getSenderAddress());
		System.out.println(notifySmsReception2.getNotifySmsReception().getMessage().getSmsServiceActivationNumber());
		System.out.println(notifySmsReception2.getNotifySmsReception().getMessage().getMessage());
		System.out.println(notifySmsReception2.getNotifySmsReception().getRegistrationIdentifier());
		cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponseE resp=new cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponseE();
		cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponse param=new cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponse();
		resp.setNotifySmsReceptionResponse(param);
		return resp;
	}




----------------------短信发送客户端
wsdl2java -uri  ctcc_sms_send_service_2_1.wsdl   -p com.bxtel.dxgx.webservice  -d adb -s -o build\service
