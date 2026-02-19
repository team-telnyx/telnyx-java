// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberConfigurationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberConfigurationService = client.portingOrders().phoneNumberConfigurations()

        val page = phoneNumberConfigurationService.list()

        page.response().validate()
    }
}
