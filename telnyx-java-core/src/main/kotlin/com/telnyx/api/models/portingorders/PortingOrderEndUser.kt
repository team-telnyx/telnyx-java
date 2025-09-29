// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrderEndUser
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val admin: JsonField<PortingOrderEndUserAdmin>,
    private val location: JsonField<PortingOrderEndUserLocation>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("admin")
        @ExcludeMissing
        admin: JsonField<PortingOrderEndUserAdmin> = JsonMissing.of(),
        @JsonProperty("location")
        @ExcludeMissing
        location: JsonField<PortingOrderEndUserLocation> = JsonMissing.of(),
    ) : this(admin, location, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun admin(): Optional<PortingOrderEndUserAdmin> = admin.getOptional("admin")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<PortingOrderEndUserLocation> = location.getOptional("location")

    /**
     * Returns the raw JSON value of [admin].
     *
     * Unlike [admin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("admin") @ExcludeMissing fun _admin(): JsonField<PortingOrderEndUserAdmin> = admin

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location")
    @ExcludeMissing
    fun _location(): JsonField<PortingOrderEndUserLocation> = location

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

        /** Returns a mutable builder for constructing an instance of [PortingOrderEndUser]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderEndUser]. */
    class Builder internal constructor() {

        private var admin: JsonField<PortingOrderEndUserAdmin> = JsonMissing.of()
        private var location: JsonField<PortingOrderEndUserLocation> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderEndUser: PortingOrderEndUser) = apply {
            admin = portingOrderEndUser.admin
            location = portingOrderEndUser.location
            additionalProperties = portingOrderEndUser.additionalProperties.toMutableMap()
        }

        fun admin(admin: PortingOrderEndUserAdmin) = admin(JsonField.of(admin))

        /**
         * Sets [Builder.admin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.admin] with a well-typed [PortingOrderEndUserAdmin]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun admin(admin: JsonField<PortingOrderEndUserAdmin>) = apply { this.admin = admin }

        fun location(location: PortingOrderEndUserLocation) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed
         * [PortingOrderEndUserLocation] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<PortingOrderEndUserLocation>) = apply {
            this.location = location
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
         * Returns an immutable instance of [PortingOrderEndUser].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderEndUser =
            PortingOrderEndUser(admin, location, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderEndUser = apply {
        if (validated) {
            return@apply
        }

        admin().ifPresent { it.validate() }
        location().ifPresent { it.validate() }
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
        (admin.asKnown().getOrNull()?.validity() ?: 0) +
            (location.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderEndUser &&
            admin == other.admin &&
            location == other.location &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(admin, location, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderEndUser{admin=$admin, location=$location, additionalProperties=$additionalProperties}"
}
