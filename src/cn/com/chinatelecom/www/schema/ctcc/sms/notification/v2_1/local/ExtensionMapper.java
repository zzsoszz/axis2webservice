
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local".equals(namespaceURI) &&
                  "notifySmsReception".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/common/v2_1".equals(namespaceURI) &&
                  "RequestSOAPHeader".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.common.v2_1.RequestSOAPHeader.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/common/v2_1".equals(namespaceURI) &&
                  "EndReason".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.common.v2_1.EndReason.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/sms/v2_1".equals(namespaceURI) &&
                  "DeliveryStatus".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.sms.v2_1.DeliveryStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/common/v2_1".equals(namespaceURI) &&
                  "NotifySOAPHeader".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.common.v2_1.NotifySOAPHeader.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local".equals(namespaceURI) &&
                  "notifySmsDeliveryReceipt".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsDeliveryReceipt.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local".equals(namespaceURI) &&
                  "notifySmsReceptionResponse".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsReceptionResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/common/v2_1".equals(namespaceURI) &&
                  "ServiceException".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.common.v2_1.ServiceException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/sms/v2_1".equals(namespaceURI) &&
                  "DeliveryInformation".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.sms.v2_1.DeliveryInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/sms/v2_1".equals(namespaceURI) &&
                  "SmsMessage".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.sms.v2_1.SmsMessage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/common/v2_1".equals(namespaceURI) &&
                  "PolicyException".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.common.v2_1.PolicyException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.chinatelecom.com.cn/schema/ctcc/sms/notification/v2_1/local".equals(namespaceURI) &&
                  "notifySmsDeliveryReceiptResponse".equals(typeName)){
                   
                            return  cn.com.chinatelecom.www.schema.ctcc.sms.notification.v2_1.local.NotifySmsDeliveryReceiptResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    