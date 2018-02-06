package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.videotron.esbcustomerinformationmanagement.customeraccount._2_0.GetCustomerAccountIn;
import com.videotron.esbcustomerinformationmanagement.customeraccount._2_0.GetCustomerAccountOut;

/**
 * Processor for processing the report incident.
 */
public class GetCustomerAccountProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        // get the id of the input
    	GetCustomerAccountIn customerAccountIn = exchange.getIn().getBody(GetCustomerAccountIn.class);
    	GetCustomerAccountOut customerAccountOut = new GetCustomerAccountOut();
    	
        
        exchange.getOut().setHeader("customerAccountNo", customerAccountIn.getCustomerAccountNo());
        exchange.getOut().setBody(customerAccountOut);
    }

}