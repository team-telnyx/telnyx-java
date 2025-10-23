// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceRetrieveConferencesParamsTest {

    @Test
    fun create() {
        ConferenceRetrieveConferencesParams.builder()
            .accountSid("account_sid")
            .dateCreated("DateCreated")
            .dateUpdated("DateUpdated")
            .friendlyName("FriendlyName")
            .page(0L)
            .pageSize(0L)
            .pageToken("PageToken")
            .status(ConferenceRetrieveConferencesParams.Status.INIT)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ConferenceRetrieveConferencesParams.builder().accountSid("account_sid").build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ConferenceRetrieveConferencesParams.builder()
                .accountSid("account_sid")
                .dateCreated("DateCreated")
                .dateUpdated("DateUpdated")
                .friendlyName("FriendlyName")
                .page(0L)
                .pageSize(0L)
                .pageToken("PageToken")
                .status(ConferenceRetrieveConferencesParams.Status.INIT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("DateCreated", "DateCreated")
                    .put("DateUpdated", "DateUpdated")
                    .put("FriendlyName", "FriendlyName")
                    .put("Page", "0")
                    .put("PageSize", "0")
                    .put("PageToken", "PageToken")
                    .put("Status", "init")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConferenceRetrieveConferencesParams.builder().accountSid("account_sid").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
