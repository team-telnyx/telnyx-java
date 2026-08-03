// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * If the group has 0 active suppressions, hard-deletes the row. With `force=true`, soft-deletes all
 * active suppressions first (status → `removed`, `group_id` cleared, `removed` audit event per
 * block) in a single transaction, then hard-deletes the group. Without `force` and active
 * suppressions present → `409`. Audit trail is preserved. `force` only accepts the string `"true"`
 * or boolean `true`; all other values are false.
 */
class EmailUnsubscribeGroupDeleteParams
private constructor(
    private val id: String?,
    private val force: Force?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Force-delete a group with active suppressions. Only `"true"` (string) or `true` (bool) are
     * truthy; all other values are false.
     */
    fun force(): Optional<Force> = Optional.ofNullable(force)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailUnsubscribeGroupDeleteParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [EmailUnsubscribeGroupDeleteParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailUnsubscribeGroupDeleteParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var force: Force? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailUnsubscribeGroupDeleteParams: EmailUnsubscribeGroupDeleteParams) =
            apply {
                id = emailUnsubscribeGroupDeleteParams.id
                force = emailUnsubscribeGroupDeleteParams.force
                additionalHeaders = emailUnsubscribeGroupDeleteParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    emailUnsubscribeGroupDeleteParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    emailUnsubscribeGroupDeleteParams.additionalBodyProperties.toMutableMap()
            }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Force-delete a group with active suppressions. Only `"true"` (string) or `true` (bool)
         * are truthy; all other values are false.
         */
        fun force(force: Force?) = apply { this.force = force }

        /** Alias for calling [Builder.force] with `force.orElse(null)`. */
        fun force(force: Optional<Force>) = force(force.getOrNull())

        /** Alias for calling [force] with `Force.ofUnionMember0(unionMember0)`. */
        fun force(unionMember0: Force.UnionMember0) = force(Force.ofUnionMember0(unionMember0))

        /** Alias for calling [force] with `Force.ofBool(bool)`. */
        fun force(bool: Boolean) = force(Force.ofBool(bool))

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [EmailUnsubscribeGroupDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailUnsubscribeGroupDeleteParams =
            EmailUnsubscribeGroupDeleteParams(
                id,
                force,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                force?.accept(
                    object : Force.Visitor<Unit> {
                        override fun visitUnionMember0(unionMember0: Force.UnionMember0) {
                            put("force", unionMember0.toString())
                        }

                        override fun visitBool(bool: Boolean) {
                            put("force", bool.toString())
                        }
                    }
                )
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Force-delete a group with active suppressions. Only `"true"` (string) or `true` (bool) are
     * truthy; all other values are false.
     */
    class Force
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val bool: Boolean? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isBool(): Boolean = bool != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                bool != null -> visitor.visitBool(bool)
                else -> throw IllegalStateException("Invalid Force")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Force && unionMember0 == other.unionMember0 && bool == other.bool
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, bool)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Force{unionMember0=$unionMember0}"
                bool != null -> "Force{bool=$bool}"
                else -> throw IllegalStateException("Invalid Force")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Force(unionMember0 = unionMember0)

            @JvmStatic fun ofBool(bool: Boolean) = Force(bool = bool)
        }

        /** An interface that defines how to map each variant of [Force] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitBool(bool: Boolean): T
        }

        class UnionMember0 @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val TRUE = of("true")

                @JvmField val FALSE = of("false")

                @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
            }

            /** An enum containing [UnionMember0]'s known values. */
            enum class Known {
                TRUE,
                FALSE,
            }

            /**
             * An enum containing [UnionMember0]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UnionMember0] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRUE,
                FALSE,
                /**
                 * An enum member indicating that [UnionMember0] was instantiated with an unknown
                 * value.
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
                    TRUE -> Value.TRUE
                    FALSE -> Value.FALSE
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
                    TRUE -> Known.TRUE
                    FALSE -> Known.FALSE
                    else -> throw TelnyxInvalidDataException("Unknown UnionMember0: $value")
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
            fun validate(): UnionMember0 = apply {
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

                return other is UnionMember0 && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailUnsubscribeGroupDeleteParams &&
            id == other.id &&
            force == other.force &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(id, force, additionalHeaders, additionalQueryParams, additionalBodyProperties)

    override fun toString() =
        "EmailUnsubscribeGroupDeleteParams{id=$id, force=$force, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
