// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.uploads

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCreateParamsTest {

    @Test
    fun create() {
        UploadCreateParams.builder()
            .id("id")
            .numberIds(
                listOf(
                    "3920457616934164700",
                    "3920457616934164701",
                    "3920457616934164702",
                    "3920457616934164703",
                )
            )
            .addAdditionalUsage(UploadCreateParams.AdditionalUsage.CALLING_USER_ASSIGNMENT)
            .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .locationId("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2")
            .usage(UploadCreateParams.Usage.FIRST_PARTY_APP_ASSIGNMENT)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UploadCreateParams.builder()
                .id("id")
                .numberIds(
                    listOf(
                        "3920457616934164700",
                        "3920457616934164701",
                        "3920457616934164702",
                        "3920457616934164703",
                    )
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UploadCreateParams.builder()
                .id("id")
                .numberIds(
                    listOf(
                        "3920457616934164700",
                        "3920457616934164701",
                        "3920457616934164702",
                        "3920457616934164703",
                    )
                )
                .addAdditionalUsage(UploadCreateParams.AdditionalUsage.CALLING_USER_ASSIGNMENT)
                .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .locationId("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2")
                .usage(UploadCreateParams.Usage.FIRST_PARTY_APP_ASSIGNMENT)
                .build()

        val body = params._body()

        assertThat(body.numberIds())
            .containsExactly(
                "3920457616934164700",
                "3920457616934164701",
                "3920457616934164702",
                "3920457616934164703",
            )
        assertThat(body.additionalUsages().getOrNull())
            .containsExactly(UploadCreateParams.AdditionalUsage.CALLING_USER_ASSIGNMENT)
        assertThat(body.civicAddressId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.locationId()).contains("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2")
        assertThat(body.usage()).contains(UploadCreateParams.Usage.FIRST_PARTY_APP_ASSIGNMENT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UploadCreateParams.builder()
                .id("id")
                .numberIds(
                    listOf(
                        "3920457616934164700",
                        "3920457616934164701",
                        "3920457616934164702",
                        "3920457616934164703",
                    )
                )
                .build()

        val body = params._body()

        assertThat(body.numberIds())
            .containsExactly(
                "3920457616934164700",
                "3920457616934164701",
                "3920457616934164702",
                "3920457616934164703",
            )
    }
}
