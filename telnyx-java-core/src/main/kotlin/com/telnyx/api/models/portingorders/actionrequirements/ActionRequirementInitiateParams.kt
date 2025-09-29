// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.actionrequirements

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Initiates a specific action requirement for a porting order. */
class ActionRequirementInitiateParams
private constructor(
    private val portingOrderId: String,
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun portingOrderId(): String = portingOrderId

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Required information for initiating the action requirement for AU ID verification.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun params(): Params = body.params()

    /**
     * Returns the raw JSON value of [params].
     *
     * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _params(): JsonField<Params> = body._params()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActionRequirementInitiateParams].
         *
         * The following fields are required:
         * ```java
         * .portingOrderId()
         * .params()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionRequirementInitiateParams]. */
    class Builder internal constructor() {

        private var portingOrderId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionRequirementInitiateParams: ActionRequirementInitiateParams) =
            apply {
                portingOrderId = actionRequirementInitiateParams.portingOrderId
                id = actionRequirementInitiateParams.id
                body = actionRequirementInitiateParams.body.toBuilder()
                additionalHeaders = actionRequirementInitiateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    actionRequirementInitiateParams.additionalQueryParams.toBuilder()
            }

        fun portingOrderId(portingOrderId: String) = apply { this.portingOrderId = portingOrderId }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [params]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Required information for initiating the action requirement for AU ID verification. */
        fun params(params: Params) = apply { body.params(params) }

        /**
         * Sets [Builder.params] to an arbitrary JSON value.
         *
         * You should usually call [Builder.params] with a well-typed [Params] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun params(params: JsonField<Params>) = apply { body.params(params) }

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
         * Returns an immutable instance of [ActionRequirementInitiateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .portingOrderId()
         * .params()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionRequirementInitiateParams =
            ActionRequirementInitiateParams(
                checkRequired("portingOrderId", portingOrderId),
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> portingOrderId
            1 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val params: JsonField<Params>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("params") @ExcludeMissing params: JsonField<Params> = JsonMissing.of()
        ) : this(params, mutableMapOf())

        /**
         * Required information for initiating the action requirement for AU ID verification.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun params(): Params = params.getRequired("params")

        /**
         * Returns the raw JSON value of [params].
         *
         * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

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
             * .params()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var params: JsonField<Params>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                params = body.params
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Required information for initiating the action requirement for AU ID verification.
             */
            fun params(params: Params) = params(JsonField.of(params))

            /**
             * Sets [Builder.params] to an arbitrary JSON value.
             *
             * You should usually call [Builder.params] with a well-typed [Params] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun params(params: JsonField<Params>) = apply { this.params = params }

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
             * .params()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("params", params), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            params().validate()
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
        @JvmSynthetic internal fun validity(): Int = (params.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                params == other.params &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(params, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{params=$params, additionalProperties=$additionalProperties}"
    }

    /** Required information for initiating the action requirement for AU ID verification. */
    class Params
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
        ) : this(firstName, lastName, mutableMapOf())

        /**
         * The first name of the person that will perform the verification flow.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("first_name")

        /**
         * The last name of the person that will perform the verification flow.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("last_name")

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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
             * Returns a mutable builder for constructing an instance of [Params].
             *
             * The following fields are required:
             * ```java
             * .firstName()
             * .lastName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Params]. */
        class Builder internal constructor() {

            private var firstName: JsonField<String>? = null
            private var lastName: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(params: Params) = apply {
                firstName = params.firstName
                lastName = params.lastName
                additionalProperties = params.additionalProperties.toMutableMap()
            }

            /** The first name of the person that will perform the verification flow. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The last name of the person that will perform the verification flow. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

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
             * Returns an immutable instance of [Params].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .firstName()
             * .lastName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Params =
                Params(
                    checkRequired("firstName", firstName),
                    checkRequired("lastName", lastName),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            firstName()
            lastName()
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
            (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Params &&
                firstName == other.firstName &&
                lastName == other.lastName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(firstName, lastName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Params{firstName=$firstName, lastName=$lastName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionRequirementInitiateParams &&
            portingOrderId == other.portingOrderId &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(portingOrderId, id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionRequirementInitiateParams{portingOrderId=$portingOrderId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
