// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbercampaigns

import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create New Phone Number Campaign */
class PhoneNumberCampaignUpdateParams
private constructor(
    private val pathPhoneNumber: String?,
    private val phoneNumberCampaignCreate: PhoneNumberCampaignCreate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathPhoneNumber(): Optional<String> = Optional.ofNullable(pathPhoneNumber)

    fun phoneNumberCampaignCreate(): PhoneNumberCampaignCreate = phoneNumberCampaignCreate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        phoneNumberCampaignCreate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberCampaignUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .phoneNumberCampaignCreate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberCampaignUpdateParams]. */
    class Builder internal constructor() {

        private var pathPhoneNumber: String? = null
        private var phoneNumberCampaignCreate: PhoneNumberCampaignCreate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(phoneNumberCampaignUpdateParams: PhoneNumberCampaignUpdateParams) =
            apply {
                pathPhoneNumber = phoneNumberCampaignUpdateParams.pathPhoneNumber
                phoneNumberCampaignCreate =
                    phoneNumberCampaignUpdateParams.phoneNumberCampaignCreate
                additionalHeaders = phoneNumberCampaignUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    phoneNumberCampaignUpdateParams.additionalQueryParams.toBuilder()
            }

        fun pathPhoneNumber(pathPhoneNumber: String?) = apply {
            this.pathPhoneNumber = pathPhoneNumber
        }

        /** Alias for calling [Builder.pathPhoneNumber] with `pathPhoneNumber.orElse(null)`. */
        fun pathPhoneNumber(pathPhoneNumber: Optional<String>) =
            pathPhoneNumber(pathPhoneNumber.getOrNull())

        fun phoneNumberCampaignCreate(phoneNumberCampaignCreate: PhoneNumberCampaignCreate) =
            apply {
                this.phoneNumberCampaignCreate = phoneNumberCampaignCreate
            }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PhoneNumberCampaignUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .phoneNumberCampaignCreate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberCampaignUpdateParams =
            PhoneNumberCampaignUpdateParams(
                pathPhoneNumber,
                checkRequired("phoneNumberCampaignCreate", phoneNumberCampaignCreate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PhoneNumberCampaignCreate = phoneNumberCampaignCreate

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathPhoneNumber ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberCampaignUpdateParams &&
            pathPhoneNumber == other.pathPhoneNumber &&
            phoneNumberCampaignCreate == other.phoneNumberCampaignCreate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            pathPhoneNumber,
            phoneNumberCampaignCreate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PhoneNumberCampaignUpdateParams{pathPhoneNumber=$pathPhoneNumber, phoneNumberCampaignCreate=$phoneNumberCampaignCreate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
