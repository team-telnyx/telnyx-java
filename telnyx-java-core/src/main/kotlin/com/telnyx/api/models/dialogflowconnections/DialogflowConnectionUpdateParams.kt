// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.dialogflowconnections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates a stored Dialogflow Connection. */
class DialogflowConnectionUpdateParams
private constructor(
    private val connectionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun connectionId(): Optional<String> = Optional.ofNullable(connectionId)

    /**
     * The JSON map to connect your Dialoglow account.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun serviceAccount(): ServiceAccount = body.serviceAccount()

    /**
     * The id of a configured conversation profile on your Dialogflow account. (If you use
     * Dialogflow CX, this param is required)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationProfileId(): Optional<String> = body.conversationProfileId()

    /**
     * Determine which Dialogflow will be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dialogflowApi(): Optional<DialogflowApi> = body.dialogflowApi()

    /**
     * Which Dialogflow environment will be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun environment(): Optional<String> = body.environment()

    /**
     * The region of your agent is. (If you use Dialogflow CX, this param is required)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<String> = body.location()

    /**
     * Returns the raw JSON value of [serviceAccount].
     *
     * Unlike [serviceAccount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _serviceAccount(): JsonField<ServiceAccount> = body._serviceAccount()

    /**
     * Returns the raw JSON value of [conversationProfileId].
     *
     * Unlike [conversationProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _conversationProfileId(): JsonField<String> = body._conversationProfileId()

    /**
     * Returns the raw JSON value of [dialogflowApi].
     *
     * Unlike [dialogflowApi], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dialogflowApi(): JsonField<DialogflowApi> = body._dialogflowApi()

    /**
     * Returns the raw JSON value of [environment].
     *
     * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _environment(): JsonField<String> = body._environment()

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _location(): JsonField<String> = body._location()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DialogflowConnectionUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .serviceAccount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialogflowConnectionUpdateParams]. */
    class Builder internal constructor() {

        private var connectionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dialogflowConnectionUpdateParams: DialogflowConnectionUpdateParams) =
            apply {
                connectionId = dialogflowConnectionUpdateParams.connectionId
                body = dialogflowConnectionUpdateParams.body.toBuilder()
                additionalHeaders = dialogflowConnectionUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    dialogflowConnectionUpdateParams.additionalQueryParams.toBuilder()
            }

        fun connectionId(connectionId: String?) = apply { this.connectionId = connectionId }

        /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
        fun connectionId(connectionId: Optional<String>) = connectionId(connectionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [serviceAccount]
         * - [conversationProfileId]
         * - [dialogflowApi]
         * - [environment]
         * - [location]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The JSON map to connect your Dialoglow account. */
        fun serviceAccount(serviceAccount: ServiceAccount) = apply {
            body.serviceAccount(serviceAccount)
        }

        /**
         * Sets [Builder.serviceAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceAccount] with a well-typed [ServiceAccount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceAccount(serviceAccount: JsonField<ServiceAccount>) = apply {
            body.serviceAccount(serviceAccount)
        }

        /**
         * The id of a configured conversation profile on your Dialogflow account. (If you use
         * Dialogflow CX, this param is required)
         */
        fun conversationProfileId(conversationProfileId: String) = apply {
            body.conversationProfileId(conversationProfileId)
        }

        /**
         * Sets [Builder.conversationProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversationProfileId(conversationProfileId: JsonField<String>) = apply {
            body.conversationProfileId(conversationProfileId)
        }

        /** Determine which Dialogflow will be used. */
        fun dialogflowApi(dialogflowApi: DialogflowApi) = apply {
            body.dialogflowApi(dialogflowApi)
        }

        /**
         * Sets [Builder.dialogflowApi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dialogflowApi] with a well-typed [DialogflowApi] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dialogflowApi(dialogflowApi: JsonField<DialogflowApi>) = apply {
            body.dialogflowApi(dialogflowApi)
        }

        /** Which Dialogflow environment will be used. */
        fun environment(environment: String) = apply { body.environment(environment) }

        /**
         * Sets [Builder.environment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.environment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun environment(environment: JsonField<String>) = apply { body.environment(environment) }

        /** The region of your agent is. (If you use Dialogflow CX, this param is required) */
        fun location(location: String) = apply { body.location(location) }

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { body.location(location) }

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
         * Returns an immutable instance of [DialogflowConnectionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .serviceAccount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DialogflowConnectionUpdateParams =
            DialogflowConnectionUpdateParams(
                connectionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> connectionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val serviceAccount: JsonField<ServiceAccount>,
        private val conversationProfileId: JsonField<String>,
        private val dialogflowApi: JsonField<DialogflowApi>,
        private val environment: JsonField<String>,
        private val location: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("service_account")
            @ExcludeMissing
            serviceAccount: JsonField<ServiceAccount> = JsonMissing.of(),
            @JsonProperty("conversation_profile_id")
            @ExcludeMissing
            conversationProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dialogflow_api")
            @ExcludeMissing
            dialogflowApi: JsonField<DialogflowApi> = JsonMissing.of(),
            @JsonProperty("environment")
            @ExcludeMissing
            environment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
        ) : this(
            serviceAccount,
            conversationProfileId,
            dialogflowApi,
            environment,
            location,
            mutableMapOf(),
        )

        /**
         * The JSON map to connect your Dialoglow account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun serviceAccount(): ServiceAccount = serviceAccount.getRequired("service_account")

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
         * Determine which Dialogflow will be used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dialogflowApi(): Optional<DialogflowApi> = dialogflowApi.getOptional("dialogflow_api")

        /**
         * Which Dialogflow environment will be used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun environment(): Optional<String> = environment.getOptional("environment")

        /**
         * The region of your agent is. (If you use Dialogflow CX, this param is required)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun location(): Optional<String> = location.getOptional("location")

        /**
         * Returns the raw JSON value of [serviceAccount].
         *
         * Unlike [serviceAccount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("service_account")
        @ExcludeMissing
        fun _serviceAccount(): JsonField<ServiceAccount> = serviceAccount

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
         * Returns the raw JSON value of [dialogflowApi].
         *
         * Unlike [dialogflowApi], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dialogflow_api")
        @ExcludeMissing
        fun _dialogflowApi(): JsonField<DialogflowApi> = dialogflowApi

        /**
         * Returns the raw JSON value of [environment].
         *
         * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("environment")
        @ExcludeMissing
        fun _environment(): JsonField<String> = environment

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

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
             * .serviceAccount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var serviceAccount: JsonField<ServiceAccount>? = null
            private var conversationProfileId: JsonField<String> = JsonMissing.of()
            private var dialogflowApi: JsonField<DialogflowApi> = JsonMissing.of()
            private var environment: JsonField<String> = JsonMissing.of()
            private var location: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                serviceAccount = body.serviceAccount
                conversationProfileId = body.conversationProfileId
                dialogflowApi = body.dialogflowApi
                environment = body.environment
                location = body.location
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The JSON map to connect your Dialoglow account. */
            fun serviceAccount(serviceAccount: ServiceAccount) =
                serviceAccount(JsonField.of(serviceAccount))

            /**
             * Sets [Builder.serviceAccount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceAccount] with a well-typed [ServiceAccount]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun serviceAccount(serviceAccount: JsonField<ServiceAccount>) = apply {
                this.serviceAccount = serviceAccount
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

            /** Determine which Dialogflow will be used. */
            fun dialogflowApi(dialogflowApi: DialogflowApi) =
                dialogflowApi(JsonField.of(dialogflowApi))

            /**
             * Sets [Builder.dialogflowApi] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dialogflowApi] with a well-typed [DialogflowApi]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dialogflowApi(dialogflowApi: JsonField<DialogflowApi>) = apply {
                this.dialogflowApi = dialogflowApi
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

            /** The region of your agent is. (If you use Dialogflow CX, this param is required) */
            fun location(location: String) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<String>) = apply { this.location = location }

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
             * .serviceAccount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("serviceAccount", serviceAccount),
                    conversationProfileId,
                    dialogflowApi,
                    environment,
                    location,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            serviceAccount().validate()
            conversationProfileId()
            dialogflowApi().ifPresent { it.validate() }
            environment()
            location()
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
            (serviceAccount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (conversationProfileId.asKnown().isPresent) 1 else 0) +
                (dialogflowApi.asKnown().getOrNull()?.validity() ?: 0) +
                (if (environment.asKnown().isPresent) 1 else 0) +
                (if (location.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                serviceAccount == other.serviceAccount &&
                conversationProfileId == other.conversationProfileId &&
                dialogflowApi == other.dialogflowApi &&
                environment == other.environment &&
                location == other.location &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                serviceAccount,
                conversationProfileId,
                dialogflowApi,
                environment,
                location,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{serviceAccount=$serviceAccount, conversationProfileId=$conversationProfileId, dialogflowApi=$dialogflowApi, environment=$environment, location=$location, additionalProperties=$additionalProperties}"
    }

    /** The JSON map to connect your Dialoglow account. */
    class ServiceAccount
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ServiceAccount]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ServiceAccount]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(serviceAccount: ServiceAccount) = apply {
                additionalProperties = serviceAccount.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ServiceAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ServiceAccount = ServiceAccount(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ServiceAccount = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ServiceAccount && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ServiceAccount{additionalProperties=$additionalProperties}"
    }

    /** Determine which Dialogflow will be used. */
    class DialogflowApi @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CX = of("cx")

            @JvmField val ES = of("es")

            @JvmStatic fun of(value: String) = DialogflowApi(JsonField.of(value))
        }

        /** An enum containing [DialogflowApi]'s known values. */
        enum class Known {
            CX,
            ES,
        }

        /**
         * An enum containing [DialogflowApi]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DialogflowApi] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CX,
            ES,
            /**
             * An enum member indicating that [DialogflowApi] was instantiated with an unknown
             * value.
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
                CX -> Value.CX
                ES -> Value.ES
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
                CX -> Known.CX
                ES -> Known.ES
                else -> throw TelnyxInvalidDataException("Unknown DialogflowApi: $value")
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

        fun validate(): DialogflowApi = apply {
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

            return other is DialogflowApi && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DialogflowConnectionUpdateParams &&
            connectionId == other.connectionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(connectionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DialogflowConnectionUpdateParams{connectionId=$connectionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
