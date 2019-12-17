package cxf.sample;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class CustomerServiceTest {

    @Test
    public void testCustomerService() throws IOException {
        HttpPost request = createRequest();
        HttpClient httpclient = new DefaultHttpClient();
        HttpResponse response = httpclient.execute(request);
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }



    private HttpPost createRequest() {
        HttpPost post = new HttpPost("http://localhost:15001/customer/process");
        String request = "{\"requestId\":\"1\", \"customerId\":\"2\"}";
        StringEntity entity = new StringEntity(request, "UTF-8");
        entity.setContentType("application/json");
        post.setEntity(entity);
        return post;
    }
}
