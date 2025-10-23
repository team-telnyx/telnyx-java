// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberConfigurationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberConfigurationService = client.portingOrders().phoneNumberConfigurations()

        val phoneNumberConfiguration =
            phoneNumberConfigurationService.create(
                PhoneNumberConfigurationCreateParams.builder()
                    .addPhoneNumberConfiguration(
                        PhoneNumberConfigurationCreateParams.PhoneNumberConfiguration.builder()
                            .portingPhoneNumberId("927f4687-318c-44bc-9f2f-22a5898143a4")
                            .userBundleId("ff901545-3e27-462a-ba9d-2b34654cab82")
                            .build()
                    )
                    .build()
            )

        phoneNumberConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberConfigurationService = client.portingOrders().phoneNumberConfigurations()

        val phoneNumberConfigurations =
            phoneNumberConfigurationService.list(
                PhoneNumberConfigurationListParams.builder()
                    .filter(
                        PhoneNumberConfigurationListParams.Filter.builder()
                            .portingOrder(
                                PhoneNumberConfigurationListParams.Filter.PortingOrder.builder()
                                    .addStatus(
                                        PhoneNumberConfigurationListParams.Filter.PortingOrder
                                            .Status
                                            .ACTIVATION_IN_PROGRESS
                                    )
                                    .build()
                            )
                            .addPortingPhoneNumber("5d6f7ede-1961-4717-bfb5-db392c5efc2d")
                            .addUserBundleId("5d6f7ede-1961-4717-bfb5-db392c5efc2d")
                            .build()
                    )
                    .page(
                        PhoneNumberConfigurationListParams.Page.builder()
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .sort(
                        PhoneNumberConfigurationListParams.Sort.builder()
                            .value(PhoneNumberConfigurationListParams.Sort.Value_.CREATED_AT)
                            .build()
                    )
                    .build()
            )

        phoneNumberConfigurations.validate()
    }
}
