// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomcompositions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class VideoRegion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val height: JsonField<Long>,
    private val maxColumns: JsonField<Long>,
    private val maxRows: JsonField<Long>,
    private val videoSources: JsonField<List<String>>,
    private val width: JsonField<Long>,
    private val xPos: JsonField<Long>,
    private val yPos: JsonField<Long>,
    private val zPos: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_columns") @ExcludeMissing maxColumns: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_rows") @ExcludeMissing maxRows: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("video_sources")
        @ExcludeMissing
        videoSources: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("x_pos") @ExcludeMissing xPos: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("y_pos") @ExcludeMissing yPos: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("z_pos") @ExcludeMissing zPos: JsonField<Long> = JsonMissing.of(),
    ) : this(height, maxColumns, maxRows, videoSources, width, xPos, yPos, zPos, mutableMapOf())

    /**
     * Height of the video region
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Optional<Long> = height.getOptional("height")

    /**
     * Maximum number of columns of the region's placement grid. By default, the region has as many
     * columns as needed to layout all the specified video sources.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxColumns(): Optional<Long> = maxColumns.getOptional("max_columns")

    /**
     * Maximum number of rows of the region's placement grid. By default, the region has as many
     * rows as needed to layout all the specified video sources.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxRows(): Optional<Long> = maxRows.getOptional("max_rows")

    /**
     * Array of video recording ids to be composed in the region. Can be "*" to specify all video
     * recordings in the session
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun videoSources(): Optional<List<String>> = videoSources.getOptional("video_sources")

    /**
     * Width of the video region
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun width(): Optional<Long> = width.getOptional("width")

    /**
     * X axis value (in pixels) of the region's upper left corner relative to the upper left corner
     * of the whole room composition viewport.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun xPos(): Optional<Long> = xPos.getOptional("x_pos")

    /**
     * Y axis value (in pixels) of the region's upper left corner relative to the upper left corner
     * of the whole room composition viewport.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun yPos(): Optional<Long> = yPos.getOptional("y_pos")

    /**
     * Regions with higher z_pos values are stacked on top of regions with lower z_pos values
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun zPos(): Optional<Long> = zPos.getOptional("z_pos")

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

    /**
     * Returns the raw JSON value of [maxColumns].
     *
     * Unlike [maxColumns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_columns") @ExcludeMissing fun _maxColumns(): JsonField<Long> = maxColumns

    /**
     * Returns the raw JSON value of [maxRows].
     *
     * Unlike [maxRows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_rows") @ExcludeMissing fun _maxRows(): JsonField<Long> = maxRows

    /**
     * Returns the raw JSON value of [videoSources].
     *
     * Unlike [videoSources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("video_sources")
    @ExcludeMissing
    fun _videoSources(): JsonField<List<String>> = videoSources

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

    /**
     * Returns the raw JSON value of [xPos].
     *
     * Unlike [xPos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("x_pos") @ExcludeMissing fun _xPos(): JsonField<Long> = xPos

    /**
     * Returns the raw JSON value of [yPos].
     *
     * Unlike [yPos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("y_pos") @ExcludeMissing fun _yPos(): JsonField<Long> = yPos

    /**
     * Returns the raw JSON value of [zPos].
     *
     * Unlike [zPos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("z_pos") @ExcludeMissing fun _zPos(): JsonField<Long> = zPos

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

        /** Returns a mutable builder for constructing an instance of [VideoRegion]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VideoRegion]. */
    class Builder internal constructor() {

        private var height: JsonField<Long> = JsonMissing.of()
        private var maxColumns: JsonField<Long> = JsonMissing.of()
        private var maxRows: JsonField<Long> = JsonMissing.of()
        private var videoSources: JsonField<MutableList<String>>? = null
        private var width: JsonField<Long> = JsonMissing.of()
        private var xPos: JsonField<Long> = JsonMissing.of()
        private var yPos: JsonField<Long> = JsonMissing.of()
        private var zPos: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(videoRegion: VideoRegion) = apply {
            height = videoRegion.height
            maxColumns = videoRegion.maxColumns
            maxRows = videoRegion.maxRows
            videoSources = videoRegion.videoSources.map { it.toMutableList() }
            width = videoRegion.width
            xPos = videoRegion.xPos
            yPos = videoRegion.yPos
            zPos = videoRegion.zPos
            additionalProperties = videoRegion.additionalProperties.toMutableMap()
        }

        /** Height of the video region */
        fun height(height: Long?) = height(JsonField.ofNullable(height))

        /**
         * Alias for [Builder.height].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun height(height: Long) = height(height as Long?)

        /** Alias for calling [Builder.height] with `height.orElse(null)`. */
        fun height(height: Optional<Long>) = height(height.getOrNull())

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Long>) = apply { this.height = height }

        /**
         * Maximum number of columns of the region's placement grid. By default, the region has as
         * many columns as needed to layout all the specified video sources.
         */
        fun maxColumns(maxColumns: Long?) = maxColumns(JsonField.ofNullable(maxColumns))

        /**
         * Alias for [Builder.maxColumns].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxColumns(maxColumns: Long) = maxColumns(maxColumns as Long?)

        /** Alias for calling [Builder.maxColumns] with `maxColumns.orElse(null)`. */
        fun maxColumns(maxColumns: Optional<Long>) = maxColumns(maxColumns.getOrNull())

        /**
         * Sets [Builder.maxColumns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxColumns] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxColumns(maxColumns: JsonField<Long>) = apply { this.maxColumns = maxColumns }

        /**
         * Maximum number of rows of the region's placement grid. By default, the region has as many
         * rows as needed to layout all the specified video sources.
         */
        fun maxRows(maxRows: Long?) = maxRows(JsonField.ofNullable(maxRows))

        /**
         * Alias for [Builder.maxRows].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxRows(maxRows: Long) = maxRows(maxRows as Long?)

        /** Alias for calling [Builder.maxRows] with `maxRows.orElse(null)`. */
        fun maxRows(maxRows: Optional<Long>) = maxRows(maxRows.getOrNull())

        /**
         * Sets [Builder.maxRows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRows] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxRows(maxRows: JsonField<Long>) = apply { this.maxRows = maxRows }

        /**
         * Array of video recording ids to be composed in the region. Can be "*" to specify all
         * video recordings in the session
         */
        fun videoSources(videoSources: List<String>) = videoSources(JsonField.of(videoSources))

        /**
         * Sets [Builder.videoSources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.videoSources] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun videoSources(videoSources: JsonField<List<String>>) = apply {
            this.videoSources = videoSources.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [videoSources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVideoSource(videoSource: String) = apply {
            videoSources =
                (videoSources ?: JsonField.of(mutableListOf())).also {
                    checkKnown("videoSources", it).add(videoSource)
                }
        }

        /** Width of the video region */
        fun width(width: Long?) = width(JsonField.ofNullable(width))

        /**
         * Alias for [Builder.width].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun width(width: Long) = width(width as Long?)

        /** Alias for calling [Builder.width] with `width.orElse(null)`. */
        fun width(width: Optional<Long>) = width(width.getOrNull())

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Long>) = apply { this.width = width }

        /**
         * X axis value (in pixels) of the region's upper left corner relative to the upper left
         * corner of the whole room composition viewport.
         */
        fun xPos(xPos: Long?) = xPos(JsonField.ofNullable(xPos))

        /**
         * Alias for [Builder.xPos].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xPos(xPos: Long) = xPos(xPos as Long?)

        /** Alias for calling [Builder.xPos] with `xPos.orElse(null)`. */
        fun xPos(xPos: Optional<Long>) = xPos(xPos.getOrNull())

        /**
         * Sets [Builder.xPos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xPos] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xPos(xPos: JsonField<Long>) = apply { this.xPos = xPos }

        /**
         * Y axis value (in pixels) of the region's upper left corner relative to the upper left
         * corner of the whole room composition viewport.
         */
        fun yPos(yPos: Long?) = yPos(JsonField.ofNullable(yPos))

        /**
         * Alias for [Builder.yPos].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun yPos(yPos: Long) = yPos(yPos as Long?)

        /** Alias for calling [Builder.yPos] with `yPos.orElse(null)`. */
        fun yPos(yPos: Optional<Long>) = yPos(yPos.getOrNull())

        /**
         * Sets [Builder.yPos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yPos] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yPos(yPos: JsonField<Long>) = apply { this.yPos = yPos }

        /**
         * Regions with higher z_pos values are stacked on top of regions with lower z_pos values
         */
        fun zPos(zPos: Long?) = zPos(JsonField.ofNullable(zPos))

        /**
         * Alias for [Builder.zPos].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun zPos(zPos: Long) = zPos(zPos as Long?)

        /** Alias for calling [Builder.zPos] with `zPos.orElse(null)`. */
        fun zPos(zPos: Optional<Long>) = zPos(zPos.getOrNull())

        /**
         * Sets [Builder.zPos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zPos] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zPos(zPos: JsonField<Long>) = apply { this.zPos = zPos }

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
         * Returns an immutable instance of [VideoRegion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VideoRegion =
            VideoRegion(
                height,
                maxColumns,
                maxRows,
                (videoSources ?: JsonMissing.of()).map { it.toImmutable() },
                width,
                xPos,
                yPos,
                zPos,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VideoRegion = apply {
        if (validated) {
            return@apply
        }

        height()
        maxColumns()
        maxRows()
        videoSources()
        width()
        xPos()
        yPos()
        zPos()
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
        (if (height.asKnown().isPresent) 1 else 0) +
            (if (maxColumns.asKnown().isPresent) 1 else 0) +
            (if (maxRows.asKnown().isPresent) 1 else 0) +
            (videoSources.asKnown().getOrNull()?.size ?: 0) +
            (if (width.asKnown().isPresent) 1 else 0) +
            (if (xPos.asKnown().isPresent) 1 else 0) +
            (if (yPos.asKnown().isPresent) 1 else 0) +
            (if (zPos.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VideoRegion &&
            height == other.height &&
            maxColumns == other.maxColumns &&
            maxRows == other.maxRows &&
            videoSources == other.videoSources &&
            width == other.width &&
            xPos == other.xPos &&
            yPos == other.yPos &&
            zPos == other.zPos &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            height,
            maxColumns,
            maxRows,
            videoSources,
            width,
            xPos,
            yPos,
            zPos,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VideoRegion{height=$height, maxColumns=$maxColumns, maxRows=$maxRows, videoSources=$videoSources, width=$width, xPos=$xPos, yPos=$yPos, zPos=$zPos, additionalProperties=$additionalProperties}"
}
