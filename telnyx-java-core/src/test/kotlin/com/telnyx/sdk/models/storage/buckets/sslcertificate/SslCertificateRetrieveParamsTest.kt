// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.sslcertificate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SslCertificateRetrieveParamsTest {

    @Test
    fun create() {
        SslCertificateRetrieveParams.builder().bucketName("").build()
    }

    @Test
    fun pathParams() {
        val params = SslCertificateRetrieveParams.builder().bucketName("").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
