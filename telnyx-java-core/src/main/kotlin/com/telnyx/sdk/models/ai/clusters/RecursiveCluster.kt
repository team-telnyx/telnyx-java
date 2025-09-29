// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

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

class RecursiveCluster
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clusterId: JsonField<String>,
    private val clusterSummary: JsonField<String>,
    private val totalNumberOfNodes: JsonField<Long>,
    private val clusterHeader: JsonField<String>,
    private val nodes: JsonField<List<Node>>,
    private val subclusters: JsonField<List<RecursiveCluster>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cluster_id") @ExcludeMissing clusterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cluster_summary")
        @ExcludeMissing
        clusterSummary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_number_of_nodes")
        @ExcludeMissing
        totalNumberOfNodes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cluster_header")
        @ExcludeMissing
        clusterHeader: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nodes") @ExcludeMissing nodes: JsonField<List<Node>> = JsonMissing.of(),
        @JsonProperty("subclusters")
        @ExcludeMissing
        subclusters: JsonField<List<RecursiveCluster>> = JsonMissing.of(),
    ) : this(
        clusterId,
        clusterSummary,
        totalNumberOfNodes,
        clusterHeader,
        nodes,
        subclusters,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clusterId(): String = clusterId.getRequired("cluster_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clusterSummary(): String = clusterSummary.getRequired("cluster_summary")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalNumberOfNodes(): Long = totalNumberOfNodes.getRequired("total_number_of_nodes")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clusterHeader(): Optional<String> = clusterHeader.getOptional("cluster_header")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nodes(): Optional<List<Node>> = nodes.getOptional("nodes")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subclusters(): Optional<List<RecursiveCluster>> = subclusters.getOptional("subclusters")

    /**
     * Returns the raw JSON value of [clusterId].
     *
     * Unlike [clusterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cluster_id") @ExcludeMissing fun _clusterId(): JsonField<String> = clusterId

    /**
     * Returns the raw JSON value of [clusterSummary].
     *
     * Unlike [clusterSummary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cluster_summary")
    @ExcludeMissing
    fun _clusterSummary(): JsonField<String> = clusterSummary

    /**
     * Returns the raw JSON value of [totalNumberOfNodes].
     *
     * Unlike [totalNumberOfNodes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_number_of_nodes")
    @ExcludeMissing
    fun _totalNumberOfNodes(): JsonField<Long> = totalNumberOfNodes

    /**
     * Returns the raw JSON value of [clusterHeader].
     *
     * Unlike [clusterHeader], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cluster_header")
    @ExcludeMissing
    fun _clusterHeader(): JsonField<String> = clusterHeader

    /**
     * Returns the raw JSON value of [nodes].
     *
     * Unlike [nodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nodes") @ExcludeMissing fun _nodes(): JsonField<List<Node>> = nodes

    /**
     * Returns the raw JSON value of [subclusters].
     *
     * Unlike [subclusters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subclusters")
    @ExcludeMissing
    fun _subclusters(): JsonField<List<RecursiveCluster>> = subclusters

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
         * Returns a mutable builder for constructing an instance of [RecursiveCluster].
         *
         * The following fields are required:
         * ```java
         * .clusterId()
         * .clusterSummary()
         * .totalNumberOfNodes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecursiveCluster]. */
    class Builder internal constructor() {

        private var clusterId: JsonField<String>? = null
        private var clusterSummary: JsonField<String>? = null
        private var totalNumberOfNodes: JsonField<Long>? = null
        private var clusterHeader: JsonField<String> = JsonMissing.of()
        private var nodes: JsonField<MutableList<Node>>? = null
        private var subclusters: JsonField<MutableList<RecursiveCluster>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recursiveCluster: RecursiveCluster) = apply {
            clusterId = recursiveCluster.clusterId
            clusterSummary = recursiveCluster.clusterSummary
            totalNumberOfNodes = recursiveCluster.totalNumberOfNodes
            clusterHeader = recursiveCluster.clusterHeader
            nodes = recursiveCluster.nodes.map { it.toMutableList() }
            subclusters = recursiveCluster.subclusters.map { it.toMutableList() }
            additionalProperties = recursiveCluster.additionalProperties.toMutableMap()
        }

        fun clusterId(clusterId: String) = clusterId(JsonField.of(clusterId))

        /**
         * Sets [Builder.clusterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clusterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clusterId(clusterId: JsonField<String>) = apply { this.clusterId = clusterId }

        fun clusterSummary(clusterSummary: String) = clusterSummary(JsonField.of(clusterSummary))

        /**
         * Sets [Builder.clusterSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clusterSummary] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clusterSummary(clusterSummary: JsonField<String>) = apply {
            this.clusterSummary = clusterSummary
        }

        fun totalNumberOfNodes(totalNumberOfNodes: Long) =
            totalNumberOfNodes(JsonField.of(totalNumberOfNodes))

        /**
         * Sets [Builder.totalNumberOfNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalNumberOfNodes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalNumberOfNodes(totalNumberOfNodes: JsonField<Long>) = apply {
            this.totalNumberOfNodes = totalNumberOfNodes
        }

        fun clusterHeader(clusterHeader: String) = clusterHeader(JsonField.of(clusterHeader))

        /**
         * Sets [Builder.clusterHeader] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clusterHeader] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clusterHeader(clusterHeader: JsonField<String>) = apply {
            this.clusterHeader = clusterHeader
        }

        fun nodes(nodes: List<Node>) = nodes(JsonField.of(nodes))

        /**
         * Sets [Builder.nodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nodes] with a well-typed `List<Node>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nodes(nodes: JsonField<List<Node>>) = apply {
            this.nodes = nodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Node] to [nodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNode(node: Node) = apply {
            nodes =
                (nodes ?: JsonField.of(mutableListOf())).also { checkKnown("nodes", it).add(node) }
        }

        fun subclusters(subclusters: List<RecursiveCluster>) =
            subclusters(JsonField.of(subclusters))

        /**
         * Sets [Builder.subclusters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subclusters] with a well-typed `List<RecursiveCluster>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subclusters(subclusters: JsonField<List<RecursiveCluster>>) = apply {
            this.subclusters = subclusters.map { it.toMutableList() }
        }

        /**
         * Adds a single [RecursiveCluster] to [subclusters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubcluster(subcluster: RecursiveCluster) = apply {
            subclusters =
                (subclusters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subclusters", it).add(subcluster)
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
         * Returns an immutable instance of [RecursiveCluster].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clusterId()
         * .clusterSummary()
         * .totalNumberOfNodes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecursiveCluster =
            RecursiveCluster(
                checkRequired("clusterId", clusterId),
                checkRequired("clusterSummary", clusterSummary),
                checkRequired("totalNumberOfNodes", totalNumberOfNodes),
                clusterHeader,
                (nodes ?: JsonMissing.of()).map { it.toImmutable() },
                (subclusters ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RecursiveCluster = apply {
        if (validated) {
            return@apply
        }

        clusterId()
        clusterSummary()
        totalNumberOfNodes()
        clusterHeader()
        nodes().ifPresent { it.forEach { it.validate() } }
        subclusters().ifPresent { it.forEach { it.validate() } }
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
        (if (clusterId.asKnown().isPresent) 1 else 0) +
            (if (clusterSummary.asKnown().isPresent) 1 else 0) +
            (if (totalNumberOfNodes.asKnown().isPresent) 1 else 0) +
            (if (clusterHeader.asKnown().isPresent) 1 else 0) +
            (nodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (subclusters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Node
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val filename: JsonField<String>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(filename, text, mutableMapOf())

        /**
         * The corresponding source file of your embedded storage bucket that the node is from.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String = filename.getRequired("filename")

        /**
         * The text of the node.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
             * Returns a mutable builder for constructing an instance of [Node].
             *
             * The following fields are required:
             * ```java
             * .filename()
             * .text()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Node]. */
        class Builder internal constructor() {

            private var filename: JsonField<String>? = null
            private var text: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(node: Node) = apply {
                filename = node.filename
                text = node.text
                additionalProperties = node.additionalProperties.toMutableMap()
            }

            /**
             * The corresponding source file of your embedded storage bucket that the node is from.
             */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** The text of the node. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

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
             * Returns an immutable instance of [Node].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .filename()
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Node =
                Node(
                    checkRequired("filename", filename),
                    checkRequired("text", text),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Node = apply {
            if (validated) {
                return@apply
            }

            filename()
            text()
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
            (if (filename.asKnown().isPresent) 1 else 0) + (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Node &&
                filename == other.filename &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(filename, text, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Node{filename=$filename, text=$text, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecursiveCluster &&
            clusterId == other.clusterId &&
            clusterSummary == other.clusterSummary &&
            totalNumberOfNodes == other.totalNumberOfNodes &&
            clusterHeader == other.clusterHeader &&
            nodes == other.nodes &&
            subclusters == other.subclusters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clusterId,
            clusterSummary,
            totalNumberOfNodes,
            clusterHeader,
            nodes,
            subclusters,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecursiveCluster{clusterId=$clusterId, clusterSummary=$clusterSummary, totalNumberOfNodes=$totalNumberOfNodes, clusterHeader=$clusterHeader, nodes=$nodes, subclusters=$subclusters, additionalProperties=$additionalProperties}"
}
