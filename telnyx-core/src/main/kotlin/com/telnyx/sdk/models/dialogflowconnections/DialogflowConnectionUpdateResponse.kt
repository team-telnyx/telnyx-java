// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialogflowconnections

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

class DialogflowConnectionUpdateResponse
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
         * [DialogflowConnectionUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialogflowConnectionUpdateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dialogflowConnectionUpdateResponse: DialogflowConnectionUpdateResponse) =
            apply {
                data = dialogflowConnectionUpdateResponse.data
                additionalProperties =
                    dialogflowConnectionUpdateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [DialogflowConnectionUpdateResponse].
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
        fun build(): DialogflowConnectionUpdateResponse =
            DialogflowConnectionUpdateResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DialogflowConnectionUpdateResponse = apply {
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
        private val connectionId: JsonField<String>,
        private val conversationProfileId: JsonField<String>,
        private val environment: JsonField<String>,
        private val recordType: JsonField<String>,
        private val serviceAccount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conversation_profile_id")
            @ExcludeMissing
            conversationProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("environment")
            @ExcludeMissing
            environment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("service_account")
            @ExcludeMissing
            serviceAccount: JsonField<String> = JsonMissing.of(),
        ) : this(
            connectionId,
            conversationProfileId,
            environment,
            recordType,
            serviceAccount,
            mutableMapOf(),
        )

        /**
         * Uniquely identifies a Telnyx application (Call Control).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * The id of a configured conversation profile on your Dialogflow account. (If you use
         * Dialogflow CX, this param is required)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conversationProfileId(): Optional<String> =
            conversationProfileId.getOptional("conversation_profile_id")

        /**
         * Which Dialogflow environment will be used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun environment(): Optional<String> = environment.getOptional("environment")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * The JSON map to connect your Dialoglow account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serviceAccount(): Optional<String> = serviceAccount.getOptional("service_account")

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [conversationProfileId].
         *
         * Unlike [conversationProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("conversation_profile_id")
        @ExcludeMissing
        fun _conversationProfileId(): JsonField<String> = conversationProfileId

        /**
         * Returns the raw JSON value of [environment].
         *
         * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("environment")
        @ExcludeMissing
        fun _environment(): JsonField<String> = environment

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [serviceAccount].
         *
         * Unlike [serviceAccount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("service_account")
        @ExcludeMissing
        fun _serviceAccount(): JsonField<String> = serviceAccount

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

            private var connectionId: JsonField<String> = JsonMissing.of()
            private var conversationProfileId: JsonField<String> = JsonMissing.of()
            private var environment: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var serviceAccount: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                connectionId = data.connectionId
                conversationProfileId = data.conversationProfileId
                environment = data.environment
                recordType = data.recordType
                serviceAccount = data.serviceAccount
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Uniquely identifies a Telnyx application (Call Control). */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /**
             * The id of a configured conversation profile on your Dialogflow account. (If you use
             * Dialogflow CX, this param is required)
             */
            fun conversationProfileId(conversationProfileId: String) =
                conversationProfileId(JsonField.of(conversationProfileId))

            /**
             * Sets [Builder.conversationProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversationProfileId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun conversationProfileId(conversationProfileId: JsonField<String>) = apply {
                this.conversationProfileId = conversationProfileId
            }

            /** Which Dialogflow environment will be used. */
            fun environment(environment: String) = environment(JsonField.of(environment))

            /**
             * Sets [Builder.environment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.environment] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun environment(environment: JsonField<String>) = apply {
                this.environment = environment
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** The JSON map to connect your Dialoglow account. */
            fun serviceAccount(serviceAccount: String) =
                serviceAccount(JsonField.of(serviceAccount))

            /**
             * Sets [Builder.serviceAccount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceAccount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serviceAccount(serviceAccount: JsonField<String>) = apply {
                this.serviceAccount = serviceAccount
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    connectionId,
                    conversationProfileId,
                    environment,
                    recordType,
                    serviceAccount,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            connectionId()
            conversationProfileId()
            environment()
            recordType()
            serviceAccount()
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
            (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (conversationProfileId.asKnown().isPresent) 1 else 0) +
                (if (environment.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (serviceAccount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                connectionId == other.connectionId &&
                conversationProfileId == other.conversationProfileId &&
                environment == other.environment &&
                recordType == other.recordType &&
                serviceAccount == other.serviceAccount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                connectionId,
                conversationProfileId,
                environment,
                recordType,
                serviceAccount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{connectionId=$connectionId, conversationProfileId=$conversationProfileId, environment=$environment, recordType=$recordType, serviceAccount=$serviceAccount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DialogflowConnectionUpdateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DialogflowConnectionUpdateResponse{data=$data, additionalProperties=$additionalProperties}"
}
