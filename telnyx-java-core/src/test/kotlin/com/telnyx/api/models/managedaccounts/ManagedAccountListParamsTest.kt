// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountListParamsTest {

    @Test
    fun create() {
        ManagedAccountListParams.builder()
            .filter(
                ManagedAccountListParams.Filter.builder()
                    .email(
                        ManagedAccountListParams.Filter.Email.builder()
                            .contains("john")
                            .eq("eq")
                            .build()
                    )
                    .organizationName(
                        ManagedAccountListParams.Filter.OrganizationName.builder()
                            .contains("contains")
                            .eq("Example Company LLC")
                            .build()
                    )
                    .build()
            )
            .includeCancelledAccounts(true)
            .page(ManagedAccountListParams.Page.builder().number(1L).size(1L).build())
            .sort(ManagedAccountListParams.Sort.EMAIL)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ManagedAccountListParams.builder()
                .filter(
                    ManagedAccountListParams.Filter.builder()
                        .email(
                            ManagedAccountListParams.Filter.Email.builder()
                                .contains("john")
                                .eq("eq")
                                .build()
                        )
                        .organizationName(
                            ManagedAccountListParams.Filter.OrganizationName.builder()
                                .contains("contains")
                                .eq("Example Company LLC")
                                .build()
                        )
                        .build()
                )
                .includeCancelledAccounts(true)
                .page(ManagedAccountListParams.Page.builder().number(1L).size(1L).build())
                .sort(ManagedAccountListParams.Sort.EMAIL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[email][contains]", "john")
                    .put("filter[email][eq]", "eq")
                    .put("filter[organization_name][contains]", "contains")
                    .put("filter[organization_name][eq]", "Example Company LLC")
                    .put("include_cancelled_accounts", "true")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "email")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ManagedAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
