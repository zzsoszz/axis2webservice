/**
 * SmsNotificationServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.bxtel.dxgx.webservice;

/**
 * SmsNotificationServiceSkeleton java skeleton for the axisService
 */
public class SmsNotificationServiceSkeleton implements
		SmsNotificationServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param notifySmsDeliveryReceipt0
	 * @return notifySmsDeliveryReceiptResponse1
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
	 * @return notifySmsReceptionResponse3
	 */

	public cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponseE notifySmsReception(
			cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionE notifySmsReception2) {
		System.out.println(notifySmsReception2.getNotifySmsReception().getMessage().getSenderAddress());
		System.out.println(notifySmsReception2.getNotifySmsReception().getMessage().getSmsServiceActivationNumber());
		System.out.println(notifySmsReception2.getNotifySmsReception().getMessage().getMessage());
		System.out.println(notifySmsReception2.getNotifySmsReception().getRegistrationIdentifier());
		cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponseE resp=new cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponseE();
		cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponse param=new cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponse();
		resp.setNotifySmsReceptionResponse(param);
		return resp;
	}

}
