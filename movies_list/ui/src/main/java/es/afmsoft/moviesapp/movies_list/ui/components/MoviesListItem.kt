package es.afmsoft.moviesapp.movies_list.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MoviesListItem(title: String) {
    Column {
        Box(
            Modifier
                .weight(2f)
                .fillMaxWidth()
                .background(color = Color.Blue)
        ) {
        }

        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()) {
            Text(
                text = title,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colors.secondary,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Red)
            )
        }
    }
}


@Preview(widthDp = 200, heightDp = 200)
@Composable
fun MoviesListItemPreview() {
    MaterialTheme {
        MoviesListItem(title = "Prueba")
    }
}