// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberconfigurations

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberConfigurationListParamsTest {

    @Test
    fun create() {
        PhoneNumberConfigurationListParams.builder()
            .filter(
                PhoneNumberConfigurationListParams.Filter.builder()
                    .portingOrder(
                        PhoneNumberConfigurationListParams.Filter.PortingOrder.builder()
                            .addStatus(
                                PhoneNumberConfigurationListParams.Filter.PortingOrder.Status
                                    .ACTIVATION_IN_PROGRESS
                            )
                            .build()
                    )
                    .addPortingPhoneNumber("5d6f7ede-1961-4717-bfb5-db392c5efc2d")
                    .addUserBundleId("5d6f7ede-1961-4717-bfb5-db392c5efc2d")
                    .build()
            )
            .page(PhoneNumberConfigurationListParams.Page.builder().number(1L).size(1L).build())
            .sort(
                PhoneNumberConfigurationListParams.Sort.builder()
                    .value(PhoneNumberConfigurationListParams.Sort.Value.CREATED_AT)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberConfigurationListParams.builder()
                .filter(
                    PhoneNumberConfigurationListParams.Filter.builder()
                        .portingOrder(
                            PhoneNumberConfigurationListParams.Filter.PortingOrder.builder()
                                .addStatus(
                                    PhoneNumberConfigurationListParams.Filter.PortingOrder.Status
                                        .ACTIVATION_IN_PROGRESS
                                )
                                .build()
                        )
                        .addPortingPhoneNumber("5d6f7ede-1961-4717-bfb5-db392c5efc2d")
                        .addUserBundleId("5d6f7ede-1961-4717-bfb5-db392c5efc2d")
                        .build()
                )
                .page(PhoneNumberConfigurationListParams.Page.builder().number(1L).size(1L).build())
                .sort(
                    PhoneNumberConfigurationListParams.Sort.builder()
                        .value(PhoneNumberConfigurationListParams.Sort.Value.CREATED_AT)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "filter[porting_order][status]",
                        listOf("activation-in-progress").joinToString(","),
                    )
                    .put(
                        "filter[porting_phone_number]",
                        listOf("5d6f7ede-1961-4717-bfb5-db392c5efc2d").joinToString(","),
                    )
                    .put(
                        "filter[user_bundle_id]",
                        listOf("5d6f7ede-1961-4717-bfb5-db392c5efc2d").joinToString(","),
                    )
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort[value]", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumberConfigurationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
