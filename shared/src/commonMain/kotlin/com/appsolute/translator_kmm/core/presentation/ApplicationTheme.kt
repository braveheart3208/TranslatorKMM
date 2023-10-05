package com.appsolute.translator_kmm.core.presentation

import androidx.compose.runtime.Composable

/**
 * @author : alexyang - Appsolute
 * @mailto : braveheart3208@mail.com
 * @created : 5/10/2023, Thursday
 **/

@Composable
expect fun ApplicationTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)