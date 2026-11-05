// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys.toolpermissions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentGatewayToolPermissions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val servers: JsonField<List<Server>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("servers") @ExcludeMissing servers: JsonField<List<Server>> = JsonMissing.of()
    ) : this(servers, mutableMapOf())

    /**
     * The servers granted, each with its tools. `[]` grants none.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun servers(): List<Server> = servers.getRequired("servers")

    /**
     * Returns the raw JSON value of [servers].
     *
     * Unlike [servers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("servers") @ExcludeMissing fun _servers(): JsonField<List<Server>> = servers

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
         * Returns a mutable builder for constructing an instance of [AgentGatewayToolPermissions].
         *
         * The following fields are required:
         * ```java
         * .servers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayToolPermissions]. */
    class Builder internal constructor() {

        private var servers: JsonField<MutableList<Server>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayToolPermissions: AgentGatewayToolPermissions) = apply {
            servers = agentGatewayToolPermissions.servers.map { it.toMutableList() }
            additionalProperties = agentGatewayToolPermissions.additionalProperties.toMutableMap()
        }

        /** The servers granted, each with its tools. `[]` grants none. */
        fun servers(servers: List<Server>) = servers(JsonField.of(servers))

        /**
         * Sets [Builder.servers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.servers] with a well-typed `List<Server>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun servers(servers: JsonField<List<Server>>) = apply {
            this.servers = servers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Server] to [servers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addServer(server: Server) = apply {
            servers =
                (servers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("servers", it).add(server)
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
         * Returns an immutable instance of [AgentGatewayToolPermissions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .servers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGatewayToolPermissions =
            AgentGatewayToolPermissions(
                checkRequired("servers", servers).map { it.toImmutable() },
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
    fun validate(): AgentGatewayToolPermissions = apply {
        if (validated) {
            return@apply
        }

        servers().forEach { it.validate() }
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
        (servers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Server
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val tools: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<String>> = JsonMissing.of(),
        ) : this(id, tools, mutableMapOf())

        /**
         * An MCP server's or API's `id` on the instance.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The tools the grant covers, by name without the server prefix. `[]` covers every tool the
         * server exposes.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tools(): Optional<List<String>> = tools.getOptional("tools")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [tools].
         *
         * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<String>> = tools

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
             * Returns a mutable builder for constructing an instance of [Server].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Server]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var tools: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(server: Server) = apply {
                id = server.id
                tools = server.tools.map { it.toMutableList() }
                additionalProperties = server.additionalProperties.toMutableMap()
            }

            /** An MCP server's or API's `id` on the instance. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The tools the grant covers, by name without the server prefix. `[]` covers every tool
             * the server exposes.
             */
            fun tools(tools: List<String>) = tools(JsonField.of(tools))

            /**
             * Sets [Builder.tools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tools] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tools(tools: JsonField<List<String>>) = apply {
                this.tools = tools.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tools].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTool(tool: String) = apply {
                tools =
                    (tools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tools", it).add(tool)
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
             * Returns an immutable instance of [Server].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Server =
                Server(
                    checkRequired("id", id),
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Server = apply {
            if (validated) {
                return@apply
            }

            id()
            tools()
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
            (if (id.asKnown().isPresent) 1 else 0) + (tools.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Server &&
                id == other.id &&
                tools == other.tools &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, tools, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Server{id=$id, tools=$tools, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayToolPermissions &&
            servers == other.servers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(servers, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayToolPermissions{servers=$servers, additionalProperties=$additionalProperties}"
}
