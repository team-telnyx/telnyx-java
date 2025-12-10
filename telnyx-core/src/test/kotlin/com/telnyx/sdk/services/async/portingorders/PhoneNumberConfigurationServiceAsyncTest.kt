// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberConfigurationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberConfigurationServiceAsync =
            client.portingOrders().phoneNumberConfigurations()

        val phoneNumberConfigurationFuture =
            phoneNumberConfigurationServiceAsync.create(
                PhoneNumberConfigurationCreateParams.builder()
                    .addPhoneNumberConfiguration(
                        PhoneNumberConfigurationCreateParams.PhoneNumberConfiguration.builder()
                            .portingPhoneNumberId("927f4687-318c-44bc-9f2f-22a5898143a4")
                            .userBundleId("ff901545-3e27-462a-ba9d-2b34654cab82")
                            .build()
                    )
                    .build()
            )

        val phoneNumberConfiguration = phoneNumberConfigurationFuture.get()
        phoneNumberConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberConfigurationServiceAsync =
            client.portingOrders().phoneNumberConfigurations()

        val pageFuture = phoneNumberConfigurationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
