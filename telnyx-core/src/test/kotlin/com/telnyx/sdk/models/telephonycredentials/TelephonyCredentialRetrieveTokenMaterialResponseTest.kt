// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonyCredentialRetrieveTokenMaterialResponseTest {

    @Test
    fun create() {
        val telephonyCredentialRetrieveTokenMaterialResponse =
            TelephonyCredentialRetrieveTokenMaterialResponse.builder()
                .data(
                    TokenMaterial.builder()
                        .kid("v1")
                        .signingSecret("cCL985ACi7wpbe_2xh1VDF3NabPJ90u1wCKmJCPNpxw")
                        .telToken(
                            "rj_ZkkZUOZMxZOfOmLpEUB3siU7u6RjZFeM9s-gb_xCR56WFKFAJiMyF2T6CBRmlh_Sy0i_lfyT9AI8sEif8MTIIszyzSl_aDnG48aO50yaHGuRSYbUbSYm9WIiQ0g=="
                        )
                        .build()
                )
                .build()

        assertThat(telephonyCredentialRetrieveTokenMaterialResponse.data())
            .contains(
                TokenMaterial.builder()
                    .kid("v1")
                    .signingSecret("cCL985ACi7wpbe_2xh1VDF3NabPJ90u1wCKmJCPNpxw")
                    .telToken(
                        "rj_ZkkZUOZMxZOfOmLpEUB3siU7u6RjZFeM9s-gb_xCR56WFKFAJiMyF2T6CBRmlh_Sy0i_lfyT9AI8sEif8MTIIszyzSl_aDnG48aO50yaHGuRSYbUbSYm9WIiQ0g=="
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telephonyCredentialRetrieveTokenMaterialResponse =
            TelephonyCredentialRetrieveTokenMaterialResponse.builder()
                .data(
                    TokenMaterial.builder()
                        .kid("v1")
                        .signingSecret("cCL985ACi7wpbe_2xh1VDF3NabPJ90u1wCKmJCPNpxw")
                        .telToken(
                            "rj_ZkkZUOZMxZOfOmLpEUB3siU7u6RjZFeM9s-gb_xCR56WFKFAJiMyF2T6CBRmlh_Sy0i_lfyT9AI8sEif8MTIIszyzSl_aDnG48aO50yaHGuRSYbUbSYm9WIiQ0g=="
                        )
                        .build()
                )
                .build()

        val roundtrippedTelephonyCredentialRetrieveTokenMaterialResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telephonyCredentialRetrieveTokenMaterialResponse),
                jacksonTypeRef<TelephonyCredentialRetrieveTokenMaterialResponse>(),
            )

        assertThat(roundtrippedTelephonyCredentialRetrieveTokenMaterialResponse)
            .isEqualTo(telephonyCredentialRetrieveTokenMaterialResponse)
    }
}
