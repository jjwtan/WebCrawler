package com.jjwtan.crawler.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by Ran on 25/3/2018.
 */

@Component
public class CamelTestRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/SCB/inbound").routeId("testRoute")
                .to("file:/SCB/outbound");
    }
}
