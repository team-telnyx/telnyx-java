// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderUpdateParamsTest {

    @Test
    fun create() {
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
                            .billingPhoneNumber("billing_phone_number")
                            .businessIdentifier("abc123")
                            .entityName("Porter McPortersen")
                            .pinPasscode("pin_passcode")
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
            .messaging(PortingOrderUpdateParams.Messaging.builder().enableMessaging(true).build())
            .misc(
                PortingOrderMisc.builder()
                    .newBillingPhoneNumber("new_billing_phone_number")
                    .remainingNumbersAction(PortingOrderMisc.RemainingNumbersAction.DISCONNECT)
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
    }

    @Test
    fun pathParams() {
        val params =
            PortingOrderUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                                .billingPhoneNumber("billing_phone_number")
                                .businessIdentifier("abc123")
                                .entityName("Porter McPortersen")
                                .pinPasscode("pin_passcode")
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
                        .remainingNumbersAction(PortingOrderMisc.RemainingNumbersAction.DISCONNECT)
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

        val body = params._body()

        assertThat(body.activationSettings())
            .contains(
                PortingOrderUpdateParams.ActivationSettings.builder()
                    .focDatetimeRequested(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .build()
            )
        assertThat(body.customerGroupReference()).contains("customer_group_reference")
        assertThat(body.customerReference()).contains("customer_reference")
        assertThat(body.documents())
            .contains(
                PortingOrderDocuments.builder()
                    .invoice("ce74b771-d23d-4960-81ec-8741b3862146")
                    .loa("64ffb720-04c7-455b-92d6-20fcca92e935")
                    .build()
            )
        assertThat(body.endUser())
            .contains(
                PortingOrderEndUser.builder()
                    .admin(
                        PortingOrderEndUserAdmin.builder()
                            .accountNumber("123abc")
                            .authPersonName("Porter McPortersen II")
                            .billingPhoneNumber("billing_phone_number")
                            .businessIdentifier("abc123")
                            .entityName("Porter McPortersen")
                            .pinPasscode("pin_passcode")
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
        assertThat(body.messaging())
            .contains(PortingOrderUpdateParams.Messaging.builder().enableMessaging(true).build())
        assertThat(body.misc())
            .contains(
                PortingOrderMisc.builder()
                    .newBillingPhoneNumber("new_billing_phone_number")
                    .remainingNumbersAction(PortingOrderMisc.RemainingNumbersAction.DISCONNECT)
                    .type(PortingOrderType.FULL)
                    .build()
            )
        assertThat(body.phoneNumberConfiguration())
            .contains(
                PortingOrderPhoneNumberConfiguration.builder()
                    .billingGroupId("f1486bae-f067-460c-ad43-73a92848f902")
                    .connectionId("f1486bae-f067-460c-ad43-73a92848f902")
                    .emergencyAddressId("f1486bae-f067-460c-ad43-73a92848f902")
                    .messagingProfileId("f1486bae-f067-460c-ad43-73a92848f901")
                    .addTag("abc")
                    .addTag("123")
                    .build()
            )
        assertThat(body.requirementGroupId()).contains("DE748D99-06FA-4D90-9F9A-F4B62696BADA")
        assertThat(body.requirements().getOrNull())
            .containsExactly(
                PortingOrderUpdateParams.Requirement.builder()
                    .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                    .requirementTypeId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                    .build()
            )
        assertThat(body.userFeedback())
            .contains(
                PortingOrderUserFeedback.builder()
                    .userComment("I loved my experience porting numbers with Telnyx")
                    .userRating(5L)
                    .build()
            )
        assertThat(body.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PortingOrderUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
