package com.appsolute.translator_kmm

import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun MainViewController() = ComposeUIViewController {
    val isDarkTheme =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
                UIUserInterfaceStyle.UIUserInterfaceStyleDark
    ApplicationContainer(
        darkTheme = isDarkTheme,
        dynamicColor = false,
    )
}