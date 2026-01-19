// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingurldomains

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class MessagingUrlDomainListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val recordType: JsonField<String>,
    private val urlDomain: JsonField<String>,
    private val useCase: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url_domain") @ExcludeMissing urlDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("use_case") @ExcludeMissing useCase: JsonField<String> = JsonMissing.of(),
    ) : this(id, recordType, urlDomain, useCase, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun urlDomain(): Optional<String> = urlDomain.getOptional("url_domain")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useCase(): Optional<String> = useCase.getOptional("use_case")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [urlDomain].
     *
     * Unlike [urlDomain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url_domain") @ExcludeMissing fun _urlDomain(): JsonField<String> = urlDomain

    /**
     * Returns the raw JSON value of [useCase].
     *
     * Unlike [useCase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("use_case") @ExcludeMissing fun _useCase(): JsonField<String> = useCase

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingUrlDomainListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingUrlDomainListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var urlDomain: JsonField<String> = JsonMissing.of()
        private var useCase: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messagingUrlDomainListResponse: MessagingUrlDomainListResponse) = apply {
            id = messagingUrlDomainListResponse.id
            recordType = messagingUrlDomainListResponse.recordType
            urlDomain = messagingUrlDomainListResponse.urlDomain
            useCase = messagingUrlDomainListResponse.useCase
            additionalProperties =
                messagingUrlDomainListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        fun urlDomain(urlDomain: String) = urlDomain(JsonField.of(urlDomain))

        /**
         * Sets [Builder.urlDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urlDomain] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun urlDomain(urlDomain: JsonField<String>) = apply { this.urlDomain = urlDomain }

        fun useCase(useCase: String) = useCase(JsonField.of(useCase))

        /**
         * Sets [Builder.useCase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCase] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun useCase(useCase: JsonField<String>) = apply { this.useCase = useCase }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [MessagingUrlDomainListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingUrlDomainListResponse =
            MessagingUrlDomainListResponse(
                id,
                recordType,
                urlDomain,
                useCase,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessagingUrlDomainListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        recordType()
        urlDomain()
        useCase()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TelnyxInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (urlDomain.asKnown().isPresent) 1 else 0) +
            (if (useCase.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingUrlDomainListResponse &&
            id == other.id &&
            recordType == other.recordType &&
            urlDomain == other.urlDomain &&
            useCase == other.useCase &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, recordType, urlDomain, useCase, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessagingUrlDomainListResponse{id=$id, recordType=$recordType, urlDomain=$urlDomain, useCase=$useCase, additionalProperties=$additionalProperties}"
}
