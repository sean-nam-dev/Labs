package dev.sn.littlelemoncoursera.navigation

import kotlinx.serialization.Serializable

sealed interface Destination {

    @Serializable
    object HomeGraph: Destination

    @Serializable
    object HomeScreen: Destination

    @Serializable
    data class DetailScreen(val id: Int): Destination
}