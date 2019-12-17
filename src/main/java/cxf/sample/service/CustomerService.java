package cxf.sample.service;

import cxf.sample.model.CustomerServiceRequest;
import cxf.sample.model.CustomerServiceResponse;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Validated
public interface CustomerService extends Service<CustomerServiceRequest, CustomerServiceResponse> {

    @Override
    @POST
    @Path("process")
    @Valid
    CustomerServiceResponse process(@Valid CustomerServiceRequest request);

}
