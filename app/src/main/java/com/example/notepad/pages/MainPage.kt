package com.example.notepad.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notepad.ui.theme.NotepadTheme

@Composable
fun MainPage( modifier: Modifier = Modifier) {
    Scaffold (
        modifier = modifier, // siempre poner esto
        topBar = { MainTopAppBar() }
    ){
        Column (modifier = Modifier.padding(it)){  // siempre poner el modifier asi

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar(){
    TopAppBar(
        title = {
            Text(text = "Notepad") /* todo lo que es texto va dento de Text*/
        },
        colors = TopAppBarDefaults.topAppBarColors( // configuracion del color
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        )
    )
}


@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    NotepadTheme {
        MainPage()
    }
}