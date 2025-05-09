## Name: Nguyen Nhat An
## ID: 22110007 
# Photo Gallery App

This is a Photo Gallery app built using Jetpack Compose. It allows users to browse photos, manage favorites, delete photos, and more. The app follows modern architecture patterns, such as MVVM (Model-View-ViewModel), and demonstrates how to work with images, state management, and UI interactions in Android using Jetpack Compose.

## Features

- **Photo Grid**: Displays photos in a grid layout.
- **Full Photo View**: View photos in full screen with navigation options.
- **Favorite Photos**: Mark photos as favorites and view them easily.
- **Delete Photos**: Delete photos from the gallery.
- **Floating Action Button**: Quickly access adding new photos or settings.
- **Gesture Controls**: Swipe to navigate photos, pinch to zoom, and long press for actions.
- **Settings**: Clear all favorite photos.
  
## Architecture

This app uses the **MVVM (Model-View-ViewModel)** architecture to separate concerns and make the codebase more maintainable and testable. 

- **Model**: Represents the data, in this case, `Photo` objects with metadata (ID, URL, title, etc.).
- **View**: UI components built with Jetpack Compose.
- **ViewModel**: Handles UI-related data and business logic, managing the state and interacting with the Model.

## Tech Stack

- **Jetpack Compose**: A modern toolkit for building native Android UIs.
- **MVVM Architecture**: Clean architecture pattern to manage the app’s state.
- **Material 3**: A design system that provides modern, consistent UI components.
- **Coil**: For image loading and caching (optional, if used).
- **FileProvider**: For accessing images from the file system.

## Requirements

- Android Studio Bumblebee or newer.
- Minimum SDK: Android 5.0 (API Level 21).
- Kotlin 1.5+.

## Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/photo-gallery-app.git
    cd photo-gallery-app
    ```

2. **Open the project in Android Studio**.

3. **Build and run the app** on a physical or virtual device.

## Usage

- **Viewing Photos**: Browse photos in the gallery.
- **Marking Favorites**: Tap the heart icon to mark photos as favorites.
- **Deleting Photos**: Long-press on an image and select the delete option.
- **Settings**: Go to settings to clear all favorite photos.

## Screenshots

![image](https://github.com/user-attachments/assets/29964fbf-fe0d-4010-99e8-7060b87184db)


## Contributing

Feel free to fork the repository and submit pull requests if you want to contribute to the project. Make sure to follow these guidelines:

1. Fork the repository.
2. Create a new branch for each significant change.
3. Write clear and concise commit messages.
4. Open a pull request with a description of the changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- Jetpack Compose documentation.
- Android MVVM pattern resources.
- Material Design for UI components.
- Coil library for image loading (if used).

---

> **Note**: Replace the links with your actual GitHub username and repository information before uploading to GitHub.

---

