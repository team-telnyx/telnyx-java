// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.mcpservers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The gateway signs each request with AWS Signature Version 4. Without keys or a role, it uses the
 * instance's own AWS identity. Keys are write-only.
 */
class AgentGatewayAwsSigV4Auth
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val region: JsonField<String>,
    private val type: JsonValue,
    private val accessKeyId: JsonField<String>,
    private val roleName: JsonField<String>,
    private val secretAccessKey: JsonField<String>,
    private val service: JsonField<String>,
    private val sessionToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("access_key_id")
        @ExcludeMissing
        accessKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("role_name") @ExcludeMissing roleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secret_access_key")
        @ExcludeMissing
        secretAccessKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service") @ExcludeMissing service: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_token")
        @ExcludeMissing
        sessionToken: JsonField<String> = JsonMissing.of(),
    ) : this(
        region,
        type,
        accessKeyId,
        roleName,
        secretAccessKey,
        service,
        sessionToken,
        mutableMapOf(),
    )

    /**
     * The AWS region to sign for.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun region(): String = region.getRequired("region")

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("aws_sigv4")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessKeyId(): Optional<String> = accessKeyId.getOptional("access_key_id")

    /**
     * The ARN of a role for the gateway to assume.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleName(): Optional<String> = roleName.getOptional("role_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secretAccessKey(): Optional<String> = secretAccessKey.getOptional("secret_access_key")

    /**
     * The AWS service to sign for.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun service(): Optional<String> = service.getOptional("service")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionToken(): Optional<String> = sessionToken.getOptional("session_token")

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [accessKeyId].
     *
     * Unlike [accessKeyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_key_id")
    @ExcludeMissing
    fun _accessKeyId(): JsonField<String> = accessKeyId

    /**
     * Returns the raw JSON value of [roleName].
     *
     * Unlike [roleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("role_name") @ExcludeMissing fun _roleName(): JsonField<String> = roleName

    /**
     * Returns the raw JSON value of [secretAccessKey].
     *
     * Unlike [secretAccessKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secret_access_key")
    @ExcludeMissing
    fun _secretAccessKey(): JsonField<String> = secretAccessKey

    /**
     * Returns the raw JSON value of [service].
     *
     * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<String> = service

    /**
     * Returns the raw JSON value of [sessionToken].
     *
     * Unlike [sessionToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_token")
    @ExcludeMissing
    fun _sessionToken(): JsonField<String> = sessionToken

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
         * Returns a mutable builder for constructing an instance of [AgentGatewayAwsSigV4Auth].
         *
         * The following fields are required:
         * ```java
         * .region()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayAwsSigV4Auth]. */
    class Builder internal constructor() {

        private var region: JsonField<String>? = null
        private var type: JsonValue = JsonValue.from("aws_sigv4")
        private var accessKeyId: JsonField<String> = JsonMissing.of()
        private var roleName: JsonField<String> = JsonMissing.of()
        private var secretAccessKey: JsonField<String> = JsonMissing.of()
        private var service: JsonField<String> = JsonMissing.of()
        private var sessionToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayAwsSigV4Auth: AgentGatewayAwsSigV4Auth) = apply {
            region = agentGatewayAwsSigV4Auth.region
            type = agentGatewayAwsSigV4Auth.type
            accessKeyId = agentGatewayAwsSigV4Auth.accessKeyId
            roleName = agentGatewayAwsSigV4Auth.roleName
            secretAccessKey = agentGatewayAwsSigV4Auth.secretAccessKey
            service = agentGatewayAwsSigV4Auth.service
            sessionToken = agentGatewayAwsSigV4Auth.sessionToken
            additionalProperties = agentGatewayAwsSigV4Auth.additionalProperties.toMutableMap()
        }

        /** The AWS region to sign for. */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("aws_sigv4")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        fun accessKeyId(accessKeyId: String?) = accessKeyId(JsonField.ofNullable(accessKeyId))

        /** Alias for calling [Builder.accessKeyId] with `accessKeyId.orElse(null)`. */
        fun accessKeyId(accessKeyId: Optional<String>) = accessKeyId(accessKeyId.getOrNull())

        /**
         * Sets [Builder.accessKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessKeyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accessKeyId(accessKeyId: JsonField<String>) = apply { this.accessKeyId = accessKeyId }

        /** The ARN of a role for the gateway to assume. */
        fun roleName(roleName: String?) = roleName(JsonField.ofNullable(roleName))

        /** Alias for calling [Builder.roleName] with `roleName.orElse(null)`. */
        fun roleName(roleName: Optional<String>) = roleName(roleName.getOrNull())

        /**
         * Sets [Builder.roleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun roleName(roleName: JsonField<String>) = apply { this.roleName = roleName }

        fun secretAccessKey(secretAccessKey: String?) =
            secretAccessKey(JsonField.ofNullable(secretAccessKey))

        /** Alias for calling [Builder.secretAccessKey] with `secretAccessKey.orElse(null)`. */
        fun secretAccessKey(secretAccessKey: Optional<String>) =
            secretAccessKey(secretAccessKey.getOrNull())

        /**
         * Sets [Builder.secretAccessKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secretAccessKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secretAccessKey(secretAccessKey: JsonField<String>) = apply {
            this.secretAccessKey = secretAccessKey
        }

        /** The AWS service to sign for. */
        fun service(service: String) = service(JsonField.of(service))

        /**
         * Sets [Builder.service] to an arbitrary JSON value.
         *
         * You should usually call [Builder.service] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun service(service: JsonField<String>) = apply { this.service = service }

        fun sessionToken(sessionToken: String?) = sessionToken(JsonField.ofNullable(sessionToken))

        /** Alias for calling [Builder.sessionToken] with `sessionToken.orElse(null)`. */
        fun sessionToken(sessionToken: Optional<String>) = sessionToken(sessionToken.getOrNull())

        /**
         * Sets [Builder.sessionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionToken(sessionToken: JsonField<String>) = apply {
            this.sessionToken = sessionToken
        }

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
         * Returns an immutable instance of [AgentGatewayAwsSigV4Auth].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .region()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGatewayAwsSigV4Auth =
            AgentGatewayAwsSigV4Auth(
                checkRequired("region", region),
                type,
                accessKeyId,
                roleName,
                secretAccessKey,
                service,
                sessionToken,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AgentGatewayAwsSigV4Auth = apply {
        if (validated) {
            return@apply
        }

        region()
        _type().let {
            if (it != JsonValue.from("aws_sigv4")) {
                throw TelnyxInvalidDataException("'type' is invalid, received $it")
            }
        }
        accessKeyId()
        roleName()
        secretAccessKey()
        service()
        sessionToken()
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
        (if (region.asKnown().isPresent) 1 else 0) +
            type.let { if (it == JsonValue.from("aws_sigv4")) 1 else 0 } +
            (if (accessKeyId.asKnown().isPresent) 1 else 0) +
            (if (roleName.asKnown().isPresent) 1 else 0) +
            (if (secretAccessKey.asKnown().isPresent) 1 else 0) +
            (if (service.asKnown().isPresent) 1 else 0) +
            (if (sessionToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayAwsSigV4Auth &&
            region == other.region &&
            type == other.type &&
            accessKeyId == other.accessKeyId &&
            roleName == other.roleName &&
            secretAccessKey == other.secretAccessKey &&
            service == other.service &&
            sessionToken == other.sessionToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            region,
            type,
            accessKeyId,
            roleName,
            secretAccessKey,
            service,
            sessionToken,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayAwsSigV4Auth{region=$region, type=$type, accessKeyId=$accessKeyId, roleName=$roleName, secretAccessKey=$secretAccessKey, service=$service, sessionToken=$sessionToken, additionalProperties=$additionalProperties}"
}
