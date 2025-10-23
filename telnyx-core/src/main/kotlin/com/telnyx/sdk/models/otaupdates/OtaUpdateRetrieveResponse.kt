// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.otaupdates

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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

class OtaUpdateRetrieveResponse
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
     * This object represents an Over the Air (OTA) update request. It allows tracking the current
     * status of a operation that apply settings in a particular SIM card. <br/><br/>
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

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
         * Returns a mutable builder for constructing an instance of [OtaUpdateRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OtaUpdateRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(otaUpdateRetrieveResponse: OtaUpdateRetrieveResponse) = apply {
            data = otaUpdateRetrieveResponse.data
            additionalProperties = otaUpdateRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * This object represents an Over the Air (OTA) update request. It allows tracking the
         * current status of a operation that apply settings in a particular SIM card. <br/><br/>
         */
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
         * Returns an immutable instance of [OtaUpdateRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OtaUpdateRetrieveResponse =
            OtaUpdateRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): OtaUpdateRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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

    /**
     * This object represents an Over the Air (OTA) update request. It allows tracking the current
     * status of a operation that apply settings in a particular SIM card. <br/><br/>
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val recordType: JsonField<String>,
        private val settings: JsonField<Settings>,
        private val simCardId: JsonField<String>,
        private val status: JsonField<Status>,
        private val type: JsonField<Type>,
        private val updatedAt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("settings")
            @ExcludeMissing
            settings: JsonField<Settings> = JsonMissing.of(),
            @JsonProperty("sim_card_id")
            @ExcludeMissing
            simCardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            recordType,
            settings,
            simCardId,
            status,
            type,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * Identifies the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * ISO 8601 formatted date-time indicating when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * A JSON object representation of the operation. The information present here will relate
         * directly to the source of the OTA request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun settings(): Optional<Settings> = settings.getOptional("settings")

        /**
         * The identification UUID of the related SIM card resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun simCardId(): Optional<String> = simCardId.getOptional("sim_card_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Represents the type of the operation requested. This will relate directly to the source
         * of the request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * ISO 8601 formatted date-time indicating when the resource was updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [settings].
         *
         * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("settings") @ExcludeMissing fun _settings(): JsonField<Settings> = settings

        /**
         * Returns the raw JSON value of [simCardId].
         *
         * Unlike [simCardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sim_card_id") @ExcludeMissing fun _simCardId(): JsonField<String> = simCardId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var settings: JsonField<Settings> = JsonMissing.of()
            private var simCardId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                recordType = data.recordType
                settings = data.settings
                simCardId = data.simCardId
                status = data.status
                type = data.type
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Identifies the resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** ISO 8601 formatted date-time indicating when the resource was created. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /**
             * A JSON object representation of the operation. The information present here will
             * relate directly to the source of the OTA request.
             */
            fun settings(settings: Settings) = settings(JsonField.of(settings))

            /**
             * Sets [Builder.settings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settings] with a well-typed [Settings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settings(settings: JsonField<Settings>) = apply { this.settings = settings }

            /** The identification UUID of the related SIM card resource. */
            fun simCardId(simCardId: String) = simCardId(JsonField.of(simCardId))

            /**
             * Sets [Builder.simCardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.simCardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun simCardId(simCardId: JsonField<String>) = apply { this.simCardId = simCardId }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * Represents the type of the operation requested. This will relate directly to the
             * source of the request.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** ISO 8601 formatted date-time indicating when the resource was updated. */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
             */
            fun build(): Data =
                Data(
                    id,
                    createdAt,
                    recordType,
                    settings,
                    simCardId,
                    status,
                    type,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            recordType()
            settings().ifPresent { it.validate() }
            simCardId()
            status().ifPresent { it.validate() }
            type().ifPresent { it.validate() }
            updatedAt()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (settings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (simCardId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /**
         * A JSON object representation of the operation. The information present here will relate
         * directly to the source of the OTA request.
         */
        class Settings
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val mobileNetworkOperatorsPreferences:
                JsonField<List<MobileNetworkOperatorsPreference>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("mobile_network_operators_preferences")
                @ExcludeMissing
                mobileNetworkOperatorsPreferences:
                    JsonField<List<MobileNetworkOperatorsPreference>> =
                    JsonMissing.of()
            ) : this(mobileNetworkOperatorsPreferences, mutableMapOf())

            /**
             * A list of mobile network operators and the priority that should be applied when the
             * SIM is connecting to the network.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mobileNetworkOperatorsPreferences():
                Optional<List<MobileNetworkOperatorsPreference>> =
                mobileNetworkOperatorsPreferences.getOptional(
                    "mobile_network_operators_preferences"
                )

            /**
             * Returns the raw JSON value of [mobileNetworkOperatorsPreferences].
             *
             * Unlike [mobileNetworkOperatorsPreferences], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("mobile_network_operators_preferences")
            @ExcludeMissing
            fun _mobileNetworkOperatorsPreferences():
                JsonField<List<MobileNetworkOperatorsPreference>> =
                mobileNetworkOperatorsPreferences

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

                /** Returns a mutable builder for constructing an instance of [Settings]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Settings]. */
            class Builder internal constructor() {

                private var mobileNetworkOperatorsPreferences:
                    JsonField<MutableList<MobileNetworkOperatorsPreference>>? =
                    null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(settings: Settings) = apply {
                    mobileNetworkOperatorsPreferences =
                        settings.mobileNetworkOperatorsPreferences.map { it.toMutableList() }
                    additionalProperties = settings.additionalProperties.toMutableMap()
                }

                /**
                 * A list of mobile network operators and the priority that should be applied when
                 * the SIM is connecting to the network.
                 */
                fun mobileNetworkOperatorsPreferences(
                    mobileNetworkOperatorsPreferences: List<MobileNetworkOperatorsPreference>
                ) =
                    mobileNetworkOperatorsPreferences(
                        JsonField.of(mobileNetworkOperatorsPreferences)
                    )

                /**
                 * Sets [Builder.mobileNetworkOperatorsPreferences] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mobileNetworkOperatorsPreferences] with a
                 * well-typed `List<MobileNetworkOperatorsPreference>` value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun mobileNetworkOperatorsPreferences(
                    mobileNetworkOperatorsPreferences:
                        JsonField<List<MobileNetworkOperatorsPreference>>
                ) = apply {
                    this.mobileNetworkOperatorsPreferences =
                        mobileNetworkOperatorsPreferences.map { it.toMutableList() }
                }

                /**
                 * Adds a single [MobileNetworkOperatorsPreference] to
                 * [mobileNetworkOperatorsPreferences].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMobileNetworkOperatorsPreference(
                    mobileNetworkOperatorsPreference: MobileNetworkOperatorsPreference
                ) = apply {
                    mobileNetworkOperatorsPreferences =
                        (mobileNetworkOperatorsPreferences ?: JsonField.of(mutableListOf())).also {
                            checkKnown("mobileNetworkOperatorsPreferences", it)
                                .add(mobileNetworkOperatorsPreference)
                        }
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
                 * Returns an immutable instance of [Settings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Settings =
                    Settings(
                        (mobileNetworkOperatorsPreferences ?: JsonMissing.of()).map {
                            it.toImmutable()
                        },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Settings = apply {
                if (validated) {
                    return@apply
                }

                mobileNetworkOperatorsPreferences().ifPresent { it.forEach { it.validate() } }
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
                (mobileNetworkOperatorsPreferences.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0)

            class MobileNetworkOperatorsPreference
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val mobileNetworkOperatorId: JsonField<String>,
                private val mobileNetworkOperatorName: JsonField<String>,
                private val priority: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("mobile_network_operator_id")
                    @ExcludeMissing
                    mobileNetworkOperatorId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("mobile_network_operator_name")
                    @ExcludeMissing
                    mobileNetworkOperatorName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("priority")
                    @ExcludeMissing
                    priority: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    mobileNetworkOperatorId,
                    mobileNetworkOperatorName,
                    priority,
                    mutableMapOf(),
                )

                /**
                 * The mobile network operator resource identification UUID.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mobileNetworkOperatorId(): Optional<String> =
                    mobileNetworkOperatorId.getOptional("mobile_network_operator_id")

                /**
                 * The mobile network operator resource name.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mobileNetworkOperatorName(): Optional<String> =
                    mobileNetworkOperatorName.getOptional("mobile_network_operator_name")

                /**
                 * It determines what is the priority of a specific network operator that should be
                 * assumed by a SIM card when connecting to a network. The highest priority is 0,
                 * the second highest is 1 and so on.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun priority(): Optional<Long> = priority.getOptional("priority")

                /**
                 * Returns the raw JSON value of [mobileNetworkOperatorId].
                 *
                 * Unlike [mobileNetworkOperatorId], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("mobile_network_operator_id")
                @ExcludeMissing
                fun _mobileNetworkOperatorId(): JsonField<String> = mobileNetworkOperatorId

                /**
                 * Returns the raw JSON value of [mobileNetworkOperatorName].
                 *
                 * Unlike [mobileNetworkOperatorName], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("mobile_network_operator_name")
                @ExcludeMissing
                fun _mobileNetworkOperatorName(): JsonField<String> = mobileNetworkOperatorName

                /**
                 * Returns the raw JSON value of [priority].
                 *
                 * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("priority")
                @ExcludeMissing
                fun _priority(): JsonField<Long> = priority

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
                     * [MobileNetworkOperatorsPreference].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MobileNetworkOperatorsPreference]. */
                class Builder internal constructor() {

                    private var mobileNetworkOperatorId: JsonField<String> = JsonMissing.of()
                    private var mobileNetworkOperatorName: JsonField<String> = JsonMissing.of()
                    private var priority: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        mobileNetworkOperatorsPreference: MobileNetworkOperatorsPreference
                    ) = apply {
                        mobileNetworkOperatorId =
                            mobileNetworkOperatorsPreference.mobileNetworkOperatorId
                        mobileNetworkOperatorName =
                            mobileNetworkOperatorsPreference.mobileNetworkOperatorName
                        priority = mobileNetworkOperatorsPreference.priority
                        additionalProperties =
                            mobileNetworkOperatorsPreference.additionalProperties.toMutableMap()
                    }

                    /** The mobile network operator resource identification UUID. */
                    fun mobileNetworkOperatorId(mobileNetworkOperatorId: String) =
                        mobileNetworkOperatorId(JsonField.of(mobileNetworkOperatorId))

                    /**
                     * Sets [Builder.mobileNetworkOperatorId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mobileNetworkOperatorId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun mobileNetworkOperatorId(mobileNetworkOperatorId: JsonField<String>) =
                        apply {
                            this.mobileNetworkOperatorId = mobileNetworkOperatorId
                        }

                    /** The mobile network operator resource name. */
                    fun mobileNetworkOperatorName(mobileNetworkOperatorName: String) =
                        mobileNetworkOperatorName(JsonField.of(mobileNetworkOperatorName))

                    /**
                     * Sets [Builder.mobileNetworkOperatorName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mobileNetworkOperatorName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun mobileNetworkOperatorName(mobileNetworkOperatorName: JsonField<String>) =
                        apply {
                            this.mobileNetworkOperatorName = mobileNetworkOperatorName
                        }

                    /**
                     * It determines what is the priority of a specific network operator that should
                     * be assumed by a SIM card when connecting to a network. The highest priority
                     * is 0, the second highest is 1 and so on.
                     */
                    fun priority(priority: Long) = priority(JsonField.of(priority))

                    /**
                     * Sets [Builder.priority] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.priority] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

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
                     * Returns an immutable instance of [MobileNetworkOperatorsPreference].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): MobileNetworkOperatorsPreference =
                        MobileNetworkOperatorsPreference(
                            mobileNetworkOperatorId,
                            mobileNetworkOperatorName,
                            priority,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): MobileNetworkOperatorsPreference = apply {
                    if (validated) {
                        return@apply
                    }

                    mobileNetworkOperatorId()
                    mobileNetworkOperatorName()
                    priority()
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
                    (if (mobileNetworkOperatorId.asKnown().isPresent) 1 else 0) +
                        (if (mobileNetworkOperatorName.asKnown().isPresent) 1 else 0) +
                        (if (priority.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MobileNetworkOperatorsPreference &&
                        mobileNetworkOperatorId == other.mobileNetworkOperatorId &&
                        mobileNetworkOperatorName == other.mobileNetworkOperatorName &&
                        priority == other.priority &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        mobileNetworkOperatorId,
                        mobileNetworkOperatorName,
                        priority,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MobileNetworkOperatorsPreference{mobileNetworkOperatorId=$mobileNetworkOperatorId, mobileNetworkOperatorName=$mobileNetworkOperatorName, priority=$priority, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Settings &&
                    mobileNetworkOperatorsPreferences == other.mobileNetworkOperatorsPreferences &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(mobileNetworkOperatorsPreferences, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Settings{mobileNetworkOperatorsPreferences=$mobileNetworkOperatorsPreferences, additionalProperties=$additionalProperties}"
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val IN_PROGRESS = of("in-progress")

                @JvmField val COMPLETED = of("completed")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                IN_PROGRESS,
                COMPLETED,
                FAILED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IN_PROGRESS,
                COMPLETED,
                FAILED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    IN_PROGRESS -> Value.IN_PROGRESS
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    IN_PROGRESS -> Known.IN_PROGRESS
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Represents the type of the operation requested. This will relate directly to the source
         * of the request.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SIM_CARD_NETWORK_PREFERENCES = of("sim_card_network_preferences")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                SIM_CARD_NETWORK_PREFERENCES
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SIM_CARD_NETWORK_PREFERENCES,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SIM_CARD_NETWORK_PREFERENCES -> Value.SIM_CARD_NETWORK_PREFERENCES
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SIM_CARD_NETWORK_PREFERENCES -> Known.SIM_CARD_NETWORK_PREFERENCES
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                recordType == other.recordType &&
                settings == other.settings &&
                simCardId == other.simCardId &&
                status == other.status &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                recordType,
                settings,
                simCardId,
                status,
                type,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, recordType=$recordType, settings=$settings, simCardId=$simCardId, status=$status, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OtaUpdateRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OtaUpdateRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
