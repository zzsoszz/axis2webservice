
/**
 * OrderRelationUpdateNotifyReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.chinatelecom.ismp.sp.req;
            

            /**
            *  OrderRelationUpdateNotifyReq bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class OrderRelationUpdateNotifyReq
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = OrderRelationUpdateNotifyReq
                Namespace URI = http://req.sp.ismp.chinatelecom.com
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for OPType
                        */

                        
                                    protected int localOPType ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOPType(){
                               return localOPType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OPType
                               */
                               public void setOPType(int param){
                            
                                            this.localOPType=param;
                                    

                               }
                            

                        /**
                        * field for PackageID
                        */

                        
                                    protected java.lang.String localPackageID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackageIDTracker = false ;

                           public boolean isPackageIDSpecified(){
                               return localPackageIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPackageID(){
                               return localPackageID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackageID
                               */
                               public void setPackageID(java.lang.String param){
                            localPackageIDTracker = true;
                                   
                                            this.localPackageID=param;
                                    

                               }
                            

                        /**
                        * field for OldPackageID
                        */

                        
                                    protected java.lang.String localOldPackageID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOldPackageIDTracker = false ;

                           public boolean isOldPackageIDSpecified(){
                               return localOldPackageIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOldPackageID(){
                               return localOldPackageID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OldPackageID
                               */
                               public void setOldPackageID(java.lang.String param){
                            localOldPackageIDTracker = true;
                                   
                                            this.localOldPackageID=param;
                                    

                               }
                            

                        /**
                        * field for ProductID
                        */

                        
                                    protected java.lang.String localProductID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductIDTracker = false ;

                           public boolean isProductIDSpecified(){
                               return localProductIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProductID(){
                               return localProductID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProductID
                               */
                               public void setProductID(java.lang.String param){
                            localProductIDTracker = true;
                                   
                                            this.localProductID=param;
                                    

                               }
                            

                        /**
                        * field for OldProductID
                        */

                        
                                    protected java.lang.String localOldProductID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOldProductIDTracker = false ;

                           public boolean isOldProductIDSpecified(){
                               return localOldProductIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOldProductID(){
                               return localOldProductID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OldProductID
                               */
                               public void setOldProductID(java.lang.String param){
                            localOldProductIDTracker = true;
                                   
                                            this.localOldProductID=param;
                                    

                               }
                            

                        /**
                        * field for StreamingNo
                        */

                        
                                    protected java.lang.String localStreamingNo ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreamingNo(){
                               return localStreamingNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreamingNo
                               */
                               public void setStreamingNo(java.lang.String param){
                            
                                            this.localStreamingNo=param;
                                    

                               }
                            

                        /**
                        * field for UserID
                        */

                        
                                    protected java.lang.String localUserID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserID(){
                               return localUserID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserID
                               */
                               public void setUserID(java.lang.String param){
                            
                                            this.localUserID=param;
                                    

                               }
                            

                        /**
                        * field for UserIDType
                        */

                        
                                    protected int localUserIDType ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getUserIDType(){
                               return localUserIDType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserIDType
                               */
                               public void setUserIDType(int param){
                            
                                            this.localUserIDType=param;
                                    

                               }
                            

                        /**
                        * field for VerUserID
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localVerUserID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVerUserIDTracker = false ;

                           public boolean isVerUserIDSpecified(){
                               return localVerUserIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getVerUserID(){
                               return localVerUserID;
                           }

                           
                        


                               
                              /**
                               * validate the array for VerUserID
                               */
                              protected void validateVerUserID(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param VerUserID
                              */
                              public void setVerUserID(java.lang.String[] param){
                              
                                   validateVerUserID(param);

                               localVerUserIDTracker = true;
                                      
                                      this.localVerUserID=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addVerUserID(java.lang.String param){
                                   if (localVerUserID == null){
                                   localVerUserID = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localVerUserIDTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localVerUserID);
                               list.add(param);
                               this.localVerUserID =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://req.sp.ismp.chinatelecom.com");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":OrderRelationUpdateNotifyReq",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "OrderRelationUpdateNotifyReq",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://req.sp.ismp.chinatelecom.com";
                                    writeStartElement(null, namespace, "OPType", xmlWriter);
                             
                                               if (localOPType==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("OPType cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOPType));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localPackageIDTracker){
                                    namespace = "http://req.sp.ismp.chinatelecom.com";
                                    writeStartElement(null, namespace, "packageID", xmlWriter);
                             

                                          if (localPackageID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPackageID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOldPackageIDTracker){
                                    namespace = "http://req.sp.ismp.chinatelecom.com";
                                    writeStartElement(null, namespace, "oldPackageID", xmlWriter);
                             

                                          if (localOldPackageID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOldPackageID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProductIDTracker){
                                    namespace = "http://req.sp.ismp.chinatelecom.com";
                                    writeStartElement(null, namespace, "productID", xmlWriter);
                             

                                          if (localProductID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProductID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOldProductIDTracker){
                                    namespace = "http://req.sp.ismp.chinatelecom.com";
                                    writeStartElement(null, namespace, "oldProductID", xmlWriter);
                             

                                          if (localOldProductID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOldProductID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://req.sp.ismp.chinatelecom.com";
                                    writeStartElement(null, namespace, "streamingNo", xmlWriter);
                             

                                          if (localStreamingNo==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStreamingNo);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://req.sp.ismp.chinatelecom.com";
                                    writeStartElement(null, namespace, "userID", xmlWriter);
                             

                                          if (localUserID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://req.sp.ismp.chinatelecom.com";
                                    writeStartElement(null, namespace, "userIDType", xmlWriter);
                             
                                               if (localUserIDType==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("userIDType cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserIDType));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localVerUserIDTracker){
                             if (localVerUserID!=null) {
                                   namespace = "http://req.sp.ismp.chinatelecom.com";
                                   for (int i = 0;i < localVerUserID.length;i++){
                                        
                                            if (localVerUserID[i] != null){
                                        
                                                writeStartElement(null, namespace, "VerUserID", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVerUserID[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://req.sp.ismp.chinatelecom.com";
                                                            writeStartElement(null, namespace, "VerUserID", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://req.sp.ismp.chinatelecom.com", "VerUserID", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://req.sp.ismp.chinatelecom.com")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                      "OPType"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOPType));
                             if (localPackageIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                      "packageID"));
                                 
                                         elementList.add(localPackageID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageID));
                                    } if (localOldPackageIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                      "oldPackageID"));
                                 
                                         elementList.add(localOldPackageID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOldPackageID));
                                    } if (localProductIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                      "productID"));
                                 
                                         elementList.add(localProductID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProductID));
                                    } if (localOldProductIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                      "oldProductID"));
                                 
                                         elementList.add(localOldProductID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOldProductID));
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                      "streamingNo"));
                                 
                                         elementList.add(localStreamingNo==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreamingNo));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                      "userID"));
                                 
                                         elementList.add(localUserID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserID));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                      "userIDType"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserIDType));
                             if (localVerUserIDTracker){
                            if (localVerUserID!=null){
                                  for (int i = 0;i < localVerUserID.length;i++){
                                      
                                         if (localVerUserID[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                              "VerUserID"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVerUserID[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                              "VerUserID"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com",
                                                                              "VerUserID"));
                                    elementList.add(null);
                                
                            }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static OrderRelationUpdateNotifyReq parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            OrderRelationUpdateNotifyReq object =
                new OrderRelationUpdateNotifyReq();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"OrderRelationUpdateNotifyReq".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (OrderRelationUpdateNotifyReq)com.chinatelecom.ismp.sp.req.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","OPType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"OPType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOPType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","packageID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPackageID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","oldPackageID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOldPackageID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","productID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProductID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","oldProductID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOldProductID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","streamingNo").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStreamingNo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","userID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","userIDType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"userIDType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserIDType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","VerUserID").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list9.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list9.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone9 = false;
                                            while(!loopDone9){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone9 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://req.sp.ismp.chinatelecom.com","VerUserID").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list9.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list9.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone9 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setVerUserID((java.lang.String[])
                                                        list9.toArray(new java.lang.String[list9.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    