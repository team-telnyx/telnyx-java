// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.PortingOrderCreateParams
import com.telnyx.sdk.models.portingorders.PortingOrderDocuments
import com.telnyx.sdk.models.portingorders.PortingOrderEndUser
import com.telnyx.sdk.models.portingorders.PortingOrderEndUserAdmin
import com.telnyx.sdk.models.portingorders.PortingOrderEndUserLocation
import com.telnyx.sdk.models.portingorders.PortingOrderMisc
import com.telnyx.sdk.models.portingorders.PortingOrderPhoneNumberConfiguration
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveLoaTemplateParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveParams
import com.telnyx.sdk.models.portingorders.PortingOrderType
import com.telnyx.sdk.models.portingorders.PortingOrderUpdateParams
import com.telnyx.sdk.models.portingorders.PortingOrderUserFeedback
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class PortingOrderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingOrderServiceAsync = client.portingOrders()

        val portingOrderFuture =
            portingOrderServiceAsync.create(
                PortingOrderCreateParams.builder()
                    .phoneNumbers(listOf("+13035550000", "+13035550001", "+13035550002"))
                    .customerGroupReference("Group-456")
                    .customerReference("Acct 123abc")
                    .build()
            )

        val portingOrder = portingOrderFuture.get()
        portingOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingOrderServiceAsync = client.portingOrders()

        val portingOrderFuture =
            portingOrderServiceAsync.retrieve(
                PortingOrderRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includePhoneNumbers(true)
                    .build()
            )

        val portingOrder = portingOrderFuture.get()
        portingOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingOrderServiceAsync = client.portingOrders()

        val portingOrderFuture =
            portingOrderServiceAsync.update(
                PortingOrderUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .activationSettings(
                        PortingOrderUpdateParams.ActivationSettings.builder()
                            .focDatetimeRequested(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                            .build()
                    )
                    .customerGroupReference("customer_group_reference")
                    .customerReference("customer_reference")
                    .documents(
                        PortingOrderDocuments.builder()
                            .invoice("ce74b771-d23d-4960-81ec-8741b3862146")
                            .loa("64ffb720-04c7-455b-92d6-20fcca92e935")
                            .build()
                    )
                    .endUser(
                        PortingOrderEndUser.builder()
                            .admin(
                                PortingOrderEndUserAdmin.builder()
                                    .accountNumber("123abc")
                                    .authPersonName("Porter McPortersen II")
                                    .billingPhoneNumber("13035551234")
                                    .businessIdentifier("abc123")
                                    .entityName("Porter McPortersen")
                                    .pinPasscode("1234")
                                    .taxIdentifier("1234abcd")
                                    .build()
                            )
                            .location(
                                PortingOrderEndUserLocation.builder()
                                    .administrativeArea("TX")
                                    .countryCode("US")
                                    .extendedAddress("14th Floor")
                                    .locality("Austin")
                                    .postalCode("78701")
                                    .streetAddress("600 Congress Avenue")
                                    .build()
                            )
                            .build()
                    )
                    .messaging(
                        PortingOrderUpdateParams.Messaging.builder().enableMessaging(true).build()
                    )
                    .misc(
                        PortingOrderMisc.builder()
                            .newBillingPhoneNumber("new_billing_phone_number")
                            .remainingNumbersAction(
                                PortingOrderMisc.RemainingNumbersAction.DISCONNECT
                            )
                            .type(PortingOrderType.FULL)
                            .build()
                    )
                    .phoneNumberConfiguration(
                        PortingOrderPhoneNumberConfiguration.builder()
                            .billingGroupId("f1486bae-f067-460c-ad43-73a92848f902")
                            .connectionId("f1486bae-f067-460c-ad43-73a92848f902")
                            .emergencyAddressId("f1486bae-f067-460c-ad43-73a92848f902")
                            .messagingProfileId("f1486bae-f067-460c-ad43-73a92848f901")
                            .addTag("abc")
                            .addTag("123")
                            .build()
                    )
                    .requirementGroupId("DE748D99-06FA-4D90-9F9A-F4B62696BADA")
                    .addRequirement(
                        PortingOrderUpdateParams.Requirement.builder()
                            .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                            .requirementTypeId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                            .build()
                    )
                    .userFeedback(
                        PortingOrderUserFeedback.builder()
                            .userComment("I loved my experience porting numbers with Telnyx")
                            .userRating(5L)
                            .build()
                    )
                    .webhookUrl("https://example.com")
                    .build()
            )

        val portingOrder = portingOrderFuture.get()
        portingOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingOrderServiceAsync = client.portingOrders()

        val pageFuture = portingOrderServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingOrderServiceAsync = client.portingOrders()

        val future = portingOrderServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAllowedFocWindows() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingOrderServiceAsync = client.portingOrders()

        val responseFuture =
            portingOrderServiceAsync.retrieveAllowedFocWindows(
                "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveExceptionTypes() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingOrderServiceAsync = client.portingOrders()

        val responseFuture = portingOrderServiceAsync.retrieveExceptionTypes()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrieveLoaTemplate(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val portingOrderServiceAsync = client.portingOrders()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            portingOrderServiceAsync.retrieveLoaTemplate(
                PortingOrderRetrieveLoaTemplateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .loaConfigurationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRequirements() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingOrderServiceAsync = client.portingOrders()

        val pageFuture =
            portingOrderServiceAsync.retrieveRequirements("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSubRequest() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val portingOrderServiceAsync = client.portingOrders()

        val responseFuture =
            portingOrderServiceAsync.retrieveSubRequest("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }
}
