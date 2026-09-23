// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConnectionRetrieveCountResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [ConnectionRetrieveCountResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionRetrieveCountResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionRetrieveCountResponse: ConnectionRetrieveCountResponse) =
            apply {
                data = connectionRetrieveCountResponse.data
                additionalProperties =
                    connectionRetrieveCountResponse.additionalProperties.toMutableMap()
            }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [ConnectionRetrieveCountResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConnectionRetrieveCountResponse =
            ConnectionRetrieveCountResponse(
                checkRequired("data", data),
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
    fun validate(): ConnectionRetrieveCountResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val counts: JsonField<Counts>,
        private val limits: JsonField<Limits>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("counts") @ExcludeMissing counts: JsonField<Counts> = JsonMissing.of(),
            @JsonProperty("limits") @ExcludeMissing limits: JsonField<Limits> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(counts, limits, recordType, mutableMapOf())

        /**
         * Counts of the authenticated user's connections, grouped by connection type. Forward-only
         * connections are excluded.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun counts(): Counts = counts.getRequired("counts")

        /**
         * Connection limits that apply to the user. Contains a single global_limit when a global
         * connection limit applies, or per-type limits (standard_limit, texml_limit and uac_limit)
         * when the user has per-type connection count capabilities.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun limits(): Limits = limits.getRequired("limits")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

        /**
         * Returns the raw JSON value of [counts].
         *
         * Unlike [counts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("counts") @ExcludeMissing fun _counts(): JsonField<Counts> = counts

        /**
         * Returns the raw JSON value of [limits].
         *
         * Unlike [limits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limits") @ExcludeMissing fun _limits(): JsonField<Limits> = limits

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .counts()
             * .limits()
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var counts: JsonField<Counts>? = null
            private var limits: JsonField<Limits>? = null
            private var recordType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                counts = data.counts
                limits = data.limits
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * Counts of the authenticated user's connections, grouped by connection type.
             * Forward-only connections are excluded.
             */
            fun counts(counts: Counts) = counts(JsonField.of(counts))

            /**
             * Sets [Builder.counts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counts] with a well-typed [Counts] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun counts(counts: JsonField<Counts>) = apply { this.counts = counts }

            /**
             * Connection limits that apply to the user. Contains a single global_limit when a
             * global connection limit applies, or per-type limits (standard_limit, texml_limit and
             * uac_limit) when the user has per-type connection count capabilities.
             */
            fun limits(limits: Limits) = limits(JsonField.of(limits))

            /**
             * Sets [Builder.limits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limits] with a well-typed [Limits] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limits(limits: JsonField<Limits>) = apply { this.limits = limits }

            /**
             * Alias for calling [limits] with
             * `Limits.ofGlobalConnectionLimit(globalConnectionLimit)`.
             */
            fun limits(globalConnectionLimit: Limits.GlobalConnectionLimit) =
                limits(Limits.ofGlobalConnectionLimit(globalConnectionLimit))

            /** Alias for calling [limits] with `Limits.ofPerTypeConnection(perTypeConnection)`. */
            fun limits(perTypeConnection: Limits.PerTypeConnectionLimits) =
                limits(Limits.ofPerTypeConnection(perTypeConnection))

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .counts()
             * .limits()
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("counts", counts),
                    checkRequired("limits", limits),
                    checkRequired("recordType", recordType),
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            counts().validate()
            limits().validate()
            recordType()
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
            (counts.asKnown().getOrNull()?.validity() ?: 0) +
                (limits.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        /**
         * Counts of the authenticated user's connections, grouped by connection type. Forward-only
         * connections are excluded.
         */
        class Counts
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val callControlApplications: JsonField<Long>,
            private val credentialConnections: JsonField<Long>,
            private val externalConnections: JsonField<Long>,
            private val faxConnections: JsonField<Long>,
            private val fqdnConnections: JsonField<Long>,
            private val ipConnections: JsonField<Long>,
            private val microsoftTeamsSbcConnections: JsonField<Long>,
            private val mobileVoiceConnections: JsonField<Long>,
            private val operatorConnectConnections: JsonField<Long>,
            private val texmlApplications: JsonField<Long>,
            private val thirdPartyProviderConnections: JsonField<Long>,
            private val uacConnections: JsonField<Long>,
            private val zoomSbcConnections: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("call_control_applications")
                @ExcludeMissing
                callControlApplications: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("credential_connections")
                @ExcludeMissing
                credentialConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("external_connections")
                @ExcludeMissing
                externalConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("fax_connections")
                @ExcludeMissing
                faxConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("fqdn_connections")
                @ExcludeMissing
                fqdnConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("ip_connections")
                @ExcludeMissing
                ipConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("microsoft_teams_sbc_connections")
                @ExcludeMissing
                microsoftTeamsSbcConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("mobile_voice_connections")
                @ExcludeMissing
                mobileVoiceConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("operator_connect_connections")
                @ExcludeMissing
                operatorConnectConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("texml_applications")
                @ExcludeMissing
                texmlApplications: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("third_party_provider_connections")
                @ExcludeMissing
                thirdPartyProviderConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("uac_connections")
                @ExcludeMissing
                uacConnections: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("zoom_sbc_connections")
                @ExcludeMissing
                zoomSbcConnections: JsonField<Long> = JsonMissing.of(),
            ) : this(
                callControlApplications,
                credentialConnections,
                externalConnections,
                faxConnections,
                fqdnConnections,
                ipConnections,
                microsoftTeamsSbcConnections,
                mobileVoiceConnections,
                operatorConnectConnections,
                texmlApplications,
                thirdPartyProviderConnections,
                uacConnections,
                zoomSbcConnections,
                mutableMapOf(),
            )

            /**
             * Number of Call Control applications.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun callControlApplications(): Long =
                callControlApplications.getRequired("call_control_applications")

            /**
             * Number of credential connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun credentialConnections(): Long =
                credentialConnections.getRequired("credential_connections")

            /**
             * Number of external connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun externalConnections(): Long =
                externalConnections.getRequired("external_connections")

            /**
             * Number of Fax applications.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun faxConnections(): Long = faxConnections.getRequired("fax_connections")

            /**
             * Number of FQDN connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fqdnConnections(): Long = fqdnConnections.getRequired("fqdn_connections")

            /**
             * Number of IP connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ipConnections(): Long = ipConnections.getRequired("ip_connections")

            /**
             * Number of Microsoft Teams SBC (direct routing) connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun microsoftTeamsSbcConnections(): Long =
                microsoftTeamsSbcConnections.getRequired("microsoft_teams_sbc_connections")

            /**
             * Number of mobile voice (IMS) connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mobileVoiceConnections(): Long =
                mobileVoiceConnections.getRequired("mobile_voice_connections")

            /**
             * Number of Microsoft Operator Connect connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operatorConnectConnections(): Long =
                operatorConnectConnections.getRequired("operator_connect_connections")

            /**
             * Number of TeXML applications.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun texmlApplications(): Long = texmlApplications.getRequired("texml_applications")

            /**
             * Number of third-party provider connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun thirdPartyProviderConnections(): Long =
                thirdPartyProviderConnections.getRequired("third_party_provider_connections")

            /**
             * Number of UAC connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun uacConnections(): Long = uacConnections.getRequired("uac_connections")

            /**
             * Number of Zoom SBC connections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun zoomSbcConnections(): Long = zoomSbcConnections.getRequired("zoom_sbc_connections")

            /**
             * Returns the raw JSON value of [callControlApplications].
             *
             * Unlike [callControlApplications], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("call_control_applications")
            @ExcludeMissing
            fun _callControlApplications(): JsonField<Long> = callControlApplications

            /**
             * Returns the raw JSON value of [credentialConnections].
             *
             * Unlike [credentialConnections], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("credential_connections")
            @ExcludeMissing
            fun _credentialConnections(): JsonField<Long> = credentialConnections

            /**
             * Returns the raw JSON value of [externalConnections].
             *
             * Unlike [externalConnections], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_connections")
            @ExcludeMissing
            fun _externalConnections(): JsonField<Long> = externalConnections

            /**
             * Returns the raw JSON value of [faxConnections].
             *
             * Unlike [faxConnections], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fax_connections")
            @ExcludeMissing
            fun _faxConnections(): JsonField<Long> = faxConnections

            /**
             * Returns the raw JSON value of [fqdnConnections].
             *
             * Unlike [fqdnConnections], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fqdn_connections")
            @ExcludeMissing
            fun _fqdnConnections(): JsonField<Long> = fqdnConnections

            /**
             * Returns the raw JSON value of [ipConnections].
             *
             * Unlike [ipConnections], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ip_connections")
            @ExcludeMissing
            fun _ipConnections(): JsonField<Long> = ipConnections

            /**
             * Returns the raw JSON value of [microsoftTeamsSbcConnections].
             *
             * Unlike [microsoftTeamsSbcConnections], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("microsoft_teams_sbc_connections")
            @ExcludeMissing
            fun _microsoftTeamsSbcConnections(): JsonField<Long> = microsoftTeamsSbcConnections

            /**
             * Returns the raw JSON value of [mobileVoiceConnections].
             *
             * Unlike [mobileVoiceConnections], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mobile_voice_connections")
            @ExcludeMissing
            fun _mobileVoiceConnections(): JsonField<Long> = mobileVoiceConnections

            /**
             * Returns the raw JSON value of [operatorConnectConnections].
             *
             * Unlike [operatorConnectConnections], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("operator_connect_connections")
            @ExcludeMissing
            fun _operatorConnectConnections(): JsonField<Long> = operatorConnectConnections

            /**
             * Returns the raw JSON value of [texmlApplications].
             *
             * Unlike [texmlApplications], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("texml_applications")
            @ExcludeMissing
            fun _texmlApplications(): JsonField<Long> = texmlApplications

            /**
             * Returns the raw JSON value of [thirdPartyProviderConnections].
             *
             * Unlike [thirdPartyProviderConnections], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("third_party_provider_connections")
            @ExcludeMissing
            fun _thirdPartyProviderConnections(): JsonField<Long> = thirdPartyProviderConnections

            /**
             * Returns the raw JSON value of [uacConnections].
             *
             * Unlike [uacConnections], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("uac_connections")
            @ExcludeMissing
            fun _uacConnections(): JsonField<Long> = uacConnections

            /**
             * Returns the raw JSON value of [zoomSbcConnections].
             *
             * Unlike [zoomSbcConnections], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("zoom_sbc_connections")
            @ExcludeMissing
            fun _zoomSbcConnections(): JsonField<Long> = zoomSbcConnections

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
                 * Returns a mutable builder for constructing an instance of [Counts].
                 *
                 * The following fields are required:
                 * ```java
                 * .callControlApplications()
                 * .credentialConnections()
                 * .externalConnections()
                 * .faxConnections()
                 * .fqdnConnections()
                 * .ipConnections()
                 * .microsoftTeamsSbcConnections()
                 * .mobileVoiceConnections()
                 * .operatorConnectConnections()
                 * .texmlApplications()
                 * .thirdPartyProviderConnections()
                 * .uacConnections()
                 * .zoomSbcConnections()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Counts]. */
            class Builder internal constructor() {

                private var callControlApplications: JsonField<Long>? = null
                private var credentialConnections: JsonField<Long>? = null
                private var externalConnections: JsonField<Long>? = null
                private var faxConnections: JsonField<Long>? = null
                private var fqdnConnections: JsonField<Long>? = null
                private var ipConnections: JsonField<Long>? = null
                private var microsoftTeamsSbcConnections: JsonField<Long>? = null
                private var mobileVoiceConnections: JsonField<Long>? = null
                private var operatorConnectConnections: JsonField<Long>? = null
                private var texmlApplications: JsonField<Long>? = null
                private var thirdPartyProviderConnections: JsonField<Long>? = null
                private var uacConnections: JsonField<Long>? = null
                private var zoomSbcConnections: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(counts: Counts) = apply {
                    callControlApplications = counts.callControlApplications
                    credentialConnections = counts.credentialConnections
                    externalConnections = counts.externalConnections
                    faxConnections = counts.faxConnections
                    fqdnConnections = counts.fqdnConnections
                    ipConnections = counts.ipConnections
                    microsoftTeamsSbcConnections = counts.microsoftTeamsSbcConnections
                    mobileVoiceConnections = counts.mobileVoiceConnections
                    operatorConnectConnections = counts.operatorConnectConnections
                    texmlApplications = counts.texmlApplications
                    thirdPartyProviderConnections = counts.thirdPartyProviderConnections
                    uacConnections = counts.uacConnections
                    zoomSbcConnections = counts.zoomSbcConnections
                    additionalProperties = counts.additionalProperties.toMutableMap()
                }

                /** Number of Call Control applications. */
                fun callControlApplications(callControlApplications: Long) =
                    callControlApplications(JsonField.of(callControlApplications))

                /**
                 * Sets [Builder.callControlApplications] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callControlApplications] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun callControlApplications(callControlApplications: JsonField<Long>) = apply {
                    this.callControlApplications = callControlApplications
                }

                /** Number of credential connections. */
                fun credentialConnections(credentialConnections: Long) =
                    credentialConnections(JsonField.of(credentialConnections))

                /**
                 * Sets [Builder.credentialConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.credentialConnections] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun credentialConnections(credentialConnections: JsonField<Long>) = apply {
                    this.credentialConnections = credentialConnections
                }

                /** Number of external connections. */
                fun externalConnections(externalConnections: Long) =
                    externalConnections(JsonField.of(externalConnections))

                /**
                 * Sets [Builder.externalConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalConnections] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalConnections(externalConnections: JsonField<Long>) = apply {
                    this.externalConnections = externalConnections
                }

                /** Number of Fax applications. */
                fun faxConnections(faxConnections: Long) =
                    faxConnections(JsonField.of(faxConnections))

                /**
                 * Sets [Builder.faxConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.faxConnections] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun faxConnections(faxConnections: JsonField<Long>) = apply {
                    this.faxConnections = faxConnections
                }

                /** Number of FQDN connections. */
                fun fqdnConnections(fqdnConnections: Long) =
                    fqdnConnections(JsonField.of(fqdnConnections))

                /**
                 * Sets [Builder.fqdnConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fqdnConnections] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fqdnConnections(fqdnConnections: JsonField<Long>) = apply {
                    this.fqdnConnections = fqdnConnections
                }

                /** Number of IP connections. */
                fun ipConnections(ipConnections: Long) = ipConnections(JsonField.of(ipConnections))

                /**
                 * Sets [Builder.ipConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ipConnections] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ipConnections(ipConnections: JsonField<Long>) = apply {
                    this.ipConnections = ipConnections
                }

                /** Number of Microsoft Teams SBC (direct routing) connections. */
                fun microsoftTeamsSbcConnections(microsoftTeamsSbcConnections: Long) =
                    microsoftTeamsSbcConnections(JsonField.of(microsoftTeamsSbcConnections))

                /**
                 * Sets [Builder.microsoftTeamsSbcConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.microsoftTeamsSbcConnections] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun microsoftTeamsSbcConnections(microsoftTeamsSbcConnections: JsonField<Long>) =
                    apply {
                        this.microsoftTeamsSbcConnections = microsoftTeamsSbcConnections
                    }

                /** Number of mobile voice (IMS) connections. */
                fun mobileVoiceConnections(mobileVoiceConnections: Long) =
                    mobileVoiceConnections(JsonField.of(mobileVoiceConnections))

                /**
                 * Sets [Builder.mobileVoiceConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mobileVoiceConnections] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mobileVoiceConnections(mobileVoiceConnections: JsonField<Long>) = apply {
                    this.mobileVoiceConnections = mobileVoiceConnections
                }

                /** Number of Microsoft Operator Connect connections. */
                fun operatorConnectConnections(operatorConnectConnections: Long) =
                    operatorConnectConnections(JsonField.of(operatorConnectConnections))

                /**
                 * Sets [Builder.operatorConnectConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operatorConnectConnections] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun operatorConnectConnections(operatorConnectConnections: JsonField<Long>) =
                    apply {
                        this.operatorConnectConnections = operatorConnectConnections
                    }

                /** Number of TeXML applications. */
                fun texmlApplications(texmlApplications: Long) =
                    texmlApplications(JsonField.of(texmlApplications))

                /**
                 * Sets [Builder.texmlApplications] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.texmlApplications] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun texmlApplications(texmlApplications: JsonField<Long>) = apply {
                    this.texmlApplications = texmlApplications
                }

                /** Number of third-party provider connections. */
                fun thirdPartyProviderConnections(thirdPartyProviderConnections: Long) =
                    thirdPartyProviderConnections(JsonField.of(thirdPartyProviderConnections))

                /**
                 * Sets [Builder.thirdPartyProviderConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.thirdPartyProviderConnections] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun thirdPartyProviderConnections(thirdPartyProviderConnections: JsonField<Long>) =
                    apply {
                        this.thirdPartyProviderConnections = thirdPartyProviderConnections
                    }

                /** Number of UAC connections. */
                fun uacConnections(uacConnections: Long) =
                    uacConnections(JsonField.of(uacConnections))

                /**
                 * Sets [Builder.uacConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.uacConnections] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun uacConnections(uacConnections: JsonField<Long>) = apply {
                    this.uacConnections = uacConnections
                }

                /** Number of Zoom SBC connections. */
                fun zoomSbcConnections(zoomSbcConnections: Long) =
                    zoomSbcConnections(JsonField.of(zoomSbcConnections))

                /**
                 * Sets [Builder.zoomSbcConnections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zoomSbcConnections] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun zoomSbcConnections(zoomSbcConnections: JsonField<Long>) = apply {
                    this.zoomSbcConnections = zoomSbcConnections
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Counts].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .callControlApplications()
                 * .credentialConnections()
                 * .externalConnections()
                 * .faxConnections()
                 * .fqdnConnections()
                 * .ipConnections()
                 * .microsoftTeamsSbcConnections()
                 * .mobileVoiceConnections()
                 * .operatorConnectConnections()
                 * .texmlApplications()
                 * .thirdPartyProviderConnections()
                 * .uacConnections()
                 * .zoomSbcConnections()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Counts =
                    Counts(
                        checkRequired("callControlApplications", callControlApplications),
                        checkRequired("credentialConnections", credentialConnections),
                        checkRequired("externalConnections", externalConnections),
                        checkRequired("faxConnections", faxConnections),
                        checkRequired("fqdnConnections", fqdnConnections),
                        checkRequired("ipConnections", ipConnections),
                        checkRequired("microsoftTeamsSbcConnections", microsoftTeamsSbcConnections),
                        checkRequired("mobileVoiceConnections", mobileVoiceConnections),
                        checkRequired("operatorConnectConnections", operatorConnectConnections),
                        checkRequired("texmlApplications", texmlApplications),
                        checkRequired(
                            "thirdPartyProviderConnections",
                            thirdPartyProviderConnections,
                        ),
                        checkRequired("uacConnections", uacConnections),
                        checkRequired("zoomSbcConnections", zoomSbcConnections),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Counts = apply {
                if (validated) {
                    return@apply
                }

                callControlApplications()
                credentialConnections()
                externalConnections()
                faxConnections()
                fqdnConnections()
                ipConnections()
                microsoftTeamsSbcConnections()
                mobileVoiceConnections()
                operatorConnectConnections()
                texmlApplications()
                thirdPartyProviderConnections()
                uacConnections()
                zoomSbcConnections()
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
                (if (callControlApplications.asKnown().isPresent) 1 else 0) +
                    (if (credentialConnections.asKnown().isPresent) 1 else 0) +
                    (if (externalConnections.asKnown().isPresent) 1 else 0) +
                    (if (faxConnections.asKnown().isPresent) 1 else 0) +
                    (if (fqdnConnections.asKnown().isPresent) 1 else 0) +
                    (if (ipConnections.asKnown().isPresent) 1 else 0) +
                    (if (microsoftTeamsSbcConnections.asKnown().isPresent) 1 else 0) +
                    (if (mobileVoiceConnections.asKnown().isPresent) 1 else 0) +
                    (if (operatorConnectConnections.asKnown().isPresent) 1 else 0) +
                    (if (texmlApplications.asKnown().isPresent) 1 else 0) +
                    (if (thirdPartyProviderConnections.asKnown().isPresent) 1 else 0) +
                    (if (uacConnections.asKnown().isPresent) 1 else 0) +
                    (if (zoomSbcConnections.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Counts &&
                    callControlApplications == other.callControlApplications &&
                    credentialConnections == other.credentialConnections &&
                    externalConnections == other.externalConnections &&
                    faxConnections == other.faxConnections &&
                    fqdnConnections == other.fqdnConnections &&
                    ipConnections == other.ipConnections &&
                    microsoftTeamsSbcConnections == other.microsoftTeamsSbcConnections &&
                    mobileVoiceConnections == other.mobileVoiceConnections &&
                    operatorConnectConnections == other.operatorConnectConnections &&
                    texmlApplications == other.texmlApplications &&
                    thirdPartyProviderConnections == other.thirdPartyProviderConnections &&
                    uacConnections == other.uacConnections &&
                    zoomSbcConnections == other.zoomSbcConnections &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    callControlApplications,
                    credentialConnections,
                    externalConnections,
                    faxConnections,
                    fqdnConnections,
                    ipConnections,
                    microsoftTeamsSbcConnections,
                    mobileVoiceConnections,
                    operatorConnectConnections,
                    texmlApplications,
                    thirdPartyProviderConnections,
                    uacConnections,
                    zoomSbcConnections,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Counts{callControlApplications=$callControlApplications, credentialConnections=$credentialConnections, externalConnections=$externalConnections, faxConnections=$faxConnections, fqdnConnections=$fqdnConnections, ipConnections=$ipConnections, microsoftTeamsSbcConnections=$microsoftTeamsSbcConnections, mobileVoiceConnections=$mobileVoiceConnections, operatorConnectConnections=$operatorConnectConnections, texmlApplications=$texmlApplications, thirdPartyProviderConnections=$thirdPartyProviderConnections, uacConnections=$uacConnections, zoomSbcConnections=$zoomSbcConnections, additionalProperties=$additionalProperties}"
        }

        /**
         * Connection limits that apply to the user. Contains a single global_limit when a global
         * connection limit applies, or per-type limits (standard_limit, texml_limit and uac_limit)
         * when the user has per-type connection count capabilities.
         */
        @JsonDeserialize(using = Limits.Deserializer::class)
        @JsonSerialize(using = Limits.Serializer::class)
        class Limits
        private constructor(
            private val globalConnectionLimit: GlobalConnectionLimit? = null,
            private val perTypeConnection: PerTypeConnectionLimits? = null,
            private val _json: JsonValue? = null,
        ) {

            fun globalConnectionLimit(): Optional<GlobalConnectionLimit> =
                Optional.ofNullable(globalConnectionLimit)

            fun perTypeConnection(): Optional<PerTypeConnectionLimits> =
                Optional.ofNullable(perTypeConnection)

            fun isGlobalConnectionLimit(): Boolean = globalConnectionLimit != null

            fun isPerTypeConnection(): Boolean = perTypeConnection != null

            fun asGlobalConnectionLimit(): GlobalConnectionLimit =
                globalConnectionLimit.getOrThrow("globalConnectionLimit")

            fun asPerTypeConnection(): PerTypeConnectionLimits =
                perTypeConnection.getOrThrow("perTypeConnection")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = limits.accept(new Limits.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitGlobalConnectionLimit(GlobalConnectionLimit globalConnectionLimit) {
             *         return Optional.of(globalConnectionLimit.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    globalConnectionLimit != null ->
                        visitor.visitGlobalConnectionLimit(globalConnectionLimit)
                    perTypeConnection != null -> visitor.visitPerTypeConnection(perTypeConnection)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Limits = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitGlobalConnectionLimit(
                            globalConnectionLimit: GlobalConnectionLimit
                        ) {
                            globalConnectionLimit.validate()
                        }

                        override fun visitPerTypeConnection(
                            perTypeConnection: PerTypeConnectionLimits
                        ) {
                            perTypeConnection.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitGlobalConnectionLimit(
                            globalConnectionLimit: GlobalConnectionLimit
                        ) = globalConnectionLimit.validity()

                        override fun visitPerTypeConnection(
                            perTypeConnection: PerTypeConnectionLimits
                        ) = perTypeConnection.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Limits &&
                    globalConnectionLimit == other.globalConnectionLimit &&
                    perTypeConnection == other.perTypeConnection
            }

            override fun hashCode(): Int = Objects.hash(globalConnectionLimit, perTypeConnection)

            override fun toString(): String =
                when {
                    globalConnectionLimit != null ->
                        "Limits{globalConnectionLimit=$globalConnectionLimit}"
                    perTypeConnection != null -> "Limits{perTypeConnection=$perTypeConnection}"
                    _json != null -> "Limits{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Limits")
                }

            companion object {

                @JvmStatic
                fun ofGlobalConnectionLimit(globalConnectionLimit: GlobalConnectionLimit) =
                    Limits(globalConnectionLimit = globalConnectionLimit)

                @JvmStatic
                fun ofPerTypeConnection(perTypeConnection: PerTypeConnectionLimits) =
                    Limits(perTypeConnection = perTypeConnection)
            }

            /**
             * An interface that defines how to map each variant of [Limits] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitGlobalConnectionLimit(globalConnectionLimit: GlobalConnectionLimit): T

                fun visitPerTypeConnection(perTypeConnection: PerTypeConnectionLimits): T

                /**
                 * Maps an unknown variant of [Limits] to a value of type [T].
                 *
                 * An instance of [Limits] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown Limits: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Limits>(Limits::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Limits {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<GlobalConnectionLimit>())?.let {
                                    Limits(globalConnectionLimit = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<PerTypeConnectionLimits>())
                                    ?.let { Limits(perTypeConnection = it, _json = json) },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Limits(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Limits>(Limits::class) {

                override fun serialize(
                    value: Limits,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.globalConnectionLimit != null ->
                            generator.writeObject(value.globalConnectionLimit)
                        value.perTypeConnection != null ->
                            generator.writeObject(value.perTypeConnection)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Limits")
                    }
                }
            }

            class GlobalConnectionLimit
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val globalLimit: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("global_limit")
                    @ExcludeMissing
                    globalLimit: JsonField<Long> = JsonMissing.of()
                ) : this(globalLimit, mutableMapOf())

                /**
                 * Maximum total number of connections allowed, when a global limit applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun globalLimit(): Long = globalLimit.getRequired("global_limit")

                /**
                 * Returns the raw JSON value of [globalLimit].
                 *
                 * Unlike [globalLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("global_limit")
                @ExcludeMissing
                fun _globalLimit(): JsonField<Long> = globalLimit

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
                     * [GlobalConnectionLimit].
                     *
                     * The following fields are required:
                     * ```java
                     * .globalLimit()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [GlobalConnectionLimit]. */
                class Builder internal constructor() {

                    private var globalLimit: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(globalConnectionLimit: GlobalConnectionLimit) = apply {
                        globalLimit = globalConnectionLimit.globalLimit
                        additionalProperties =
                            globalConnectionLimit.additionalProperties.toMutableMap()
                    }

                    /** Maximum total number of connections allowed, when a global limit applies. */
                    fun globalLimit(globalLimit: Long) = globalLimit(JsonField.of(globalLimit))

                    /**
                     * Sets [Builder.globalLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.globalLimit] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun globalLimit(globalLimit: JsonField<Long>) = apply {
                        this.globalLimit = globalLimit
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [GlobalConnectionLimit].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .globalLimit()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GlobalConnectionLimit =
                        GlobalConnectionLimit(
                            checkRequired("globalLimit", globalLimit),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): GlobalConnectionLimit = apply {
                    if (validated) {
                        return@apply
                    }

                    globalLimit()
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
                internal fun validity(): Int = (if (globalLimit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GlobalConnectionLimit &&
                        globalLimit == other.globalLimit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(globalLimit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GlobalConnectionLimit{globalLimit=$globalLimit, additionalProperties=$additionalProperties}"
            }

            class PerTypeConnectionLimits
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val standardLimit: JsonField<Long>,
                private val texmlLimit: JsonField<Long>,
                private val uacLimit: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("standard_limit")
                    @ExcludeMissing
                    standardLimit: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("texml_limit")
                    @ExcludeMissing
                    texmlLimit: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("uac_limit")
                    @ExcludeMissing
                    uacLimit: JsonField<Long> = JsonMissing.of(),
                ) : this(standardLimit, texmlLimit, uacLimit, mutableMapOf())

                /**
                 * Maximum number of standard connections allowed, when per-type limits apply.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun standardLimit(): Long = standardLimit.getRequired("standard_limit")

                /**
                 * Maximum number of TeXML applications allowed, when per-type limits apply.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun texmlLimit(): Long = texmlLimit.getRequired("texml_limit")

                /**
                 * Maximum number of UAC connections allowed, when per-type limits apply.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun uacLimit(): Long = uacLimit.getRequired("uac_limit")

                /**
                 * Returns the raw JSON value of [standardLimit].
                 *
                 * Unlike [standardLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("standard_limit")
                @ExcludeMissing
                fun _standardLimit(): JsonField<Long> = standardLimit

                /**
                 * Returns the raw JSON value of [texmlLimit].
                 *
                 * Unlike [texmlLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("texml_limit")
                @ExcludeMissing
                fun _texmlLimit(): JsonField<Long> = texmlLimit

                /**
                 * Returns the raw JSON value of [uacLimit].
                 *
                 * Unlike [uacLimit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("uac_limit")
                @ExcludeMissing
                fun _uacLimit(): JsonField<Long> = uacLimit

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
                     * [PerTypeConnectionLimits].
                     *
                     * The following fields are required:
                     * ```java
                     * .standardLimit()
                     * .texmlLimit()
                     * .uacLimit()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PerTypeConnectionLimits]. */
                class Builder internal constructor() {

                    private var standardLimit: JsonField<Long>? = null
                    private var texmlLimit: JsonField<Long>? = null
                    private var uacLimit: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(perTypeConnectionLimits: PerTypeConnectionLimits) = apply {
                        standardLimit = perTypeConnectionLimits.standardLimit
                        texmlLimit = perTypeConnectionLimits.texmlLimit
                        uacLimit = perTypeConnectionLimits.uacLimit
                        additionalProperties =
                            perTypeConnectionLimits.additionalProperties.toMutableMap()
                    }

                    /**
                     * Maximum number of standard connections allowed, when per-type limits apply.
                     */
                    fun standardLimit(standardLimit: Long) =
                        standardLimit(JsonField.of(standardLimit))

                    /**
                     * Sets [Builder.standardLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.standardLimit] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun standardLimit(standardLimit: JsonField<Long>) = apply {
                        this.standardLimit = standardLimit
                    }

                    /** Maximum number of TeXML applications allowed, when per-type limits apply. */
                    fun texmlLimit(texmlLimit: Long) = texmlLimit(JsonField.of(texmlLimit))

                    /**
                     * Sets [Builder.texmlLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.texmlLimit] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun texmlLimit(texmlLimit: JsonField<Long>) = apply {
                        this.texmlLimit = texmlLimit
                    }

                    /** Maximum number of UAC connections allowed, when per-type limits apply. */
                    fun uacLimit(uacLimit: Long) = uacLimit(JsonField.of(uacLimit))

                    /**
                     * Sets [Builder.uacLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.uacLimit] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun uacLimit(uacLimit: JsonField<Long>) = apply { this.uacLimit = uacLimit }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PerTypeConnectionLimits].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .standardLimit()
                     * .texmlLimit()
                     * .uacLimit()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PerTypeConnectionLimits =
                        PerTypeConnectionLimits(
                            checkRequired("standardLimit", standardLimit),
                            checkRequired("texmlLimit", texmlLimit),
                            checkRequired("uacLimit", uacLimit),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PerTypeConnectionLimits = apply {
                    if (validated) {
                        return@apply
                    }

                    standardLimit()
                    texmlLimit()
                    uacLimit()
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
                    (if (standardLimit.asKnown().isPresent) 1 else 0) +
                        (if (texmlLimit.asKnown().isPresent) 1 else 0) +
                        (if (uacLimit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PerTypeConnectionLimits &&
                        standardLimit == other.standardLimit &&
                        texmlLimit == other.texmlLimit &&
                        uacLimit == other.uacLimit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(standardLimit, texmlLimit, uacLimit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PerTypeConnectionLimits{standardLimit=$standardLimit, texmlLimit=$texmlLimit, uacLimit=$uacLimit, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                counts == other.counts &&
                limits == other.limits &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(counts, limits, recordType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{counts=$counts, limits=$limits, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectionRetrieveCountResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionRetrieveCountResponse{data=$data, additionalProperties=$additionalProperties}"
}
