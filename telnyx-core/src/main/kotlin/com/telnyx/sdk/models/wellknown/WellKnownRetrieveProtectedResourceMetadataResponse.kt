// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wellknown

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WellKnownRetrieveProtectedResourceMetadataResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authorizationServers: JsonField<List<String>>,
    private val resource: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authorization_servers")
        @ExcludeMissing
        authorizationServers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("resource") @ExcludeMissing resource: JsonField<String> = JsonMissing.of(),
    ) : this(authorizationServers, resource, mutableMapOf())

    /**
     * List of authorization server URLs
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizationServers(): Optional<List<String>> =
        authorizationServers.getOptional("authorization_servers")

    /**
     * Protected resource URL
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resource(): Optional<String> = resource.getOptional("resource")

    /**
     * Returns the raw JSON value of [authorizationServers].
     *
     * Unlike [authorizationServers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authorization_servers")
    @ExcludeMissing
    fun _authorizationServers(): JsonField<List<String>> = authorizationServers

    /**
     * Returns the raw JSON value of [resource].
     *
     * Unlike [resource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource") @ExcludeMissing fun _resource(): JsonField<String> = resource

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
         * [WellKnownRetrieveProtectedResourceMetadataResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WellKnownRetrieveProtectedResourceMetadataResponse]. */
    class Builder internal constructor() {

        private var authorizationServers: JsonField<MutableList<String>>? = null
        private var resource: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            wellKnownRetrieveProtectedResourceMetadataResponse:
                WellKnownRetrieveProtectedResourceMetadataResponse
        ) = apply {
            authorizationServers =
                wellKnownRetrieveProtectedResourceMetadataResponse.authorizationServers.map {
                    it.toMutableList()
                }
            resource = wellKnownRetrieveProtectedResourceMetadataResponse.resource
            additionalProperties =
                wellKnownRetrieveProtectedResourceMetadataResponse.additionalProperties
                    .toMutableMap()
        }

        /** List of authorization server URLs */
        fun authorizationServers(authorizationServers: List<String>) =
            authorizationServers(JsonField.of(authorizationServers))

        /**
         * Sets [Builder.authorizationServers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationServers] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun authorizationServers(authorizationServers: JsonField<List<String>>) = apply {
            this.authorizationServers = authorizationServers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [authorizationServers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAuthorizationServer(authorizationServer: String) = apply {
            authorizationServers =
                (authorizationServers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("authorizationServers", it).add(authorizationServer)
                }
        }

        /** Protected resource URL */
        fun resource(resource: String) = resource(JsonField.of(resource))

        /**
         * Sets [Builder.resource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resource] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun resource(resource: JsonField<String>) = apply { this.resource = resource }

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
         * Returns an immutable instance of [WellKnownRetrieveProtectedResourceMetadataResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WellKnownRetrieveProtectedResourceMetadataResponse =
            WellKnownRetrieveProtectedResourceMetadataResponse(
                (authorizationServers ?: JsonMissing.of()).map { it.toImmutable() },
                resource,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WellKnownRetrieveProtectedResourceMetadataResponse = apply {
        if (validated) {
            return@apply
        }

        authorizationServers()
        resource()
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
        (authorizationServers.asKnown().getOrNull()?.size ?: 0) +
            (if (resource.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WellKnownRetrieveProtectedResourceMetadataResponse &&
            authorizationServers == other.authorizationServers &&
            resource == other.resource &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authorizationServers, resource, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WellKnownRetrieveProtectedResourceMetadataResponse{authorizationServers=$authorizationServers, resource=$resource, additionalProperties=$additionalProperties}"
}
