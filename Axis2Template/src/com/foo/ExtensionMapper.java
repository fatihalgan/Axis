
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:41 LKT)
 */

            package com.foo;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://bar.org/purchasing".equals(namespaceURI) &&
                  "queryItemType".equals(typeName)){
                   
                            return  bar.org.QueryItemType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bar.org/purchasing".equals(namespaceURI) &&
                  "resultItemType".equals(typeName)){
                   
                            return  bar.org.ResultItemType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    