package com.vw.movies.utils

import android.R.id.text1
import android.R.id.text2
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.text.SpannableString
import android.text.Spanned.SPAN_INCLUSIVE_INCLUSIVE
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.widget.TextView
import androidx.databinding.BindingAdapter


class BindingUtils {
    companion object {
        @JvmStatic
        @BindingAdapter("gradientText")
        fun gradientText(textView: TextView, text: String) {
            val paint = textView.paint
            val width = paint.measureText(text)
            var textShader = LinearGradient(
                0f, 0f, width, textView.textSize, intArrayOf(
                    Color.parseColor("#FC6449"),
                    Color.parseColor("#ffffff")

                ), floatArrayOf(100f, 100f), Shader.TileMode.CLAMP
            )
            textView.paint.shader = textShader
        }

        @JvmStatic
        @BindingAdapter("gradientWhiteText")
        fun gradientWhiteTextFun(textView: TextView, text: String) {
            val paint = textView.paint
            val width = paint.measureText(text)
            var textShader = LinearGradient(
                0f, 0f, width, textView.textSize, intArrayOf(
                    Color.parseColor("#ffffff"),
                    Color.parseColor("#B3B3B3")

                ), floatArrayOf(100f, 100f), Shader.TileMode.CLAMP
            )
            textView.paint.shader = textShader
        }
    }


}