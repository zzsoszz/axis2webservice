
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.unicom.vac.bossagent.soap.sync.req;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://rsp.sync.soap.bossagent.vac.unicom.com".equals(namespaceURI) &&
                  "OrderRelationUpdateNotifyResponse".equals(typeName)){
                   
                            return  com.unicom.vac.bossagent.soap.sync.rsp.OrderRelationUpdateNotifyResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://req.sync.soap.bossagent.vac.unicom.com".equals(namespaceURI) &&
                  "OrderRelationUpdateNotifyRequest".equals(typeName)){
                   
                            return  com.unicom.vac.bossagent.soap.sync.req.OrderRelationUpdateNotifyRequest.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    