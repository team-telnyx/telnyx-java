// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.pricing

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.pricing.products.ProductRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProductServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val productService = client.pricing().products()

        val product =
            productService.retrieve(
                ProductRetrieveParams.builder().slug("slug").pageNumber(1L).pageSize(1L).build()
            )

        product.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val productService = client.pricing().products()

        val page = productService.list()

        page.response().validate()
    }
}
