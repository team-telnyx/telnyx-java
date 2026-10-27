// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.ippools.ips

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Add a dedicated IP to the pool with an optional routing weight. An IP can belong to one pool; to
 * move an IP that is already in a pool, use `PATCH /email/dedicated_ips/{id}` with `pool_id`.
 */
class IpCreateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The dedicated IP to add. It must belong to the account, must not be released, and must not
     * already be in a pool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dedicatedIpId(): String = body.dedicatedIpId()

    /**
     * Relative routing weight for this IP in the pool. Positive integer; defaults to 100.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weight(): Optional<Long> = body.weight()

    /**
     * Returns the raw JSON value of [dedicatedIpId].
     *
     * Unlike [dedicatedIpId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dedicatedIpId(): JsonField<String> = body._dedicatedIpId()

    /**
     * Returns the raw JSON value of [weight].
     *
     * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _weight(): JsonField<Long> = body._weight()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IpCreateParams].
         *
         * The following fields are required:
         * ```java
         * .dedicatedIpId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IpCreateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ipCreateParams: IpCreateParams) = apply {
            id = ipCreateParams.id
            body = ipCreateParams.body.toBuilder()
            additionalHeaders = ipCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ipCreateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dedicatedIpId]
         * - [weight]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The dedicated IP to add. It must belong to the account, must not be released, and must
         * not already be in a pool.
         */
        fun dedicatedIpId(dedicatedIpId: String) = apply { body.dedicatedIpId(dedicatedIpId) }

        /**
         * Sets [Builder.dedicatedIpId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dedicatedIpId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dedicatedIpId(dedicatedIpId: JsonField<String>) = apply {
            body.dedicatedIpId(dedicatedIpId)
        }

        /** Relative routing weight for this IP in the pool. Positive integer; defaults to 100. */
        fun weight(weight: Long) = apply { body.weight(weight) }

        /**
         * Sets [Builder.weight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weight(weight: JsonField<Long>) = apply { body.weight(weight) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [IpCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dedicatedIpId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IpCreateParams =
            IpCreateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dedicatedIpId: JsonField<String>,
        private val weight: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dedicated_ip_id")
            @ExcludeMissing
            dedicatedIpId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("weight") @ExcludeMissing weight: JsonField<Long> = JsonMissing.of(),
        ) : this(dedicatedIpId, weight, mutableMapOf())

        /**
         * The dedicated IP to add. It must belong to the account, must not be released, and must
         * not already be in a pool.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dedicatedIpId(): String = dedicatedIpId.getRequired("dedicated_ip_id")

        /**
         * Relative routing weight for this IP in the pool. Positive integer; defaults to 100.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weight(): Optional<Long> = weight.getOptional("weight")

        /**
         * Returns the raw JSON value of [dedicatedIpId].
         *
         * Unlike [dedicatedIpId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dedicated_ip_id")
        @ExcludeMissing
        fun _dedicatedIpId(): JsonField<String> = dedicatedIpId

        /**
         * Returns the raw JSON value of [weight].
         *
         * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .dedicatedIpId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var dedicatedIpId: JsonField<String>? = null
            private var weight: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                dedicatedIpId = body.dedicatedIpId
                weight = body.weight
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The dedicated IP to add. It must belong to the account, must not be released, and
             * must not already be in a pool.
             */
            fun dedicatedIpId(dedicatedIpId: String) = dedicatedIpId(JsonField.of(dedicatedIpId))

            /**
             * Sets [Builder.dedicatedIpId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dedicatedIpId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dedicatedIpId(dedicatedIpId: JsonField<String>) = apply {
                this.dedicatedIpId = dedicatedIpId
            }

            /**
             * Relative routing weight for this IP in the pool. Positive integer; defaults to 100.
             */
            fun weight(weight: Long) = weight(JsonField.of(weight))

            /**
             * Sets [Builder.weight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun weight(weight: JsonField<Long>) = apply { this.weight = weight }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .dedicatedIpId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("dedicatedIpId", dedicatedIpId),
                    weight,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            dedicatedIpId()
            weight()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (dedicatedIpId.asKnown().isPresent) 1 else 0) +
                (if (weight.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                dedicatedIpId == other.dedicatedIpId &&
                weight == other.weight &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dedicatedIpId, weight, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dedicatedIpId=$dedicatedIpId, weight=$weight, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IpCreateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IpCreateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
