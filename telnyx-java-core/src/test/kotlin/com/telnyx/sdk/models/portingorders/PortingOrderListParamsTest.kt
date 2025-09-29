// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderListParamsTest {

    @Test
    fun create() {
        PortingOrderListParams.builder()
            .filter(
                PortingOrderListParams.Filter.builder()
                    .activationSettings(
                        PortingOrderListParams.Filter.ActivationSettings.builder()
                            .fastPortEligible(true)
                            .focDatetimeRequested(
                                PortingOrderListParams.Filter.ActivationSettings
                                    .FocDatetimeRequested
                                    .builder()
                                    .gt("2021-03-25T10:00:00.000Z")
                                    .lt("2021-03-25T10:00:00.000Z")
                                    .build()
                            )
                            .build()
                    )
                    .customerGroupReference("customer_group_reference")
                    .customerReference("customer_reference")
                    .endUser(
                        PortingOrderListParams.Filter.EndUser.builder()
                            .admin(
                                PortingOrderListParams.Filter.EndUser.Admin.builder()
                                    .authPersonName("auth_person_name")
                                    .entityName("entity_name")
                                    .build()
                            )
                            .build()
                    )
                    .misc(
                        PortingOrderListParams.Filter.Misc.builder()
                            .type(PortingOrderType.FULL)
                            .build()
                    )
                    .parentSupportKey("parent_support_key")
                    .phoneNumbers(
                        PortingOrderListParams.Filter.PhoneNumbers.builder()
                            .carrierName("carrier_name")
                            .countryCode("country_code")
                            .phoneNumber(
                                PortingOrderListParams.Filter.PhoneNumbers.PhoneNumber.builder()
                                    .contains("contains")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .includePhoneNumbers(true)
            .page(PortingOrderListParams.Page.builder().number(1L).size(1L).build())
            .sort(
                PortingOrderListParams.Sort.builder()
                    .value(PortingOrderListParams.Sort.Value.CREATED_AT)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PortingOrderListParams.builder()
                .filter(
                    PortingOrderListParams.Filter.builder()
                        .activationSettings(
                            PortingOrderListParams.Filter.ActivationSettings.builder()
                                .fastPortEligible(true)
                                .focDatetimeRequested(
                                    PortingOrderListParams.Filter.ActivationSettings
                                        .FocDatetimeRequested
                                        .builder()
                                        .gt("2021-03-25T10:00:00.000Z")
                                        .lt("2021-03-25T10:00:00.000Z")
                                        .build()
                                )
                                .build()
                        )
                        .customerGroupReference("customer_group_reference")
                        .customerReference("customer_reference")
                        .endUser(
                            PortingOrderListParams.Filter.EndUser.builder()
                                .admin(
                                    PortingOrderListParams.Filter.EndUser.Admin.builder()
                                        .authPersonName("auth_person_name")
                                        .entityName("entity_name")
                                        .build()
                                )
                                .build()
                        )
                        .misc(
                            PortingOrderListParams.Filter.Misc.builder()
                                .type(PortingOrderType.FULL)
                                .build()
                        )
                        .parentSupportKey("parent_support_key")
                        .phoneNumbers(
                            PortingOrderListParams.Filter.PhoneNumbers.builder()
                                .carrierName("carrier_name")
                                .countryCode("country_code")
                                .phoneNumber(
                                    PortingOrderListParams.Filter.PhoneNumbers.PhoneNumber.builder()
                                        .contains("contains")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .includePhoneNumbers(true)
                .page(PortingOrderListParams.Page.builder().number(1L).size(1L).build())
                .sort(
                    PortingOrderListParams.Sort.builder()
                        .value(PortingOrderListParams.Sort.Value.CREATED_AT)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[activation_settings][fast_port_eligible]", "true")
                    .put(
                        "filter[activation_settings][foc_datetime_requested][gt]",
                        "2021-03-25T10:00:00.000Z",
                    )
                    .put(
                        "filter[activation_settings][foc_datetime_requested][lt]",
                        "2021-03-25T10:00:00.000Z",
                    )
                    .put("filter[customer_group_reference]", "customer_group_reference")
                    .put("filter[customer_reference]", "customer_reference")
                    .put("filter[end_user][admin][auth_person_name]", "auth_person_name")
                    .put("filter[end_user][admin][entity_name]", "entity_name")
                    .put("filter[misc][type]", "full")
                    .put("filter[parent_support_key]", "parent_support_key")
                    .put("filter[phone_numbers][carrier_name]", "carrier_name")
                    .put("filter[phone_numbers][country_code]", "country_code")
                    .put("filter[phone_numbers][phone_number][contains]", "contains")
                    .put("include_phone_numbers", "true")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort[value]", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PortingOrderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
