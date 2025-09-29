// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.PortingOrderStatus
import com.telnyx.api.models.PortingOrdersExceptionType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderUpdateResponseTest {

    @Test
    fun create() {
        val portingOrderUpdateResponse =
            PortingOrderUpdateResponse.builder()
                .data(
                    PortingOrder.builder()
                        .id("eef10fb8-f3df-4c67-97c5-e18179723222")
                        .activationSettings(
                            PortingOrderActivationSettings.builder()
                                .activationStatus(
                                    PortingOrderActivationSettings.ActivationStatus.NEW
                                )
                                .fastPortEligible(true)
                                .focDatetimeActual(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .focDatetimeRequested(OffsetDateTime.parse("2022-04-08T15:00:00Z"))
                                .build()
                        )
                        .addAdditionalStep(PortingOrder.AdditionalStep.ASSOCIATED_PHONE_NUMBERS)
                        .createdAt(OffsetDateTime.parse("2022-03-24T14:22:28Z"))
                        .customerGroupReference("Group-789")
                        .customerReference("Test1234")
                        .description("FP Telnyx")
                        .documents(
                            PortingOrderDocuments.builder()
                                .invoice("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .loa("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .endUser(
                            PortingOrderEndUser.builder()
                                .admin(
                                    PortingOrderEndUserAdmin.builder()
                                        .accountNumber("123abc")
                                        .authPersonName("Porter McPortersen II")
                                        .billingPhoneNumber("+13035551234")
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
                                    PortingOrderMisc.RemainingNumbersAction.KEEP
                                )
                                .type(PortingOrderType.FULL)
                                .build()
                        )
                        .oldServiceProviderOcn("Unreal Communications")
                        .parentSupportKey("parent_support_key")
                        .phoneNumberConfiguration(
                            PortingOrderPhoneNumberConfiguration.builder()
                                .billingGroupId("billing_group_id")
                                .connectionId("1752379429071357070")
                                .emergencyAddressId("emergency_address_id")
                                .messagingProfileId("messaging_profile_id")
                                .addTag("string")
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
                                .value(PortingOrderStatus.Value.DRAFT)
                                .build()
                        )
                        .supportKey("support_key")
                        .updatedAt(OffsetDateTime.parse("2022-03-24T14:26:53Z"))
                        .userFeedback(
                            PortingOrderUserFeedback.builder()
                                .userComment("user_comment")
                                .userRating(0L)
                                .build()
                        )
                        .userId("40d68ba2-0847-4df2-be9c-b0e0cb673e75")
                        .webhookUrl("https://example.com/porting_webhooks")
                        .build()
                )
                .meta(
                    PortingOrderUpdateResponse.Meta.builder()
                        .phoneNumbersUrl(
                            "/v2/porting_phone_numbers?filter[porting_order_id]=eef10fb8-f3df-4c67-97c5-e18179723222"
                        )
                        .build()
                )
                .build()

        assertThat(portingOrderUpdateResponse.data())
            .contains(
                PortingOrder.builder()
                    .id("eef10fb8-f3df-4c67-97c5-e18179723222")
                    .activationSettings(
                        PortingOrderActivationSettings.builder()
                            .activationStatus(PortingOrderActivationSettings.ActivationStatus.NEW)
                            .fastPortEligible(true)
                            .focDatetimeActual(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .focDatetimeRequested(OffsetDateTime.parse("2022-04-08T15:00:00Z"))
                            .build()
                    )
                    .addAdditionalStep(PortingOrder.AdditionalStep.ASSOCIATED_PHONE_NUMBERS)
                    .createdAt(OffsetDateTime.parse("2022-03-24T14:22:28Z"))
                    .customerGroupReference("Group-789")
                    .customerReference("Test1234")
                    .description("FP Telnyx")
                    .documents(
                        PortingOrderDocuments.builder()
                            .invoice("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .loa("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .endUser(
                        PortingOrderEndUser.builder()
                            .admin(
                                PortingOrderEndUserAdmin.builder()
                                    .accountNumber("123abc")
                                    .authPersonName("Porter McPortersen II")
                                    .billingPhoneNumber("+13035551234")
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
                            .remainingNumbersAction(PortingOrderMisc.RemainingNumbersAction.KEEP)
                            .type(PortingOrderType.FULL)
                            .build()
                    )
                    .oldServiceProviderOcn("Unreal Communications")
                    .parentSupportKey("parent_support_key")
                    .phoneNumberConfiguration(
                        PortingOrderPhoneNumberConfiguration.builder()
                            .billingGroupId("billing_group_id")
                            .connectionId("1752379429071357070")
                            .emergencyAddressId("emergency_address_id")
                            .messagingProfileId("messaging_profile_id")
                            .addTag("string")
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
                            .value(PortingOrderStatus.Value.DRAFT)
                            .build()
                    )
                    .supportKey("support_key")
                    .updatedAt(OffsetDateTime.parse("2022-03-24T14:26:53Z"))
                    .userFeedback(
                        PortingOrderUserFeedback.builder()
                            .userComment("user_comment")
                            .userRating(0L)
                            .build()
                    )
                    .userId("40d68ba2-0847-4df2-be9c-b0e0cb673e75")
                    .webhookUrl("https://example.com/porting_webhooks")
                    .build()
            )
        assertThat(portingOrderUpdateResponse.meta())
            .contains(
                PortingOrderUpdateResponse.Meta.builder()
                    .phoneNumbersUrl(
                        "/v2/porting_phone_numbers?filter[porting_order_id]=eef10fb8-f3df-4c67-97c5-e18179723222"
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderUpdateResponse =
            PortingOrderUpdateResponse.builder()
                .data(
                    PortingOrder.builder()
                        .id("eef10fb8-f3df-4c67-97c5-e18179723222")
                        .activationSettings(
                            PortingOrderActivationSettings.builder()
                                .activationStatus(
                                    PortingOrderActivationSettings.ActivationStatus.NEW
                                )
                                .fastPortEligible(true)
                                .focDatetimeActual(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .focDatetimeRequested(OffsetDateTime.parse("2022-04-08T15:00:00Z"))
                                .build()
                        )
                        .addAdditionalStep(PortingOrder.AdditionalStep.ASSOCIATED_PHONE_NUMBERS)
                        .createdAt(OffsetDateTime.parse("2022-03-24T14:22:28Z"))
                        .customerGroupReference("Group-789")
                        .customerReference("Test1234")
                        .description("FP Telnyx")
                        .documents(
                            PortingOrderDocuments.builder()
                                .invoice("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .loa("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .endUser(
                            PortingOrderEndUser.builder()
                                .admin(
                                    PortingOrderEndUserAdmin.builder()
                                        .accountNumber("123abc")
                                        .authPersonName("Porter McPortersen II")
                                        .billingPhoneNumber("+13035551234")
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
                                    PortingOrderMisc.RemainingNumbersAction.KEEP
                                )
                                .type(PortingOrderType.FULL)
                                .build()
                        )
                        .oldServiceProviderOcn("Unreal Communications")
                        .parentSupportKey("parent_support_key")
                        .phoneNumberConfiguration(
                            PortingOrderPhoneNumberConfiguration.builder()
                                .billingGroupId("billing_group_id")
                                .connectionId("1752379429071357070")
                                .emergencyAddressId("emergency_address_id")
                                .messagingProfileId("messaging_profile_id")
                                .addTag("string")
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
                                .value(PortingOrderStatus.Value.DRAFT)
                                .build()
                        )
                        .supportKey("support_key")
                        .updatedAt(OffsetDateTime.parse("2022-03-24T14:26:53Z"))
                        .userFeedback(
                            PortingOrderUserFeedback.builder()
                                .userComment("user_comment")
                                .userRating(0L)
                                .build()
                        )
                        .userId("40d68ba2-0847-4df2-be9c-b0e0cb673e75")
                        .webhookUrl("https://example.com/porting_webhooks")
                        .build()
                )
                .meta(
                    PortingOrderUpdateResponse.Meta.builder()
                        .phoneNumbersUrl(
                            "/v2/porting_phone_numbers?filter[porting_order_id]=eef10fb8-f3df-4c67-97c5-e18179723222"
                        )
                        .build()
                )
                .build()

        val roundtrippedPortingOrderUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderUpdateResponse),
                jacksonTypeRef<PortingOrderUpdateResponse>(),
            )

        assertThat(roundtrippedPortingOrderUpdateResponse).isEqualTo(portingOrderUpdateResponse)
    }
}
