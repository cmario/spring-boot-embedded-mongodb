package com.example.mongodb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MongodbApplicationTests {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSaveEntity() {
        this.webClient.post().uri("/entity").exchange().expectStatus().isNoContent();
    }

}
