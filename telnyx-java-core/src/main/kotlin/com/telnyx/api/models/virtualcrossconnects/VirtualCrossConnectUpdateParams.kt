// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.virtualcrossconnects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the Virtual Cross Connect.<br /><br />Cloud IPs can only be patched during the `created`
 * state, as GCE will only inform you of your generated IP once the pending connection requested has
 * been accepted. Once the Virtual Cross Connect has moved to `provisioning`, the IPs can no longer
 * be patched.<br /><br />Once the Virtual Cross Connect has moved to `provisioned` and you are
 * ready to enable routing, you can toggle the routing announcements to `true`.
 */
class VirtualCrossConnectUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
     * provided, one will be generated for you.<br /><br />This value can not be patched once the
     * VXC has bene provisioned.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryCloudIp(): Optional<String> = body.primaryCloudIp()

    /**
     * Indicates whether the primary circuit is enabled. Setting this to `false` will disable the
     * circuit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryEnabled(): Optional<Boolean> = body.primaryEnabled()

    /**
     * Whether the primary BGP route is being announced.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryRoutingAnnouncement(): Optional<Boolean> = body.primaryRoutingAnnouncement()

    /**
     * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
     * provided, one will be generated for you.<br /><br />This value can not be patched once the
     * VXC has bene provisioned.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryCloudIp(): Optional<String> = body.secondaryCloudIp()

    /**
     * Indicates whether the secondary circuit is enabled. Setting this to `false` will disable the
     * circuit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryEnabled(): Optional<Boolean> = body.secondaryEnabled()

    /**
     * Whether the secondary BGP route is being announced.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryRoutingAnnouncement(): Optional<Boolean> = body.secondaryRoutingAnnouncement()

    /**
     * Returns the raw JSON value of [primaryCloudIp].
     *
     * Unlike [primaryCloudIp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primaryCloudIp(): JsonField<String> = body._primaryCloudIp()

    /**
     * Returns the raw JSON value of [primaryEnabled].
     *
     * Unlike [primaryEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primaryEnabled(): JsonField<Boolean> = body._primaryEnabled()

    /**
     * Returns the raw JSON value of [primaryRoutingAnnouncement].
     *
     * Unlike [primaryRoutingAnnouncement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _primaryRoutingAnnouncement(): JsonField<Boolean> = body._primaryRoutingAnnouncement()

    /**
     * Returns the raw JSON value of [secondaryCloudIp].
     *
     * Unlike [secondaryCloudIp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _secondaryCloudIp(): JsonField<String> = body._secondaryCloudIp()

    /**
     * Returns the raw JSON value of [secondaryEnabled].
     *
     * Unlike [secondaryEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _secondaryEnabled(): JsonField<Boolean> = body._secondaryEnabled()

    /**
     * Returns the raw JSON value of [secondaryRoutingAnnouncement].
     *
     * Unlike [secondaryRoutingAnnouncement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _secondaryRoutingAnnouncement(): JsonField<Boolean> = body._secondaryRoutingAnnouncement()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): VirtualCrossConnectUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualCrossConnectUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VirtualCrossConnectUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(virtualCrossConnectUpdateParams: VirtualCrossConnectUpdateParams) =
            apply {
                id = virtualCrossConnectUpdateParams.id
                body = virtualCrossConnectUpdateParams.body.toBuilder()
                additionalHeaders = virtualCrossConnectUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    virtualCrossConnectUpdateParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [primaryCloudIp]
         * - [primaryEnabled]
         * - [primaryRoutingAnnouncement]
         * - [secondaryCloudIp]
         * - [secondaryEnabled]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value can not be patched once
         * the VXC has bene provisioned.
         */
        fun primaryCloudIp(primaryCloudIp: String) = apply { body.primaryCloudIp(primaryCloudIp) }

        /**
         * Sets [Builder.primaryCloudIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryCloudIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryCloudIp(primaryCloudIp: JsonField<String>) = apply {
            body.primaryCloudIp(primaryCloudIp)
        }

        /**
         * Indicates whether the primary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         */
        fun primaryEnabled(primaryEnabled: Boolean) = apply { body.primaryEnabled(primaryEnabled) }

        /**
         * Sets [Builder.primaryEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryEnabled(primaryEnabled: JsonField<Boolean>) = apply {
            body.primaryEnabled(primaryEnabled)
        }

        /** Whether the primary BGP route is being announced. */
        fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: Boolean) = apply {
            body.primaryRoutingAnnouncement(primaryRoutingAnnouncement)
        }

        /**
         * Sets [Builder.primaryRoutingAnnouncement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryRoutingAnnouncement] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: JsonField<Boolean>) = apply {
            body.primaryRoutingAnnouncement(primaryRoutingAnnouncement)
        }

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value can not be patched once
         * the VXC has bene provisioned.
         */
        fun secondaryCloudIp(secondaryCloudIp: String) = apply {
            body.secondaryCloudIp(secondaryCloudIp)
        }

        /**
         * Sets [Builder.secondaryCloudIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryCloudIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryCloudIp(secondaryCloudIp: JsonField<String>) = apply {
            body.secondaryCloudIp(secondaryCloudIp)
        }

        /**
         * Indicates whether the secondary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         */
        fun secondaryEnabled(secondaryEnabled: Boolean) = apply {
            body.secondaryEnabled(secondaryEnabled)
        }

        /**
         * Sets [Builder.secondaryEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryEnabled(secondaryEnabled: JsonField<Boolean>) = apply {
            body.secondaryEnabled(secondaryEnabled)
        }

        /** Whether the secondary BGP route is being announced. */
        fun secondaryRoutingAnnouncement(secondaryRoutingAnnouncement: Boolean) = apply {
            body.secondaryRoutingAnnouncement(secondaryRoutingAnnouncement)
        }

        /**
         * Sets [Builder.secondaryRoutingAnnouncement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryRoutingAnnouncement] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun secondaryRoutingAnnouncement(secondaryRoutingAnnouncement: JsonField<Boolean>) = apply {
            body.secondaryRoutingAnnouncement(secondaryRoutingAnnouncement)
        }

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
         * Returns an immutable instance of [VirtualCrossConnectUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VirtualCrossConnectUpdateParams =
            VirtualCrossConnectUpdateParams(
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val primaryCloudIp: JsonField<String>,
        private val primaryEnabled: JsonField<Boolean>,
        private val primaryRoutingAnnouncement: JsonField<Boolean>,
        private val secondaryCloudIp: JsonField<String>,
        private val secondaryEnabled: JsonField<Boolean>,
        private val secondaryRoutingAnnouncement: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("primary_cloud_ip")
            @ExcludeMissing
            primaryCloudIp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_enabled")
            @ExcludeMissing
            primaryEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("primary_routing_announcement")
            @ExcludeMissing
            primaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("secondary_cloud_ip")
            @ExcludeMissing
            secondaryCloudIp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secondary_enabled")
            @ExcludeMissing
            secondaryEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("secondary_routing_announcement")
            @ExcludeMissing
            secondaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            primaryCloudIp,
            primaryEnabled,
            primaryRoutingAnnouncement,
            secondaryCloudIp,
            secondaryEnabled,
            secondaryRoutingAnnouncement,
            mutableMapOf(),
        )

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value can not be patched once
         * the VXC has bene provisioned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCloudIp(): Optional<String> = primaryCloudIp.getOptional("primary_cloud_ip")

        /**
         * Indicates whether the primary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryEnabled(): Optional<Boolean> = primaryEnabled.getOptional("primary_enabled")

        /**
         * Whether the primary BGP route is being announced.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryRoutingAnnouncement(): Optional<Boolean> =
            primaryRoutingAnnouncement.getOptional("primary_routing_announcement")

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value can not be patched once
         * the VXC has bene provisioned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryCloudIp(): Optional<String> =
            secondaryCloudIp.getOptional("secondary_cloud_ip")

        /**
         * Indicates whether the secondary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryEnabled(): Optional<Boolean> =
            secondaryEnabled.getOptional("secondary_enabled")

        /**
         * Whether the secondary BGP route is being announced.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryRoutingAnnouncement(): Optional<Boolean> =
            secondaryRoutingAnnouncement.getOptional("secondary_routing_announcement")

        /**
         * Returns the raw JSON value of [primaryCloudIp].
         *
         * Unlike [primaryCloudIp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_cloud_ip")
        @ExcludeMissing
        fun _primaryCloudIp(): JsonField<String> = primaryCloudIp

        /**
         * Returns the raw JSON value of [primaryEnabled].
         *
         * Unlike [primaryEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_enabled")
        @ExcludeMissing
        fun _primaryEnabled(): JsonField<Boolean> = primaryEnabled

        /**
         * Returns the raw JSON value of [primaryRoutingAnnouncement].
         *
         * Unlike [primaryRoutingAnnouncement], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_routing_announcement")
        @ExcludeMissing
        fun _primaryRoutingAnnouncement(): JsonField<Boolean> = primaryRoutingAnnouncement

        /**
         * Returns the raw JSON value of [secondaryCloudIp].
         *
         * Unlike [secondaryCloudIp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondary_cloud_ip")
        @ExcludeMissing
        fun _secondaryCloudIp(): JsonField<String> = secondaryCloudIp

        /**
         * Returns the raw JSON value of [secondaryEnabled].
         *
         * Unlike [secondaryEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondary_enabled")
        @ExcludeMissing
        fun _secondaryEnabled(): JsonField<Boolean> = secondaryEnabled

        /**
         * Returns the raw JSON value of [secondaryRoutingAnnouncement].
         *
         * Unlike [secondaryRoutingAnnouncement], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("secondary_routing_announcement")
        @ExcludeMissing
        fun _secondaryRoutingAnnouncement(): JsonField<Boolean> = secondaryRoutingAnnouncement

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var primaryCloudIp: JsonField<String> = JsonMissing.of()
            private var primaryEnabled: JsonField<Boolean> = JsonMissing.of()
            private var primaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of()
            private var secondaryCloudIp: JsonField<String> = JsonMissing.of()
            private var secondaryEnabled: JsonField<Boolean> = JsonMissing.of()
            private var secondaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                primaryCloudIp = body.primaryCloudIp
                primaryEnabled = body.primaryEnabled
                primaryRoutingAnnouncement = body.primaryRoutingAnnouncement
                secondaryCloudIp = body.secondaryCloudIp
                secondaryEnabled = body.secondaryEnabled
                secondaryRoutingAnnouncement = body.secondaryRoutingAnnouncement
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If
             * none is provided, one will be generated for you.<br /><br />This value can not be
             * patched once the VXC has bene provisioned.
             */
            fun primaryCloudIp(primaryCloudIp: String) =
                primaryCloudIp(JsonField.of(primaryCloudIp))

            /**
             * Sets [Builder.primaryCloudIp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCloudIp] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primaryCloudIp(primaryCloudIp: JsonField<String>) = apply {
                this.primaryCloudIp = primaryCloudIp
            }

            /**
             * Indicates whether the primary circuit is enabled. Setting this to `false` will
             * disable the circuit.
             */
            fun primaryEnabled(primaryEnabled: Boolean) =
                primaryEnabled(JsonField.of(primaryEnabled))

            /**
             * Sets [Builder.primaryEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primaryEnabled(primaryEnabled: JsonField<Boolean>) = apply {
                this.primaryEnabled = primaryEnabled
            }

            /** Whether the primary BGP route is being announced. */
            fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: Boolean) =
                primaryRoutingAnnouncement(JsonField.of(primaryRoutingAnnouncement))

            /**
             * Sets [Builder.primaryRoutingAnnouncement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryRoutingAnnouncement] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: JsonField<Boolean>) = apply {
                this.primaryRoutingAnnouncement = primaryRoutingAnnouncement
            }

            /**
             * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If
             * none is provided, one will be generated for you.<br /><br />This value can not be
             * patched once the VXC has bene provisioned.
             */
            fun secondaryCloudIp(secondaryCloudIp: String) =
                secondaryCloudIp(JsonField.of(secondaryCloudIp))

            /**
             * Sets [Builder.secondaryCloudIp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryCloudIp] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondaryCloudIp(secondaryCloudIp: JsonField<String>) = apply {
                this.secondaryCloudIp = secondaryCloudIp
            }

            /**
             * Indicates whether the secondary circuit is enabled. Setting this to `false` will
             * disable the circuit.
             */
            fun secondaryEnabled(secondaryEnabled: Boolean) =
                secondaryEnabled(JsonField.of(secondaryEnabled))

            /**
             * Sets [Builder.secondaryEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondaryEnabled(secondaryEnabled: JsonField<Boolean>) = apply {
                this.secondaryEnabled = secondaryEnabled
            }

            /** Whether the secondary BGP route is being announced. */
            fun secondaryRoutingAnnouncement(secondaryRoutingAnnouncement: Boolean) =
                secondaryRoutingAnnouncement(JsonField.of(secondaryRoutingAnnouncement))

            /**
             * Sets [Builder.secondaryRoutingAnnouncement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryRoutingAnnouncement] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun secondaryRoutingAnnouncement(secondaryRoutingAnnouncement: JsonField<Boolean>) =
                apply {
                    this.secondaryRoutingAnnouncement = secondaryRoutingAnnouncement
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    primaryCloudIp,
                    primaryEnabled,
                    primaryRoutingAnnouncement,
                    secondaryCloudIp,
                    secondaryEnabled,
                    secondaryRoutingAnnouncement,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            primaryCloudIp()
            primaryEnabled()
            primaryRoutingAnnouncement()
            secondaryCloudIp()
            secondaryEnabled()
            secondaryRoutingAnnouncement()
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
            (if (primaryCloudIp.asKnown().isPresent) 1 else 0) +
                (if (primaryEnabled.asKnown().isPresent) 1 else 0) +
                (if (primaryRoutingAnnouncement.asKnown().isPresent) 1 else 0) +
                (if (secondaryCloudIp.asKnown().isPresent) 1 else 0) +
                (if (secondaryEnabled.asKnown().isPresent) 1 else 0) +
                (if (secondaryRoutingAnnouncement.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                primaryCloudIp == other.primaryCloudIp &&
                primaryEnabled == other.primaryEnabled &&
                primaryRoutingAnnouncement == other.primaryRoutingAnnouncement &&
                secondaryCloudIp == other.secondaryCloudIp &&
                secondaryEnabled == other.secondaryEnabled &&
                secondaryRoutingAnnouncement == other.secondaryRoutingAnnouncement &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                primaryCloudIp,
                primaryEnabled,
                primaryRoutingAnnouncement,
                secondaryCloudIp,
                secondaryEnabled,
                secondaryRoutingAnnouncement,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{primaryCloudIp=$primaryCloudIp, primaryEnabled=$primaryEnabled, primaryRoutingAnnouncement=$primaryRoutingAnnouncement, secondaryCloudIp=$secondaryCloudIp, secondaryEnabled=$secondaryEnabled, secondaryRoutingAnnouncement=$secondaryRoutingAnnouncement, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualCrossConnectUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VirtualCrossConnectUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
