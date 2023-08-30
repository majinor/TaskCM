package com.daffamuhtar.taskcm

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.daffamuhtar.taskcm.approval.ApprovalScreen
import com.daffamuhtar.taskcm.approval.ApprovalViewModel
//import com.daffamuhtar.taskcm.contacts.presentation.bird.BirdAppTheme
//import com.daffamuhtar.taskcm.contacts.presentation.bird.BirdsPage
//import com.daffamuhtar.taskcm.contacts.presentation.bird.com.daffamuhtar.taskcm.contacts.presentation.bird.BirdsViewModel
import com.daffamuhtar.taskcm.core.presentation.ContactsTheme
import com.daffamuhtar.taskcm.core.presentation.ImagePicker
import com.daffamuhtar.taskcm.di.AppModule
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    appModule: AppModule,
    imagePicker: ImagePicker,
    fcmToken: String?,
) {

    ContactsTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor,
    ){

        val viewModel2 =  getViewModel(
            key ="approval-list-screen",
            factory = viewModelFactory {
                ApprovalViewModel()
            }
        )

        val state2 by viewModel2.state.collectAsState()

//        val viewModel =  getViewModel(
//            key ="contact-list-screen",
//            factory = viewModelFactory {
//                ContactListViewModel(appModule.contactDataSource)
//            }
//        )
//
//        val state by viewModel.state.collectAsState()
//

        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){

//            ContactListScreen(
//                state = state,
//                newContact = viewModel.newContact,
//                onEvent = viewModel::onEvent,
//                imagePicker = imagePicker
//            )

            ApprovalScreen(
                state = state2,
                onEvent = viewModel2::onEvent,
                fcmToken = fcmToken
            )

        }
    }

}