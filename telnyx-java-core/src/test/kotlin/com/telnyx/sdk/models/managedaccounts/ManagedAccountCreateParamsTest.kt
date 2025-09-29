// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.managedaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountCreateParamsTest {

    @Test
    fun create() {
        ManagedAccountCreateParams.builder()
            .businessName("Larry's Cat Food Inc")
            .email("larry_cat_food@customer.org")
            .managedAccountAllowCustomPricing(false)
            .password("3jVjLq!tMuWKyWx4NN*CvhnB")
            .rollupBilling(false)
            .build()
    }

    @Test
    fun body() {
        val params =
            ManagedAccountCreateParams.builder()
                .businessName("Larry's Cat Food Inc")
                .email("larry_cat_food@customer.org")
                .managedAccountAllowCustomPricing(false)
                .password("3jVjLq!tMuWKyWx4NN*CvhnB")
                .rollupBilling(false)
                .build()

        val body = params._body()

        assertThat(body.businessName()).isEqualTo("Larry's Cat Food Inc")
        assertThat(body.email()).contains("larry_cat_food@customer.org")
        assertThat(body.managedAccountAllowCustomPricing()).contains(false)
        assertThat(body.password()).contains("3jVjLq!tMuWKyWx4NN*CvhnB")
        assertThat(body.rollupBilling()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ManagedAccountCreateParams.builder().businessName("Larry's Cat Food Inc").build()

        val body = params._body()

        assertThat(body.businessName()).isEqualTo("Larry's Cat Food Inc")
    }
}
