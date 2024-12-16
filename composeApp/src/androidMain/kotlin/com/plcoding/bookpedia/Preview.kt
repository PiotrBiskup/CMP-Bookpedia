package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@Composable
@Preview(showBackground = true)
fun BookSearchBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    )
    BookSearchBar("", {}, {}, modifier = Modifier.fillMaxWidth())
}

@Composable
@Preview(showBackground = true)
fun BookSearchBarPreview2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    )
    BookSearchBar("Kotlin", {}, {}, modifier = Modifier.fillMaxWidth())
}