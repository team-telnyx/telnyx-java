// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.PortingOrderStatus
import com.telnyx.sdk.models.PortingOrdersExceptionType
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderListPageResponseTest {

    @Test
    fun create() {
        val portingOrderListPageResponse =
            PortingOrderListPageResponse.builder()
                .addData(
                    PortingOrder.builder()
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .activationSettings(
                            PortingOrderActivationSettings.builder()
                                .activationStatus(
                                    PortingOrderActivationSettings.ActivationStatus.ACTIVE
                                )
                                .fastPortEligible(true)
                                .focDatetimeActual(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .focDatetimeRequested(
                                    OffsetDateTime.parse("2021-03-19T10:07:15.527Z")
                                )
                                .build()
                        )
                        .addAdditionalStep(PortingOrder.AdditionalStep.ASSOCIATED_PHONE_NUMBERS)
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .customerGroupReference("Group-456")
                        .customerReference("Acct 123abc")
                        .description("FP Telnyx")
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
                            PortingOrderMessaging.builder()
                                .enableMessaging(true)
                                .messagingCapable(true)
                                .messagingPortCompleted(false)
                                .messagingPortStatus(
                                    PortingOrderMessaging.MessagingPortStatus.PENDING
                                )
                                .build()
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
                        .oldServiceProviderOcn("Unreal Communications")
                        .parentSupportKey("pr_123abc")
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
                        .phoneNumberType(PortingOrder.PhoneNumberType.LOCAL)
                        .portingPhoneNumbersCount(1L)
                        .recordType("porting_order")
                        .addRequirement(
                            PortingOrderRequirement.builder()
                                .fieldType(PortingOrderRequirement.FieldType.DOCUMENT)
                                .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                                .recordType("porting_requirement")
                                .requirementTypeId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                                .build()
                        )
                        .requirementsMet(false)
                        .status(
                            PortingOrderStatus.builder()
                                .addDetail(
                                    PortingOrdersExceptionType.builder()
                                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                                        .description("Entity name does not match that on the CSR")
                                        .build()
                                )
                                .value(PortingOrderStatus.PortingOrderStatusValue.PORTED)
                                .build()
                        )
                        .supportKey("sr_123abc")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .userFeedback(
                            PortingOrderUserFeedback.builder()
                                .userComment("I loved my experience porting numbers with Telnyx")
                                .userRating(5L)
                                .build()
                        )
                        .userId("40d68ba2-0847-4df2-be9c-b0e0cb673e75")
                        .webhookUrl("https://example.com/porting_webhooks")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(portingOrderListPageResponse.data().getOrNull())
            .containsExactly(
                PortingOrder.builder()
                    .id("f1486bae-f067-460c-ad43-73a92848f902")
                    .activationSettings(
                        PortingOrderActivationSettings.builder()
                            .activationStatus(
                                PortingOrderActivationSettings.ActivationStatus.ACTIVE
                            )
                            .fastPortEligible(true)
                            .focDatetimeActual(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                            .focDatetimeRequested(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                            .build()
                    )
                    .addAdditionalStep(PortingOrder.AdditionalStep.ASSOCIATED_PHONE_NUMBERS)
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .customerGroupReference("Group-456")
                    .customerReference("Acct 123abc")
                    .description("FP Telnyx")
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
                        PortingOrderMessaging.builder()
                            .enableMessaging(true)
                            .messagingCapable(true)
                            .messagingPortCompleted(false)
                            .messagingPortStatus(PortingOrderMessaging.MessagingPortStatus.PENDING)
                            .build()
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
                    .oldServiceProviderOcn("Unreal Communications")
                    .parentSupportKey("pr_123abc")
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
                    .phoneNumberType(PortingOrder.PhoneNumberType.LOCAL)
                    .portingPhoneNumbersCount(1L)
                    .recordType("porting_order")
                    .addRequirement(
                        PortingOrderRequirement.builder()
                            .fieldType(PortingOrderRequirement.FieldType.DOCUMENT)
                            .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                            .recordType("porting_requirement")
                            .requirementTypeId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                            .build()
                    )
                    .requirementsMet(false)
                    .status(
                        PortingOrderStatus.builder()
                            .addDetail(
                                PortingOrdersExceptionType.builder()
                                    .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                                    .description("Entity name does not match that on the CSR")
                                    .build()
                            )
                            .value(PortingOrderStatus.PortingOrderStatusValue.PORTED)
                            .build()
                    )
                    .supportKey("sr_123abc")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .userFeedback(
                        PortingOrderUserFeedback.builder()
                            .userComment("I loved my experience porting numbers with Telnyx")
                            .userRating(5L)
                            .build()
                    )
                    .userId("40d68ba2-0847-4df2-be9c-b0e0cb673e75")
                    .webhookUrl("https://example.com/porting_webhooks")
                    .build()
            )
        assertThat(portingOrderListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderListPageResponse =
            PortingOrderListPageResponse.builder()
                .addData(
                    PortingOrder.builder()
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .activationSettings(
                            PortingOrderActivationSettings.builder()
                                .activationStatus(
                                    PortingOrderActivationSettings.ActivationStatus.ACTIVE
                                )
                                .fastPortEligible(true)
                                .focDatetimeActual(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .focDatetimeRequested(
                                    OffsetDateTime.parse("2021-03-19T10:07:15.527Z")
                                )
                                .build()
                        )
                        .addAdditionalStep(PortingOrder.AdditionalStep.ASSOCIATED_PHONE_NUMBERS)
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .customerGroupReference("Group-456")
                        .customerReference("Acct 123abc")
                        .description("FP Telnyx")
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
                            PortingOrderMessaging.builder()
                                .enableMessaging(true)
                                .messagingCapable(true)
                                .messagingPortCompleted(false)
                                .messagingPortStatus(
                                    PortingOrderMessaging.MessagingPortStatus.PENDING
                                )
                                .build()
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
                        .oldServiceProviderOcn("Unreal Communications")
                        .parentSupportKey("pr_123abc")
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
                        .phoneNumberType(PortingOrder.PhoneNumberType.LOCAL)
                        .portingPhoneNumbersCount(1L)
                        .recordType("porting_order")
                        .addRequirement(
                            PortingOrderRequirement.builder()
                                .fieldType(PortingOrderRequirement.FieldType.DOCUMENT)
                                .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                                .recordType("porting_requirement")
                                .requirementTypeId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                                .build()
                        )
                        .requirementsMet(false)
                        .status(
                            PortingOrderStatus.builder()
                                .addDetail(
                                    PortingOrdersExceptionType.builder()
                                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                                        .description("Entity name does not match that on the CSR")
                                        .build()
                                )
                                .value(PortingOrderStatus.PortingOrderStatusValue.PORTED)
                                .build()
                        )
                        .supportKey("sr_123abc")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .userFeedback(
                            PortingOrderUserFeedback.builder()
                                .userComment("I loved my experience porting numbers with Telnyx")
                                .userRating(5L)
                                .build()
                        )
                        .userId("40d68ba2-0847-4df2-be9c-b0e0cb673e75")
                        .webhookUrl("https://example.com/porting_webhooks")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedPortingOrderListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderListPageResponse),
                jacksonTypeRef<PortingOrderListPageResponse>(),
            )

        assertThat(roundtrippedPortingOrderListPageResponse).isEqualTo(portingOrderListPageResponse)
    }
}
