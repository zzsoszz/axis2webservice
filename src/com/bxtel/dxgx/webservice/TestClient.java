//package com.bxtel.dxgx.webservice;
//
//import java.math.BigDecimal;
//
//import java.rmi.RemoteException;
//import org.apache.axiom.om.OMAbstractFactory;
//import org.apache.axiom.om.OMFactory;
//import org.apache.axiom.om.OMNamespace;
//import org.apache.axiom.soap.SOAPFactory;
//import org.apache.axiom.soap.SOAPHeaderBlock;
//import org.apache.axis2.client.ServiceClient;
//import org.apache.axis2.databinding.types.URI;
//import org.apache.axis2.databinding.types.URI.MalformedURIException;
//
//import com.bxtel.dxgx.webservice.SendSmsServiceStub.ChargingInformation;
//import com.bxtel.dxgx.webservice.SendSmsServiceStub.SendSms;
//import com.bxtel.dxgx.webservice.SendSmsServiceStub.SendSmsE;
//import com.bxtel.dxgx.webservice.SendSmsServiceStub.SimpleReference;
//
//
//import dinamica.util.DateHelper;
//
//public class TestClient {
//	
//	 
//	public static void main(String[] args) throws RemoteException, PolicyException, ServiceException, MalformedURIException {
//	    OMFactory oMFactory = OMAbstractFactory.getOMFactory();  
//	    SOAPFactory sOAPFactory = OMAbstractFactory.getSOAP11Factory();  
//		SendSmsServiceStub ss=new SendSmsServiceStub();
//		SendSmsE sendSms=new SendSmsE();
//		SendSms param=new SendSms();
//		URI[] uri=new URI[1];
//		uri[0]=new URI("tel:+8613730666347");
//		param.setAddresses(uri);
//		ChargingInformation charg=new ChargingInformation();
//		BigDecimal dd=new BigDecimal(0);
//		charg.setAmount(dd);
//		param.setCharging(charg);
//		param.setMessage("sss");
//		param.setSenderName("114");
//		SimpleReference receiptRequest = new SimpleReference(); 
//		receiptRequest.setCorrelator("1001559"); // 序号自己随机增加
//		receiptRequest.setInterfaceName("SmsNotificationService"); 
//		receiptRequest.setEndpoint(new URI("http://www.baidu.com"));
//		param.setReceiptRequest(receiptRequest);
//		sendSms.setSendSms(param);
//		
//		/*蒜苗回锅，鱼香茄子，11,22,
//		 *  Axis2用法（3）soap消息携带消息头
//		 * http://blog.csdn.net/yanghaitaohhh/article/details/17722841
//		 */
//		//SOAPHeaderElement SoapHeader = new SOAPHeaderElement("http://www.chinatelecom.com.cn/schema/ctcc/common/v2_1", "RequestSOAPHeader"); 
//		OMNamespace oMNamespace = oMFactory.createOMNamespace("http://www.chinatelecom.com.cn/schema/ctcc/common/v2_1", "RequestSOAPHeader");  
//        SOAPHeaderBlock header1 = sOAPFactory.createSOAPHeaderBlock("spId", oMNamespace);
//		header1.addChild(sOAPFactory.createOMText(DateHelper.getDateString("MMddHHmmss")));
//		
//		SOAPHeaderBlock header2 = sOAPFactory.createSOAPHeaderBlock("timeStamp", oMNamespace);
//		header2.addChild(sOAPFactory.createOMText(DateHelper.getDateString("MMddHHmmss")));
//		
//		SOAPHeaderBlock header3 = sOAPFactory.createSOAPHeaderBlock("spPassword", oMNamespace);
//		header2.addChild(sOAPFactory.createOMText(DateHelper.getDateString("MMddHHmmss")));
//		
//		SOAPHeaderBlock header4 = sOAPFactory.createSOAPHeaderBlock("productId", oMNamespace);
//		header2.addChild(sOAPFactory.createOMText(DateHelper.getDateString("MMddHHmmss")));
//		
//		SOAPHeaderBlock header5 = sOAPFactory.createSOAPHeaderBlock("OA", oMNamespace);
//		header2.addChild(sOAPFactory.createOMText(DateHelper.getDateString("MMddHHmmss")));
//		
//		SOAPHeaderBlock header6 = sOAPFactory.createSOAPHeaderBlock("FA", oMNamespace);
//		header2.addChild(sOAPFactory.createOMText(DateHelper.getDateString("MMddHHmmss")));
//		
//		SOAPHeaderBlock header7 = sOAPFactory.createSOAPHeaderBlock("multicastMessaging", oMNamespace);
//		header2.addChild(sOAPFactory.createOMText(DateHelper.getDateString("MMddHHmmss")));
//		
//		SOAPHeaderBlock header8 = sOAPFactory.createSOAPHeaderBlock("multicastMessaging", oMNamespace);
//		header2.addChild(sOAPFactory.createOMText(DateHelper.getDateString("MMddHHmmss")));
//		
//		
//		ServiceClient client = ss._getServiceClient();
//		client.addHeader(header1);
//		client.addHeader(header2);
//		client.addHeader(header3);
//		client.addHeader(header4);
//		client.addHeader(header5);
//		client.addHeader(header6);
//		client.addHeader(header7);
//		client.addHeader(header8);
//		ss.sendSms(sendSms);
//	}
//	
//	
//	
//	private static String FormatMsisdn(String msisdn) {
//		msisdn = msisdn.toLowerCase();
//		if ((msisdn.indexOf("+86") < 0) && (msisdn.indexOf("tel:") != 0)
//				&& (msisdn.length() == 11)) {
//			// 不带+86，不带tel:的手机号码
//			return "tel:+86" + msisdn;
//		}
//		if ((msisdn.indexOf("86") == 0) && (msisdn.indexOf("tel:") != 0)
//				&& (msisdn.length() == 13)) {
//			// 带86，不带+号，不带tel:的手机号码
//			return "tel:+" + msisdn;
//		}
//		return msisdn;
//	}
//
//}
