// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging10dlc.brand.AltBusinessIdType
import com.telnyx.sdk.models.messaging10dlc.brand.BrandCreateParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandIdentityStatus
import com.telnyx.sdk.models.messaging10dlc.brand.BrandRetrieveSmsOtpStatusParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandTriggerSmsOtpParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandUpdateParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandVerifySmsOtpParams
import com.telnyx.sdk.models.messaging10dlc.brand.EntityType
import com.telnyx.sdk.models.messaging10dlc.brand.StockExchange
import com.telnyx.sdk.models.messaging10dlc.brand.Vertical
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        val telnyxBrand =
            brandService.create(
                BrandCreateParams.builder()
                    .country("US")
                    .displayName("ABC Mobile")
                    .email("email")
                    .entityType(EntityType.PRIVATE_PROFIT)
                    .vertical(Vertical.TECHNOLOGY)
                    .businessContactEmail("name@example.com")
                    .city("New York")
                    .companyName("ABC Inc.")
                    .ein("111111111")
                    .firstName("John")
                    .ipAddress("ipAddress")
                    .isReseller(true)
                    .lastName("Smith")
                    .mobilePhone("+12024567890")
                    .mock(true)
                    .phone("+12024567890")
                    .postalCode("10001")
                    .state("NY")
                    .stockExchange(StockExchange.NASDAQ)
                    .stockSymbol("ABC")
                    .street("123")
                    .webhookFailoverUrl("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
                    .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
                    .website("http://www.abcmobile.com")
                    .build()
            )

        telnyxBrand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        val brand = brandService.retrieve("brandId")

        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        val telnyxBrand =
            brandService.update(
                BrandUpdateParams.builder()
                    .brandId("brandId")
                    .country("US")
                    .displayName("ABC Mobile")
                    .email("email")
                    .entityType(EntityType.PRIVATE_PROFIT)
                    .vertical(Vertical.TECHNOLOGY)
                    .altBusinessId("altBusiness_id")
                    .altBusinessIdType(AltBusinessIdType.NONE)
                    .businessContactEmail("name@example.com")
                    .city("New York")
                    .companyName("ABC Inc.")
                    .ein("111111111")
                    .firstName("John")
                    .identityStatus(BrandIdentityStatus.VERIFIED)
                    .ipAddress("ipAddress")
                    .isReseller(true)
                    .lastName("Smith")
                    .phone("+12024567890")
                    .postalCode("10001")
                    .state("NY")
                    .stockExchange(StockExchange.NASDAQ)
                    .stockSymbol("ABC")
                    .street("123")
                    .webhookFailoverUrl("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
                    .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
                    .website("http://www.abcmobile.com")
                    .build()
            )

        telnyxBrand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        val page = brandService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        brandService.delete("brandId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getFeedback() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        val response = brandService.getFeedback("brandId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resend2faEmail() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        brandService.resend2faEmail("brandId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSmsOtpStatus() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        val response =
            brandService.retrieveSmsOtpStatus(
                BrandRetrieveSmsOtpStatusParams.builder()
                    .referenceId("OTP4B2001")
                    .brandId("B123ABC")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun revet() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        val telnyxBrand = brandService.revet("brandId")

        telnyxBrand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun triggerSmsOtp() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        val response =
            brandService.triggerSmsOtp(
                BrandTriggerSmsOtpParams.builder()
                    .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                    .pinSms("Your PIN is @OTP_PIN@")
                    .successSms("Verification successful!")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun verifySmsOtp() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.messaging10dlc().brand()

        brandService.verifySmsOtp(
            BrandVerifySmsOtpParams.builder()
                .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                .otpPin("123456")
                .build()
        )
    }
}
