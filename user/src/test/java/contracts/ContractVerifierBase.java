package contracts;

import com.otr.wuhan.learning.user.UserApplication;
import com.otr.wuhan.learning.user.controller.UserController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
public abstract class ContractVerifierBase {
    @Autowired
    private WebApplicationContext applicationContext;

    @Before
    public void setup() {
        RestAssuredMockMvc.webAppContextSetup(applicationContext);
    }
}
