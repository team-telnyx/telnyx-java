// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Session
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val closedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val failureReason: JsonField<String>,
    private val lastActivityAt: JsonField<OffsetDateTime>,
    private val limits: JsonField<Limits>,
    private val metadata: JsonValue,
    private val policy: JsonField<Policy>,
    private val readyAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("closed_at")
        @ExcludeMissing
        closedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("failure_reason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_activity_at")
        @ExcludeMissing
        lastActivityAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("limits") @ExcludeMissing limits: JsonField<Limits> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("policy") @ExcludeMissing policy: JsonField<Policy> = JsonMissing.of(),
        @JsonProperty("ready_at")
        @ExcludeMissing
        readyAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(
        id,
        closedAt,
        createdAt,
        expiresAt,
        failureReason,
        lastActivityAt,
        limits,
        metadata,
        policy,
        readyAt,
        status,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun closedAt(): Optional<OffsetDateTime> = closedAt.getOptional("closed_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<String> = failureReason.getOptional("failure_reason")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastActivityAt(): Optional<OffsetDateTime> = lastActivityAt.getOptional("last_activity_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limits(): Limits = limits.getRequired("limits")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = session.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policy(): Policy = policy.getRequired("policy")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readyAt(): Optional<OffsetDateTime> = readyAt.getOptional("ready_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [closedAt].
     *
     * Unlike [closedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("closed_at") @ExcludeMissing fun _closedAt(): JsonField<OffsetDateTime> = closedAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_reason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

    /**
     * Returns the raw JSON value of [lastActivityAt].
     *
     * Unlike [lastActivityAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_activity_at")
    @ExcludeMissing
    fun _lastActivityAt(): JsonField<OffsetDateTime> = lastActivityAt

    /**
     * Returns the raw JSON value of [limits].
     *
     * Unlike [limits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limits") @ExcludeMissing fun _limits(): JsonField<Limits> = limits

    /**
     * Returns the raw JSON value of [policy].
     *
     * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<Policy> = policy

    /**
     * Returns the raw JSON value of [readyAt].
     *
     * Unlike [readyAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ready_at") @ExcludeMissing fun _readyAt(): JsonField<OffsetDateTime> = readyAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [Session].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .closedAt()
         * .createdAt()
         * .expiresAt()
         * .failureReason()
         * .lastActivityAt()
         * .limits()
         * .metadata()
         * .policy()
         * .readyAt()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Session]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var closedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var failureReason: JsonField<String>? = null
        private var lastActivityAt: JsonField<OffsetDateTime>? = null
        private var limits: JsonField<Limits>? = null
        private var metadata: JsonValue? = null
        private var policy: JsonField<Policy>? = null
        private var readyAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(session: Session) = apply {
            id = session.id
            closedAt = session.closedAt
            createdAt = session.createdAt
            expiresAt = session.expiresAt
            failureReason = session.failureReason
            lastActivityAt = session.lastActivityAt
            limits = session.limits
            metadata = session.metadata
            policy = session.policy
            readyAt = session.readyAt
            status = session.status
            additionalProperties = session.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun closedAt(closedAt: OffsetDateTime?) = closedAt(JsonField.ofNullable(closedAt))

        /** Alias for calling [Builder.closedAt] with `closedAt.orElse(null)`. */
        fun closedAt(closedAt: Optional<OffsetDateTime>) = closedAt(closedAt.getOrNull())

        /**
         * Sets [Builder.closedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closedAt(closedAt: JsonField<OffsetDateTime>) = apply { this.closedAt = closedAt }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        fun failureReason(failureReason: String?) =
            failureReason(JsonField.ofNullable(failureReason))

        /** Alias for calling [Builder.failureReason] with `failureReason.orElse(null)`. */
        fun failureReason(failureReason: Optional<String>) =
            failureReason(failureReason.getOrNull())

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failureReason(failureReason: JsonField<String>) = apply {
            this.failureReason = failureReason
        }

        fun lastActivityAt(lastActivityAt: OffsetDateTime?) =
            lastActivityAt(JsonField.ofNullable(lastActivityAt))

        /** Alias for calling [Builder.lastActivityAt] with `lastActivityAt.orElse(null)`. */
        fun lastActivityAt(lastActivityAt: Optional<OffsetDateTime>) =
            lastActivityAt(lastActivityAt.getOrNull())

        /**
         * Sets [Builder.lastActivityAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastActivityAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastActivityAt(lastActivityAt: JsonField<OffsetDateTime>) = apply {
            this.lastActivityAt = lastActivityAt
        }

        fun limits(limits: Limits) = limits(JsonField.of(limits))

        /**
         * Sets [Builder.limits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limits] with a well-typed [Limits] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limits(limits: JsonField<Limits>) = apply { this.limits = limits }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun policy(policy: Policy) = policy(JsonField.of(policy))

        /**
         * Sets [Builder.policy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policy] with a well-typed [Policy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun policy(policy: JsonField<Policy>) = apply { this.policy = policy }

        fun readyAt(readyAt: OffsetDateTime?) = readyAt(JsonField.ofNullable(readyAt))

        /** Alias for calling [Builder.readyAt] with `readyAt.orElse(null)`. */
        fun readyAt(readyAt: Optional<OffsetDateTime>) = readyAt(readyAt.getOrNull())

        /**
         * Sets [Builder.readyAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readyAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readyAt(readyAt: JsonField<OffsetDateTime>) = apply { this.readyAt = readyAt }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [Session].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .closedAt()
         * .createdAt()
         * .expiresAt()
         * .failureReason()
         * .lastActivityAt()
         * .limits()
         * .metadata()
         * .policy()
         * .readyAt()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Session =
            Session(
                checkRequired("id", id),
                checkRequired("closedAt", closedAt),
                checkRequired("createdAt", createdAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("failureReason", failureReason),
                checkRequired("lastActivityAt", lastActivityAt),
                checkRequired("limits", limits),
                checkRequired("metadata", metadata),
                checkRequired("policy", policy),
                checkRequired("readyAt", readyAt),
                checkRequired("status", status),
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
    fun validate(): Session = apply {
        if (validated) {
            return@apply
        }

        id()
        closedAt()
        createdAt()
        expiresAt()
        failureReason()
        lastActivityAt()
        limits().validate()
        policy().validate()
        readyAt()
        status().validate()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (closedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (failureReason.asKnown().isPresent) 1 else 0) +
            (if (lastActivityAt.asKnown().isPresent) 1 else 0) +
            (limits.asKnown().getOrNull()?.validity() ?: 0) +
            (policy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (readyAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    class Limits
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val idleTimeoutS: JsonField<Long>,
        private val lifetimeS: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("idle_timeout_s")
            @ExcludeMissing
            idleTimeoutS: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lifetime_s")
            @ExcludeMissing
            lifetimeS: JsonField<Long> = JsonMissing.of(),
        ) : this(idleTimeoutS, lifetimeS, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun idleTimeoutS(): Long = idleTimeoutS.getRequired("idle_timeout_s")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lifetimeS(): Long = lifetimeS.getRequired("lifetime_s")

        /**
         * Returns the raw JSON value of [idleTimeoutS].
         *
         * Unlike [idleTimeoutS], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idle_timeout_s")
        @ExcludeMissing
        fun _idleTimeoutS(): JsonField<Long> = idleTimeoutS

        /**
         * Returns the raw JSON value of [lifetimeS].
         *
         * Unlike [lifetimeS], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lifetime_s") @ExcludeMissing fun _lifetimeS(): JsonField<Long> = lifetimeS

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
             * Returns a mutable builder for constructing an instance of [Limits].
             *
             * The following fields are required:
             * ```java
             * .idleTimeoutS()
             * .lifetimeS()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Limits]. */
        class Builder internal constructor() {

            private var idleTimeoutS: JsonField<Long>? = null
            private var lifetimeS: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(limits: Limits) = apply {
                idleTimeoutS = limits.idleTimeoutS
                lifetimeS = limits.lifetimeS
                additionalProperties = limits.additionalProperties.toMutableMap()
            }

            fun idleTimeoutS(idleTimeoutS: Long) = idleTimeoutS(JsonField.of(idleTimeoutS))

            /**
             * Sets [Builder.idleTimeoutS] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idleTimeoutS] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idleTimeoutS(idleTimeoutS: JsonField<Long>) = apply {
                this.idleTimeoutS = idleTimeoutS
            }

            fun lifetimeS(lifetimeS: Long) = lifetimeS(JsonField.of(lifetimeS))

            /**
             * Sets [Builder.lifetimeS] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lifetimeS] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lifetimeS(lifetimeS: JsonField<Long>) = apply { this.lifetimeS = lifetimeS }

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
             * Returns an immutable instance of [Limits].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .idleTimeoutS()
             * .lifetimeS()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Limits =
                Limits(
                    checkRequired("idleTimeoutS", idleTimeoutS),
                    checkRequired("lifetimeS", lifetimeS),
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
        fun validate(): Limits = apply {
            if (validated) {
                return@apply
            }

            idleTimeoutS()
            lifetimeS()
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
            (if (idleTimeoutS.asKnown().isPresent) 1 else 0) +
                (if (lifetimeS.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Limits &&
                idleTimeoutS == other.idleTimeoutS &&
                lifetimeS == other.lifetimeS &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(idleTimeoutS, lifetimeS, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Limits{idleTimeoutS=$idleTimeoutS, lifetimeS=$lifetimeS, additionalProperties=$additionalProperties}"
    }

    class Policy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowedDomains: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowed_domains")
            @ExcludeMissing
            allowedDomains: JsonField<List<String>> = JsonMissing.of()
        ) : this(allowedDomains, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun allowedDomains(): List<String> = allowedDomains.getRequired("allowed_domains")

        /**
         * Returns the raw JSON value of [allowedDomains].
         *
         * Unlike [allowedDomains], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowed_domains")
        @ExcludeMissing
        fun _allowedDomains(): JsonField<List<String>> = allowedDomains

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
             * Returns a mutable builder for constructing an instance of [Policy].
             *
             * The following fields are required:
             * ```java
             * .allowedDomains()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Policy]. */
        class Builder internal constructor() {

            private var allowedDomains: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(policy: Policy) = apply {
                allowedDomains = policy.allowedDomains.map { it.toMutableList() }
                additionalProperties = policy.additionalProperties.toMutableMap()
            }

            fun allowedDomains(allowedDomains: List<String>) =
                allowedDomains(JsonField.of(allowedDomains))

            /**
             * Sets [Builder.allowedDomains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedDomains] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowedDomains(allowedDomains: JsonField<List<String>>) = apply {
                this.allowedDomains = allowedDomains.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [allowedDomains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedDomain(allowedDomain: String) = apply {
                allowedDomains =
                    (allowedDomains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedDomains", it).add(allowedDomain)
                    }
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
             * Returns an immutable instance of [Policy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .allowedDomains()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Policy =
                Policy(
                    checkRequired("allowedDomains", allowedDomains).map { it.toImmutable() },
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
        fun validate(): Policy = apply {
            if (validated) {
                return@apply
            }

            allowedDomains()
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
        internal fun validity(): Int = (allowedDomains.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Policy &&
                allowedDomains == other.allowedDomains &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(allowedDomains, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Policy{allowedDomains=$allowedDomains, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PROVISIONING = of("provisioning")

            @JvmField val READY = of("ready")

            @JvmField val CLOSING = of("closing")

            @JvmField val CLOSED = of("closed")

            @JvmField val FAILED = of("failed")

            @JvmField val EXPIRED = of("expired")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PROVISIONING,
            READY,
            CLOSING,
            CLOSED,
            FAILED,
            EXPIRED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROVISIONING,
            READY,
            CLOSING,
            CLOSED,
            FAILED,
            EXPIRED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PROVISIONING -> Value.PROVISIONING
                READY -> Value.READY
                CLOSING -> Value.CLOSING
                CLOSED -> Value.CLOSED
                FAILED -> Value.FAILED
                EXPIRED -> Value.EXPIRED
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
                PROVISIONING -> Known.PROVISIONING
                READY -> Known.READY
                CLOSING -> Known.CLOSING
                CLOSED -> Known.CLOSED
                FAILED -> Known.FAILED
                EXPIRED -> Known.EXPIRED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Session &&
            id == other.id &&
            closedAt == other.closedAt &&
            createdAt == other.createdAt &&
            expiresAt == other.expiresAt &&
            failureReason == other.failureReason &&
            lastActivityAt == other.lastActivityAt &&
            limits == other.limits &&
            metadata == other.metadata &&
            policy == other.policy &&
            readyAt == other.readyAt &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            closedAt,
            createdAt,
            expiresAt,
            failureReason,
            lastActivityAt,
            limits,
            metadata,
            policy,
            readyAt,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Session{id=$id, closedAt=$closedAt, createdAt=$createdAt, expiresAt=$expiresAt, failureReason=$failureReason, lastActivityAt=$lastActivityAt, limits=$limits, metadata=$metadata, policy=$policy, readyAt=$readyAt, status=$status, additionalProperties=$additionalProperties}"
}
