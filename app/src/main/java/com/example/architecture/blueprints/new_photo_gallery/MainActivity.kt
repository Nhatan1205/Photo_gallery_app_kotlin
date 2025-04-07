package com.example.architecture.blueprints.new_photo_gallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.architecture.blueprints.new_photo_gallery.ui.PhotoGalleryApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhotoGalleryPreview()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PhotoGalleryPreview() {
    MaterialTheme {
        PhotoGalleryApp()
    }
}