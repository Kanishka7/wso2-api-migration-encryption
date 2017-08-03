package org.wso2.carbon.api.migration.encryption;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil;


/*
    Service class for encrypting in migration
 */
public class APIMigrationEncryptionServiceComponent {

    public static final Log log = LogFactory.getLog(APIMigrationEncryptionServiceComponent.class);

    protected void activate(ComponentContext context) {

        log.error("*********************EXECUTED*************************************************************");
//        try {
//            APIMgtDBUtil.initialize();
//        } catch (Exception e) {
//            //APIMgtDBUtil.initialize() throws generic exception
//            log.error("Error occurred while initializing DB Util ", e);
//        }


    }


}
