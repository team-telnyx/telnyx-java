// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenMaterialTest {

    @Test
    fun create() {
        val tokenMaterial =
            TokenMaterial.builder()
                .kid("v1")
                .signingSecret("cCL985ACi7wpbe_2xh1VDF3NabPJ90u1wCKmJCPNpxw")
                .telToken(
                    "rj_ZkkZUOZMxZOfOmLpEUB3siU7u6RjZFeM9s-gb_xCR56WFKFAJiMyF2T6CBRmlh_Sy0i_lfyT9AI8sEif8MTIIszyzSl_aDnG48aO50yaHGuRSYbUbSYm9WIiQ0g=="
                )
                .build()

        assertThat(tokenMaterial.kid()).contains("v1")
        assertThat(tokenMaterial.signingSecret())
            .contains("cCL985ACi7wpbe_2xh1VDF3NabPJ90u1wCKmJCPNpxw")
        assertThat(tokenMaterial.telToken())
            .contains(
                "rj_ZkkZUOZMxZOfOmLpEUB3siU7u6RjZFeM9s-gb_xCR56WFKFAJiMyF2T6CBRmlh_Sy0i_lfyT9AI8sEif8MTIIszyzSl_aDnG48aO50yaHGuRSYbUbSYm9WIiQ0g=="
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenMaterial =
            TokenMaterial.builder()
                .kid("v1")
                .signingSecret("cCL985ACi7wpbe_2xh1VDF3NabPJ90u1wCKmJCPNpxw")
                .telToken(
                    "rj_ZkkZUOZMxZOfOmLpEUB3siU7u6RjZFeM9s-gb_xCR56WFKFAJiMyF2T6CBRmlh_Sy0i_lfyT9AI8sEif8MTIIszyzSl_aDnG48aO50yaHGuRSYbUbSYm9WIiQ0g=="
                )
                .build()

        val roundtrippedTokenMaterial =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenMaterial),
                jacksonTypeRef<TokenMaterial>(),
            )

        assertThat(roundtrippedTokenMaterial).isEqualTo(tokenMaterial)
    }
}
