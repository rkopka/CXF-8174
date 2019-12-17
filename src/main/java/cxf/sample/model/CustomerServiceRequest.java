package cxf.sample.model;

public class CustomerServiceRequest extends BaseRequest {

    private int customerId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
