package com.yuji.dex.x.utils

import android.graphics.Rect

/**
 * Geometry engine for Yuji DEX snap layouts.
 *
 * Coordinates are in physical display pixels and use a top-left origin.
 * The caller supplies the usable desktop area after system/dock insets.
 * This class only computes task bounds; applying them still requires the
 * existing privileged task-resize path in AppUtils.
 */
object WindowLayoutEngine {

    /**
     * Returns a snap rectangle for quarter (2x2) and six-cell layouts.
     * Supported modes: tiled-quarter-1..4 and tiled-six-1..6.
     * Returns null for modes not owned by this engine.
     */
    fun bounds(mode: String, width: Int, height: Int): Rect? {
        if (width <= 0 || height <= 0) return null

        val quarterIndex = mode.removePrefix("tiled-quarter-").toIntOrNull()
        if (quarterIndex != null && quarterIndex in 1..4) {
            return cellBounds(width, height, columns = 2, rows = 2, index = quarterIndex - 1)
        }

        val sixIndex = mode.removePrefix("tiled-six-").toIntOrNull()
        if (sixIndex != null && sixIndex in 1..6) {
            // Prefer a wide 3x2 layout on landscape displays and a 2x3
            // layout on portrait displays so each window remains usable.
            val columns = if (width >= height) 3 else 2
            val rows = 6 / columns
            return cellBounds(width, height, columns, rows, sixIndex - 1)
        }
        return null
    }

    private fun cellBounds(
        width: Int,
        height: Int,
        columns: Int,
        rows: Int,
        index: Int
    ): Rect {
        val column = index % columns
        val row = index / columns
        val left = column * width / columns
        val top = row * height / rows
        val right = (column + 1) * width / columns
        val bottom = (row + 1) * height / rows
        return Rect(left, top, right, bottom)
    }
}
