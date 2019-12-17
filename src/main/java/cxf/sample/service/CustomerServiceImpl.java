package cxf.sample.service;

import cxf.sample.model.CustomerServiceRequest;
import cxf.sample.model.CustomerServiceResponse;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerServiceResponse process(CustomerServiceRequest request) {
        CustomerServiceResponse customerServiceResponse = new CustomerServiceResponse();
        customerServiceResponse.setResponseId(request.getRequestId());
        return customerServiceResponse;
    }

}
