package com.husttwj.drawablepreview.drawables.dom

import com.husttwj.drawablepreview.drawables.Utils
import java.awt.image.BufferedImage

class IconDrawable : Drawable() {

    var childImage: BufferedImage? = null

    override fun draw(outputImage: BufferedImage) {
        super.draw(outputImage)
        childImage?.also { childImage ->
            Utils.drawResizedIcon(childImage, outputImage)
        }
    }
}