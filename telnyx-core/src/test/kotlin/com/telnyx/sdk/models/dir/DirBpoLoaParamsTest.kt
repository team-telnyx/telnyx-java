// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirBpoLoaParamsTest {

    @Test
    fun create() {
        DirBpoLoaParams.builder()
            .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .signature(
                SignaturePayload.builder().imageBase64("x").signerName("signer_name").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DirBpoLoaParams.builder()
                .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DirBpoLoaParams.builder()
                .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .signature(
                    SignaturePayload.builder().imageBase64("x").signerName("signer_name").build()
                )
                .build()

        val body = params._body()

        assertThat(body.bpoEnterpriseId()).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(body.signature())
            .contains(SignaturePayload.builder().imageBase64("x").signerName("signer_name").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DirBpoLoaParams.builder()
                .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .build()

        val body = params._body()

        assertThat(body.bpoEnterpriseId()).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
    }
}
