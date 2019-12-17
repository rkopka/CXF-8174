package cxf.sample.service;

import cxf.sample.model.BaseRequest;
import cxf.sample.model.BaseResponse;

public interface Service<REQ extends BaseRequest, RES extends BaseResponse> {

    RES process(REQ request);

}
