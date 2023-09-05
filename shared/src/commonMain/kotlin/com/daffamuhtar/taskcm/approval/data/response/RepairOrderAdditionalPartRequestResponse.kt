package com.daffamuhtar.taskcm.approval.data.response

import kotlinx.serialization.Serializable

@Serializable
data class RepairOrderAdditionalPartRequestResponse(
    val correctionReason: String,
    val offerId: String,
    val orderId: String,
    val previousOfferId: String,
    val problemName: List<ProblemName>,
    val scheduledDate: String,
    val stageName: String,
    val vehicleBrand: String,
    val vehicleDistrict: String,
    val vehicleLicenseNumber: String,
    val vehiclePhoto: String,
    val vehicleType: String,
    val vehicleVarian: String,
    val vehicleYear: String,
    val vehicleName: String = "${vehicleBrand} ${vehicleType} ${vehicleVarian} ${vehicleYear}",
    val workshopArea: String,
    val workshopName: String
)