// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressListParamsTest {

    @Test
    fun create() {
        AddressListParams.builder()
            .filter(
                AddressListParams.Filter.builder()
                    .addressBook(AddressListParams.Filter.AddressBook.builder().eq("eq").build())
                    .customerReference("string")
                    .streetAddress(
                        AddressListParams.Filter.StreetAddress.builder()
                            .contains("contains")
                            .build()
                    )
                    .usedAsEmergency("used_as_emergency")
                    .build()
            )
            .page(AddressListParams.Page.builder().number(1L).size(1L).build())
            .sort(AddressListParams.Sort.STREET_ADDRESS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AddressListParams.builder()
                .filter(
                    AddressListParams.Filter.builder()
                        .addressBook(
                            AddressListParams.Filter.AddressBook.builder().eq("eq").build()
                        )
                        .customerReference("string")
                        .streetAddress(
                            AddressListParams.Filter.StreetAddress.builder()
                                .contains("contains")
                                .build()
                        )
                        .usedAsEmergency("used_as_emergency")
                        .build()
                )
                .page(AddressListParams.Page.builder().number(1L).size(1L).build())
                .sort(AddressListParams.Sort.STREET_ADDRESS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[address_book][eq]", "eq")
                    .put("filter[customer_reference]", "string")
                    .put("filter[street_address][contains]", "contains")
                    .put("filter[used_as_emergency]", "used_as_emergency")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "street_address")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AddressListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
