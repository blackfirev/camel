/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.sns;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Sns2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.aws2.sns.Sns2Configuration getOrCreateConfiguration(Sns2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.sns.Sns2Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Sns2Component target = (Sns2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsnsclient":
        case "amazonSNSClient": getOrCreateConfiguration(target).setAmazonSNSClient(property(camelContext, software.amazon.awssdk.services.sns.SnsClient.class, value)); return true;
        case "autocreatetopic":
        case "autoCreateTopic": getOrCreateConfiguration(target).setAutoCreateTopic(property(camelContext, boolean.class, value)); return true;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": getOrCreateConfiguration(target).setKmsMasterKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "messagestructure":
        case "messageStructure": getOrCreateConfiguration(target).setMessageStructure(property(camelContext, java.lang.String.class, value)); return true;
        case "policy": getOrCreateConfiguration(target).setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "queueurl":
        case "queueUrl": getOrCreateConfiguration(target).setQueueUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": getOrCreateConfiguration(target).setServerSideEncryptionEnabled(property(camelContext, boolean.class, value)); return true;
        case "subject": getOrCreateConfiguration(target).setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "subscribesnstosqs":
        case "subscribeSNStoSQS": getOrCreateConfiguration(target).setSubscribeSNStoSQS(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.sns.Sns2Configuration.class, value)); return true;
        default: return false;
        }
    }

}
