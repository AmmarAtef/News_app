## NewsApp

NewsApp is an MVVM-based Jetpack Compose application for Android, built using Kotlin.

Fetches news from the [News API](https://newsapi.org/) and caches the results for offline access.
Supports searching for news articles.
Allows browsing news by different categories.

### Setup
To run this project, you’ll need a **NewsAPI key**:  
1. Sign up at [https://newsapi.org/](https://newsapi.org/) and generate your API key.  
2. Add your key to the project (e.g., in `local.properties` or your environment variables). 
3. Requests per day: Limited to 100 requests/day on the free plan



## Libraries \& Technologies Used

Jetpack Compose – Modern UI toolkit for building native Android interfaces.
Compose Navigation – For navigating between screens in a Compose-based app.
MVVM Architecture – Separates UI from business logic and preserves app state during configuration changes.
Material 3 Design – Implements Google’s Material You design principles.
Retrofit + Gson Converter – Fetches news from the REST API and converts JSON responses into Kotlin objects.
Coroutines – Handles background tasks efficiently without blocking the main thread.
Dagger Hilt – Dependency injection framework for managing app components.
Coil – Image loading library optimized for Jetpack Compose.





# Project Documentation





PPT File – Project presentation slides.



PDF File – Application workflow screenshots in execution order.

