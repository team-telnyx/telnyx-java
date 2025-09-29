// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.PortingOrderStatus
import com.telnyx.api.models.PortingOrdersExceptionType
import com.telnyx.api.models.portingorders.PortingOrder
import com.telnyx.api.models.portingorders.PortingOrderActivationSettings
import com.telnyx.api.models.portingorders.PortingOrderDocuments
import com.telnyx.api.models.portingorders.PortingOrderEndUser
import com.telnyx.api.models.portingorders.PortingOrderEndUserAdmin
import com.telnyx.api.models.portingorders.PortingOrderEndUserLocation
import com.telnyx.api.models.portingorders.PortingOrderMessaging
import com.telnyx.api.models.portingorders.PortingOrderMisc
import com.telnyx.api.models.portingorders.PortingOrderPhoneNumberConfiguration
import com.telnyx.api.models.portingorders.PortingOrderRequirement
import com.telnyx.api.models.portingorders.PortingOrderType
import com.telnyx.api.models.portingorders.PortingOrderUserFeedback
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionCancelResponseTest {

    @Test
    fun create() {
        val actionCancelResponse =
            ActionCancelResponse.builder()
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
                                .invoice("3a5b98a0-5049-47c3-96e1-aa6c8d119117")
                                .loa("3a5b98a0-5049-47c3-96e1-aa6c8d119117")
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
                        .parentSupportKey("pr_4bec1a")
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
                        .requirementsMet(true)
                        .status(
                            PortingOrderStatus.builder()
                                .addDetail(
                                    PortingOrdersExceptionType.builder()
                                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                                        .description("Entity name does not match that on the CSR")
                                        .build()
                                )
                                .value(PortingOrderStatus.Value.CANCEL_PENDING)
                                .build()
                        )
                        .supportKey("sr_10b316")
                        .updatedAt(OffsetDateTime.parse("2022-03-24T16:43:35Z"))
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
                    ActionCancelResponse.Meta.builder()
                        .phoneNumbersUrl(
                            "/v2/porting_phone_numbers?filter[porting_order_id]=eef10fb8-f3df-4c67-97c5-e18179723222"
                        )
                        .build()
                )
                .build()

        assertThat(actionCancelResponse.data())
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
                            .invoice("3a5b98a0-5049-47c3-96e1-aa6c8d119117")
                            .loa("3a5b98a0-5049-47c3-96e1-aa6c8d119117")
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
                    .parentSupportKey("pr_4bec1a")
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
                    .requirementsMet(true)
                    .status(
                        PortingOrderStatus.builder()
                            .addDetail(
                                PortingOrdersExceptionType.builder()
                                    .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                                    .description("Entity name does not match that on the CSR")
                                    .build()
                            )
                            .value(PortingOrderStatus.Value.CANCEL_PENDING)
                            .build()
                    )
                    .supportKey("sr_10b316")
                    .updatedAt(OffsetDateTime.parse("2022-03-24T16:43:35Z"))
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
        assertThat(actionCancelResponse.meta())
            .contains(
                ActionCancelResponse.Meta.builder()
                    .phoneNumbersUrl(
                        "/v2/porting_phone_numbers?filter[porting_order_id]=eef10fb8-f3df-4c67-97c5-e18179723222"
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionCancelResponse =
            ActionCancelResponse.builder()
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
                                .invoice("3a5b98a0-5049-47c3-96e1-aa6c8d119117")
                                .loa("3a5b98a0-5049-47c3-96e1-aa6c8d119117")
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
                        .parentSupportKey("pr_4bec1a")
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
                        .requirementsMet(true)
                        .status(
                            PortingOrderStatus.builder()
                                .addDetail(
                                    PortingOrdersExceptionType.builder()
                                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                                        .description("Entity name does not match that on the CSR")
                                        .build()
                                )
                                .value(PortingOrderStatus.Value.CANCEL_PENDING)
                                .build()
                        )
                        .supportKey("sr_10b316")
                        .updatedAt(OffsetDateTime.parse("2022-03-24T16:43:35Z"))
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
                    ActionCancelResponse.Meta.builder()
                        .phoneNumbersUrl(
                            "/v2/porting_phone_numbers?filter[porting_order_id]=eef10fb8-f3df-4c67-97c5-e18179723222"
                        )
                        .build()
                )
                .build()

        val roundtrippedActionCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionCancelResponse),
                jacksonTypeRef<ActionCancelResponse>(),
            )

        assertThat(roundtrippedActionCancelResponse).isEqualTo(actionCancelResponse)
    }
}
