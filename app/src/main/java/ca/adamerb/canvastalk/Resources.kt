package ca.adamerb.canvastalk

import android.graphics.Paint
import android.graphics.Rect
import android.graphics.Typeface

const val Shade0 = 0xff2F4172.toInt()
const val Shade1 = 0xff7986AC.toInt()
const val Shade2 = 0xff4F608F.toInt()
const val Shade3 = 0xff162756.toInt()
const val Shade4 = 0xff061439.toInt()
const val Shade5 = 0xff03091B.toInt()
const val AndroidGreen = 0xffA5C445.toInt()


const val White = 0xffffffff.toInt()
const val Black = 0xff000000.toInt()
const val CodeBackgroundColor = 0x88000000.toInt()


val UbuntuBold =
    Typeface.createFromAsset(
        AppContext.resources.assets,
        "Ubuntu-Bold.ttf"
    )!!

val SourceCodePro by lazy(LazyThreadSafetyMode.NONE) {
    Typeface.createFromAsset(
        AppContext.resources.assets,
        "SourceCodePro-Regular.ttf"
    )!!
}

val PaddingF = dp(20)
val Padding = PaddingF.toInt()
val StrokeWidth = dp(3)
val Spacing = dp(10)
val CornerF = dp(5)

val RectBuffer = Rect()
val FontMetricsBuffer = Paint.FontMetrics()

/*
#####  Color Palette by Paletton.com
#####  Palette URL: http://paletton.com/#uid=13N0u0kllllaFw0g0qFqFg0w0aF


*** Primary color:

   shade 0 = #2F4172 = rgb( 47, 65,114) = rgba( 47, 65,114,1) = rgb0(0.184,0.255,0.447)
   shade 1 = #7986AC = rgb(121,134,172) = rgba(121,134,172,1) = rgb0(0.475,0.525,0.675)
   shade 2 = #4F608F = rgb( 79, 96,143) = rgba( 79, 96,143,1) = rgb0(0.31,0.376,0.561)
   shade 3 = #162756 = rgb( 22, 39, 86) = rgba( 22, 39, 86,1) = rgb0(0.086,0.153,0.337)
   shade 4 = #061439 = rgb(  6, 20, 57) = rgba(  6, 20, 57,1) = rgb0(0.024,0.078,0.224)


#####  Generated by Paletton.com (c) 2002-2014
 */

