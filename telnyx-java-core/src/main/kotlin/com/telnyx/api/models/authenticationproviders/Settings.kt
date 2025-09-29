// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.authenticationproviders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The settings associated with the authentication provider. */
class Settings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val idpCertFingerprint: JsonField<String>,
    private val idpEntityId: JsonField<String>,
    private val idpSsoTargetUrl: JsonField<String>,
    private val idpCertFingerprintAlgorithm: JsonField<IdpCertFingerprintAlgorithm>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("idp_cert_fingerprint")
        @ExcludeMissing
        idpCertFingerprint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idp_entity_id")
        @ExcludeMissing
        idpEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idp_sso_target_url")
        @ExcludeMissing
        idpSsoTargetUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idp_cert_fingerprint_algorithm")
        @ExcludeMissing
        idpCertFingerprintAlgorithm: JsonField<IdpCertFingerprintAlgorithm> = JsonMissing.of(),
    ) : this(
        idpCertFingerprint,
        idpEntityId,
        idpSsoTargetUrl,
        idpCertFingerprintAlgorithm,
        mutableMapOf(),
    )

    /**
     * The certificate fingerprint for the identity provider (IdP)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idpCertFingerprint(): String = idpCertFingerprint.getRequired("idp_cert_fingerprint")

    /**
     * The Entity ID for the identity provider (IdP).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idpEntityId(): String = idpEntityId.getRequired("idp_entity_id")

    /**
     * The SSO target url for the identity provider (IdP).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idpSsoTargetUrl(): String = idpSsoTargetUrl.getRequired("idp_sso_target_url")

    /**
     * The algorithm used to generate the identity provider's (IdP) certificate fingerprint
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idpCertFingerprintAlgorithm(): Optional<IdpCertFingerprintAlgorithm> =
        idpCertFingerprintAlgorithm.getOptional("idp_cert_fingerprint_algorithm")

    /**
     * Returns the raw JSON value of [idpCertFingerprint].
     *
     * Unlike [idpCertFingerprint], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("idp_cert_fingerprint")
    @ExcludeMissing
    fun _idpCertFingerprint(): JsonField<String> = idpCertFingerprint

    /**
     * Returns the raw JSON value of [idpEntityId].
     *
     * Unlike [idpEntityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idp_entity_id")
    @ExcludeMissing
    fun _idpEntityId(): JsonField<String> = idpEntityId

    /**
     * Returns the raw JSON value of [idpSsoTargetUrl].
     *
     * Unlike [idpSsoTargetUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idp_sso_target_url")
    @ExcludeMissing
    fun _idpSsoTargetUrl(): JsonField<String> = idpSsoTargetUrl

    /**
     * Returns the raw JSON value of [idpCertFingerprintAlgorithm].
     *
     * Unlike [idpCertFingerprintAlgorithm], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("idp_cert_fingerprint_algorithm")
    @ExcludeMissing
    fun _idpCertFingerprintAlgorithm(): JsonField<IdpCertFingerprintAlgorithm> =
        idpCertFingerprintAlgorithm

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
         * Returns a mutable builder for constructing an instance of [Settings].
         *
         * The following fields are required:
         * ```java
         * .idpCertFingerprint()
         * .idpEntityId()
         * .idpSsoTargetUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Settings]. */
    class Builder internal constructor() {

        private var idpCertFingerprint: JsonField<String>? = null
        private var idpEntityId: JsonField<String>? = null
        private var idpSsoTargetUrl: JsonField<String>? = null
        private var idpCertFingerprintAlgorithm: JsonField<IdpCertFingerprintAlgorithm> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settings: Settings) = apply {
            idpCertFingerprint = settings.idpCertFingerprint
            idpEntityId = settings.idpEntityId
            idpSsoTargetUrl = settings.idpSsoTargetUrl
            idpCertFingerprintAlgorithm = settings.idpCertFingerprintAlgorithm
            additionalProperties = settings.additionalProperties.toMutableMap()
        }

        /** The certificate fingerprint for the identity provider (IdP) */
        fun idpCertFingerprint(idpCertFingerprint: String) =
            idpCertFingerprint(JsonField.of(idpCertFingerprint))

        /**
         * Sets [Builder.idpCertFingerprint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idpCertFingerprint] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idpCertFingerprint(idpCertFingerprint: JsonField<String>) = apply {
            this.idpCertFingerprint = idpCertFingerprint
        }

        /** The Entity ID for the identity provider (IdP). */
        fun idpEntityId(idpEntityId: String) = idpEntityId(JsonField.of(idpEntityId))

        /**
         * Sets [Builder.idpEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idpEntityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idpEntityId(idpEntityId: JsonField<String>) = apply { this.idpEntityId = idpEntityId }

        /** The SSO target url for the identity provider (IdP). */
        fun idpSsoTargetUrl(idpSsoTargetUrl: String) =
            idpSsoTargetUrl(JsonField.of(idpSsoTargetUrl))

        /**
         * Sets [Builder.idpSsoTargetUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idpSsoTargetUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idpSsoTargetUrl(idpSsoTargetUrl: JsonField<String>) = apply {
            this.idpSsoTargetUrl = idpSsoTargetUrl
        }

        /** The algorithm used to generate the identity provider's (IdP) certificate fingerprint */
        fun idpCertFingerprintAlgorithm(idpCertFingerprintAlgorithm: IdpCertFingerprintAlgorithm) =
            idpCertFingerprintAlgorithm(JsonField.of(idpCertFingerprintAlgorithm))

        /**
         * Sets [Builder.idpCertFingerprintAlgorithm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idpCertFingerprintAlgorithm] with a well-typed
         * [IdpCertFingerprintAlgorithm] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun idpCertFingerprintAlgorithm(
            idpCertFingerprintAlgorithm: JsonField<IdpCertFingerprintAlgorithm>
        ) = apply { this.idpCertFingerprintAlgorithm = idpCertFingerprintAlgorithm }

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
         * Returns an immutable instance of [Settings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .idpCertFingerprint()
         * .idpEntityId()
         * .idpSsoTargetUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Settings =
            Settings(
                checkRequired("idpCertFingerprint", idpCertFingerprint),
                checkRequired("idpEntityId", idpEntityId),
                checkRequired("idpSsoTargetUrl", idpSsoTargetUrl),
                idpCertFingerprintAlgorithm,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Settings = apply {
        if (validated) {
            return@apply
        }

        idpCertFingerprint()
        idpEntityId()
        idpSsoTargetUrl()
        idpCertFingerprintAlgorithm().ifPresent { it.validate() }
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
        (if (idpCertFingerprint.asKnown().isPresent) 1 else 0) +
            (if (idpEntityId.asKnown().isPresent) 1 else 0) +
            (if (idpSsoTargetUrl.asKnown().isPresent) 1 else 0) +
            (idpCertFingerprintAlgorithm.asKnown().getOrNull()?.validity() ?: 0)

    /** The algorithm used to generate the identity provider's (IdP) certificate fingerprint */
    class IdpCertFingerprintAlgorithm
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SHA1 = of("sha1")

            @JvmField val SHA256 = of("sha256")

            @JvmField val SHA384 = of("sha384")

            @JvmField val SHA512 = of("sha512")

            @JvmStatic fun of(value: String) = IdpCertFingerprintAlgorithm(JsonField.of(value))
        }

        /** An enum containing [IdpCertFingerprintAlgorithm]'s known values. */
        enum class Known {
            SHA1,
            SHA256,
            SHA384,
            SHA512,
        }

        /**
         * An enum containing [IdpCertFingerprintAlgorithm]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [IdpCertFingerprintAlgorithm] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SHA1,
            SHA256,
            SHA384,
            SHA512,
            /**
             * An enum member indicating that [IdpCertFingerprintAlgorithm] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SHA1 -> Value.SHA1
                SHA256 -> Value.SHA256
                SHA384 -> Value.SHA384
                SHA512 -> Value.SHA512
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SHA1 -> Known.SHA1
                SHA256 -> Known.SHA256
                SHA384 -> Known.SHA384
                SHA512 -> Known.SHA512
                else ->
                    throw TelnyxInvalidDataException("Unknown IdpCertFingerprintAlgorithm: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): IdpCertFingerprintAlgorithm = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IdpCertFingerprintAlgorithm && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Settings &&
            idpCertFingerprint == other.idpCertFingerprint &&
            idpEntityId == other.idpEntityId &&
            idpSsoTargetUrl == other.idpSsoTargetUrl &&
            idpCertFingerprintAlgorithm == other.idpCertFingerprintAlgorithm &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            idpCertFingerprint,
            idpEntityId,
            idpSsoTargetUrl,
            idpCertFingerprintAlgorithm,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Settings{idpCertFingerprint=$idpCertFingerprint, idpEntityId=$idpEntityId, idpSsoTargetUrl=$idpSsoTargetUrl, idpCertFingerprintAlgorithm=$idpCertFingerprintAlgorithm, additionalProperties=$additionalProperties}"
}
