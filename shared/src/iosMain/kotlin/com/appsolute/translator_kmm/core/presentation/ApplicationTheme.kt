package com.appsolute.translator_kmm.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.appsolute.translator_kmm.ui.theme.DarkColorScheme
import com.appsolute.translator_kmm.ui.theme.LightColorScheme
import com.appsolute.translator_kmm.ui.theme.Typography

/**
 * @author : alexyang - Appsolute
 * @mailto : braveheart3208@mail.com
 * @created : 5/10/2023, Thursday
 **/
@Composable
actual fun ApplicationTheme (
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if(darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}