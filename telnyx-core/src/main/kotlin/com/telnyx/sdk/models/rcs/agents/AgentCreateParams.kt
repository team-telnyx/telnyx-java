// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

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
 * Creates an editable RCS agent draft under a brand. The `Idempotency-Key` is scoped to the
 * authenticated organization. Reusing the key with the same request returns the original agent,
 * while reusing it with a different request returns a conflict.
 */
class AgentCreateParams
private constructor(
    private val idempotencyKey: String,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun idempotencyKey(): String = idempotencyKey

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = body.brandId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configuration(): AgentConfiguration = body.configuration()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = body.displayName()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useCase(): AgentUseCase = body.useCase()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hostingRegion(): Optional<String> = body.hostingRegion()

    /**
     * A Messaging Profile owned by the authenticated organization. When omitted, the agent inherits
     * the brand profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profileId(): Optional<String> = body.profileId()

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _brandId(): JsonField<String> = body._brandId()

    /**
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _configuration(): JsonField<AgentConfiguration> = body._configuration()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [useCase].
     *
     * Unlike [useCase], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _useCase(): JsonField<AgentUseCase> = body._useCase()

    /**
     * Returns the raw JSON value of [hostingRegion].
     *
     * Unlike [hostingRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hostingRegion(): JsonField<String> = body._hostingRegion()

    /**
     * Returns the raw JSON value of [profileId].
     *
     * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _profileId(): JsonField<String> = body._profileId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentCreateParams].
         *
         * The following fields are required:
         * ```java
         * .idempotencyKey()
         * .brandId()
         * .configuration()
         * .displayName()
         * .useCase()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentCreateParams]. */
    class Builder internal constructor() {

        private var idempotencyKey: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(agentCreateParams: AgentCreateParams) = apply {
            idempotencyKey = agentCreateParams.idempotencyKey
            body = agentCreateParams.body.toBuilder()
            additionalHeaders = agentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentCreateParams.additionalQueryParams.toBuilder()
        }

        fun idempotencyKey(idempotencyKey: String) = apply { this.idempotencyKey = idempotencyKey }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [brandId]
         * - [configuration]
         * - [displayName]
         * - [useCase]
         * - [hostingRegion]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun brandId(brandId: String) = apply { body.brandId(brandId) }

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { body.brandId(brandId) }

        fun configuration(configuration: AgentConfiguration) = apply {
            body.configuration(configuration)
        }

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [AgentConfiguration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun configuration(configuration: JsonField<AgentConfiguration>) = apply {
            body.configuration(configuration)
        }

        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        fun useCase(useCase: AgentUseCase) = apply { body.useCase(useCase) }

        /**
         * Sets [Builder.useCase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCase] with a well-typed [AgentUseCase] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun useCase(useCase: JsonField<AgentUseCase>) = apply { body.useCase(useCase) }

        fun hostingRegion(hostingRegion: String?) = apply { body.hostingRegion(hostingRegion) }

        /** Alias for calling [Builder.hostingRegion] with `hostingRegion.orElse(null)`. */
        fun hostingRegion(hostingRegion: Optional<String>) =
            hostingRegion(hostingRegion.getOrNull())

        /**
         * Sets [Builder.hostingRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostingRegion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hostingRegion(hostingRegion: JsonField<String>) = apply {
            body.hostingRegion(hostingRegion)
        }

        /**
         * A Messaging Profile owned by the authenticated organization. When omitted, the agent
         * inherits the brand profile.
         */
        fun profileId(profileId: String?) = apply { body.profileId(profileId) }

        /** Alias for calling [Builder.profileId] with `profileId.orElse(null)`. */
        fun profileId(profileId: Optional<String>) = profileId(profileId.getOrNull())

        /**
         * Sets [Builder.profileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun profileId(profileId: JsonField<String>) = apply { body.profileId(profileId) }

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
         * Returns an immutable instance of [AgentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .idempotencyKey()
         * .brandId()
         * .configuration()
         * .displayName()
         * .useCase()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentCreateParams =
            AgentCreateParams(
                checkRequired("idempotencyKey", idempotencyKey),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers =
        com.telnyx.sdk.core.http.Headers.builder()
            .apply {
                put("Idempotency-Key", idempotencyKey)
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val brandId: JsonField<String>,
        private val configuration: JsonField<AgentConfiguration>,
        private val displayName: JsonField<String>,
        private val useCase: JsonField<AgentUseCase>,
        private val hostingRegion: JsonField<String>,
        private val profileId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<AgentConfiguration> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("use_case")
            @ExcludeMissing
            useCase: JsonField<AgentUseCase> = JsonMissing.of(),
            @JsonProperty("hosting_region")
            @ExcludeMissing
            hostingRegion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("profile_id")
            @ExcludeMissing
            profileId: JsonField<String> = JsonMissing.of(),
        ) : this(
            brandId,
            configuration,
            displayName,
            useCase,
            hostingRegion,
            profileId,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun brandId(): String = brandId.getRequired("brand_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun configuration(): AgentConfiguration = configuration.getRequired("configuration")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("display_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun useCase(): AgentUseCase = useCase.getRequired("use_case")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hostingRegion(): Optional<String> = hostingRegion.getOptional("hosting_region")

        /**
         * A Messaging Profile owned by the authenticated organization. When omitted, the agent
         * inherits the brand profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun profileId(): Optional<String> = profileId.getOptional("profile_id")

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<AgentConfiguration> = configuration

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [useCase].
         *
         * Unlike [useCase], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("use_case") @ExcludeMissing fun _useCase(): JsonField<AgentUseCase> = useCase

        /**
         * Returns the raw JSON value of [hostingRegion].
         *
         * Unlike [hostingRegion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hosting_region")
        @ExcludeMissing
        fun _hostingRegion(): JsonField<String> = hostingRegion

        /**
         * Returns the raw JSON value of [profileId].
         *
         * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("profile_id") @ExcludeMissing fun _profileId(): JsonField<String> = profileId

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
             * .brandId()
             * .configuration()
             * .displayName()
             * .useCase()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var brandId: JsonField<String>? = null
            private var configuration: JsonField<AgentConfiguration>? = null
            private var displayName: JsonField<String>? = null
            private var useCase: JsonField<AgentUseCase>? = null
            private var hostingRegion: JsonField<String> = JsonMissing.of()
            private var profileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                brandId = body.brandId
                configuration = body.configuration
                displayName = body.displayName
                useCase = body.useCase
                hostingRegion = body.hostingRegion
                profileId = body.profileId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun brandId(brandId: String) = brandId(JsonField.of(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            fun configuration(configuration: AgentConfiguration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed
             * [AgentConfiguration] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun configuration(configuration: JsonField<AgentConfiguration>) = apply {
                this.configuration = configuration
            }

            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            fun useCase(useCase: AgentUseCase) = useCase(JsonField.of(useCase))

            /**
             * Sets [Builder.useCase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useCase] with a well-typed [AgentUseCase] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useCase(useCase: JsonField<AgentUseCase>) = apply { this.useCase = useCase }

            fun hostingRegion(hostingRegion: String?) =
                hostingRegion(JsonField.ofNullable(hostingRegion))

            /** Alias for calling [Builder.hostingRegion] with `hostingRegion.orElse(null)`. */
            fun hostingRegion(hostingRegion: Optional<String>) =
                hostingRegion(hostingRegion.getOrNull())

            /**
             * Sets [Builder.hostingRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostingRegion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hostingRegion(hostingRegion: JsonField<String>) = apply {
                this.hostingRegion = hostingRegion
            }

            /**
             * A Messaging Profile owned by the authenticated organization. When omitted, the agent
             * inherits the brand profile.
             */
            fun profileId(profileId: String?) = profileId(JsonField.ofNullable(profileId))

            /** Alias for calling [Builder.profileId] with `profileId.orElse(null)`. */
            fun profileId(profileId: Optional<String>) = profileId(profileId.getOrNull())

            /**
             * Sets [Builder.profileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profileId(profileId: JsonField<String>) = apply { this.profileId = profileId }

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
             * .brandId()
             * .configuration()
             * .displayName()
             * .useCase()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("brandId", brandId),
                    checkRequired("configuration", configuration),
                    checkRequired("displayName", displayName),
                    checkRequired("useCase", useCase),
                    hostingRegion,
                    profileId,
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

            brandId()
            configuration().validate()
            displayName()
            useCase().validate()
            hostingRegion()
            profileId()
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
            (if (brandId.asKnown().isPresent) 1 else 0) +
                (configuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (useCase.asKnown().getOrNull()?.validity() ?: 0) +
                (if (hostingRegion.asKnown().isPresent) 1 else 0) +
                (if (profileId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                brandId == other.brandId &&
                configuration == other.configuration &&
                displayName == other.displayName &&
                useCase == other.useCase &&
                hostingRegion == other.hostingRegion &&
                profileId == other.profileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                brandId,
                configuration,
                displayName,
                useCase,
                hostingRegion,
                profileId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{brandId=$brandId, configuration=$configuration, displayName=$displayName, useCase=$useCase, hostingRegion=$hostingRegion, profileId=$profileId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentCreateParams &&
            idempotencyKey == other.idempotencyKey &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(idempotencyKey, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentCreateParams{idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
