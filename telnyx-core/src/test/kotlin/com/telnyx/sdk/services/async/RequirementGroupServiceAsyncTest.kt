// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.requirementgroups.RequirementGroupCreateParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupListParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RequirementGroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val requirementGroupServiceAsync = client.requirementGroups()

        val requirementGroupFuture =
            requirementGroupServiceAsync.create(
                RequirementGroupCreateParams.builder()
                    .action(RequirementGroupCreateParams.Action.ORDERING)
                    .countryCode("US")
                    .phoneNumberType(RequirementGroupCreateParams.PhoneNumberType.LOCAL)
                    .customerReference("My Requirement Group")
                    .addRegulatoryRequirement(
                        RequirementGroupCreateParams.RegulatoryRequirement.builder()
                            .fieldValue("field_value")
                            .requirementId("requirement_id")
                            .build()
                    )
                    .build()
            )

        val requirementGroup = requirementGroupFuture.get()
        requirementGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val requirementGroupServiceAsync = client.requirementGroups()

        val requirementGroupFuture = requirementGroupServiceAsync.retrieve("id")

        val requirementGroup = requirementGroupFuture.get()
        requirementGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val requirementGroupServiceAsync = client.requirementGroups()

        val requirementGroupFuture =
            requirementGroupServiceAsync.update(
                RequirementGroupUpdateParams.builder()
                    .id("id")
                    .customerReference("0002")
                    .addRegulatoryRequirement(
                        RequirementGroupUpdateParams.RegulatoryRequirement.builder()
                            .fieldValue("new requirement value")
                            .requirementId("53970723-fbff-4f46-a975-f62be6c1a585")
                            .build()
                    )
                    .build()
            )

        val requirementGroup = requirementGroupFuture.get()
        requirementGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val requirementGroupServiceAsync = client.requirementGroups()

        val requirementGroupsFuture =
            requirementGroupServiceAsync.list(
                RequirementGroupListParams.builder()
                    .filter(
                        RequirementGroupListParams.Filter.builder()
                            .action(RequirementGroupListParams.Filter.Action.ORDERING)
                            .countryCode("country_code")
                            .customerReference("customer_reference")
                            .phoneNumberType(
                                RequirementGroupListParams.Filter.PhoneNumberType.LOCAL
                            )
                            .status(RequirementGroupListParams.Filter.Status.APPROVED)
                            .build()
                    )
                    .build()
            )

        val requirementGroups = requirementGroupsFuture.get()
        requirementGroups.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val requirementGroupServiceAsync = client.requirementGroups()

        val requirementGroupFuture = requirementGroupServiceAsync.delete("id")

        val requirementGroup = requirementGroupFuture.get()
        requirementGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitForApproval() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val requirementGroupServiceAsync = client.requirementGroups()

        val requirementGroupFuture = requirementGroupServiceAsync.submitForApproval("id")

        val requirementGroup = requirementGroupFuture.get()
        requirementGroup.validate()
    }
}
