package com.jazzinjars.user.details.steps;

import org.springframework.stereotype.Component;

import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathMatching;

@Component
public class ContactsServiceSteps {

    public void expectGetUserContacts(long userId, String body) {
	stubFor(get(urlPathMatching("/contacts")).withQueryParam("userId", equalTo(String.valueOf(userId)))
		.willReturn(okJson(body)));
    }
}
